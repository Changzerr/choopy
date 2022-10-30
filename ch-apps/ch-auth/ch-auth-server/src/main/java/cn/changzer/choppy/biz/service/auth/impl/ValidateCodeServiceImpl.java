package cn.changzer.choppy.biz.service.auth.impl;


import cn.changzer.choppy.biz.service.auth.ValidateCodeService;
import cn.changzer.choppy.enums.CacheKey;
import cn.changzer.choppy.exception.BizException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 验证码服务
 */
@Service
public class ValidateCodeServiceImpl implements ValidateCodeService {
    @Override
    public void create(String key, HttpServletResponse response) throws IOException {

    }

    @Override
    public boolean check(String key, String value) {
        return false;
    }
    //@Autowired
    //private RedisCache redisCache;
    //
    //@Override
    //public void create(String key, HttpServletResponse response) throws IOException {
    //    if (StringUtils.isBlank(key)) {
    //        throw BizException.validFail("验证码key不能为空");
    //    }
    //    //setHeader(response, "arithmetic");
    //    response.setContentType(MediaType.IMAGE_PNG_VALUE);
    //    response.setHeader(HttpHeaders.PRAGMA, "No-cache");
    //    response.setHeader(HttpHeaders.CACHE_CONTROL, "No-cache");
    //    response.setDateHeader(HttpHeaders.EXPIRES, 0L);
    //
    //    Captcha captcha = new ArithmeticCaptcha(115, 42);
    //    captcha.setCharType(2);
    //    redisCache.setCacheObject(CacheKey.CAPTCHA+":"+key, StringUtils.lowerCase(captcha.text()),5, TimeUnit.MINUTES);
    //    //cache.set(CacheKey.CAPTCHA, key, StringUtils.lowerCase(captcha.text()));
    //    captcha.out(response.getOutputStream());
    //}
    //
    //@Override
    //public boolean check(String key, String value) {
    //    if (StringUtils.isBlank(value)) {
    //        throw BizException.validFail("请输入验证码");
    //    }
    //    String cacheObject = redisCache.getCacheObject(CacheKey.CAPTCHA + ":" + key);
    //    //CacheObject cacheObject = cache.get(CacheKey.CAPTCHA, key);
    //    if (cacheObject == null) {
    //        throw BizException.validFail("验证码已过期");
    //    }
    //    if (!StringUtils.equalsIgnoreCase(value, String.valueOf(cacheObject))) {
    //        throw BizException.validFail("验证码不正确");
    //    }
    //    //验证通过，立即从缓存中删除验证码
    //    redisCache.deleteObject(CacheKey.CAPTCHA+":"+ key);
    //    //cache.evict(CacheKey.CAPTCHA, key);
    //    return true;
    //}
    //
    //private Captcha createCaptcha(String type) {
    //    Captcha captcha = null;
    //    if (StringUtils.equalsIgnoreCase(type, "gif")) {
    //        captcha = new GifCaptcha(115, 42, 4);
    //    } else if (StringUtils.equalsIgnoreCase(type, "png")) {
    //        captcha = new SpecCaptcha(115, 42, 4);
    //    } else if (StringUtils.equalsIgnoreCase(type, "arithmetic")) {
    //        captcha = new ArithmeticCaptcha(115, 42);
    //    } else if (StringUtils.equalsIgnoreCase(type, "chinese")) {
    //        captcha = new ChineseCaptcha(115, 42);
    //    }
    //    captcha.setCharType(2);
    //    return captcha;
    //}
    //
    //private void setHeader(HttpServletResponse response, String type) {
    //    if (StringUtils.equalsIgnoreCase(type, "gif")) {
    //        response.setContentType(MediaType.IMAGE_GIF_VALUE);
    //    } else {
    //        response.setContentType(MediaType.IMAGE_PNG_VALUE);
    //    }
    //    response.setHeader(HttpHeaders.PRAGMA, "No-cache");
    //    response.setHeader(HttpHeaders.CACHE_CONTROL, "No-cache");
    //    response.setDateHeader(HttpHeaders.EXPIRES, 0L);
    //}
}
