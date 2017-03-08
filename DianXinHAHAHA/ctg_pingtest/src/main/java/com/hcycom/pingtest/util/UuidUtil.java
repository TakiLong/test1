package com.hcycom.pingtest.util;

import java.util.UUID;

public class UuidUtil {
	
    public static void main(String[] args) {   
    	//生成8位的用户id
        System.out.println(UuidUtil.Uuid());
    }
    //得到uuid
    public final static String Uuid() {
    	UUID uuid = UUID.randomUUID();
    	String s = uuid.toString();
    	return s.substring(0,8);
    }
}
