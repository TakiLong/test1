package com.hcycom.pingtest.rest;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hcycom.pingtest.entity.CirAddinfo;
import com.hcycom.pingtest.entity.CirInfo;
import com.hcycom.pingtest.modle.Result;
import com.hcycom.pingtest.service.CirAddinfoService;
import com.hcycom.pingtest.service.CirInfoService;

@Controller
@RequestMapping("/rest/circuit")
public class CircuitResource {

	private Logger logger=Logger.getLogger(CircuitResource.class);

	@Resource(name="cirAddinfoService")
	private CirAddinfoService cirAddinfoService;
	@Resource(name="cirInfoService")
	private CirInfoService cirInfoService;
	
	@ResponseBody
	@RequestMapping("/all_list_no")
	public Result all_list(@RequestParam("circuitType") String type) throws Exception {
		
		try {
			
			List<Object> list = new ArrayList<Object>(); 

			if("VPN".equals(type)){
				List<CirAddinfo> cList=cirAddinfoService.selectAllNo();
				list.addAll(cList);
			}else if("GIS".equals(type)){
				List<CirInfo> cList = cirInfoService.selectAllNo();
				list.addAll(cList);
			}
			Result r=new Result();
			r.setReason("");
			r.setResultcode("1");
			r.setRows(list);
			return r;
		} catch (Exception e) {
			logger.error("type==="+type);
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}
	}

	@ResponseBody
	@RequestMapping("/select_circuit")
	public Result select_circuit(@RequestParam("circuitType") String type,@RequestParam("circuitNo") String circuitNo) throws Exception {
		try {
			circuitNo = URLDecoder.decode(circuitNo,"utf-8");
			List<Object> list = new ArrayList<Object>(); 

			if("VPN".equals(type)){
				CirAddinfo cList=cirAddinfoService.selectByNo(circuitNo);
				list.add(cList);
			}else if("GIS".equals(type)){
				CirInfo cList = cirInfoService.selectByNo(circuitNo);
				list.add(cList);
			}
			Result r=new Result();
			r.setReason("");
			r.setResultcode("1");
			r.setRows(list);
			return r;

		} catch (Exception e) {
			logger.error("type==="+type+";circuitNo==="+circuitNo);
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}

	}
}
