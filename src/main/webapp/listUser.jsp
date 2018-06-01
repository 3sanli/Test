<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table border="1">
			<tr>
				<td>用户姓名</td>
				<td>用户密码</td>
			</tr>
			<c:forEach items="${list }" var="user">
				<tr>
					<td>${user.username }</td>
					<td>${user.password }</td>
					<td><a
						href="${pageContext.request.contextPath }/deleteUser.action?username=${user.username}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
	<a href="${pageContext.request.contextPath }/user.jsp">用户添加与修改</a>
</body>
</html>