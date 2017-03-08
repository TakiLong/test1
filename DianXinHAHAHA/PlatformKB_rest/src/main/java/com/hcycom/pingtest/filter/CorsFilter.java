package com.hcycom.pingtest.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class CorsFilter extends OncePerRequestFilter {

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
		filterChain.doFilter(request, response);

	}

}
