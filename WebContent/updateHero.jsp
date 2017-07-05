<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>Insert title here</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
<h1><font color="red">Change your order pool.</font></h1>
<form action="updateHero" method="post">
	OrderId:<input type="text" name="hero.id" value="${hero.id }" readonly="readonly" style="display:none">${hero.id }.
	TrideName:<input type="text" name="hero.TrideName" value="${hero.TrideName }">
	Price:<input type="text" name="hero.Price" value="${hero.Price }">
	TransportWay:<input type="text" name="hero.TransportWay" value="${hero.TransportWay }">
	Payment:<input type="text" name="hero.Payment" value="${hero.Payment }">
	CustomerId:<input type="text" name="hero.CustomerId" value="${hero.CustomerId }">
	CustomerName:<input type="text" name="hero.CustomerName" value="${hero.CustomerName }">
	<input type="submit" value="Confirm">
</form>
Of course, you can also click <a href="index.jsp">here</a> to return.
</body>
</html>