package cn.changzer.choppy.biz.service.auth.impl;

import cn.changzer.choppy.biz.dao.auth.RoleMapper;
import cn.changzer.choppy.biz.service.auth.*;
import cn.changzer.choppy.dto.auth.RoleSaveDTO;
import cn.changzer.choppy.dto.auth.RoleUpdateDTO;
import cn.changzer.choppy.entity.auth.*;
import cn.changzer.choppy.enums.CacheKey;
import cn.changzer.choppy.redis.RedisCache;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 业务实现类
 * 角色
 */
@Slf4j
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    @Override
    public boolean removeById(List<Long> ids) {
        return false;
    }

    @Override
    public List<Role> findRoleByUserId(Long userId) {
        return null;
    }

    @Override
    public void saveRole(RoleSaveDTO data, Long userId) {

    }

    @Override
    public void updateRole(RoleUpdateDTO role, Long userId) {

    }

    @Override
    public List<Long> findUserIdByCode(String[] codes) {
        return null;
    }

    @Override
    public Boolean check(String code) {
        return null;
    }
    //@Autowired
    //private RedisCache redisCache;
    //@Autowired
    //private DozerUtils dozer;
    //@Autowired
    //private RoleOrgService roleOrgService;
    //@Autowired
    //private RoleAuthorityService roleAuthorityService;
    //@Autowired
    //private UserRoleService userRoleService;
    //@Autowired
    //private UserService userService;
    //@Autowired
    //private CodeGenerate codeGenerate;
    //
    //@Override
    //public boolean removeById(List<Long> ids) {
    //    if (ids.isEmpty()) {
    //        return true;
    //    }
    //    ids.forEach(roleId -> {
    //        List<User> userList = userService.findUserByRoleId(roleId, null);
    //        if(userList != null && userList.size() > 0){
    //            userList.forEach(user -> {
    //                redisCache.deleteObject(CacheKey.USER_RESOURCE+":"+ user.getId().toString());
    //                //cache.evict(CacheKey.USER_RESOURCE, user.getId().toString());
    //            });
    //        }
    //    });
    //
    //    //删除主表pd_auth_role数据
    //    super.removeByIds(ids);
    //    //删除pd_auth_role_org关系表数据
    //    roleOrgService.remove(Wraps.<RoleOrg>lbQ().in(RoleOrg::getRoleId, ids));
    //    //删除pd_auth_role_authority关系表数据
    //    roleAuthorityService.remove(Wraps.<RoleAuthority>lbQ().in(RoleAuthority::getRoleId, ids));
    //    //删除pd_auth_user_role关系表数据
    //    userRoleService.remove(Wraps.<UserRole>lbQ().in(UserRole::getRoleId,ids));
    //
    //    return true;
    //}
    //
    //@Override
    //public List<Role> findRoleByUserId(Long userId) {
    //    return baseMapper.findRoleByUserId(userId);
    //}
    //
    ///**
    // * 1，保存角色
    // * 2，保存 与组织的关系
    // */
    //@Override
    //public void saveRole(RoleSaveDTO data, Long userId) {
    //    Role role = dozer.map(data, Role.class);
    //    role.setCode(StrHelper.getOrDef(data.getCode(), codeGenerate.next()));
    //    role.setReadonly(false);
    //    super.save(role);
    //    saveRoleOrg(userId, role, data.getOrgList());
    //}
    //
    //@Override
    //public void updateRole(RoleUpdateDTO data, Long userId) {
    //    Role role = dozer.map(data, Role.class);
    //    super.updateById(role);
    //
    //    roleOrgService.remove(Wraps.<RoleOrg>lbQ().eq(RoleOrg::getRoleId, data.getId()));
    //    saveRoleOrg(userId, role, data.getOrgList());
    //}
    //
    //private void saveRoleOrg(Long userId, Role role, List<Long> orgList) {
    //    if (orgList != null && !orgList.isEmpty()) {
    //        List<RoleOrg> list = orgList.stream().map((orgId) ->
    //                RoleOrg.builder()
    //                        .orgId(orgId).roleId(role.getId())
    //                        .build()
    //        ).collect(Collectors.toList());
    //        roleOrgService.saveBatch(list);
    //    }
    //}
    //
    //@Override
    //public List<Long> findUserIdByCode(String[] codes) {
    //    return baseMapper.findUserIdByCode(codes);
    //}
    //
    //@Override
    //public Boolean check(String code) {
    //    return super.count(Wraps.<Role>lbQ().eq(Role::getCode, code)) > 0;
    //}
}
