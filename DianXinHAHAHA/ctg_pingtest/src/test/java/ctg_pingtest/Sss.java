package ctg_pingtest;

import java.util.Date;

import com.hcycom.pingtest.entity.CirAddinfo;
import com.hcycom.pingtest.util.DateUtil;

public class Sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();   
		DateUtil da=new DateUtil();
		  
		   System.out.println("今天的日期："+da.formatDate (d));   
		   System.out.println("两天前的日期：" + da.formatDate(new Date(d.getTime() - 5* 60 * 1000)));  
		   System.out.println("三天后的日期：" + da.formatDate(new Date(d.getTime() + 6 * 60 * 1000)));
		/*CirAddinfo ci=new CirAddinfo();
		ci.setPeName(ci.getCustName());*/
	}

}
