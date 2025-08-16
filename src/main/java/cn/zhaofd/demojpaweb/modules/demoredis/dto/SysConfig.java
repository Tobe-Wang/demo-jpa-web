/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demoredis.dto;

import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;

public class SysConfig implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Size(max = 10)
    private String key;

    @Size(max = 10)
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
