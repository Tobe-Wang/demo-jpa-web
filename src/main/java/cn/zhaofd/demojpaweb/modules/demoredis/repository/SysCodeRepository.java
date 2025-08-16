/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demoredis.repository;

import cn.zhaofd.core.spring.redis.core.repository.BaseHashRedisRepository;
import cn.zhaofd.demojpaweb.modules.demoredis.dto.SysCode;
import org.springframework.stereotype.Repository;

/**
 * 继承core-spring-redis的应用示例
 */
@Repository
public class SysCodeRepository extends BaseHashRedisRepository<SysCode> {
}
