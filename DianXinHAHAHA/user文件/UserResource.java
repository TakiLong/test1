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
import com.hcycom.pingtest.entity.User;
import com.hcycom.pingtest.modle.Result;
import com.hcycom.pingtest.service.CirAddinfoService;
import com.hcycom.pingtest.service.CirInfoService;
import com.hcycom.pingtest.service.UserService;

@Controller
@RequestMapping("/rest/user")
public class UserResource {

	private Logger logger=Logger.getLogger(UserResource.class);

	@Resource(name="userService")
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/login")
	public Result all_list(@RequestParam("loginName") String loginName, @RequestParam("passwd") String passwd) {
		//此处需要设置Result返回到页面的结果集
		try {
			
			List<Object> list = new ArrayList<Object>(); 
			User u = new User();
			u.setLoginName(loginName);
			u.setPasswd(passwd);
			User user = userService.login(u);
			if(user!=null){
				list.add(user);
			}
			
			Result r=new Result();
			r.setReason("");
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
	}

}
