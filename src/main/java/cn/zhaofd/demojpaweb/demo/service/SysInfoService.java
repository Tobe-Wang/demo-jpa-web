package cn.zhaofd.demojpaweb.demo.service;

import cn.zhaofd.demojpaweb.demo.dto.SysInfo;
import cn.zhaofd.demojpaweb.demo.dto.SysInfoStat;
import cn.zhaofd.demojpaweb.demo.repository.SysInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * jpa直接应用示例
 */
@Service
public class SysInfoService {
    private final SysInfoRepository sysInfoRepository;

    @Autowired
    public SysInfoService(SysInfoRepository sysInfoRepository) {
        this.sysInfoRepository = sysInfoRepository;
    }

    public List<SysInfo> findByName(String name) {
        return sysInfoRepository.findByName(name);
    }

    public List<SysInfo> findByNameLike(String name) {
        return sysInfoRepository.findByNameLike(name);
    }

    public List<SysInfo> findByIdAndName(String id, String name) {
        return sysInfoRepository.findByIdAndName(id, name);
    }

    public List<SysInfo> findByNameLike(String name, Sort sort) {
        return sysInfoRepository.findByNameLike(name, sort);
    }

    public Page<SysInfo> findByNameLike(String name, Pageable pageable) {
        return sysInfoRepository.findByNameLike(name, pageable);
    }

    public List<SysInfo> findLike(String name) {
        return sysInfoRepository.findLike(name);
    }

    public SysInfo getId(String uuid) {
        return sysInfoRepository.getId(uuid);
    }

    public List<Map<String, Object>> groupByNameNative(Date startdate, Date enddate) {
        return sysInfoRepository.groupByNameNative(startdate, enddate);
    }

    public List<SysInfoStat> groupByName(Instant startdate, Instant enddate) {
        return sysInfoRepository.groupByName(startdate, enddate);
    }

    public int setNameById(String name, String id) {
        return sysInfoRepository.setNameById(name, id);
    }
}
