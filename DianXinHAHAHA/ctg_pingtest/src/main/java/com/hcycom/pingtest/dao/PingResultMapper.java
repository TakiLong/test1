package com.hcycom.pingtest.dao;

import java.util.List;
import java.util.Map;

import com.hcycom.pingtest.entity.PingResult;


public interface PingResultMapper {
	//添加
    int insert(PingResult record);
    //按时间范围查找
    List<PingResult> selectByTime(Map<String, String> map);
    //通过电路类型查找
    List<PingResult> selectByType(String circuitType);
    //通过电路No查找
    List<PingResult> selectByCircuitNo(String circuitNo);
    //通过任务Id查找
    List<PingResult> selectByNo(Integer taskId);
    
}