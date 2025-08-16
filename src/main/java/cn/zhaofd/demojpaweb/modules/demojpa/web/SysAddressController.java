/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demojpa.web;

import cn.zhaofd.core.spring.jpa.core.web.BaseController;
import cn.zhaofd.demojpaweb.modules.demojpa.dto.SysAddress;
import cn.zhaofd.demojpaweb.modules.demojpa.service.SysAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 继承core-spring-jpa的应用示例(启用缓存)
 */
@RestController
@RequestMapping("/sys/address")
public class SysAddressController extends BaseController<SysAddress, Integer, SysAddressService> {
}
