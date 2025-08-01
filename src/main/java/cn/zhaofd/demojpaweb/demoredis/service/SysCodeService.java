/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.service;

import cn.zhaofd.core.spring.redis.core.service.BaseHashRedisService;
import cn.zhaofd.demojpaweb.demoredis.dto.SysCode;
import cn.zhaofd.demojpaweb.demoredis.repository.StringRedisRepository;
import cn.zhaofd.demojpaweb.demoredis.repository.SysCodeRepository;
import org.springframework.stereotype.Service;

@Service
public class SysCodeService extends BaseHashRedisService<SysCode, SysCodeRepository, StringRedisRepository> {
}
