package com.hcycom.pingtest.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.hcycom.pingtest.dao.CtgPmDeviceMapper;
import com.hcycom.pingtest.entity.CtgPmDevice;
import com.hcycom.pingtest.service.CtgPmDeviceService;

@Service
public class CtgPmDeviceServiceImpl implements CtgPmDeviceService{
	
	@Resource(name="CtgPmDeviceMapper")
	CtgPmDeviceMapper ctgPmDeviceMapper;
	
	private Log logger = LogFactory.getLog(this.getClass());
	
	public int insertDevice(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入添加设备service");
			return ctgPmDeviceMapper.insert(ctgPmDevice);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceService异常");
			logger.error("异常信息:"+e);
			return 101;
		}
	}

	public int deleteDevice(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入添加设备service");
			return ctgPmDeviceMapper.deleteDevice(ctgPmDevice);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceService异常");
			logger.error("异常信息:"+e);
			return 101;
		}
	}

	public boolean validateDevice(CtgPmDevice ctgPmDevice) {
		// TODO Auto-generated method stub
		List<CtgPmDevice> list = new ArrayList<CtgPmDevice>();
		list = ctgPmDeviceMapper.showDeviceById(ctgPmDevice);
		if(list.size()!=0&&list.get(0).getPlatformId()==-1){
			logger.error("CtgPmDeviceDao异常");
			return false;
		}
		if(list.size()==0){
			return true;
		}else{
			return false;
		}
		
	}

	public CtgPmDevice toupdateDevice(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入修改前查询设备service");
			return ctgPmDeviceMapper.showDeviceById(ctgPmDevice).get(0);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceService异常");
			logger.error("异常信息:"+e);
			CtgPmDevice ctgPmDevice1 =new CtgPmDevice();
			ctgPmDevice1.setPlatformId(-1);
			return ctgPmDevice1;
		}
	}

	public int updateDevice(CtgPmDevice ctgPmDevice) {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入修改设备service");
			return ctgPmDeviceMapper.updateDevice(ctgPmDevice);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceService异常");
			logger.error("异常信息:"+e);
			return 101;
		}
	}

	public List<CtgPmDevice> listDevice() {
		try {
			// TODO Auto-generated method stub
			logger.debug("进入查询所有设备service");
			return ctgPmDeviceMapper.listDevice();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("CtgPmDeviceService异常");
			logger.error("异常信息:"+e);
			List<CtgPmDevice> list = new ArrayList<CtgPmDevice>();
			CtgPmDevice ctgPmDevice = new CtgPmDevice();
			ctgPmDevice.setPlatformId(-1);
			list.add(ctgPmDevice);
			return list;
		}
	}

}
