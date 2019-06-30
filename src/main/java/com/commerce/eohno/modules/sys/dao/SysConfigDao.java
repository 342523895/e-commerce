package com.commerce.eohno.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.eohno.modules.sys.entity.SysConfigEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 系统配置信息
 *
 * @author Wanda
 */
@Repository
public interface SysConfigDao extends BaseMapper<SysConfigEntity> {

	/**
	 * 根据key，查询value
	 */
	SysConfigEntity queryByKey(String paramKey);

	/**
	 * 根据key，更新value
	 */
	int updateValueByKey(@Param("paramKey") String paramKey, @Param("paramValue") String paramValue);
	
}
