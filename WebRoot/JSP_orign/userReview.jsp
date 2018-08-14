<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'select.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script>
  function confirmDel()
  {
  	if(window.confirm("您确定要删除该条评论吗?"))
  	{
  		return true;
  	}
  	else
  	{
  		return false;
  	}
  
}
  </script>
  <body>
    
 	${requestScope.reviewuser}的评论记录：<br>
 	
 	<!--  <input type="text" name=""><input type="submit" value="搜索"></form>-->
   <c:forEach var="r" items="${requestScope.review}" varStatus="status">
   <div id="${status}">
	评论电影名：${r.getReviewmoviename()}<br>
	评论内容：${r.getReviewcontent()}<br>
	评论时间：${r.getReviewtime()}<br>
	<a  href="adminaction_deleteReview?review.reviewid=${r.getReviewid()}&user.username=${r.getReviewuser()}" onclick="return congirmDel()">删除</a>
	
	</div>

	</c:forEach> 
  </body>
</html>
