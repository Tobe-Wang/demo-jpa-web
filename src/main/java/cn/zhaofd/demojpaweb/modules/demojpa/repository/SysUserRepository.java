/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demojpa.repository;

import cn.zhaofd.core.spring.jpa.core.repository.BaseRepository;
import cn.zhaofd.demojpaweb.modules.demojpa.dto.SysUser;

/**
 * 继承core-spring-jpa的应用示例
 */
public interface SysUserRepository extends BaseRepository<SysUser, Integer> {
}
