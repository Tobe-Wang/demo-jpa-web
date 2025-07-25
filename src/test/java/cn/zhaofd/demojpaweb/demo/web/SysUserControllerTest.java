/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demojpaweb.demo.web;

import cn.zhaofd.core.base.DateUtil;
import cn.zhaofd.core.json.JacksonUtil;
import cn.zhaofd.core.spring.jpa.core.dto.DataSet;
import cn.zhaofd.demojpaweb.demo.dto.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class SysUserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void findById() throws Exception {
        // @formatter:off
        mockMvc.perform(get("/sys/user/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void find() throws Exception {
        // @formatter:off
        mockMvc.perform(get("/sys/user?name=王五&ORDER_BY=regtime desc"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void findPage() throws Exception {
        // @formatter:off
        mockMvc.perform(get("/sys/user/page?name=王五&PAGE_NUMBER=1&PAGE_SIZE=2&ORDER_BY=regtime desc"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void save() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setName("保存");
        sysUser.setSex("1");
        sysUser.setRegtime(LocalDateTime.now());

        // @formatter:off
        mockMvc.perform(post("/sys/user").contentType(MediaType.APPLICATION_JSON_VALUE).content(JacksonUtil.writeValueAsString(sysUser)))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void saveFormData() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setName("form保存");
        sysUser.setSex("1");
        sysUser.setRegtime(LocalDateTime.now());

        // 封装请求参数
        MultiValueMap<String, String> reqParams = new LinkedMultiValueMap<>();
        reqParams.setAll(JacksonUtil.toMapWithString(sysUser));

        // @formatter:off
        mockMvc.perform(post("/sys/user").contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE).formFields(reqParams))
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void update() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setId(1);
        sysUser.setName("张三");
        sysUser.setSex("1");
        sysUser.setRegtime(LocalDateTime.now());

        // @formatter:off
        mockMvc.perform(put("/sys/user").contentType(MediaType.APPLICATION_JSON_VALUE).content(JacksonUtil.writeValueAsString(sysUser)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void updateFormData() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setId(2);
        sysUser.setName("李四");
        sysUser.setSex("2");
        sysUser.setRegtime(LocalDateTime.now());

        // 封装请求参数
        MultiValueMap<String, String> reqParams = new LinkedMultiValueMap<>();
        reqParams.setAll(JacksonUtil.toMapWithString(sysUser));

        // @formatter:off
        mockMvc.perform(put("/sys/user").contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE).formFields(reqParams))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void updatePart() throws Exception {
        Map<String, Object> params = Map.of("name", "钱七part", "regtime", DateUtil.format(new Date(), DateUtil.DATE_TIME));

        // @formatter:off
        mockMvc.perform(patch("/sys/user/3").contentType(MediaType.APPLICATION_JSON_VALUE).content(JacksonUtil.writeValueAsString(params)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }

    @Test
    void deleteById() throws Exception {
        // @formatter:off
        mockMvc.perform(delete("/sys/user/20"))
                .andDo(print())
                .andExpect(status().isOk());
        // @formatter:on
    }

    @Test
    void saveDataSet() throws Exception {
        // 新增数据
        SysUser sysUser1 = new SysUser();
        sysUser1.setName("批量新增1");
        sysUser1.setSex("1");
        sysUser1.setRegtime(LocalDateTime.now());
        SysUser sysUser2 = new SysUser();
        sysUser2.setName("批量新增2");
        sysUser2.setSex("2");
        sysUser2.setRegtime(LocalDateTime.now());
        List<SysUser> insertedList = List.of(sysUser1, sysUser2);
        // 删除数据
        List<Integer> deletedIds = List.of(15);
        // 修改数据
        SysUser sysUser3 = new SysUser();
        sysUser3.setId(4);
        sysUser3.setName("批量更新1");
        sysUser3.setSex("1");
        sysUser3.setRegtime(LocalDateTime.now());
        List<SysUser> updatedList = List.of(sysUser3);

        DataSet<SysUser, Integer> ds = new DataSet<>(insertedList, deletedIds, updatedList);
        // @formatter:off
        mockMvc.perform(post("/sys/user/dataset").contentType(MediaType.APPLICATION_JSON_VALUE).content(JacksonUtil.writeValueAsString(ds)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
        // @formatter:on
    }
}
