<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:if test="${movietype==null}">
<s:action name="movieaction_selectType" executeResult="true" namespace="/"/>
</c:if>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="description" content="Magz is a HTML5 & CSS3 magazine template is based on Bootstrap 3.">
		
		<meta name="keyword" content="magz, html5, css3, template, magazine template">
		
		<title>Magz &mdash; Responsive HTML5 &amp; CSS3 Magazine Template</title>
		<!-- Bootstrap -->
		<link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/bootstrap-3.3.4.css">
		<!-- IonIcons -->
		<link rel="stylesheet" href="scripts/ionicons/css/ionicons.min.css">
		<!-- Toast -->
		<link rel="stylesheet" href="scripts/toast/jquery.toast.min.css">
		<!-- OwlCarousel -->
		<link rel="stylesheet" href="scripts/owlcarousel/dist/assets/owl.carousel.min.css">
		<link rel="stylesheet" href="scripts/owlcarousel/dist/assets/owl.theme.default.min.css">
		<!-- Magnific Popup -->
		<link rel="stylesheet" href="scripts/magnific-popup/dist/magnific-popup.css">
		<link rel="stylesheet" href="scripts/sweetalert/dist/sweetalert.css">
		<!-- Custom style -->
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/skins/all.css">
		<link rel="stylesheet" href="css/demo.css">
		<link rel="stylesheet"  href="css/moviepage.css" >
	</head>

<style>
.div_img img{
 height:40px;width:40px;"
}
.pic{
margin:10px;
} 
.moviepage{
width:1000px;
}
</style>
<style>

</style>
<script src="scripts/jquery.js"></script>
<script>
function show(){

var session="<%=session.getAttribute("user")%>"
//alert(session)
if(session=="null")
{
	document.getElementById("div_user").innerHTML="<div  class='col-md-3 col-sm-12 text-right'><ul class='nav-icons'><li><a href='register.jsp'><i class='ion-person-add'></i> <div> 注册</div></a></li><li><a href='login.jsp'><i class='ion-person'></i><div>登录</div></a></li></ul></div>"
	
	
}
else
{
	document.getElementById("div_user").innerHTML="<div  class='col-md-3 col-sm-12 text-right'><ul class='nav-icons'><li><div class='div_img'><img class='img-circle' src='${sessionScope.user.getIcon()}'  /></div></li><li><a href='reviewaction_selectReview?user.username=${sessionScope.user.getUsername()}'><span>${sessionScope.user.getUsername()}</span></a></li></ul></div>"
}

}

$(function prev(){
	var pagecode=<%=request.getAttribute("pageCode")%>;
	if(pagecode<=1)
	{
		$('#prev_page').css('display','none')
		
	}
	$('#prev_page').on('mouseover', 'a', function (e){
    var url="movieaction_selectMovie?type=${requestScope.type}&keyword=${requestScope.keyword}&pageCode="+(pagecode-1);
    
    $(e.target).attr("href",url);})
});

$(function next(){
	var pagecode=<%=request.getAttribute("pageCode")%>;
	
	if("${requestScope.movielist}"=='')
	{
		$('#next_page').css('display','none')
	}
	$('#next_page').on('mouseover', 'a', function (e){
    var url="movieaction_selectMovie?type=${requestScope.type}&keyword=${requestScope.keyword}&pageCode="+(pagecode+1);
    $(e.target).attr("href",url);})
});
</script>
	<body onload="show()">
			<div class="firstbar">
				<header class="primary">
			<div class="firstbar">
				<div class="container">
					<div class="row">
						<div class="col-md-3 col-sm-12">
							<div class="brand">
								<a href="in_index.jsp">
									<img src="images/logo.png" alt="Magz Logo">
								</a>
							</div>						
						</div>
						<div class="col-md-6 col-sm-12">
							
						
						</div>
						<div id="div_user" >
						
						
						
						</div>
					</div>
				</div>
			</div>

		
		</header>
	
		
		
		
	<section class="not-found">
			<div class="container"  style="width: 1120px;">
    <div id="wrapper">
        

        
    <div id="content" style="
    margin-left: 113px;
