package cn.zhaofd.demojpaweb.demo.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "sys_info")
public class SysInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 32)
    @Column(name = "name", length = 32)
    private String name;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "rcreatetime")
    private Instant rcreatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

}