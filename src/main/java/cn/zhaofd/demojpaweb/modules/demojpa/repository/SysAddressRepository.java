/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demojpa.repository;

import cn.zhaofd.core.spring.jpa.core.repository.BaseRepository;
import cn.zhaofd.demojpaweb.modules.demojpa.dto.SysAddress;

/**
 * 继承core-spring-jpa的应用示例(启用缓存)
 */
public interface SysAddressRepository extends BaseRepository<SysAddress, Integer> {
}
