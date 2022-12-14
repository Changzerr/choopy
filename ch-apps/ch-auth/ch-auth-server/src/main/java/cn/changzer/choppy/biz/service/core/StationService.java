package cn.changzer.choppy.biz.service.core;
import cn.changzer.choppy.dto.core.StationPageDTO;
import cn.changzer.choppy.entity.core.Station;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 业务接口
 * 岗位
 */
public interface StationService extends IService<Station> {
    /**
     * 分页
     */
    IPage<Station> findStationPage(Page page, StationPageDTO data);
}
