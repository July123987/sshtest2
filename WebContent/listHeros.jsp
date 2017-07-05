<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>List orders</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
<center><h1><font color="red">Here are all your Orders. </font></h1></center>
<table border="1" width="800px" bordercolor="red">
	<tr>
		<th>OrderId</th>
		<th>TrideName</th>
		<th>Price</th>
		<th>TransportWay</th>
		<th>Payment</th>
		<th>CustomerId</th>
		<th>CustomerName</th>
		<th>Function</th>
	</tr>
	<c:forEach items="${list }" var="hero">
		<tr>
			<td>${hero.id }</td>
			<td>${hero.TrideName }</td>
			<td>${hero.Price }</td>
			<td>${hero.TransportWay }</td>
			<td>${hero.Payment }</td>
			<td>${hero.CustomerId }</td>
			<td>${hero.CustomerName }</td>

			<td><a href="findHeroId.action?hero.id=${hero.id }">Change</a>&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="removeHero.action?hero.id=${hero.id }">Remove</a></td>
		</tr>
	</c:forEach>
</table>
Of course, you can click <a href="index.jsp">here</a> to return.
Or you can also click <a href="addHero.jsp">here</a> to add a hero.
</body>
</html>