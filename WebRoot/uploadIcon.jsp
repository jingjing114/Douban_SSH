<%@ page language="java" import="java.util.*,com.neu.cxl.entity.DoubanUser" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <title>publishreview.html</title>
	<meta charset="utf-8">
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  <style>
  #div1{backgroung:url("images/img01.jpg");width:60px;height:60px;border-radius:100px; overflow:hidden}
  #div1 img{width:100%;height:100%}
  </style>
  <body>

   <div class=“div1‘”>
 	用户头像修改
  </div>
  <form action="upload?user.username=${sessionScope.user.getUsername()}" enctype="multipart/form-data" method="post">
  用户头像：
  <div id="div1" >
	<img src="${sessionScope.user.getIcon()}"  />
	</div>
  
  <input type="file" name="myfile" value="更改"><br>
   <input type="submit" value="提交" align="left">
</form>

  </body>
</html>
