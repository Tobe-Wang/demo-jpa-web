/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demo.web;

import cn.zhaofd.core.spring.jpa.core.web.BaseController;
import cn.zhaofd.demojpaweb.demo.dto.SysUser;
import cn.zhaofd.demojpaweb.demo.service.SysUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 继承core-spring-jpa的应用示例
 */
@RestController
@RequestMapping("/sys/user")
public class SysUserController extends BaseController<SysUser, Integer, SysUserService> {
}
