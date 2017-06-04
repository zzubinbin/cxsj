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

1、显示自己所教授的全部课程
<hr>

2、选择某门课程进行选定教材
<hr>
3、选定某门课程后，发送ajax请求到/xuanshu，参数格式为
{
<br>
·参数ask="requestbook"
<br>
·参数argv=选定的课程号
}
		获取此课程所有的教材书籍
<hr>
4、根据ajax返回的数据，动态的列出此课程的所有教材数据
<hr>
5、勾选需要的教材，
<hr>
6、还应有一个添加isbn码的输入框，添加后，通过js操作，将外观设置成和上面的显示外观一样
<hr>

7，若老师也需要购买教材，，勾选另外的选项
<hr>
8、将所勾选的图书的isbn码发给serlvet：/xuanshu
{
·参数ask="xuanshu"
}
*/

</body>
</html>