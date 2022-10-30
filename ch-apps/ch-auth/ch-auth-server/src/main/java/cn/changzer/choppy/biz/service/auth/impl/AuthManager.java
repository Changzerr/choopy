package cn.changzer.choppy.biz.service.auth.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lingqu
 * @date 2022/10/7
 * @apiNote
 */
@Service
@Slf4j
public class AuthManager {
    //@Autowired
    //private UserService userService;
    //@Autowired
    //private DozerUtils dozerUtils;
    //@Autowired
    //private ResourceService resourceService;
    //@Autowired
    //private RedisCache redisCache;
    //
    //public Result<LoginDTO> login(String account, String password) {
    //    //校验账号密码是否正确
    //    User user = userService.getOne(Wrappers.<User>lambdaQuery().eq(User::getAccount, account));
    //    boolean check = check(user, password);
    //    if(!check){
    //        return Result.fail(CommonCode.FAILURE_TO_LOGIN);
    //    }
    //    UserDTO userDTO = dozerUtils.map(user, UserDTO.class);
    //
    //    //为用户生成jwt令牌
    //    String token = createToken(user);
    //
    //    //查询当前用户可以访问的资源权限
    //    List<String> permissionList = null;
    //    List<Resource> visibleResource = resourceService.findVisibleResource(ResourceQueryDTO.builder().userId(user.getId()).build());
    //    log.info("权限为：{}",visibleResource);
    //    if(visibleResource!=null && visibleResource.size() > 0){
    //        //将用户对应的权限（前端）缓存
    //        permissionList = visibleResource.stream().map(Resource::getCode).collect(Collectors.toList());
    //
    //        //将用户对应的权限（网关后端）缓存
    //        List<String> canResource = visibleResource.stream().map((resource) -> {
    //            return resource.getMethod() + resource.getUrl();
    //        }).collect(Collectors.toList());
    //        redisCache.setCacheList(CacheKey.USER_RESOURCE+":"+ user.getId(),canResource);
    //        redisCache.expire(CacheKey.USER_RESOURCE+":"+ user.getId(),2, TimeUnit.HOURS);
    //        //cacheChannel.set(CacheKey.USER_RESOURCE, user.getId().toString(), canResource);
    //    }
    //
    //    //封装返回结果
    //    LoginDTO loginDTO = LoginDTO.builder().user(userDTO)
    //            .token(token)
    //            .permissionsList(permissionList)
    //            .build();
    //    return Result.success(CommonCode.SUCCESS_LOGIN,loginDTO);
    //
    //}
    ////校验账号密码是否正确
    //private boolean check(User user, String password) {
    //    //密码加密
    //    String md5Hex = DigestUtils.md5Hex(password);
    //    return user != null && md5Hex.equals(user.getPassword());
    //}
    //
    ////为用户生成jwt令牌
    //private String createToken(User user){
    //    return TokenUtil.createToken(user.getId())
    //}
}
