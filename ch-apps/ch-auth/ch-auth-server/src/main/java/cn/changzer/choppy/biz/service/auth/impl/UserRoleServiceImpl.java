package cn.changzer.choppy.biz.service.auth.impl;

import cn.changzer.choppy.biz.dao.auth.UserRoleMapper;
import cn.changzer.choppy.biz.service.auth.UserRoleService;
import cn.changzer.choppy.entity.auth.UserRole;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 业务实现类
 * 角色分配
 * 账号角色绑定
 */
@Slf4j
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
}
