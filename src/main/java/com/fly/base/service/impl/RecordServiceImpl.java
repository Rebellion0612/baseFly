package com.fly.base.service.impl;

import com.fly.base.repostitoy.entity.Record;
import com.fly.base.repostitoy.mapper.RecordMapper;
import com.fly.base.service.RecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Phoenix Fly
 * @create 2021/11/7 20:50
 */
@Service
@Slf4j
public class RecordServiceImpl implements RecordService {

    @Resource
    private RecordMapper recordMapper;


    @Override
    public void modifyRecord(Record record) {
        String sql = "select * from record where id = 6";
//        List<Map<String, Object>> maps = recordMapper.selectPublicItemList(sql);
        recordMapper.updateById(record);

    }

}
