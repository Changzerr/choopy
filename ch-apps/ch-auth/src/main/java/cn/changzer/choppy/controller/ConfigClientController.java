package cn.changzer.choppy.controller;

import cn.changzer.choppy.jwt.TokenUtil;
import cn.changzer.choppy.redis.RedisCache;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Api(tags = "测试接口")
public class ConfigClientController
{
    @Autowired
    private RedisCache redisCache;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    @ApiOperation(value="测试")
    public String getConfigInfo() throws Exception {
        redisCache.setCacheObject(configInfo,"adsfafwaf阿三顶顶顶顶顶顶顶顶s");
        redisCache.expire(configInfo, 1000 * 30);
        String laksdhjalskdhasljkdhajkld = TokenUtil.createToken(1L);
        int a = 1/0;
        long verify = TokenUtil.getUserIdByToken("eyJUeXBlIjoiSnd0IiwidHlwIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJpZCI6MSwiZXhwIjoxNjY2NzA3ODg4fQ.BOcGYpgHVL8v6WYvEooMoFmIV6HBWx5FmJrcPJYbB-o");
        return String.valueOf(verify);
    }
}

