package com.zzu.cxsj.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet Filter implementation class filter
 */
@WebFilter(urlPatterns="/login")
public class filter implements Filter {

    /**
     * Default constructor. 
     */
    public filter() {
    	 
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO 验证当前请求是否登录
		
		// place your code here
				
		System.out.println("filter a request!!!");
		// pass the request along the filter chain
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpresponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();
		String userid = (String) session.getAttribute("userid");
		System.out.println(userid);
		System.out.println();
		if(httpRequest.getRequestURI().contains("login"))
			chain.doFilter(request, response);
		else if(userid==null||userid.equals(""))
			httpresponse.sendRedirect("./index.html");
		else 
			chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter init()");
	}

}
