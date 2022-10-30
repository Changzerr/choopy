package cn.changzer.choppy.biz.service.common.impl;

import cn.changzer.choppy.biz.dao.common.OptLogMapper;
import cn.changzer.choppy.biz.service.common.OptLogService;
import cn.changzer.choppy.entity.common.OptLog;
import cn.changzer.choppy.log.entity.OptLogDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务实现类
 * 操作日志
 */
@Slf4j
@Service
public class OptLogServiceImpl extends ServiceImpl<OptLogMapper, OptLog> implements OptLogService {
    @Override
    public boolean save(OptLogDTO entity) {
        return false;
    }

    //@Autowired
    //DozerUtils dozer;
    //
    //@Override
    //public boolean save(OptLogDTO entity) {
    //    return super.save(dozer.map(entity, OptLog.class));
    //}
}
