/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.modules.demojpa.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

/**
 * jpa直接应用示例
 */
@Entity
@Table(name = "sys_info")
public class SysInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Size(max = 32)
    @Column(name = "name", length = 32)
    private String name;

    @CreationTimestamp
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "rcreatetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant rcreatetime;

    @UpdateTimestamp
    @Column(name = "rupdatetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Instant rupdatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getRcreatetime() {
        return rcreatetime;
    }

    public void setRcreatetime(Instant rcreatetime) {
        this.rcreatetime = rcreatetime;
    }

    public Instant getRupdatetime() {
        return rupdatetime;
    }

    public void setRupdatetime(Instant rupdatetime) {
        this.rupdatetime = rupdatetime;
    }

}