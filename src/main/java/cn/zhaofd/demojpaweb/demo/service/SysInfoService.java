package cn.zhaofd.demojpaweb.demo.service;

import cn.zhaofd.demojpaweb.demo.dto.SysInfo;
import cn.zhaofd.demojpaweb.demo.repository.SysInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
