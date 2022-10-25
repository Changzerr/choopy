package cn.changzer.choppy.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Changzer
 * @Date 2022/10/25 20:47
 */

public class TokenUtil {
    /**
     * token过期时间
     */
    private static final long EXPIRE_TIME = Long.MAX_VALUE;
    /**
     * token秘钥
     */
    private static final String TOKEN_SECRET = "ChangzerChoppy";


    /**
     * 生成签名，30分钟过期
     * @param userid 用户id
     * @return 生成的token
     */
    public static String createToken(long userid) {
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("Type", "Jwt");
            header.put("alg", "HS256");
            // 返回token字符串
            return JWT.create()
                    .withHeader(header)
                    .withClaim("id", userid)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取用户id并检验token是否正确
     * @param token 需要校验的token
     * @return 校验是否成功
     */
    public static long getUserIdByToken(String token) throws Exception {
        try {
            //设置签名的加密算法：HMAC256
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            Map<String, Claim> claims = jwt.getClaims();
            return claims.get("id").asLong();
        } catch (Exception e){
            throw new Exception("token解析失败");
        }
    }

}
