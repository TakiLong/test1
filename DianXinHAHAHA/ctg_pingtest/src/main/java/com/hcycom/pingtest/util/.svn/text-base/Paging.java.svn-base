package com.hcycom.pingtest.util;

import java.util.HashMap;
import java.util.Map;

public class Paging {

	/**
	 * @param totle 每页条数
	 * @param page 当前页数
	 * @return 从第几条开始，到第几条结束
	 */
	public  static Map<String, Integer> piece(int totle,int page) {
		 Map<String, Integer>  ma =new HashMap<String, Integer>();
		 ma.put("start", totle*page+1);
		 ma.put("end", totle*(page+1));
		return ma;
	    	
	    }
}
