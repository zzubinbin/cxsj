package com.zzu.cxsj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class admin
 */
@WebServlet("/admin")
public class admin extends HttpServlet {
	private static final long serialVersionUID = 4867295629510978761L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dotype = (String) request.getAttribute("dotype");
		if(dotype.equals("kebiao")){
			//对传来的课表进行操作，，将每个学生的所学课程导入student表，将每个老师所教授 的课也导入teacher表中
			
		}else if(dotype.equals("query")){//查询功能
			//查询统计本社教材的相关选定信息（选用学校、选用教师、选用数量等
			
		}else if(dotype.equals("static")){//统计功能
			
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
