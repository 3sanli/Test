<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="checkLogin.jsp" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'showMessage.jsp' starting page</title>
<link href="css/main.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<table style="border: thin;">
		<thead style="background-color: blue;">留言列表
		</thead>
		<tr style="font-style: normal;">
			<td>留言人</td>
			<td>标题</td>
			<td>内容</td>
			<td>留言时间</td>
		</tr>
		<s:iterator value="#application.messageList">
			<tr>
				<s:iterator var="message">
					<td><s:property value="#message.user_name" /></td>
					<td><s:property value="#message.tittle" /></td>
					<td><s:property value="#message.content" /></td>
					<td><s:property value="#message.createDate" /></td>
				</s:iterator>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
