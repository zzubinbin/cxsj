package com.zzu.cxsj.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzu.cxsj.dbBean.DBOrder;
import com.zzu.cxsj.dbutils.CXSJ_CONST;
import com.zzu.cxsj.dbutils.DBConnection;

/**
 * Servlet implementation class order
 */
@WebServlet("/order")
public class order extends HttpServlet {
       
	private static final long serialVersionUID = 7289935458340542019L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public order() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request里的 acktype根据不同的值进行不同的判断
		/*
		 * 提取出
		 * 		1、学号id：userid
		 * 		2、json格式的数据，，每条数据包括：
		 * 					isbn码：isbn
		 * 					数量：quanitity
		 * 					价格：price
		 * 					配送方式：distributiontype
		 * 					收货地址：addressid
		 * 
		 */
		//int acktype=(int) request.getAttribute("acktype");
		int acktype=CXSJ_CONST.ORDER_TYPE_CREATEORDER;
		String userid = (String) request.getSession().getAttribute("userid");
		if(acktype==CXSJ_CONST.ORDER_TYPE_CREATEORDER){
			/*
			 * 根据不同的图书，创建订单，自动生成订单号，自动根据当前时间生成createtime并保存到order表中，
			 * 状态status改为ORDER_STATUS_CREATE的值，
			 */
			testtemp ttt = new testtemp();
			ttt.main1();
						
			
		}else if(acktype==CXSJ_CONST.ORDER_TYPE_PAYEDORDER){
			//从request中获取订单号orderid
			//根据支付情况，，设置status的值
			
		}else if(acktype==CXSJ_CONST.ORDER_TYPE_FINISH){
			//从request中获取订单号orderid
			//设置status 的值为ORDER_STATUS_DONE
			
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
