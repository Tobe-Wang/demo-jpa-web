/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demojdbc.service;

import cn.zhaofd.demojpaweb.modules.demojdbc.dto.SysParam;
import cn.zhaofd.demojpaweb.modules.demojdbc.repository.SysParamJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 继承BaseJdbcRepository的应用示例
 */
@Service
public class SysParamService {
    private final SysParamJdbcRepository sysParamJdbcRepository;

    public SysParamService(@Autowired SysParamJdbcRepository sysParamJdbcRepository) {
        this.sysParamJdbcRepository = sysParamJdbcRepository;
    }

    /**
     * 根据id查询
     *
     * @param id 主键
     * @return SysParam
     */
    public SysParam findById(Integer id) {
        return sysParamJdbcRepository.findById(id);
    }

    /**
     * 根据code模糊查询
     *
     * @param code 代码
     * @return {@code List<SysParam>}
     */
    public List<SysParam> findByCodeLike(String code) {
        return sysParamJdbcRepository.findByCodeLike(code);
    }

    /**
     * 新增保存
     *
     * @param sysParam 系统参数
     * @return SysParam
     */
    public SysParam save(SysParam sysParam) {
        return sysParamJdbcRepository.save(sysParam);
    }

    /**
     * 修改保存
     *
     * @param sysParam 系统参数
     * @return SysParam
     */
    public SysParam update(SysParam sysParam) {
        return sysParamJdbcRepository.update(sysParam);
    }

    /**
     * 删除
     *
     * @param id 主键
     * @return 删除数量
     */
    public int delete(Integer id) {
        return sysParamJdbcRepository.delete(id);
    }
}
