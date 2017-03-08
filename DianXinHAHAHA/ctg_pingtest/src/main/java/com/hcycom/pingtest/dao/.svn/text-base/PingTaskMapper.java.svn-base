package com.hcycom.pingtest.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hcycom.pingtest.entity.PingTask;

public interface PingTaskMapper {

    int insert(PingTask record);

    PingTask selectByPrimaryKey(Integer id);
    
    int update(PingTask record);
    
    List<PingTask> selectAll(Map<String,Integer> map);
    
    Integer selectCount();
    
    List<PingTask> selectByNewDate(Date date);
    
    int updateStatus (Map<String,Integer> map);
}