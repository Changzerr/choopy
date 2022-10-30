package cn.changzer.choppy.biz.dao.auth;

import cn.changzer.choppy.dto.auth.ResourceQueryDTO;
import cn.changzer.choppy.entity.auth.Resource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * 资源
 * </p>
 *
 */
@Repository
public interface ResourceMapper extends BaseMapper<Resource> {
    /**
     * 查询用户拥有的资源
     */
    List<Resource> findVisibleResource(ResourceQueryDTO resource);

    List<Long> findMenuIdByResourceId(@Param("resourceIdList") List<Long> resourceIdList);
}
