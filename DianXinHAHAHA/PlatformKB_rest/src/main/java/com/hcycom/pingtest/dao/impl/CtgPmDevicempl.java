package com.hcycom.pingtest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.hcycom.pingtest.base.BaseDao;
import com.hcycom.pingtest.dao.CtgPmDeviceMapper;
import com.hcycom.pingtest.entity.CtgPmDevice;
@Repository("CtgPmDeviceMapper")
public class CtgPmDevicempl extends BaseDao implements CtgPmDeviceMapper{
	
	private Log logger = LogFactory.getLog(this.getClass());
	
	public int insert(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入添加设备Dao");
			this.getSqlSession().insert("com.hcycom.pingtest.dao.CtgPmDeviceMapper.insert", ctgPmDevice);
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceDao异常");
			logger.error("异常信息:"+e);
			return 101;
		}
	}

	public int insertSelective(CtgPmDevice record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteDevice(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入删除设备Dao");
			this.getSqlSession().delete("com.hcycom.pingtest.dao.CtgPmDeviceMapper.deleteDevice", ctgPmDevice);
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceDao异常");
			logger.error("异常信息:"+e);
			return 101;
		}
	}

	public List<CtgPmDevice> showDeviceById(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入根据平台Id和设备名称查找设备Dao");
			return this.getSqlSession().selectList("com.hcycom.platformKBrest.dao.CtgPmDeviceMapper.showDeviceById",
					ctgPmDevice);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceDao异常");
			logger.error("异常信息:"+e);
			List<CtgPmDevice> list = new ArrayList<CtgPmDevice>();
			CtgPmDevice ctgPmDevice1 = new CtgPmDevice();
			ctgPmDevice1.setPlatformId(-1);
			list.add(ctgPmDevice1);
			return list;
			
		}
	}

	public int updateDevice(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入修改设备Dao");
			this.getSqlSession().update("com.hcycom.platformKBrest.dao.CtgPmDeviceMapper.updateDevice", ctgPmDevice);
			return 0;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceDao异常");
			logger.error("异常信息:"+e);
			return 101;
		}
	}

	public List<CtgPmDevice> listDevice() {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入查找设备Dao");
			return this.getSqlSession().selectList("com.hcycom.platformKBrest.dao.CtgPmDeviceMapper.listDevice");
		} catch (Exception e) {
			// TODO: handle exception
			 List<CtgPmDevice> list = new ArrayList<CtgPmDevice>();
			 CtgPmDevice ctgPmDevice = new CtgPmDevice();
			 ctgPmDevice.setPlatformId(-1);
			 list.add(ctgPmDevice);
			 return list;
		}
	
	}

}
