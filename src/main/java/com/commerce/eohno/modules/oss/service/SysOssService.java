package com.commerce.eohno.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.commerce.eohno.common.utils.PageUtils;
import com.commerce.eohno.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Wanda
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
