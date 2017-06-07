package com.zzu.cxsj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

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
		String requestMode = (String) request.getAttribute("ask");
		String userid = (String) request.getSession().getAttribute("userid");
		String yuanxi = (String) request.getSession().getAttribute("yuanxi");
		String courseid = (String) request.getAttribute("courseid");
		
		if("requestbook".equals(requestMode)){//处理ajax请求
			
			/**
			 * 参数：
			 * 		教师id：userid
			 * 		所在院系：yuanxi
			 * 		某课程：课程号
			 * 功能要求：
			 * 		根据此教师的userid、院系信息以及课程信息，，
			 * 		从cxsj数据库中的book表中根据每个教材的分类号，，（如何分类，怎么样分类，需要去百度）
			 * 		找到相关的所有教材，提取出相关信息，按照json的数据返回给此request。
			 */
			
		}else {//处理选书请求,对选书情况进行持久化
			JSONObject books = (JSONObject) request.getAttribute("books");
			
			/**
			 * 参数有：
			 * 		教师id：userid
			 * 		课程号：courseid
			 * 		json格式的教材isbn码：books
			 * 		{
			 			"isbns":[
			 			"第一个isbn码",
			 			"第二个isbn码",
			 			"第三个isbn码",
			 			"第四个isbn码"
			 			。。。。。。
			 			]
					}
			 * 
			 * 功能要求：
			 * 		根据教师号userid和课程号courseid，确定这个教师的此门课程所选的教材，
			 * 	将他们保存在cxsj数据库的xuanshu表中
			 */
			
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
