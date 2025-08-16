/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demojpa.service;

import cn.zhaofd.core.spring.jpa.core.service.BaseService;
import cn.zhaofd.demojpaweb.modules.demojpa.dto.SysUser;
import cn.zhaofd.demojpaweb.modules.demojpa.repository.SysUserRepository;
import org.springframework.stereotype.Service;

/**
 * 继承core-spring-jpa的应用示例
 */
@Service
public class SysUserService extends BaseService<SysUser, Integer, SysUserRepository> {
}
