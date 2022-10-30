package cn.changzer.choppy.biz.service.auth.impl;

import cn.changzer.choppy.biz.dao.auth.ResourceMapper;
import cn.changzer.choppy.biz.service.auth.ResourceService;
import cn.changzer.choppy.dto.auth.ResourceQueryDTO;
import cn.changzer.choppy.entity.auth.Resource;
import cn.changzer.choppy.exception.BizException;
import cn.changzer.choppy.redis.RedisCache;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 业务实现类
 * 资源
 */
@Slf4j
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {
    @Override
    public List<Resource> findVisibleResource(ResourceQueryDTO resource) {
        return null;
    }

    @Override
    public void removeByMenuId(List<Long> menuIds) {

    }

    @Override
    public List<Long> findMenuIdByResourceId(List<Long> resourceIdList) {
        return null;
    }
    //@Autowired
    //private RedisCache redisCache;
    //@Autowired
    //private CodeGenerate codeGenerate;
    ///**
    // * 查询用户的可用资源
    // */
    //@Override
    //public List<Resource> findVisibleResource(ResourceQueryDTO resourceQueryDTO) {
    //    //查询当前用户可访问的资源
    //    List<Resource> visibleResource = baseMapper.findVisibleResource(resourceQueryDTO);
    //    return visibleResource;
    //}
    //
    //@Override
    //public void removeByMenuId(List<Long> menuIds) {
    //    List<Resource> resources = super.list(Wraps.<Resource>lbQ().in(Resource::getMenuId, menuIds));
    //    if (resources.isEmpty()) {
    //        return;
    //    }
    //    List<Long> idList = resources.stream().mapToLong(Resource::getId).boxed().collect(Collectors.toList());
    //    super.removeByIds(idList);
    //}
    //
    //@Override
    //public boolean save(Resource resource) {
    //    resource.setCode(StrHelper.getOrDef(resource.getCode(), codeGenerate.next()));
    //    if (super.count(Wraps.<Resource>lbQ().eq(Resource::getCode, resource.getCode())) > 0) {
    //        throw BizException.validFail("编码[%s]重复", resource.getCode());
    //    }
    //    super.save(resource);
    //    return true;
    //}
    //
    //@Override
    //public List<Long> findMenuIdByResourceId(List<Long> resourceIdList) {
    //    return baseMapper.findMenuIdByResourceId(resourceIdList);
    //}
}
