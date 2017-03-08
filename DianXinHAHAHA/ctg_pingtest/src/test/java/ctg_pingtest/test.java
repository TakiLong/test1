package ctg_pingtest;



import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcycom.pingtest.entity.CirAddinfo;
import com.hcycom.pingtest.entity.PingTask;
import com.hcycom.pingtest.service.CirAddinfoService;
import com.hcycom.pingtest.service.PingTaskService;


public class test {
    private static ApplicationContext ac;

	public static void main(String[] args) {
    	ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
    	PingTaskService ls=(PingTaskService) ac.getBean("pingTaskService");
    	CirAddinfoService ca=(CirAddinfoService) ac.getBean("cirAddinfoService");
    	/*PingResult r=new PingResult();
    	r.setCmdResult("PINg     4321111111111111dfsafsa");
    	r.setDelayAvg(50);
    	r.setDelayMax(100);
    	r.setDelayMin(0);
    	r.setExecuteTime(new Date());
    	r.setPlrAvg(50.00);
    	r.setPlrMax(99.99);
    	r.setPlrMin(0.88);
    	r.setStatus(1);
    	r.setTaskId(2);*/
    	
    	//System.out.println(ls.selectByTime("2016/12/20 18:09:18", "2016/12/20 18:9:20").size());
    	//System.out.println(ls.selectByNo("香港CTVPN80000D").getCustName());
    	CirAddinfo ci= ca.selectByNo("香港CTVPN53785A");
    	PingTask pt=new PingTask();
    	pt.setCircuitNo("香港CTVPN53785A");
    	pt.setCircuitType("VPN");
    	pt.setCreateTime(new Date());
    	pt.setCustName(ci.getCustName());
    	pt.setDestIp(ci.getCeIp());
    	pt.setDuration(1);//持续时间
    	//pt.setEndTime();
    	//pt.setLastExecTime(new Date());
    	
    	pt.setPeriod(5);//间隔
    	pt.setPingCmd("ping -vpn-instance CTVPN53785-Crown 172.0.4.2");
    	pt.setSourceIp(ci.getPeIp());//源端IP
    	pt.setSourceNe(ci.getPeName());//源端name
    	pt.setStartTime(new Date());
    	pt.setTaskName("hahah哈");
    	pt.setVpnCode(ci.getVpnCode());
    	pt.setStatus(0);
    	ls.insert(pt);
    	System.out.println(ls.selectByNewDate(new Date()).size());
    	/*Map map=new HashMap();
    	map.put("start", 1);
    	map.put("end", 2);
    	System.out.println(ls.selectAll(map).size());*/
    	
	}

}
