package com.commerce.eohno.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.eohno.modules.sys.entity.SysRoleEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 角色管理
 *
 * @author Wanda
 */
@Repository
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
