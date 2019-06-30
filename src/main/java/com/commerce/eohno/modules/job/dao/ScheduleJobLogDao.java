package com.commerce.eohno.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.eohno.modules.job.entity.ScheduleJobLogEntity;
import org.springframework.stereotype.Repository;

/**
 * 定时任务日志
 *
 * @author Wanda
 */
@Repository
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
