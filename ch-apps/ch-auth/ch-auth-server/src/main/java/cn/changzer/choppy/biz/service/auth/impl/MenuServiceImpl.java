package cn.changzer.choppy.biz.service.auth.impl;



import cn.changzer.choppy.biz.dao.auth.MenuMapper;
import cn.changzer.choppy.biz.service.auth.MenuService;
import cn.changzer.choppy.entity.auth.Menu;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 业务实现类
 * 菜单
 */
@Slf4j
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
    @Override
    public boolean removeByIds(List<Long> ids) {
        return false;
    }

    @Override
    public List<Menu> findVisibleMenu(String group, Long userId) {
        return null;
    }
    //@Autowired
    //private ResourceService resourceService;
    //
    //@Override
    //public List<Menu> findVisibleMenu(String group, Long userId) {
    //    List<Menu> visibleMenu = baseMapper.findVisibleMenu(group, userId);
    //    return visibleMenu;
    //}
    //
    //@Override
    //public boolean removeByIds(List<Long> ids) {
    //    if (ids.isEmpty()) {
    //        return true;
    //    }
    //    boolean result = super.removeByIds(ids);
    //    if (result) {
    //        resourceService.removeByMenuId(ids);
    //    }
    //    return result;
    //}
    //
    //@Override
    //public boolean save(Menu menu) {
    //    menu.setIsEnable(NumberHelper.getOrDef(menu.getIsEnable(), true));
    //    menu.setIsPublic(NumberHelper.getOrDef(menu.getIsPublic(), false));
    //    menu.setParentId(NumberHelper.getOrDef(menu.getParentId(), DEF_PARENT_ID));
    //
    //    super.save(menu);
    //    return true;
    //}
}
