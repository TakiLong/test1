package com.hcycom.pingtest.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcycom.pingtest.entity.CirAddinfo;
import com.hcycom.pingtest.entity.CirInfo;
import com.hcycom.pingtest.entity.PingTask;
import com.hcycom.pingtest.modle.Result;
import com.hcycom.pingtest.service.CirAddinfoService;
import com.hcycom.pingtest.service.CirInfoService;
import com.hcycom.pingtest.service.PingTaskService;
import com.hcycom.pingtest.util.DateUtil;



@Controller
@RequestMapping("/rest/pingTask")
public class PingTaskResource {

	private Logger logger=Logger.getLogger(PingTaskResource.class);
	@Resource(name="pingTaskService")
	private PingTaskService pingTaskService;

	@Resource(name="cirAddinfoService")
	private CirAddinfoService cirAddinfoService;
	@Resource(name="cirInfoService")
	private CirInfoService cirInfoService;
	
	@ResponseBody
	@RequestMapping("/all_list")
	public Result all_list(@RequestParam("pageNumber") int pageNum,@RequestParam("pageSize") int pagesize) throws Exception {
		try {
			int sum=pingTaskService.selectCount();
			Map<String, Integer>  ma =new HashMap<String, Integer>();
			if(pagesize*pageNum<=sum){
				ma.put("start", (pageNum-1)*pagesize+1);
				ma.put("end", pagesize*pageNum);
			}else{
				ma.put("start", (pageNum-1)*pagesize+1);
				ma.put("end", sum);
			}

			List<PingTask> ptList=pingTaskService.selectAll(ma);
			List<Object> list = new ArrayList<Object>(); 
			list.addAll(ptList);
			Result r=new Result();
			r.setReason("");
			r.setResultcode("1");
			r.setRows(list);
			r.setTotal(sum);
			return r;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}
	}

	@ResponseBody
	@RequestMapping("/add_task")
	public Result addTask(@RequestParam(value="taskName") String taskName,@RequestParam(value="circuitType") String circuitType,
			@RequestParam(value="circuitNo") String circuitNo,@RequestParam(value="period") Integer period,
			@RequestParam(value="sourceNE") String sourceNE,@RequestParam(value="destIP") String destIP,
			@RequestParam(value="pingCommand") String pingCommand,@RequestParam(value="duration") Integer duration,
			@RequestParam(value="startTime") String startTime) throws Exception {
		try {
			if(taskName==""||taskName==null||circuitType==""||circuitType==null||
					circuitNo==""||circuitNo==null||period==0||period==null||
							sourceNE==""||sourceNE==null||destIP==""||destIP==null||
									pingCommand==""||pingCommand==null||duration==0||duration==null||
											startTime==""||startTime==null){
				Result r=new Result();
				r.setReason("添加失败，请补全数据");
				r.setResultcode("-1");
				return r;
			}
			PingTask pt=new PingTask();
			if("VPN".equals(circuitType)){
				CirAddinfo ci=cirAddinfoService.selectByNo(circuitNo);
				pt.setSourceIp(ci.getPeIp());//源端IP
				pt.setCustName(ci.getCustName());
				pt.setVpnCode(ci.getVpnCode());
			}else{
				CirInfo ci= cirInfoService.selectByNo(circuitNo);
				pt.setSourceIp(ci.getPeIpStandard());
				pt.setCustName(ci.getFinalCustName());
			}
			pt.setTaskName(taskName);
			pt.setCircuitType(circuitType);
			pt.setCircuitNo(circuitNo);
			pt.setSourceNe(sourceNE);
			pt.setDestIp(destIP);
			pt.setPingCmd(pingCommand);
			pt.setDuration(duration);//持续时间
			pt.setPeriod(period);//间隔
			pt.setStartTime(DateUtil.praseDate(startTime, "yyyy-MM-dd HH:mm:ss"));
			pt.setCreateTime(new Date());
			pt.setStatus(0);
			pingTaskService.insert(pt);

			Result r=new Result();
			r.setReason("");
			r.setResultcode("1");

			return r;
		} catch (Exception e) {
			logger.error("taskName="+taskName+";circuitType="+circuitType+";circuitNo="+circuitNo+
					";period="+period+";sourceNE="+sourceNE+";destIP="+destIP+";pingCommand="+pingCommand+
					";duration="+duration+";startTime="+startTime);
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}
	}

	@ResponseBody
	@RequestMapping("/update_task")
	public Result updateTask(@RequestParam("id") Integer id,@RequestParam("status") String status) throws Exception {
		try {
			PingTask pk=pingTaskService.selectByPrimaryKey(id);
			Result r=new Result();
			Map<String, Integer>  ma =new HashMap<String, Integer>();
			ma.put("id", id);
			Date date = new Date();
			if("start".equals(status)&&pk.getStatus()==3){
				//开始时间+持续时间-现在时间，，，判断是否超时，可能会现在遇到没有超时，但是在下次执行任务的时候已超时，在多线程判断
				Long a = pk.getStartTime().getTime() + pk.getDuration()* 60 * 60 * 1000 - date.getTime();
				if(a<0){
					pk.setStatus(4);
					pk.setEndTime(date);
					pingTaskService.update(pk);
				}else{
					ma.put("status", 0);
					pingTaskService.updateStatus(ma);
				}
			}else if("pause".equals(status)&&(pk.getStatus()==0||pk.getStatus()==1)){
				ma.put("status", 3);
				pingTaskService.updateStatus(ma);
			}else if("stop".equals(status)&&(pk.getStatus()==0||pk.getStatus()==1||pk.getStatus()==3)){
				pk.setStatus(4);
				pk.setEndTime(date);
				pingTaskService.update(pk);
			}else{
				r.setReason("操作失败，请刷新后再试");
				r.setResultcode("-1");
				return r;
			}
			r.setReason("");
			r.setResultcode("1");

			return r;
		} catch (Exception e) {
			logger.error("id="+id+";taskName="+status);
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}
	}

}
