package cn.changzer.choppy.biz.service.auth;

import cn.changzer.choppy.entity.auth.RoleOrg;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 业务接口
 * 角色组织关系
 */
public interface RoleOrgService extends IService<RoleOrg> {
    /**
     * 根据角色id查询
     */
    List<Long> listOrgByRoleId(Long id);
}
