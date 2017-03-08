package com.hcycom.pingtest.service.impl;


import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.hcycom.pingtest.dao.PingTaskMapper;
import com.hcycom.pingtest.entity.PingTask;
import com.hcycom.pingtest.service.PingTaskService;



@Service("pingTaskService")
public class PingTaskServiceImpl implements  PingTaskService{
	
	@Resource(name="pingTaskMapper")
	private PingTaskMapper pingTaskMapper;

	
	@Override
	public int insert(PingTask record) {
		// TODO Auto-generated method stub
		return pingTaskMapper.insert(record);
	}



	@Override
	public PingTask selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return pingTaskMapper.selectByPrimaryKey(id);
	}



	@Override
	public int update(PingTask record) {
		// TODO Auto-generated method stub
		return pingTaskMapper.update(record);
	}



	@Override
	public List<PingTask> selectAll(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return pingTaskMapper.selectAll(map);
	}



	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return pingTaskMapper.selectCount();
	}



	@Override
	public List<PingTask> selectByNewDate(Date date) {
		// TODO Auto-generated method stub
		return pingTaskMapper.selectByNewDate(date);
	}



	@Override
	public int updateStatus(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return pingTaskMapper.updateStatus(map);
	}

	



}
