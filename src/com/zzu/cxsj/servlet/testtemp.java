package com.zzu.cxsj.servlet;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzu.cxsj.dbBean.DBOrder;
import com.zzu.cxsj.dbBean.DBStudent;
import com.zzu.cxsj.dbBean.DBXuanke;
import com.zzu.cxsj.dbutils.DBConnection;

public class testtemp {

	public void main1() {
		//JSONObject ordersjson = (JSONObject) request.getAttribute("order");
		JSONObject ordersjson = JSONObject.parseObject("{\"orders\":["
				+ "{\"isbn\":\"1123123\","
				+ "\"quanitity\":\"2\","
				+ "\"price\":\"12.5\","
				+ "\"distributiontype\":\"1\","
				+ "\"addressid\":\"1345\"},"
				+ "{\"isbn\":\"1123123\","
				+ "\"quanitity\":\"2\","
				+ "\"price\":\"8.7\","
				+ "\"distributiontype\":\"1\","
				+ "\"addressid\":\"2\"},"
				+ "{\"isbn\":\"1123123\","
				+ "\"quanitity\":\"2\","
				+ "\"price\":\"1.5\","
				+ "\"distributiontype\":\"1\","
				+ "\"addressid\":\"45\"}"
				+ "]}");
		String userid = "20142480111";
		JSONArray orders = ordersjson.getJSONArray("orders");
		int length  =orders.size();
		JSONObject s=null;
		String isbn;
		int quanitity;
		float price;
		int distributiontype;
		String addressid;
		for(int i = 0;i<length;i++){
			 s = orders.getJSONObject(i);
			 
			 isbn = s.getString("isbn");
			 quanitity = s.getIntValue("quanitity");
			 price = s.getFloatValue("price");
			 distributiontype = s.getInteger("distributiontype");
			 addressid = s.getString("addressid");
			 System.out.println("json:");
			 System.out.println(isbn);
			 System.out.println(userid);
			 System.out.println(quanitity);
			 System.out.println(distributiontype);
			 System.out.println(price);
			 System.out.println(quanitity*price);
			 System.out.println(addressid);
			 
			 Session session = DBConnection.getFactory().openSession();
			 Transaction t = session.beginTransaction();
		
			 DBOrder neworder = new DBOrder();
			 neworder.setBookisbn(isbn);
			 neworder.setBuyerid("1");
			 neworder.setQuantity(quanitity);
			 neworder.setDistributiontype(distributiontype);
			 neworder.setPrice(price);
			 neworder.setAmount(quanitity*price);
			 neworder.setAddressid(addressid);
			 neworder.setStatus(0);
			 
			 Date d = new Date();
			 System.out.println(d.getTime()+"");
			 neworder.setOrderid(d.getTime()+"");
			 session.save(neworder);
			 t.commit();
			 session.close();
// com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'order (buyerid, orderid) values ('1', '2')' at line 1			 
		}


	}

}
