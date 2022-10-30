package cn.changzer.choppy.biz.service.common;
import cn.changzer.choppy.entity.common.OptLog;
import cn.changzer.choppy.log.entity.OptLogDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 业务接口
 * 操作日志
 */
public interface OptLogService extends IService<OptLog> {
    /**
     * 保存日志
     */
    boolean save(OptLogDTO entity);
}
