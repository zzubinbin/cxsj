package com.zzu.cxsj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zzu.cxsj.dbutils.*;
import com.zzu.cxsj.dbBean.*;

/**
 * Servlet implementation class login
 */
@WebServlet(urlPatterns="/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 3192589044176123852L;
	
	static SessionFactory sessionfactory;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//验证用户信息，，并将userid写入request的session中
		String userid = request.getParameter("userid");
		String usertype = request.getParameter("usertype");
		request.getSession().setAttribute("usertype", usertype);//student/tesacher
		request.getSession().setAttribute("userid", userid);
		request.getSession().setAttribute("username", "wlk");
		Session session = DBConnection.getFactory().openSession();
		
		
		if(usertype.equals("student"))
			request.getRequestDispatcher("/jsp/welcomeStu.jsp").forward(request, response);
		else if(usertype.equals("teacher"))
			request.getRequestDispatcher("/jsp/welcomeTeacher.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
