package cn.zhaofd.demojpaweb.demo.web;

import cn.zhaofd.demojpaweb.demo.dto.SysInfo;
import cn.zhaofd.demojpaweb.demo.service.SysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sys/info")
public class SysInfoController {
    private final SysInfoService sysInfoService;

    @Autowired
    public SysInfoController(SysInfoService sysInfoService) {
        this.sysInfoService = sysInfoService;
    }

    @GetMapping(value = "/findByName1", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysInfo> findByName(@RequestParam String name) {
        return sysInfoService.findByName(name);
    }
}
