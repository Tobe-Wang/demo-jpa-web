/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demoredis.web;

import cn.zhaofd.core.spring.redis.core.web.BaseHashRedisController;
import cn.zhaofd.demojpaweb.modules.demoredis.dto.SysConfig;
import cn.zhaofd.demojpaweb.modules.demoredis.service.SysConfigService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 继承core-spring-redis的应用示例
 */
@RestController
@RequestMapping("/sys/config")
public class SysConfigController extends BaseHashRedisController<SysConfig, SysConfigService> {
}
