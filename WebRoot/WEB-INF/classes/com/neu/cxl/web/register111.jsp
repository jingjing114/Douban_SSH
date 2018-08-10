<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   ${requestScope.msg}
   <h3>用户注册</h3>
   <form action="useraction_register" method="post">
    用户名：<input type="text" name="user.username"><font color="red"><s:fielderror fieldName="user.username"></s:fielderror></font><br>
   密码：<input type="text" name="user.password"><font color="red"><s:fielderror fieldName="user.password"></s:fielderror></font><br>
   <input type="submit" value="提交">&nbsp;<input type="reset" value="重置">
   </form>
   
  </body>
</html>
