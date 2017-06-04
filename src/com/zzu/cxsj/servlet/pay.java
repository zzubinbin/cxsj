package com.zzu.cxsj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pay
 */
@WebServlet(urlPatterns="/pay")
public class pay extends HttpServlet {
	private static final long serialVersionUID = -74544611326662622L;
	static String PAY_ALIPAY="alipay";
	static String PAY_WEIXINPAY="weixinpay";
	static String PAY_STUDENTPAY="studentpay";
	
 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String payMode = (String) request.getAttribute("payMode");
		if(PAY_ALIPAY.equals(payMode)){
			//跳转支付宝支付接口
		}else if(PAY_WEIXINPAY.equals(payMode)){
			//跳转微信支付接口
		}else {
			
			//跳转校园卡支付接口
			
		}
		
		//根据支付结果的代码，，跳转到payResult.jsp
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
