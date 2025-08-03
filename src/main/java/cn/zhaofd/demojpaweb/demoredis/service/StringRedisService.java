/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.service;

import cn.zhaofd.core.spring.redis.core.service.BaseStringRedisService;
import cn.zhaofd.demojpaweb.demoredis.repository.StringRedisRepository;
import org.springframework.stereotype.Service;

/**
 * 继承core-spring-redis的应用示例
 */
@Service
public class StringRedisService extends BaseStringRedisService<StringRedisRepository> {
}
