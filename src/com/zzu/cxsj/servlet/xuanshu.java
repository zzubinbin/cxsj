package com.zzu.cxsj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class xuanshu
 */
@WebServlet("/xuanshu")
public class xuanshu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xuanshu() {
        super();
        System.out.println("xuanshu servlet create!!!");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 此servlet处理两个请求，通过ask参数进行判断
		 * 1，教师界面的ajax请求，返回某教师所教某课程下的系统内所有教材
		 * 2，对教师的选书信息进行保存，持久化
		 * */
		
		request.getParameter("");
		String requestMode = (String) request.getAttribute("ask");
		if("requestbook".equals(requestMode)){//处理ajax请求
			
		}else {//处理选书请求,对选书情况进行持久化
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
