<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.ahpu.utils.Car" %>
<%@ page import="cn.ahpu.domain.Product" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<%
	Car car = (Car)session.getAttribute("car");
	String basePath = request.getContextPath();
%>
</head>
<body>
	<%
		String method = null;
		Integer id = null;
		try{
			method = (String)request.getParameter("method");
			id = Integer.valueOf(request.getParameter("id"));
		}catch(Exception e){
			
		}
		if(method.equals("add")){
			car.addItem(id);
			response.sendRedirect(basePath+"/productInfo.jsp");
		}
		else if(method.equals("remove")){
			car.removeItem(id);
			response.sendRedirect(basePath+"/showCar.jsp");
		}
		else if(method.equals("clear")){
			car.clear();
			response.sendRedirect(basePath+"/showCar.jsp");
		}
		session.setAttribute("car", car);
	%>
</body>
</html>