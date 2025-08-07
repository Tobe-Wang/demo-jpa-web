/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demojdbc.repository;

import cn.zhaofd.core.spring.jpa.core.repository.BaseJdbcRepository;
import cn.zhaofd.demojpaweb.demojdbc.dto.SysParam;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;

/**
 * 继承BaseJdbcRepository的应用示例
 */
@Repository
public class SysParamJdbcRepository extends BaseJdbcRepository<SysParam, Integer> {
    /**
     * 获取行映射器
     *
     * @return 行映射器
     */
    @Override
    protected RowMapper<SysParam> getRowMapper() {
        return (ResultSet rs, int rowNum) -> {
            SysParam sysParam = new SysParam();
            sysParam.setId(rs.getInt("id"));
            sysParam.setCode(rs.getString("code"));
            sysParam.setValue(rs.getString("value"));
            sysParam.setRegtime(rs.getTimestamp("regtime").toLocalDateTime());
            return sysParam;
        };
    }

    /**
     * 根据id查询
     *
     * @param id 主键
     * @return SysParam
     */
    public SysParam findById(Integer id) {
        String sql = "select id, code, value, regtime from sys_param where id = ?";
        return super.findById(sql, id);
    }

    /**
     * 根据code模糊查询
     *
     * @param code 代码
     * @return {@code List<SysParam>}
     */
    public List<SysParam> findByCodeLike(String code) {
        String sql = "select id, code, value, regtime from sys_param where code like concat('%', ?, '%')";
        return super.find(sql, code);
    }

    /**
     * 新增保存
     *
     * @param sysParam 系统参数
     * @return SysParam
     */
    public SysParam save(SysParam sysParam) {
        String sql = "insert into sys_param (code, value, regtime) values (?, ?, ?)";
        int[] types = {Types.VARCHAR, Types.VARCHAR, Types.TIMESTAMP};
        List<?> values = Arrays.asList(sysParam.getCode(), sysParam.getValue(), sysParam.getRegtime());

        long id = super.saveAndGetId(sql, types, values);
        sysParam.setId(Math.toIntExact(id));
        return sysParam;
    }

    /**
     * 修改保存
     *
     * @param sysParam 系统参数
     * @return SysParam
     */
    public SysParam update(SysParam sysParam) {
        String sql = "update sys_param set code = ?, value = ?, regtime = ? where id = ?";
        int num = super.save(sql, sysParam.getCode(), sysParam.getValue(), sysParam.getRegtime(), sysParam.getId());
        return num > 0 ? sysParam : null;
    }

    /**
     * 删除
     *
     * @param id 主键
     * @return 删除数量
     */
    public int delete(Integer id) {
        String sql = "delete from sys_param where id = ?";
        return super.delete(sql, id);
    }
}
