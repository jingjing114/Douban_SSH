<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  #pingfen{width:300px;height:40px;}
#pingfen ul{height:20px;margin-bottom:2px;}
#pingfen li{width:25px;float:left;height:20px;cursor:pointer;
background:url(images/w_star.PNG) no-repeat 0 0;list-style:none;}
#pingfen .active{background:url(images/y_star.PNG) no-repeat 0 0;}
#pingfen p{width:300px;height:20px;background:white;line-height:20px;text-align:center;
font-size:1em;border:1px #CCC solid;display:none;}
  </style>
  <script src="js/star.js"></script>

  <body>
   <div class=“div1‘”>
 	简短影评
  </div>
  <form action="reviewaction_publishReview">
  	<input type="hidden" name="review.reviewmovieid" value="<%=request.getParameter("movieid")%>">
  	<input type="hidden" name="review.reviewuser" value="<%=request.getParameter("reviewuser")%>">
  	<input type="hidden" name="review.reviewmoviename" value="<%=request.getParameter("moviename")%>">
 	电影名：<input type="text" name="review.reviewmoviename" value="<%=request.getParameter("moviename")%>" disabled="disabled"><br>
  	电影评分：<div id="pingfen">
		<ul>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<input type="button" id="reset" onclick="reloadpage()" value="重置">
		</ul>
		<input type="hidden" name="review.reviewscore" id="score">
		<p>一般</p>
		</div>
  	
  	<br>
     评论：<textarea name="review.reviewcontent" rows="8" cols="60"></textarea>
    <input type="submit" value="提交" align="left">
</form>
  </body>
</html>
