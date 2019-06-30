package com.commerce.eohno.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.commerce.eohno.common.utils.PageUtils;
import com.commerce.eohno.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Wanda
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
