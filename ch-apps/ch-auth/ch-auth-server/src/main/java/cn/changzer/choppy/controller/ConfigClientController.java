package cn.changzer.choppy.controller;


import cn.changzer.choppy.biz.dao.auth.UserMapper;
import cn.changzer.choppy.entity.auth.User;
import cn.changzer.choppy.jwt.TokenUtil;
import cn.changzer.choppy.redis.RedisCache;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
@Api(tags = "测试接口")
public class ConfigClientController
{
    @Autowired
    private RedisCache redisCache;

    @Autowired
    private UserMapper userMapper;

    @Value("${choppy.swagger.enabled}")
    private String configInfo;

    @GetMapping("/config/info")
    @ApiOperation(value="测试")
    public String getConfigInfo() throws Exception {
        redisCache.setCacheObject(configInfo,"adsfafwaf阿三顶顶顶顶顶顶顶顶s");
        redisCache.expire(configInfo, 1000 * 30);
        String laksdhjalskdhasljkdhajkld = TokenUtil.createToken(1L);
        //int a = 1/0;
        //long verify = TokenUtil.getUserIdByToken("eyJUeXBlIjoiSnd0IiwidHlwIjoiSldUIiwiYWxnIjoiSFMyNTYifQ.eyJpZCI6MSwiZXhwIjoxNjY2NzA3ODg4fQ.BOcGYpgHVL8v6WYvEooMoFmIV6HBWx5FmJrcPJYbB-o");
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        for(User s:users){
            System.out.println(s.toString());
        }

        return configInfo;
    }
}

