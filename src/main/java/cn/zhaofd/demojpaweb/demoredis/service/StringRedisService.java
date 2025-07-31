/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.service;

import cn.zhaofd.core.spring.redis.core.service.BaseStringRedisService;
import cn.zhaofd.demojpaweb.demoredis.repository.StringRedisRepository;
import org.springframework.stereotype.Service;

/**
 * String键值对的redis缓存
 */
@Service
public class StringRedisService extends BaseStringRedisService<StringRedisRepository> {
}
