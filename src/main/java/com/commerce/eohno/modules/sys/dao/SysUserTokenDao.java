package com.commerce.eohno.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.eohno.modules.sys.entity.SysUserTokenEntity;
import org.springframework.stereotype.Repository;

/**
 * 系统用户Token
 *
 * @author Wanda
 */
@Repository
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
