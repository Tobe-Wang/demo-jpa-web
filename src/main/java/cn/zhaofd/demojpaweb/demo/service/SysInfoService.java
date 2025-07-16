package cn.zhaofd.demojpaweb.demo.service;

import cn.zhaofd.demojpaweb.demo.dto.SysInfo;
import cn.zhaofd.demojpaweb.demo.dto.SysInfoStat;
import cn.zhaofd.demojpaweb.demo.repository.SysInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

    public List<SysInfo> findByName(String name, Sort sort) {
        return sysInfoRepository.findByName(name, sort);
    }

    public Page<SysInfo> findByName(String name, Pageable pageable) {
        return sysInfoRepository.findByName(name, pageable);
    }

    public List<SysInfo> findLike(String name) {
        return sysInfoRepository.findLike(name);
    }

    public SysInfo getId(@Param("id") String uuid) {
        return sysInfoRepository.getId(uuid);
    }

    public List<Map<String, Object>> groupByNameNative(Date startdate, Date enddate) {
        return sysInfoRepository.groupByNameNative(startdate, enddate);
    }

    public List<SysInfoStat> groupByName(Date startdate, Date enddate) {
        return sysInfoRepository.groupByName(startdate, enddate);
    }

    public int setNameById(String name, String id) {
        return sysInfoRepository.setNameById(name, id);
    }
}
