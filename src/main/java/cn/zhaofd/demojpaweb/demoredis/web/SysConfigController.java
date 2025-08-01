/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demoredis.web;

import cn.zhaofd.core.spring.redis.core.web.BaseHashRedisController;
import cn.zhaofd.demojpaweb.demoredis.dto.SysConfig;
import cn.zhaofd.demojpaweb.demoredis.service.SysConfigService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/config")
public class SysConfigController extends BaseHashRedisController<SysConfig, SysConfigService> {
}
