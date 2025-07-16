package cn.zhaofd.demojpaweb.demo.dto;

/**
 * sys_info表统计结果
 */
public class SysInfoStat {
    private String name;
    private Long count;

    public SysInfoStat(String name, Long count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
