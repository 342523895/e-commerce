package com.commerce.eohno.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.eohno.modules.job.entity.ScheduleJobEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Wanda
 */
@Repository
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
