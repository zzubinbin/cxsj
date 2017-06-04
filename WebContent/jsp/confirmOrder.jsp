<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
/*

1、再次显示从welcomeStu传来的教材订购信息



2、选择支付方式

3、将支付方式放在reqiuest中，添加attribute，
		键为payMode，
		值的可选范围为：
			alipay
			weixinpay
			studentpay

4、然后发送给servlet:
			/pay
*/
<form action="/cxsj/pay">
<button >支付宝</button><br>
<button >微信支付</button><br>
<button >校园账户</button><br>
<input type="text" name="paymode" value="alipay">
<input type="submit" value="支付">
</form>
</body>
</html>
