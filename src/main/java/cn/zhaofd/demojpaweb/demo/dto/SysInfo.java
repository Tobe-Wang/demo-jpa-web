package cn.zhaofd.demojpaweb.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
@Table(name = "sys_info")
public class SysInfo {
    @Id
    @Size(max = 32)
    @Column(name = "id", nullable = false, length = 32)
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    private String id;

    @Size(max = 32)
    @Column(name = "name", length = 32)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "rcreatetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Instant rcreatetime;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "rupdatetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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