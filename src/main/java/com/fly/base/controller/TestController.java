package com.fly.base.controller;

import com.fly.base.repostitoy.entity.Record;
import com.fly.base.service.RecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private RecordService recordService;

    @GetMapping("/name")
    public String getName() {
        return "刘奕博";
    }


    @PostMapping("modifyRecord")
    public void mofiyRecord(@RequestBody Record record) {
        recordService.modifyRecord(record);
    }
}
