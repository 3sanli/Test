<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'showMessage.jsp' starting page</title>
<link href="css/main.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<table border="1">
		<thead>留言列表</thead>
		
		<tr>
			<td>留言人</td>
			<td>标题</td>
			<td>内容</td>
			<td>留言时间</td>
		</tr>
		
		<c:forEach items="${messageList }"	var="message">
			<tr>
				<td>${message.user_name }</td> <br>
				<td>${message.title }</td>   <br>
				<td>${message.content }</td> <br>
				<td>${message.getCreateDateVar() }</td> <br>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
