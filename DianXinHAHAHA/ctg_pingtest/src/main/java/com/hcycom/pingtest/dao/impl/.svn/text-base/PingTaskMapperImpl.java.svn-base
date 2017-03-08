package com.hcycom.pingtest.dao.impl;


import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.hcycom.pingtest.base.BaseDao;
import com.hcycom.pingtest.dao.PingTaskMapper;
import com.hcycom.pingtest.entity.PingTask;
import com.hcycom.pingtest.util.DateUtil;



@Repository("pingTaskMapper")
public class PingTaskMapperImpl extends BaseDao  implements PingTaskMapper {


	@Override
	public int insert(PingTask record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hcycom.pingtest.dao.PingTaskMapper.insert",record);
	}										

	@Override
	public PingTask selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.hcycom.pingtest.dao.PingTaskMapper.selectByPrimaryKey",id);
	}

	@Override
	public int update(PingTask record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("com.hcycom.pingtest.dao.PingTaskMapper.update",record);
	} 										

	@Override
	public List<PingTask> selectAll(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.PingTaskMapper.selectAll",map);
	}

	@Override
	public Integer selectCount() {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("com.hcycom.pingtest.dao.PingTaskMapper.selectCount");
	}

	@Override
	public List<PingTask> selectByNewDate(Date newDate) {
		String time2= DateUtil.formatDate(newDate);
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hcycom.pingtest.dao.PingTaskMapper.selectByNewDate",time2);
	}

	@Override
	public int updateStatus(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("com.hcycom.pingtest.dao.PingTaskMapper.updateStatus",map);
	}                                                                         


	
}