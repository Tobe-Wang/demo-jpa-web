package cn.zhaofd.demojpaweb.demo.repository;

import cn.zhaofd.core.spring.jpa.core.repository.BaseRepository;
import cn.zhaofd.demojpaweb.demo.dto.SysUser;

/**
 * 继承core-spring-jpa的应用示例
 */
public interface SysUserRepository extends BaseRepository<SysUser, Integer> {
}
