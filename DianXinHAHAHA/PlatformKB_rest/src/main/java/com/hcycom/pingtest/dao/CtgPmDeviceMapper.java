package com.hcycom.pingtest.dao;

import java.util.List;

import com.hcycom.pingtest.entity.CtgPmDevice;

public interface CtgPmDeviceMapper {
    /**
     * 添加设备信息
     * @param record
     * @return
     */
	int insert(CtgPmDevice ctgPmDevice);

    int insertSelective(CtgPmDevice record);
    /**
     * 删除设备信息
     * @param ctgPmDevice
     * @return
     */
    public int deleteDevice(CtgPmDevice ctgPmDevice);
    /**
     * 根据平台ID和设备名称查找
     * @param ctgPmDevice
     * @return
     */
    public List<CtgPmDevice> showDeviceById(CtgPmDevice ctgPmDevice);
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