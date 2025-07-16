package cn.zhaofd.demojpaweb.demo.dto;

/**
 * sys_info表统计结果
 */
public class SysInfoStat {
    private String name;
    private Integer count;

    public SysInfoStat(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
