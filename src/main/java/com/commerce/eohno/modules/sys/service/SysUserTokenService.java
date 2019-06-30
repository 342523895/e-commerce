package com.commerce.eohno.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.commerce.eohno.common.utils.R;
import com.commerce.eohno.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 *
 * @author Wanda
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
