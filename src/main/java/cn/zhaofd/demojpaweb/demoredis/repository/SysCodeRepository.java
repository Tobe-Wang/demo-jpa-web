/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.repository;

import cn.zhaofd.core.spring.redis.core.repository.BaseHashRedisRepository;
import cn.zhaofd.demojpaweb.demoredis.dto.SysCode;
import org.springframework.stereotype.Repository;

@Repository
public class SysCodeRepository extends BaseHashRedisRepository<SysCode> {
}
