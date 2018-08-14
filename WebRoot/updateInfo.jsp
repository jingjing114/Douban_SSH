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
  #select{width:152px;}
  </style>
  <script>
  function show(){
  	var select=document.getElementById("select");
  	var arr=select.getElementsByTagName("option");
  if('男'=='${sessionScope.user.getSex()}'||""=='${sessionScope.user.getSex()}'||null=='${sessionScope.user.getSex()}')
  {
  		arr[0].selected=true;
  }
  else
  {
  	arr[1].selected=true;
  }
  
  }
  </script>
  <body onload="show()">

   <div class="div1" align="center">
 	用户资料修改
  </div>
  <form action="useraction_updateDoubanUserInfo" enctype="multipart/form-data" method="post">
  <div id="div1" >
	<img src="${sessionScope.user.getIcon()}"  />
	</div>
  <input type="hidden" name="user.username" value="${sessionScope.user.getUsername()}"><br>
  <input type="hidden" name="user.userid" value="${sessionScope.user.getUserid()}"><br>
     用户名：<input type="text" name="username" disabled="disabled" value="${sessionScope.user.getUsername()}"><br>
  	密码：<input type="text" name="user.password" value="${sessionScope.user.getPassword()}"><br>
  	性别：	<select id="select" name="user.sex" >
  	<option value="男">男</option>
  	<option value="女">女</option>
  	</select><br>
  	
  	年龄：<input type="text" name="user.age" value="${sessionScope.user.getAge()}"><br>
  	
  	手机：<input type="text" name="user.phone" value="${sessionScope.user.getPhone()}"><br>
  	邮箱：<input type="email" name="user.email" value="${sessionScope.user.getEmail()}"><br>
  	个人简介：<textarea name="user.introduction" >${sessionScope.user.getIntroduction()}</textarea>
   <input type="submit" value="提交" align="left">
</form>

  </body>
</html>
