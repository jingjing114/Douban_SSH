<%@ page language="java" import="java.util.*,com.neu.cxl.entity.DoubanUser" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:if test="${movietype==null}">
<s:action name="adminaction_selectType2" executeResult="true" namespace="/"/>
</c:if>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'actorSelect.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
	
	
	
		
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
<!-- Custom CSS -->
<link href="JSP/css/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="JSP/css/lines.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css"> 
<!-- jQuery -->
<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>

<!---//webfonts--->  
<!-- Nav CSS -->


<link href="JSP/css/custom.css" rel="stylesheet">

<script src="JSP/js/metisMenu.min.js"></script>
<script src="JSP/js/custom.js"></script>

<script src="JSP/js/d3.v3.js"></script>
<script src="JSP/js/rickshaw.js"></script>
	
	
	
	
	
	
	
	

  </head>
   <style>
	  
	#div{
		float:left;
		margin:10px;
		padding-top:15px;
		
	}
	.div1{
	  margin: auto;
	    position: absolute;
	    top: 100px;
	    left: 300px;
	    right: 0;
	    bottom: 0;
	 text-align: center;
	 width:1100px;}
	 .form{
	 margin-left:400px;

	 }
	</style>
<script>
function show()
{
	var type='<%=request.getParameter("movietype") %>';
	var select=document.getElementById("select");
	var ops=select.getElementsByTagName("option");
	for (var i=1;i<ops.length;i++)
	{
		if(ops[i].value==type)
		{
			ops[i].selected=true;
		}
	}
	
	
}
</script>
  <body onload="show()">
  
  
  
  
  
  
 	<%
		DoubanUser user=(DoubanUser)session.getAttribute("admin");
		if(!("管理员".equals((String)user.getRole())))
		{
			out.println("您还没有登录，请先登录！<br>");
			out.println("3秒后跳转到登录页面...<br>");
			response.setHeader("Refresh","3;URL=../login.jsp"); 

			out.println("如果没有跳转，请点击<a href='login.jsp'>这里</a>跳转！");
			
		}
		else {
		%>
		
		
		
		
		
		
          <div id="wrapper">
 
 
         <nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">欢迎管理员${sessionScope.admin.getUsername()}登录！</a>
            </div>
            
            
            
            <!-- /.navbar-header -->
            <ul class="nav navbar-nav navbar-right">
				
			    <li class="dropdown">
	        		<a href="#" class="dropdown-toggle avatar" data-toggle="dropdown"  ><img src="JSP/images/1.jpeg"  style="margin-top: 5px;" ></a>
	        		<ul class="dropdown-menu">
						<li class="dropdown-menu-header text-center">
							<strong>Account</strong>
						</li>
						<li class="m_2"><a href="#"><i class="fa fa-bell-o"></i> Updates <span class="label label-info">42</span></a></li>
						<li class="m_2"><a href="#"><i class="fa fa-envelope-o"></i> Messages <span class="label label-success">42</span></a></li>
						<li class="m_2"><a href="#"><i class="fa fa-tasks"></i> Tasks <span class="label label-danger">42</span></a></li>
						<li><a href="#"><i class="fa fa-comments"></i> Comments <span class="label label-warning">42</span></a></li>
						<li class="dropdown-menu-header text-center">
							<strong>Settings</strong>
						</li>
						<li class="m_2"><a href="#"><i class="fa fa-user"></i> Profile</a></li>
						<li class="m_2"><a href="#"><i class="fa fa-wrench"></i> Settings</a></li>
						<li class="m_2"><a href="#"><i class="fa fa-usd"></i> Payments <span class="label label-default">42</span></a></li>
						<li class="m_2"><a href="#"><i class="fa fa-file"></i> Projects <span class="label label-primary">42</span></a></li>
						<li class="divider"></li>
						<li class="m_2"><a href="#"><i class="fa fa-shield"></i> Lock Profile</a></li>
						<li class="m_2"><a href="#"><i class="fa fa-lock"></i> Logout</a></li>	
	        		</ul>
	      		</li>
			</ul>
			<form class="navbar-form navbar-right">
              <input type="text" class="form-control" value="Search..." onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search...';}">
            </form>
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="adminaction_userManage"><i class="fa fa-dashboard fa-fw nav_icon"></i>用户管理</a>
                        </li>
                        
                   
                        
                        
                        <li>
                            <a href="JSP/movieManage.jsp"><i class="fa fa-indent nav_icon"></i>电影管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                  <li>
                                    <a href="adminaction_selectMovie">查看电影</a>
                                </li>
                                <li>
                                    <a href="JSP/movieAdd.jsp">添加电影</a>
                                </li>
                                 <li>
                                    <a href="adminaction_selectType">查看电影类型</a>
                                </li>
                                   <li>
                                    <a href="adminaction_selectActor">查看演员</a>
                                </li>
                                 
                                   <li>
                                    <a href="adminaction_selectDirector">查看导演</a>
                                </li>
                                  
                             
                            </ul>
                            <!-- /.nav-second-level -->
                        </li>
                    
                    
                  
                       
                       
                          <li>
                            <a href="useraction_logout"><i class="fa fa-dashboard fa-fw nav_icon"></i>退出</a>
                        </li>
                        
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        
        
        
        <div id="page-wrapper" style="height:1000px;">
        <div class="graphs"   style="height:1000px;">
        	<div class="col_3">
	
        	 
        	<div class="clearfix"> </div>
      </div>
      
    
    
    
    
    
    <div class="content_bottom">
     
	   </div>
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   <br>
	   
       
       
      
  		<div class="form">
	     <h3 style="margin-left: 42px;">电影信息修改</h3><br>

			
         <form action="adminaction_updateMovie" method="post"  enctype="multipart/form-data">
		<div class="inside"  >
		<div>  	<img  src="<%=request.getParameter("movieimgurl") %>" style="width:180px;height:218px;margin-left:43px;">
				<input type="file" name="myfile" ><br>
			<div>
		<input type="hidden" name="resource.movieid" value="<%=request.getParameter("movieid") %>">
		<input type="hidden" name="resource.moviereviewnumber" value="<%=request.getParameter("moviereviewnumber") %>" >
	电影ID：<input type="text"  value="<%=request.getParameter("movieid") %>" disabled><br>
	
		电影名称：<input type="text" name="resource.moviename" value="<%=request.getParameter("moviename") %>"><br>
		电影类型：<select id="select" name="resource.movietype" style="width:150px" >
			<c:forEach var="type" items="${requestScope.movietype}" varStatus="status">
  		 
  		 	<option value="${type.getTypename()}">${type.getTypename()}</option>

  			</c:forEach>

		</select><br>
				
		电影语言：<input type="text" name="resource.movielanguage" value="<%=request.getParameter("movielanguage") %>"><br>
		电影地区：<input type="text" name="resource.moviearea" value="<%=request.getParameter("moviearea") %>"><br>
		电影年份：<input type="text" name="resource.movieyear" value="<%=request.getParameter("movieyear") %>"><br>
		电影时长：<input type="text" name="resource.movietime" value="<%=request.getParameter("movietime") %>"><br>
		电影评论人数：<input type="text" name="resource.moviereviewnumber" value="<%=request.getParameter("moviereviewnumber") %>" disabled><br>
		电影播放地址：<input type="text" name="resource.movieurl" value="<%=request.getParameter("movieurl") %>"><br>
		电影描述信息：<textarea name="resource.moviedescription" cols="25" rows="7" align="left">
					<%=request.getParameter("moviedescription") %>
					</textarea>
		<br><br>
		<input type="submit" value="保存">&nbsp;&nbsp;
		<input type="reset" value="重置"><br>
	</div>
     </form>
     
	   <br>
	  
	   
        
    
    </div>
    
    
    
    
    
    
    
    
    
   </div>
  
  
     
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>

  
  
  
  
  
  
  
  
  <style>
  
  
  input{margin:0px 10px 10px 10px;}
  
  </style>
  

  	<%}%>
  
  
 
    </body>
 </html>
