">
        
   

        <div class="grid-16-8 clearfix">
            
            
            <div class="article">
                
    
                
    <br>
                
    <br>
   
    
                
    <br>
    <br>
    
<div class="gaia">
    <div class="detail-pop"></div>

    <div class="fliter-wp">
         <h1>选电影</h1>
         <br>
         <form action="movieaction_selectMovie" class="gaia_frm" autocomplete="off">
        <input type="hidden" name="type" value="moviename">
          <div class="form-group">
							<div class="input-group">
							
										<input type="text" name="keyword" class="form-control" placeholder="输入你想要的电影信息"  size="px"  style="width: 788px; margin-left: 30px">	
										<dic class="new1">
											<div class="input-group-btn" style=" style="padding-right: 80px;">
											<button class="btn btn-primary"><i class="ion-search"></i></button>
										</div>
</dic>
									</div>
								</div>
        <div class="tool">
            <div class="sort">
                <label>
                    <input type="radio" name="sort" value="moviereviewnumber" checked="checked">按热度排序
                </label>
                <label>
                    <input type="radio" name="sort" value="movieyear">按时间排序
                </label>
                <label>
                    <input type="radio" name="sort" value="avgscore">按评分排序
                </label>
            </div>
			</div>
          </form>
        
        		
        
   
        
        <div class="tag-list"  style=“text-align:center;>
		
       	<c:forEach var="movietype" items="${requestScope.movietype}" varStatus="status">
       	 <a href="movieaction_selectMovie?type=${movietype.getTypename()}&keyword=1" > <label class="select"><input type="button" name="tag" value="${movietype.getTypename()}"> </label></a>
       	</c:forEach>
       
        </div>
     
        
        
        
        
    
     <div class="moviepage"> 
    <c:forEach var="movie" items="${requestScope.movielist}" varStatus="status">
    <div class="pic" width="200" >
    <a href="movieaction_movieInfo?resource.movieid=${movie.getMovieid()}">
    <img src="${movie.getMovieimgurl()}" height="218" width="180"><br>
    <span>${movie.getMoviename()}</span><br>
	<span>${movie.getAvgscore()}</span>
    </a>
    </div>
    </c:forEach>
  </div>
  
   
        </div>
     <h4><span><font color="red">${requestScope.msg}</font></span></h4>
     
     
     
     
      <div id="footer">
            <div class="footer-extra"></div>
         <div class="col-md-12 text-center">
		            <ul class="pagination" id="page">
		              <li class="prev" id="prev_page"><a href="#" ><i class="ion-ios-arrow-left"></i></a></li>
		          
		              <li class="next" id="next_page"><a href="#"><i class="ion-ios-arrow-right"></i></a></li>
		            </ul>
		            
		          </div>
		          </div>
		          
