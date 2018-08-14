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
    
    <title>My JSP 'userManager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
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
<style>
.line{
height:1px;
background-color:#999;
}
.line2{
height:1px;
width:70px;
background-color:#999;
}
</style>
 <script>
    function confirmDel(id)
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
  </head>
  
  <body>
  
		
		
		
		
		
		
		
		
		
		
		
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
        
        
        
        <div id="page-wrapper">
        <div class="graphs">
        	<div class="col_3">
        
        	
        
        	 
        	 
        	 
        	 
        	<div class="clearfix"> </div>
      </div>
      
      
    
    
    
    
    <div class="content_bottom">
     <div class="col-md-8 span_3">
		  <div class="bs-example1" data-example-id="contextual-table">
		  
		  
		    
		    
		    
		    
		    
		    <table class="table table-striped">   
		    <thead>
		        <tr >
		     
		          <th>${requestScope.reviewuser}的评论记录：<br> </th>
		  
		       
		        </tr>
		      </thead>
		      
		      <tr><td>
		    <c:forEach var="review" items="${requestScope.review}" varStatus="status">
    

	 <div id="${status}">
	
${review.getReviewmoviename()}<br>	
<div class="line2"></div>
<br>
	${review.getReviewcontent()}<br>
	<br>
	 <div   style="margin-left: 480px;">	${review.getReviewtime()} </div><br>
<span   style="margin-left: 510px;">	<button type="button" class="btn btn-outline-secondary" style="margin-bottom:13px;"><a href="adminaction_deleteReview?review.reviewid=${review.getReviewid()}&user.username=${review.getReviewuser()}" onclick="return confirmDel()">删除</a></button></span><br>
	<div class="line"></div>
	
		
			<br>


	 </div>
    </c:forEach>
    <td><tr>
    
       </table>
       
       
       
		   </div>
	   </div>
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   <div class="col-md-4 span_4">
		 <div class="col_2">
		  <div class="box_1">
		   <div class="col-md-6 col_1_of_2 span_1_of_2">
             <a class="tiles_info">
			    <div class="tiles-head red1">
			        <div class="text-center">Orders</div>
			    </div>
			    <div class="tiles-body red">10</div>
			 </a>
		   </div>
		   <div class="col-md-6 col_1_of_2 span_1_of_2">
              <a class="tiles_info tiles_blue">
			    <div class="tiles-head tiles_blue1">
			        <div class="text-center">Sales</div>
			    </div>
			    <div class="tiles-body blue1">30</div>
			  </a>
		   </div>
		   <div class="clearfix"> </div>
		 </div>
		 <div class="box_1">
		   <div class="col-md-6 col_1_of_2 span_1_of_2">
             <a class="tiles_info">
			    <div class="tiles-head fb1">
			        <div class="text-center">Facebook</div>
			    </div>
			    <div class="tiles-body fb2">10</div>
			 </a>
		   </div>
		   <div class="col-md-6 col_1_of_2 span_1_of_2">
              <a class="tiles_info tiles_blue">
			    <div class="tiles-head tw1">
			        <div class="text-center">Twitter</div>
			    </div>
			    <div class="tiles-body tw2">30</div>
			  </a>
		   </div>
		   <div class="clearfix"> </div>
		   </div>
		  </div>
		  <div class="cloud">
			<div class="grid-date">
				<div class="date">
					<p class="date-in">New York</p>
					<span class="date-on">°F °C </span>
					<div class="clearfix"> </div>							
				</div>
				<h4>30°<i class="fa fa-cloud-upload"> </i></h4>
			</div>
			<p class="monday">Monday 10 July</p>
		  </div>
		</div>
		<div class="clearfix"> </div>
	    </div>
		<div class="copy">
           <p>Copyright &copy; 2015 </p>
	    </div>
		</div>
       </div>
      <!-- /#page-wrapper -->
   </div>
  
  
     
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
</body>

<html>
