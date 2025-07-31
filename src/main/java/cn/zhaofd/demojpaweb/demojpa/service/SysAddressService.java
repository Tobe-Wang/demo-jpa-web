/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demojpa.service;

import cn.zhaofd.core.spring.jpa.core.service.BaseService;
import cn.zhaofd.demojpaweb.demojpa.dto.SysAddress;
import cn.zhaofd.demojpaweb.demojpa.repository.SysAddressRepository;
import org.springframework.stereotype.Service;

/**
 * 继承core-spring-jpa的应用示例(启用缓存)
 */
@Service
public class SysAddressService extends BaseService<SysAddress, Integer, SysAddressRepository> {
    /**
     * 是否启用缓存
     * <br />辅助方法用于缓存注解中的condition检查
     *
     * @return true启用缓存；false不启用缓存
     */
    @Override
    public boolean isCacheEnabled() {
        return true;
    }
}