</section>
   
     
   
		          
		          

		<footer class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="block">
							<h1 class="block-title">公司简介</h1>
							<div class="block-body">
								<figure class="foot-logo">
 <img src="images/logo.png">
 	
								</figure>
								<p class="brand-description">
									抽象电影网是由任龙飞同学创建的一个抽象的电影评论网站。
								</p>
								<a href="page.html" class="btn btn-magz white">关于我们<i class="ion-ios-arrow-thin-right"></i></a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="block">
							<h1 class="block-title">热门标签<div class="right"><a href="#">全部查看<i class="ion-ios-arrow-thin-right"></i></a></div></h1>
							<div class="block-body">
								<ul class="tags">
									<li><a href="#">动作片</a></li>
									<li><a href="#">动漫</a></li>
									<li><a href="#">纪录片</a></li>
									<li><a href="#">电影剧照</a></li>
									<li><a href="#">评分</a></li>
									<li><a href="#">热门影评</a></li>
									<li><a href="#">影院热映</a></li>
								</ul>
							</div>
						</div>
						<div class="line"></div>
						<div class="block">
							<h1 class="block-title">订阅抽象</h1>
							<div class="block-body">
								<p>告诉我们您的邮箱，您将会收到关于抽象的更多资讯</p>
								<form class="newsletter">
									<div class="input-group">
										<div class="input-group-addon">
											<i class="ion-ios-email-outline"></i>
										</div>
										<input type="email" class="form-control email" placeholder="Your mail">
									</div>
									<button class="btn btn-primary btn-block white">订阅</button>
								</form>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="block">
							<h1 class="block-title">最近新闻</h1>
							<div class="block-body">
								<article class="article-mini">
									<div class="inner">
										<figure>
											<a href="single.html">
												<img src="images/pic3.jpg" alt="Sample Article">
											</a>
										</figure>
										<div class="padding">
											<h1><a href="single.html"> 《狄仁杰》 剧组全国巡演开始，第一站大连 </a></h1>
										</div>
									</div>
								</article>
								<article class="article-mini">
									<div class="inner">
										<figure>
											<a href="single.html">
												<img src="images/pic6.jpg" alt="Sample Article">
											</a>
										</figure>
										<div class="padding">
											<h1><a href="single.html">华谊兄弟入股抽象电影网，双方达成战略协议</a></h1>
										</div>
									</div>
								</article>
								<article class="article-mini">
									<div class="inner">
										<figure>
											<a href="single.html">
												<img src="images/pic7.jpg" alt="Sample Article">
											</a>
										</figure>
										<div class="padding">
											<h1><a href="single.html">抽象影业昨日召开发布会，产业布局重新生态链 </a></h1>
										</div>
									</div>
								</article>
								
								<a href="#" class="btn btn-magz white btn-block">查看 全部<i class="ion-ios-arrow-thin-right"></i></a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-xs-12 col-sm-6">
						<div class="block">
							<h1 class="block-title">关注我们</h1>
							<div class="block-body">
								<p>关注我们并了解抽象电影网的最新动态</p>
								<ul class="social trp">
									<li>
										<a href="#" >
											<img src="images/vxlogo.jpg" alt="weixin">
									
										</a>
									</li>
									<li>
										<a href="#" >
										
											<img src="images/weibologo.jpg"alt="weibo">
										</a>
									</li>
									<li>
										<a href="#">
										<img src="images/qqzone.jpg" alt="qqzone">
										</a>
									</li>
										<li>
										<a href="#" class="facebook">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-facebook"></i>
										</a>
									</li>
									
									<li>
										<a href="#" class="youtube">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-youtube-outline"></i>
										</a>
									</li>
									
								
									<li>
										<a href="#" class="twitter">
											<svg><rect width="0" height="0"/></svg>
											<i class="ion-social-twitter-outline"></i>
										</a>
									</li>
									
								
								</ul>
							</div>
						</div>
						<div class="line"></div>
						<div class="block">
							<div class="block-body no-margin">
								<ul class="footer-nav-horizontal">
									<li><a href="index.html">Home</a></li>
									<li><a href="#">Partner</a></li>
									<li><a href="contact.html">Contact</a></li>
									<li><a href="page.html">About</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="copyright">
							COPYRIGHT &copy; abstract comypany.
							<div>
								Made with <i class="ion-heart"></i> by wan
							</div>
						</div>
					</div>
				</div>
			</div>
		</footer>
		

		<!-- JS -->
		<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<script src="js/jquery.migrate.js"></script>
		<script src="scripts/bootstrap/bootstrap.min.js"></script>
		<script>var $target_end=$(".best-of-the-week");</script>
		<script src="scripts/jquery-number/jquery.number.min.js"></script>
		<script src="scripts/owlcarousel/dist/owl.carousel.min.js"></script>
		<script src="scripts/magnific-popup/dist/jquery.magnific-popup.min.js"></script>
		<script src="scripts/easescroll/jquery.easeScroll.js"></script>
		<script src="scripts/sweetalert/dist/sweetalert.min.js"></script>
		<script src="scripts/toast/jquery.toast.min.js"></script>
		<script src="js/demo.js"></script>
		<script src="js/e-magz.js"></script>
	</body>
</html>