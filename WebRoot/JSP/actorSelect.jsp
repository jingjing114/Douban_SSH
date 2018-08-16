<%@ page language="java" import="java.util.*,com.neu.cxl.entity.DoubanUser" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
	</style>

  <body>
  
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
        
        
        
        <div id="page-wrapper" style="height:2500px;">
        <div class="graphs" >
        	<div class="col_3">
	
        	 
        	<div class="clearfix"> </div>
      </div>
      
    
    
    
    
    
    <div class="content_bottom">
     
	   </div>
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   <br>
	   
       
       
       <div style="text-align:center;">
    <h3>演员列表</h3>
    <form action="adminaction_selectActorByName">
    <input type="text" name="actor.actorname" placeholder="输入要查找的演员名" class="input-small"  style="width:550px;"><input type="submit" value="搜索"  style="color:#F73F52">
    </form>
    
     </div>
     
     
	   <br>
	  
	   
        <center >
 
    
    <div class="link" >
    <c:forEach var="actor" items="${requestScope.actorlist}" varStatus="status">

    <div id="div" width="200" >
    <a href="#">
       <img src="${actor.getActorphoto()}" height="218" width="180"><br>
    <span style="color:#F73F52;">${actor.getActorname()}</span><br>
     <button type="button" class="btn btn-info" style="margin-right: 5px;">  <a href="JSP/actorUpdate.jsp?actorphoto=${actor.getActorphoto()}&actorid=${actor.getActorid()}&actorname=${actor.getActorname()}&actorsex=${actor.getActorsex()}&actorsign=${actor.getActorsign()}&actorbirthday=${actor.getActorbirthday()}&actorwork=${actor.getActorwork()}&actorborned=${actor.getActorborned()}&actorintroduction=${actor.getActorintroduction()}" style="color:;">修改</a>&nbsp;</button>
     <button type="button" class="btn btn-info" style="margin-right: 5px;">  <a href="adminaction_deleteActor?actor.actorid=${actor.getActorid()}" >删除</a>&nbsp;</button>

    </a>
 
    </div>
    </c:forEach>
    </div>
    </center>
    
    
    </div>
    
    
    
    
    
    
    
    
    
   </div>
  
  
     
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>

  
  
  
  
  
  
  
  
  
  
  
  
  	<%}%>
  
  
  
  
  
 
   </body>
</html>
