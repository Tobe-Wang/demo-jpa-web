/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.web;

import cn.zhaofd.core.spring.redis.core.web.BaseHashRedisController;
import cn.zhaofd.demojpaweb.demoredis.dto.SysCode;
import cn.zhaofd.demojpaweb.demoredis.service.SysCodeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 继承core-spring-redis的应用示例
 */
@RestController
@RequestMapping("/sys/code")
public class SysCodeController extends BaseHashRedisController<SysCode, SysCodeService> {
}
