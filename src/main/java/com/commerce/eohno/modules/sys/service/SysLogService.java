package com.commerce.eohno.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.commerce.eohno.common.utils.PageUtils;
import com.commerce.eohno.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Wanda
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
