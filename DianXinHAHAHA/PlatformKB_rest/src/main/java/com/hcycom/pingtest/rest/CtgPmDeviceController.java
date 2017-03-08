package com.hcycom.pingtest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcycom.pingtest.entity.CtgPmDevice;
import com.hcycom.pingtest.model.CtgPmDevicePo;
import com.hcycom.pingtest.model.ResultPo;
import com.hcycom.pingtest.service.CtgPmDeviceService;

@Controller
@RequestMapping("/1.0/device1")
public class CtgPmDeviceController {
	
		@Resource
		CtgPmDeviceService ctgPmDeviceService;
		
		
		
		private Log logger = LogFactory.getLog(this.getClass());
		
	/*	@RequestMapping("/pm_device_insert")
		@ResponseBody
		public ResultPo insertDevice(
								@RequestParam(value="platform_id")int platformId,
								@RequestParam(value="device_name")String deviceName,
								@RequestParam(value="device_ip")String deviceIp,
								@RequestParam(value="purpose")String purpose,
								@RequestParam(value="vender")String vender,
								@RequestParam(value="version")String version,
								@RequestParam(value="remarks")String remarks
				){
			logger.debug("进入添加设备controller");
			CtgPmDevice ctgPmDevice = new CtgPmDevice();
			ctgPmDevice.setPlatformId(platformId);
			ctgPmDevice.setDeviceName(deviceName);
			ctgPmDevice.setDeviceIp(deviceIp);
			ctgPmDevice.setPurpose(purpose);
			ctgPmDevice.setVender(vender);
			ctgPmDevice.setVersion(version);
			ctgPmDevice.setRemarks(remarks);
			
			ResultPo resultPo = new ResultPo();
			resultPo.setErrorCode(String.valueOf(ctgPmDeviceService.insertDevice(ctgPmDevice)));
			resultPo.setData(null);
			return resultPo;
		}
		
		@ResponseBody
		@RequestMapping("/pm_device_toupdate")
		public ResultPo toupdateDevice(
				@RequestParam(value="platform_id")int platformId,
				@RequestParam(value="device_name")String deviceName
				){
			logger.debug("进入修改前查询设备controller");
			CtgPmDevice ctgPmDevice = new CtgPmDevice();
			ctgPmDevice.setPlatformId(platformId);
			ctgPmDevice.setDeviceName(deviceName);
			ctgPmDevice = ctgPmDeviceService.toupdateDevice(ctgPmDevice);
			if(ctgPmDevice.getPlatformId()==-1){
				ResultPo resultPo = new ResultPo();
				resultPo.setData(null);
				resultPo.setErrorCode("101");
				return resultPo;
			}
			CtgPmDevicePo ctgPmDevicePo = new CtgPmDevicePo();
			CtgNetcoolAlmsource ctgNetcoolAlmsource = new CtgNetcoolAlmsource();
			ctgNetcoolAlmsource = ctgNetcoolAlmsourceService.showNetcoolById(platformId).get(0);
			if(ctgNetcoolAlmsource.getId()==-1){
				ResultPo resultPo = new ResultPo();
				resultPo.setData(null);
				resultPo.setErrorCode("101");
				return resultPo;
			}
			ctgPmDevicePo.setPlatformId(ctgNetcoolAlmsource.getId());
			ctgPmDevicePo.setName(ctgNetcoolAlmsource.getName());
			ctgPmDevicePo.setNameEn(ctgNetcoolAlmsource.getNameEn());
			ctgPmDevicePo.setDeviceName(ctgPmDevice.getDeviceName());
			ctgPmDevicePo.setDeviceIp(ctgPmDevice.getDeviceIp());
			ctgPmDevicePo.setPurpose(ctgPmDevice.getPurpose());
			ctgPmDevicePo.setRemarks(ctgPmDevice.getRemarks());
			ctgPmDevicePo.setVender(ctgPmDevice.getVender());
			ctgPmDevicePo.setVersion(ctgPmDevice.getVersion());
			List<Object> listObject = new ArrayList<Object>();
			listObject.add(ctgPmDevicePo);
			ResultPo resultPo = new ResultPo();
			resultPo.setData(listObject);
			resultPo.setErrorCode("0");
			return resultPo;
		}
		@ResponseBody
		@RequestMapping("/pm_device_update")
		public ResultPo updateDevice(
								@RequestParam(value="platform_id")int platformId,
								@RequestParam(value="device_name")String deviceName,
								@RequestParam(value="device_ip")String deviceIp,
								@RequestParam(value="purpose")String purpose,
								@RequestParam(value="vender")String vender,
								@RequestParam(value="version")String version,
								@RequestParam(value="remarks")String remarks
				){
			logger.debug("进入修改设备controller");
			CtgPmDevice ctgPmDevice = new CtgPmDevice();
			ctgPmDevice.setPlatformId(platformId);
			ctgPmDevice.setDeviceName(deviceName);
			ctgPmDevice.setDeviceIp(deviceIp);
			ctgPmDevice.setPurpose(purpose);
			ctgPmDevice.setVender(vender);
			ctgPmDevice.setVersion(version);
			ctgPmDevice.setRemarks(remarks);
			
			ResultPo resultPo = new ResultPo();
			resultPo.setErrorCode(String.valueOf(ctgPmDeviceService.updateDevice(ctgPmDevice)));
			resultPo.setData(null);
			return resultPo;
			
		}
		*/
		@ResponseBody
		@RequestMapping("/pm_device_list")
		public ResultPo listDevice(){
			logger.debug("进入查询设备controller");
			List<CtgPmDevice> list = new ArrayList<CtgPmDevice>();
			List<CtgPmDevicePo> list1 = new ArrayList<CtgPmDevicePo>();
			list = ctgPmDeviceService.listDevice();
			if(list.size()!=0&&list.get(0).getPlatformId()==-1){
				ResultPo resultPo = new ResultPo();
				resultPo.setData(null);
				resultPo.setErrorCode("101");
				return resultPo;
			}
			
			List<Object> listObject = new ArrayList<Object>();
			listObject.addAll(list1);
			ResultPo resultPo = new ResultPo();
			resultPo.setErrorCode("0");
			resultPo.setData(listObject);
			return resultPo;
		}
		
		
}
