/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.web;

import cn.zhaofd.core.spring.redis.core.web.BaseStringRedisController;
import cn.zhaofd.demojpaweb.demoredis.service.StringRedisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 继承core-spring-redis的应用示例
 */
@RestController
@RequestMapping("/cache/string")
public class StringRedisController extends BaseStringRedisController<StringRedisService> {
}
