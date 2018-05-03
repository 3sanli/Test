<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.ahpu.utils.Car" %>
<%@ page import="cn.ahpu.domain.Product" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/myCss.css" type="text/css">
<title>Insert title here</title>
<%
	Car car = (Car)session.getAttribute("car");
%>
</head>
<body>
	<div id="top"><p style="text-align: center;">购物车</p></div> 
	<table>
		<tr>
			<td>名称</td>
			<td>价格(元/斤)</td>
			<td>数量</td>
			<td>总价(元)</td>
			<td>移除(-1/次)</td>
		</tr>		
		<%
			for(Product p:car.getList()) {
				if(p.getNumber()==0) {
					continue;
				}
				%>
				<tr>
					<td><%=p.getName() %></td>
					<td><%=p.getPrice() %></td>
					<td><%=p.getNumber() %></td>
					<td><%=(p.getTotalPrice())%> </td>
					<td><a href="${pageContext.request.contextPath }/doCar.jsp?method=remove&id=<%=p.getId()%>">移除</a></td>
				</tr>
				<%
			}
		%> 
	</table>
	<div id="bottom1">
		共计应付<%=car.getCount() %>
	</div>
	<div id="bottom2">
		<a id="back" href="${pageContext.request.contextPath }/productInfo.jsp">继续购物</a>
		<a id="clear" href="${pageContext.request.contextPath }/doCar.jsp?method=clear">清空购物车</a>
	</div>
</body>
</html>