<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  
  <body>
	    <form action="${pageContext.request.contextPath }/LoginServlet?method=login" method="post">
	    	用户: <input type="text" name="username" /> <br>
	    	密码: <input type="password" name="password" /> <br>
	    	<input type="reset" value="重置" />
	    	<input type="submit" value="登录" />
	    </form>
  </body>
</html>
