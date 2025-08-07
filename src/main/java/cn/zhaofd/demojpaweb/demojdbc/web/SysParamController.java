/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demojdbc.web;

import cn.zhaofd.core.net.exception.HttpException;
import cn.zhaofd.core.spring.validation.ValidationUtil;
import cn.zhaofd.demojpaweb.demojdbc.dto.SysParam;
import cn.zhaofd.demojpaweb.demojdbc.service.SysParamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 继承BaseJdbcRepository的应用示例
 */
@RestController
@RequestMapping("/sys/param")
public class SysParamController {
    private final SysParamService sysParamService;

    public SysParamController(@Autowired SysParamService sysParamService) {
        this.sysParamService = sysParamService;
    }

    /**
     * 根据id查询
     *
     * @param id id
     * @return SysParam
     */
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SysParam findById(@PathVariable("id") Integer id) {
        return sysParamService.findById(id);
    }

    /**
     * 根据code模糊查询
     *
     * @param code 代码
     * @return List<SysParam>
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysParam> findByCodeLike(@RequestParam String code) {
        return sysParamService.findByCodeLike(code);
    }

    /**
     * 新增保存(前端json对象数据)
     *
     * @param sysParam 系统参数
     * @param errors   Errors对象
     * @return 保存后的DTO数据传输对象
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public SysParam save(@Valid @RequestBody SysParam sysParam, Errors errors) {
        // 输入参数验证
        if (errors.hasErrors()) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), ValidationUtil.getFieldErrorMsg(errors));
        }

        return sysParamService.save(sysParam);
    }

    /**
     * 修改(前端json对象数据)
     *
     * @param sysParam 系统参数
     * @param errors   Errors对象
     * @return 修改后的DTO数据传输对象
     */
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SysParam update(@Valid @RequestBody SysParam sysParam, Errors errors) {
        // 输入参数验证
        if (errors.hasErrors()) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), ValidationUtil.getFieldErrorMsg(errors));
        }

        // 验证主键字段是否有值
        if (sysParam.getId() == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), "主键字段值不能为空");
        }

        return sysParamService.update(sysParam);
    }

    /**
     * 删除
     *
     * @param id 主键id
     */
    @DeleteMapping(value = "/{id}")
    public Integer deleteById(@PathVariable("id") Integer id) {
        return sysParamService.delete(id);
    }
}
