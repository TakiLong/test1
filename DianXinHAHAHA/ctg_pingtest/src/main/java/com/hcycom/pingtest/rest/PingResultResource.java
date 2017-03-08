package com.hcycom.pingtest.rest;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.websocket.Decoder;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hcycom.pingtest.entity.PingResult;
import com.hcycom.pingtest.modle.Result;
import com.hcycom.pingtest.service.PingResultService;



@Controller
@RequestMapping("/rest/pingResult")
public class PingResultResource {

	private Logger logger=Logger.getLogger(PingResultResource.class);

	@Resource(name="pingResultService")
	private PingResultService pingResultService;

	@ResponseBody
	@RequestMapping("/select_result")
	public Result all_list(@RequestParam("id") int id) throws Exception {
		try {
			List<PingResult> plist=pingResultService.selectByNo(id);
			List<Object> list = new ArrayList<Object>(); 
			list.addAll(plist);
			Result r=new Result();
			r.setReason("");
			r.setResultcode("1");
			r.setRows(list);
			return r;
		} catch (Exception e) {
			logger.error("id==="+id);
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}
	}
	@ResponseBody
	@RequestMapping("/list_result")
	public Result listResult(@RequestParam("time1") String time1,@RequestParam("time2") String time2,
			@RequestParam("circuitNo") String circuitNo) throws Exception {
		try{
			circuitNo = URLDecoder.decode(circuitNo,"utf-8");
			List<PingResult> plist =new ArrayList<PingResult>();
			Map<String, String> map=new HashMap<String, String>();
			if(time1!=null&&time1.trim()!=""&&time2!=null&&time2.trim()!=""&&circuitNo.trim()!=""&&circuitNo!=null){
				map.put("time1",time1);
				map.put("time2",time2);
				map.put("circuitNo",circuitNo);
				plist= pingResultService.selectByTime(map);
			}else{
				Result r=new Result();
				r.setReason("参数错误，请重新尝试");
				r.setResultcode("-1");
				r.setTotal(0);
				return r;
			}

			List<Object> list = new ArrayList<Object>(); 
			list.addAll(plist);
			Result r=new Result();
			r.setResultcode("1");
			r.setRows(list);
			return r;
		} catch (Exception e) {
			logger.error("time1==="+time1+";time2==="+time2+";circuitNo==="+circuitNo);
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}
	}

	/*@GET
	@Path("list_result") 
	@Produces(MediaType.APPLICATION_JSON)
	public Result listResult(@QueryParam("selectId") String selectId,@QueryParam("selectValue") String selectValue) throws Exception {
		try{
			List<PingResult> plist =new ArrayList<PingResult>();
			if("time".equals(selectId)){
				String a[]=selectValue.split("||");
				if(a.length>=2){
					plist= pingResultService.selectByTime(a[0], a[1]);
				}
			}else if("circuitType".equals(selectId)){
				plist= pingResultService.selectByType(selectValue);
			}else if("circuitNo".equals(selectId)){
				plist= pingResultService.selectByCircuitNo(selectValue);
			}
			List<Object> list = new ArrayList<Object>(); 
			list.addAll(plist);
			Result r=new Result();
			r.setResultcode("1");
			r.setRows(list);
			return r;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			Result r=new Result();
			r.setReason("操作失败，请稍后再试");
			r.setResultcode("-1");
			return r;
		}
	}*/

}
