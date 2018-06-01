<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加或修改用户</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/addUser.action" method="post">
		
		用户名：<input type="text" name="username" value="${user.username }"><br>
		密码：<input type="text" name="password" value="${user.password }"/><br>
		
		<input type="submit" value="提交"/>
	</form>
</body>
</html>