package com.commerce.eohno.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author Wanda
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

	String value() default "";
}
