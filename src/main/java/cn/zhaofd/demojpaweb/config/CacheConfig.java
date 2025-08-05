/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.config;

import cn.zhaofd.core.spring.jpa.config.cache.DynamicCacheResolver;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 缓存配置
 */
@Configuration
@EnableCaching
@ComponentScan(basePackageClasses = DynamicCacheResolver.class)
public class CacheConfig {
}
