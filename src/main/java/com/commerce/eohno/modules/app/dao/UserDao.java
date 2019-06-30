package com.commerce.eohno.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.eohno.modules.app.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * 用户
 *
 * @author Wanda
 */
@Repository
public interface UserDao extends BaseMapper<UserEntity> {

}
