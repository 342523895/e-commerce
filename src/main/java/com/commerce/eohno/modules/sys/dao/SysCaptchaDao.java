package com.commerce.eohno.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.eohno.modules.sys.entity.SysCaptchaEntity;
import org.springframework.stereotype.Repository;

/**
 * 验证码
 *
 * @author Wanda
 */
@Repository
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
