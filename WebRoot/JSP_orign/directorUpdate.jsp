<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'directorUpdate.jsp' starting page</title>
    
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
		<h3>导演信息修改</h3>
		<form action="adminaction_updateDirector" method="post" enctype="multipart/form-data">
		<input type="hidden" name="director.directorid" value="<%=request.getParameter("directorid") %>"><br>
		&nbsp;&nbsp;&nbsp;&nbsp;导演ID：<input type="text"  value="<%=request.getParameter("directorid") %>" disabled><br>
		姓名：<input type="text" name="director.directorname" value="<%=request.getParameter("directorname") %>"><br>
		性别：<input type="text" name="director.directorsex" value="<%=request.getParameter("directorsex") %>"><br>
		星座：<input type="text" name="director.directorsign" value="<%=request.getParameter("directorsign") %>"><br>
		生日：<input type="text" name="director.directorbirthday" value="<%=request.getParameter("directorbirthday") %>"><br>		
		职业：<input type="text" name="director.directorwork" value="<%=request.getParameter("directorwork") %>"><br>
		出生地区：<input type="text" name="director.directorborned" value="<%=request.getParameter("directorborned") %>"><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		个人照片：<input type="file" name="myfile" value="选择"><br>
		个人简介：
		
		<textarea name="director.directorintroduction" cols="25" rows="7" align="left">
					<%=request.getParameter("directorintroduction") %>
					</textarea>
		
		<br><br>
		<input type="submit" value="保存">&nbsp;&nbsp;
		<input type="reset" value="重置"><br>
		</form>
  </div>
  </body>
</html>
