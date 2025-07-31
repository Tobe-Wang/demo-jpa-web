/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.repository;

import cn.zhaofd.core.spring.redis.core.repository.BaseStringRedisRepository;
import org.springframework.stereotype.Repository;

/**
 * String键值对的redis缓存
 */
@Repository
public class StringRedisRepository extends BaseStringRedisRepository {
}
