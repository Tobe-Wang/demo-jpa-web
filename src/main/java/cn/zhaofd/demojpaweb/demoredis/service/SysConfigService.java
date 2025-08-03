/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.service;

import cn.zhaofd.core.spring.redis.core.service.BaseHashRedisService;
import cn.zhaofd.demojpaweb.demoredis.dto.SysConfig;
import cn.zhaofd.demojpaweb.demoredis.repository.StringRedisRepository;
import cn.zhaofd.demojpaweb.demoredis.repository.SysConfigRepository;
import org.springframework.stereotype.Service;

/**
 * 继承core-spring-redis的应用示例
 */
@Service
public class SysConfigService extends BaseHashRedisService<SysConfig, SysConfigRepository, StringRedisRepository> {
}
