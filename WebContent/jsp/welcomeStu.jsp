<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
/**
请求列出此学生各门课程的全部教材
<br>
学生勾选相应的教材，跳转到comfirmOrder.jsp页面，request中需要有如下信息：
	参数为：
	1、学生id
	2、教材信息
		每个教材的：isbn码，书名，出版社，作者，价格，
*/
<h1>欢迎<%=request.getSession().getAttribute("username") %></h1>
<form action="jsp/confirmOrder.jsp" method="post">
isbn<input type="text" name="isbn"><br>
价格<input type="text" name="price"><br>
数量<input type="text" name="count"><br>
金额<input type="text" name="total"><br>
提交订单<input type="submit" >
</form>
/*
		
		{
			"专业号":[
			{
			"isbn":{
			"isbn":"xxxxx",
			"bookname”:”xxxxxxx",
			"bookprice”:”xxxxxx",
			"publisher”:”xxxxxxx",
			}
			},
			{
			"isbn2":{
			"isbn":”xxxxx",
			"bookname":"xxxxxxx",
			"bookprice":"xxxxxx",
			"publisher":"xxxxxxx",
			}
			}
			]
		}
		
		*/
</body>
</html>