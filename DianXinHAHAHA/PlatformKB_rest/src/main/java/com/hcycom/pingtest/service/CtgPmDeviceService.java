package com.hcycom.pingtest.service;

import java.util.List;

import com.hcycom.pingtest.entity.CtgPmDevice;

public interface CtgPmDeviceService {
		/**
		 * 添加设备信息
		 * @param ctgPmDevice
		 * @return
		 */
		public int insertDevice(CtgPmDevice ctgPmDevice);
		/**
		 * 删除设备信息
		 * @param ctgPmDevice
		 * @return
		 */
		public int deleteDevice(CtgPmDevice ctgPmDevice);
		/**
		 * 根据平台Id和设备名称验证信息是否存在
		 * @param ctgPmDevice
		 * @return
		 */
		public boolean validateDevice(CtgPmDevice ctgPmDevice);
		/**
		 * 修改前根据平台Id和设备名称查找设备
		 * @param ctgPmDevice
		 * @return
		 */
		public CtgPmDevice toupdateDevice(CtgPmDevice ctgPmDevice);
		/**
		 * 修改设备信息
		 * @param ctgPmDevice
		 * @return
		 */
		public int updateDevice(CtgPmDevice ctgPmDevice);
		/**
		 * 查询所有设备信息
		 * @return
		 */
		public List<CtgPmDevice> listDevice();
}
