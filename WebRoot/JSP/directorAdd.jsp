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

  <body>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  <body >
  
		
		
		
		
		
		
		
		
		
		
		
          <div id="wrapper">
 
 
              <nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">欢迎管理员${sessionScope.user.getUsername()}登录！</a>
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
	   
      
       
     <h3>导演信息添加</h3>
		<form action="adminaction_addDirector" method="post" enctype="multipart/form-data">
		<input type="hidden" name="dtm.movieid" value="<%=session.getAttribute("movieid") %>">
		姓名：<input type="text" name="director.directorname" ><br>
		性别：<input type="text" name="director.directorsex" ><br>
		星座：<input type="text" name="director.directorsign" ><br>
		生日：<input type="text" name="director.directorbirthday" ><br>		
		职业：<input type="text" name="director.directorwork" ><br>
		出生地区：<input type="text" name="director.directorborned" "><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		个人照片：<input type="file" name="myfile" ><br>
		个人简介：
		<textarea name="director.directorintroduction" cols="25" rows="7" align="left">
					
					</textarea><br><br>
		<input type="submit" value="保存">&nbsp;&nbsp;
		<input type="reset" value="重置"><br>
		</form>
  
     </from>
     
	   <br>
	  
	   
        
    
    </div>
    
    
    
    
    
    
    
    
    
   </div>
  
  
     
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>

  
  
  
  
  
  
  
  
  <style>
  
  
  input{margin:10px 10px 10px 10px;}
  
  <style>
  
  
  
  
  
  
  <style>
  
  
  
 
   </body>
</html>

