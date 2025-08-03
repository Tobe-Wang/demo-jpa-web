/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.repository;

import cn.zhaofd.core.spring.redis.core.repository.BaseHashRedisRepository;
import cn.zhaofd.demojpaweb.demoredis.dto.SysConfig;
import org.springframework.stereotype.Repository;

/**
 * 继承core-spring-redis的应用示例
 */
@Repository
public class SysConfigRepository extends BaseHashRedisRepository<SysConfig> {
}
