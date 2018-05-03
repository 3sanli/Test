<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.ahpu.utils.Car" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/myCss.css" type="text/css">
<title>Insert title here</title>

</head>
<body>
	<div id="top"><p style="text-align: center;">商品信息</p></div> 
	<table>		
		<tr>
		<td>名称</td>
		<td>价格(元/斤)</td>
		<td>购买</td>
		</tr>		
		<c:forEach items="${car.list }" var="product">
			<tr>
				<td>${product.name }</td>
				<td>${product.price }</td>
				<td><a href="${pageContext.request.contextPath }/doCar.jsp?method=add&id=${product.id}">购买</a></td>
			</tr>
		</c:forEach>	
	</table>
	<div id="bottom"><a style="margin: auto,auto;" href="${pageContext.request.contextPath }/showCar.jsp">查看购物车</a></div>
</body>
</html>