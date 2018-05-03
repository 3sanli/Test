<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.ahpu.utils.Car" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String basePath = request.getContextPath();
		Car car = new Car();
		session.setAttribute("car", car);
		response.sendRedirect(basePath+"/productInfo.jsp");
	%>
</body>
</html>