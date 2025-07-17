package cn.zhaofd.demojpaweb.demo.web;

import cn.zhaofd.core.base.DateUtil;
import cn.zhaofd.core.base.LocalDateTimeUtil;
import cn.zhaofd.demojpaweb.demo.dto.SysInfo;
import cn.zhaofd.demojpaweb.demo.dto.SysInfoStat;
import cn.zhaofd.demojpaweb.demo.service.SysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * jpa直接应用示例
 */
@RestController
@RequestMapping("/sys/info")
public class SysInfoController {
    private final SysInfoService sysInfoService;

    @Autowired
    public SysInfoController(SysInfoService sysInfoService) {
        this.sysInfoService = sysInfoService;
    }

    @RequestMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public SysInfo save(SysInfo sysInfo) {
        return sysInfoService.save(sysInfo);
    }

    @RequestMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public SysInfo update(String id, String name) {
        SysInfo sysInfo = sysInfoService.getId(id);
        sysInfo.setName(name);
        return sysInfoService.save(sysInfo);
    }

    @GetMapping(value = "/findByName", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysInfo> findByName(@RequestParam String name) {
        return sysInfoService.findByName(name);
    }

    @GetMapping(value = "/findByNameLike1", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysInfo> findByNameLike1(@RequestParam String name) {
        return sysInfoService.findByNameLike(name);
    }

    @GetMapping(value = "/findByIdAndName", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysInfo> findByIdAndName(String id, String name) {
        return sysInfoService.findByIdAndName(id, name);
    }

    @GetMapping(value = "/findByNameLike2", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysInfo> findByNameLike2(String name) {
        return sysInfoService.findByNameLike(name, Sort.by(Sort.Direction.ASC, "name"));
    }

    @GetMapping(value = "/findByNameLike3", produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<SysInfo> findByNameLike3(String name) {
        return sysInfoService.findByNameLike(name, PageRequest.of(0, 100));
    }

    @GetMapping(value = "/findLike", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysInfo> findLike(String name) {
        return sysInfoService.findLike(name);
    }

    @GetMapping(value = "/getId", produces = MediaType.APPLICATION_JSON_VALUE)
    public SysInfo getId(String uuid) {
        return sysInfoService.getId(uuid);
    }

    @GetMapping(value = "/groupByNameNative", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Map<String, Object>> groupByNameNative(String startdate, String enddate) {
        return sysInfoService.groupByNameNative(DateUtil.parse(startdate, DateUtil.DATE_TIME), DateUtil.parse(enddate, DateUtil.DATE_TIME));
    }

    @GetMapping(value = "/groupByName", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysInfoStat> groupByName(String startdate, String enddate) {
        return sysInfoService.groupByName(LocalDateTimeUtil.parseToInstant(startdate, LocalDateTimeUtil.DATE_TIME), LocalDateTimeUtil.parseToInstant(enddate, LocalDateTimeUtil.DATE_TIME));
    }

    @GetMapping(value = "/setNameById", produces = MediaType.APPLICATION_JSON_VALUE)
    public int setNameById(String name, String id) {
        return sysInfoService.setNameById(name, id);
    }
}
