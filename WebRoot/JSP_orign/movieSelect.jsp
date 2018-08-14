<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:if test="${movielist==null}">
<c:redirect url="/adminaction_selectMovie"></c:redirect>
</c:if>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'movieSelect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
#div{
	float:left;
	margin:10px;
	
}
.div1{
  margin: auto;
    position: absolute;
    top: 100px;
    left: 0;
    right: 0;
    bottom: 0;
 text-align: center;
 width:1100px;}
</style>
  </head>

  <body>
  <center>
    <h3>电影列表</h3>
    <form action="adminaction_selectMovieByName">
    <input type="text" name="resource.moviename" placeholder="输入要查找的电影名"><input type="submit" value="搜索">
    </form>
    <div class="div1">
    <c:forEach var="movie" items="${requestScope.movielist}" varStatus="status">

    <div id="div" width="200" >
    <a href="#">
    <img src="${movie.getMovieimgurl()}" height="218" width="180"><br>
    <span>${movie.getMoviename()}</span><br>
    <a href="JSP/movieUpdate.jsp?movieid=${movie.getMovieid()}&moviename=${movie.getMoviename()}&movietype=${movie.getMovietype()}&movieimgurl=${movie.getMovieimgurl()}&avgscore=${movie.getAvgscore()}&movielanguage=${movie.getMovielanguage()}&moviearea=${movie.getMoviearea()}&movieyear=${movie.getMovieyear()}&moviereviewnumber=${movie.getMoviereviewnumber()}&moviedescription=${movie.getMoviedescription()}&movietime=${movie.getMovietime()}&movieurl=${movie.getMovieurl()}">修改</a>&nbsp;
    <a href="adminaction_deleteMovie?resource.movieid=${movie.getMovieid()}">删除</a>
   </a>
  
    </div>
    </c:forEach>
    </div>
    </center>
  </body>
</html>
