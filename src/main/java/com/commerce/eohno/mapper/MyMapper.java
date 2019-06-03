package com.commerce.eohno.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author WanDa
 * @Date 2019/6/3 13:46
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
