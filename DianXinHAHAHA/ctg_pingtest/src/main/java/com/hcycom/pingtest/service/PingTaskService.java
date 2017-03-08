package com.hcycom.pingtest.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hcycom.pingtest.entity.PingTask;



public interface PingTaskService {
	int insert(PingTask record);

    PingTask selectByPrimaryKey(Integer id);
    
    int update(PingTask record);
    
    List<PingTask> selectAll(Map<String,Integer> map);
    
    int selectCount();
    
    List<PingTask> selectByNewDate(Date date);
    
    int updateStatus (Map<String,Integer> map);
	
}
