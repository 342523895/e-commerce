package com.commerce.eohno.common.utils;

/**
 * Redis所有Keys
 *
 * @author Wanda
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
