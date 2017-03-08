package com.hcycom.pingtest.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class CorsFilter extends OncePerRequestFilter {
	private String charset = "UTF-8";
    @Override
    public void destroy() {}
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");//http://192.168.0.112:8081
//		response.addHeader("Access-Control-Allow-Credentials", "true");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		response.addHeader("Access-Control-Allow-Headers",
				"origin, content-type, accept, x-requested-with, authorization");
//		response.addHeader("Access-Control-Expose-Headers",
//				"origin, content-type, accept, x-requested-with, authorization");
		response.addHeader("Access-Control-Max-Age", "1209600");
		if("options".equals(request.getMethod().toLowerCase())){
			return;
		}
		
		/* HttpServletRequest req = (HttpServletRequest) request;
	        if(request.getMethod().equalsIgnoreCase("GET")) {
	            if(!(req instanceof GetRequest)) {
	            	request = new GetRequest(req, charset);//处理get请求编码
	            }
	        } else {
	        	request.setCharacterEncoding(charset);//处理post请求编码
	        }*/
		
		
		filterChain.doFilter(request, response);

	}

}
