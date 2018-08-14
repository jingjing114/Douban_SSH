<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'actorUpdate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <style>
  .div{
  margin: auto;
    position: absolute;
    top: 100px;
    left: 0;
    right: 0;
    bottom: 0;
 text-align: center;
 }
 </style>
  <body>
<!--  <div class="div">
  <span><%= request.getAttribute("updatemsg") %></span>
  </div>-->
  		<div class="div">
		<h3>演员信息修改</h3>
		<form action="adminaction_updateActor" method="post" enctype="multipart/form-data">
		<input type="hidden" name="actor.actorid" value="<%=request.getParameter("actorid") %>"><br>
		&nbsp;&nbsp;&nbsp;&nbsp;演员ID：<input type="text"  value="<%=request.getParameter("actorid") %>" disabled><br>
		姓名：<input type="text" name="actor.actorname" value="<%=request.getParameter("actorname") %>"><br>
		性别：<input type="text" name="actor.actorsex" value="<%=request.getParameter("actorsex") %>"><br>
		星座：<input type="text" name="actor.actorsign" value="<%=request.getParameter("actorsign") %>"><br>
		生日：<input type="text" name="actor.actorbirthday" value="<%=request.getParameter("actorbirthday") %>"><br>		
		职业：<input type="text" name="actor.actorwork" value="<%=request.getParameter("actorwork") %>"><br>
		出生地区：<input type="text" name="actor.actorborned" value="<%=request.getParameter("actorborned") %>"><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		个人照片：<input type="file" name="myfile" ><br>
		个人简介：
		<textarea name="actor.actorintroduction" cols="25" rows="7" align="left">
					<%=request.getParameter("actorintroduction") %>
					</textarea>
		
		<br><br>
		<input type="submit" value="保存">&nbsp;&nbsp;
		<input type="reset" value="重置"><br>
		</form>
  </div>
  </body>
</html>
