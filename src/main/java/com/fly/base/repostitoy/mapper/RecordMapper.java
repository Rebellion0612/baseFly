package com.fly.base.repostitoy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fly.base.repostitoy.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @Entity com.fly.base.repostitoy.entity.Record
*/
@Mapper
public interface RecordMapper extends BaseMapper<Record> {

    List<Map<String, Object>> selectPublicItemList(@Param(value="sqlStr") String sqlStr);
}
