package cn.changzer.choppy.biz.service.auth.impl;

import cn.changzer.choppy.biz.dao.auth.RoleOrgMapper;
import cn.changzer.choppy.biz.service.auth.RoleOrgService;
import cn.changzer.choppy.entity.auth.RoleOrg;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 业务实现类
 * 角色组织关系
 */
@Slf4j
@Service
public class RoleOrgServiceImpl extends ServiceImpl<RoleOrgMapper, RoleOrg> implements RoleOrgService {
    @Override
    public List<Long> listOrgByRoleId(Long id) {
        return null;
    }
    //@Override
    //public List<Long> listOrgByRoleId(Long id) {
    //    List<RoleOrg> list = super.list(Wraps.<RoleOrg>lbQ().eq(RoleOrg::getRoleId, id));
    //    List<Long> orgList = list.stream().mapToLong(RoleOrg::getOrgId).boxed().collect(Collectors.toList());
    //    return orgList;
    //}
}
