package cn.changzer.choppy.biz.service.auth;

import cn.changzer.choppy.dto.auth.ResourceQueryDTO;
import cn.changzer.choppy.entity.auth.Resource;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 业务接口
 * 资源
 */
public interface ResourceService extends IService<Resource> {
    /**
     * 查询 拥有的资源
     */
    List<Resource> findVisibleResource(ResourceQueryDTO resource);

    /**
     * 根据菜单id删除资源
     */
    void removeByMenuId(List<Long> menuIds);

    /**
     * 根据资源id 查询菜单id
     */
    List<Long> findMenuIdByResourceId(List<Long> resourceIdList);
}
