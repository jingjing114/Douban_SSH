<%@ page language="java" import="java.util.*,com.neu.cxl.entity.DoubanResource" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
		<link rel="stylesheet" href="css/moviepage.css">
	</head>

<style>
.actor1{
		float: left;
	margin-top: 10px;
margin-left: 50px;

}
#a_review{
margin-left:600px;
 text-align:center ;
}
.div_review{
margin-left:380px;
 width:800px;
 height:600px;
}
.div_img{width:60px;height:60px;border-radius:100px; overflow:hidden}
  .div_img img{width:100%;height:100%}
</style>
<script src="scripts/jquery.js"></script>
<script>

function show(){

var session="<%=session.getAttribute("user")%>"
//alert(session)
if(session=="null")
{
	document.getElementById("div_user").innerHTML="<div  class='col-md-3 col-sm-12 text-right'><ul class='nav-icons'><li><a href='register.jsp'><i class='ion-person-add'></i> <div> 注册</div></a></li><li><a href='login.jsp'><i class='ion-person'></i><div>登录</div></a></li></ul></div>"
	document.getElementById("li_user").style.display="none"
	document.getElementById("a_review").style.display="none"
	document.getElementById("login_review").innerHTML="亲，<a href='login.jsp'>登录</a>后才可以评论哦！"
}
else
{
	document.getElementById("div_user").innerHTML="<div  class='col-md-3 col-sm-12 text-right'><ul class='nav-icons'><li><div class='div_img'><img class='img-circle' src='${sessionScope.user.getIcon()}'  /></div></li><li><a href='reviewaction_selectReview?user.username=${sessionScope.user.getUsername()}'><span>${sessionScope.user.getUsername()}</span></a></li></ul></div>"
}

}

function publish()
  {
  window.open("publishreview.jsp?movieid=${requestScope.movie.getMovieid()}&moviename=${requestScope.movie.getMoviename()}&reviewuser=${sessionScope.user.getUsername()}",'短评','height=300,width=520,top=400,left=800,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=0,status=1');

  }
$(function prev(){
	var pagecode=<%=request.getAttribute("pageCode")%>;
	if(pagecode<=1)
	{
		$('#prev_page').css('display','none')
		
	}
	$('#prev_page').on('mouseover', 'a', function (e){
    var url="movieaction_movieInfo?resource.movieid=${requestScope.movie.getMovieid()}&pageCode="+(pagecode-1);
    
    $(e.target).attr("href",url);})
});

$(function next(){
	var pagecode=<%=request.getAttribute("pageCode")%>;
	if("${requestScope.review}"=='[]')
	{
		$('#next_page').css('display','none')
	}
	$('#next_page').on('mouseover', 'a', function (e){
    var url="movieaction_movieInfo?resource.movieid=${requestScope.movie.getMovieid()}&pageCode="+(pagecode+1);
    $(e.target).attr("href",url);})
});

</script>
	<body onload="show()">
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
							
								<form class="search" autocomplete="off" action="movieaction_selectMovie">
							
								<div class="form-group">
									<div class="input-group">
										<input type="text" name="keyword" class="form-control" placeholder="输入电影">									
										<div class="input-group-btn">
										<button  class="btn btn-primary" ><i class="ion-search"></i></button>
										</div>
									
									</div>
								</div>
							
								<div class="help-block">
								<input type="radio" name="type" value="moviename" checked="checked">按名称
								<input type="radio" name="type" value="movieyear" >按年份
								<input type="radio" name="type" value="avgscore" >按评分
								<input type="radio" name="type" value="movieactorid" >按演员
								<input type="radio" name="type" value="movietype" >按类型
							
								<!--  	<div>热门:</div>
									<ul>
										<li><a href="#">侏罗纪世界2</a></li>
										<li><a href="#">我不是药神</a></li>
										<li><a href="#">邪不压正</a></li>
										<li><a href="#">犬之岛</a></li>
										<li><a href="#">摩天营救</a></li>
									</ul>-->
								</div>
							</form>											
						</div>
						<div id="div_user" >
						
						
						</div>
						
				</div>
			</div>

			
		<!-- Start nav -->
			<nav class="menu">
				<div class="container">
					<div class="brand">
						<a href="#">
							<img src="images/logo.png" alt="Magz Logo">
						</a>
					</div>
					<div class="mobile-toggle">
						<a href="#" data-toggle="menu" data-target="#menu-list"><i class="ion-navicon-round"></i></a>
					</div>
					<div class="mobile-toggle">
						<a href="#" data-toggle="sidebar" data-target="#sidebar"><i class="ion-ios-arrow-left"></i></a>
					</div>
					<div id="menu-list">
						<ul class="nav-list">
							<li class="for-tablet nav-title"><a>Menu</a></li>
							<li class="for-tablet"><a href="login.html">Login</a></li>
							<li class="for-tablet"><a href="register.html">Register</a></li>
							
							<li class="dropdown magz-dropdown">
								<a href="in_index.jsp">主页 </a>
								<ul class="dropdown-menu">
								
									<li><a href="in_index.jsp">主页</a></li>
									<li><a href="moviesearch.jsp">电影</a></li>
									
								
									<li><a href="#">更多</a></li>
									
								</ul>
							</li>
							<li class="dropdown magz-dropdown"><a href="#">关于抽象
							</a>
								<ul class="dropdown-menu">
									<li><a href="#">加入我们</a></li>
									<li class="dropdown magz-dropdown"><a href="#">公司部门 <i class="ion-ios-arrow-right"></i></a>
										<ul class="dropdown-menu">
											<li><a href="#">市场部</a></li>
											<li class="dropdown magz-dropdown"><a href="#">事业部 <i class="ion-ios-arrow-right"></i></a>
												<ul class="dropdown-menu">
													<li><a href="#">抽象影业</a></li>
													<li><a href="#">抽象传媒</a></li>
													<li><a href="#">抽象娱乐</a></li>
												</ul>
											</li>
											<li><a href="#">财务部</a>
										</ul>
									</li>
									<li><a href="#">抽象周报</a></li>
									
								</ul>
							</li>
							<li class="dropdown magz-dropdown magz-dropdown-megamenu"><a href="#">热门电影  </a>
								<div class="dropdown-menu megamenu">
									<div class="megamenu-inner">
										<div class="row">
											<a href="www.baidu.com"><div class="col-md-3">
												<div class="row">
													<div class="col-md-12">
												<h2 class="megamenu-title">热门电影</h2>
													</div>
												</div>
												<div class="row">
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="#">
																	<img src="images/yao.jpg" alt="Sample Article" width="252" height="180">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">December 10, 2018</div>
																	<div class="category"><a href="movieaction_movieInfo?resource.movieid=241">了解详情</a></div>
																</div>
																<h2><a href="#">我不是药神</a></h2>
															</div>
														</div>
													</article>
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="#">
																	<img src="images/巨齿鲨.jpg" alt="Sample Article" width="252" height="180">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">August 10, 2018</div>
																	<div class="category"><a href="movieaction_movieInfo?resource.movieid=4028ab7e65371c830165371d628b0000">了解详情</a></div>
																</div>
																<h2><a href="#">巨齿鲨</a></h2>
															</div>
														</div>
													</article>
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="#">
																	<img src="images/yourname.jpg" alt="Sample Article" width="252" height="180">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">June 14, 2016</div>
																	<div class="category"><a href="movieaction_movieInfo?resource.movieid=14">了解详情</a></div>
																</div>
																<h2><a href="#">你的名字</a></h2>
															</div>
														</div>
													</article>
												</div>
											</div>
										</div>								
									</div>
								</div>
							</li>
							
							<li id="li_user" class="dropdown magz-dropdown"><a href="#">个人中心 <i class="ion-ios-arrow-right"></i></a>
									<ul class="dropdown-menu">
									<li><a href="useraction_selectDoubanUserInfo?user.username=${sessionScope.user.getUsername()}"><i class="icon ion-person"></i>我的主页</a></li>
									
									<li><a href="single.jsp"><i class="icon ion-chatbox"></i> 我的评论</a></li>				
									<li><a href="passwordchange.jsp"><i class="icon ion-chatbox"></i> 重置密码</a></li>		
									<li><a href="useraction_logout"><i class="icon ion-log-out"></i> 注销</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- End nav -->
		</header>

		<section class="not-found" style="padding-top: 217px;padding-bottom: 20px;">
	<div class="container"  >
								
					
	<div id="wrapper">
        

        
    <div id="content">
        
    <div id="dale_movie_subject_top_icon"></div>
    <h1>
    
         <span property="v:itemreviewed">${requestScope.movie.getMoviename()}</span>
            <span class="year">(${requestScope.movie.getMovieyear()})</span>
 
      
    </h1>

        <div class="grid-16-8 clearfix">
            

            
            <div class="article">
        <div class="indent clearfix">
            <div class="subjectwrap clearfix" xmlns:v="http://rdf.data-vocabulary.org/#" typeof="v:Movie">
                <div class="subject clearfix">
                    



<div id="mainpic" class="">
 
        <img src="${requestScope.movie.getMovieimgurl()}" title="点击看更多海报"  width="270" height="380"/>

   
</div>

              


<div id="info">
        <span ><span class='pl'>导演</span>: 
         <c:forEach var="d" items="${requestScope.director}" varStatus="status">
  		 <a href="aadaction_selectDirector?director.directorid=${d.getDirectorid()}" rel="v:directedBy">${d.getDirectorname()}</a>/
  		 </c:forEach></span>
        <br>
       <span class="actor3"><span class='pl'>主演</span>:
        <c:forEach var="a" items="${requestScope.actor}" varStatus="status">
  		 <a href="aadaction_selectActor?actor.actorid=${a.getActorid()}" rel="v:directedBy">${a.getActorname()}</a>/    
  		 </c:forEach></span>
       <br/>
        <span class="pl">类型:</span> 
        
  		     <span property="v:genre">${requestScope.movie.getMovietype()}</span> 
  		 
        <br/>
        
        <span class="pl">制片国家/地区:</span> 
        <span property="v:genre">${requestScope.movie.getMoviearea()}</span> 
        <br/>
        <span class="pl">语言:</span> 
         
  		     <span property="v:genre">${requestScope.movie.getMovielanguage()}</span> 
  	
        <br/>
        <span class="pl">上映日期:</span> 
        <span property="v:initialReleaseDate" >
          
  		     <span property="v:genre">${requestScope.movie.getMovieyear()}</span>
  		
        </span> 
<br/>
        <span class="pl">片长:</span> 
        <span property="v:runtime" >
        <span property="v:genre">${requestScope.movie.getMovietime()}</span>
        </span><br/>
        
</div>
</div>
</div>
</div>
</div>
</div>
                    


<div id="interest_sectl">
    <div class="rating_wrap clearbox" rel="v:rating">
        <div class="clearfix">
          <div class="rating_logo ll">
              豆瓣评分
          </div>
  
            
             
  		     <span property="v:genre"><font size="10" color="red">${requestScope.movie.getAvgscore()}</font></span> 
  		
      
          
          
        </div>
        


        <div class="ll bigstar bigstar40"></div>
        <div class="rating_sum">
                   
  		     <span property="v:genre"><font color="red">${requestScope.movie.getMoviereviewnumber()}</font></span>人评价
  		
                
               
        </div>
    </div>
</div>
<div class="ratings-on-weight">
    
      
     
</div>

    </div>
     
</div>


                
            </div>
                




<div id="interest_sect_level" class="clearfix" >
        
          
        <div class="ll j a_stars">
            
    
   

</div>

   



<div class="related-info" style="margin-bottom:-10px;">
    <a name="intro"></a>
    
        <br>
  

            
            
    <h2 style="font-size:20px;">
        剧情简介
             
    </h2>
<br>
            <div class="indent" id="link-report" style="padding-left:230px; padding-right:230px;width:1440px;" >
                    
                        <span property="v:summary" class="">
                               
  		     <span property="v:genre">${requestScope.movie.getMoviedescription()}</span>
  		
                                    <br />
                                　
                        </span>
                    
            </div>
</div>


    








<div id="celebrities" class="celebrities related-celebrities">

<br>

  
    <h2 style="font-size:20px;">
        相关影人
             
    </h2>

<br>
   <div style="width:1300px;padding-left:230px">
  <c:forEach var="a" items="${requestScope.actor}" varStatus="status">
  		 <div class="actor1"><a href="aadaction_selectActor?actor.actorid=${a.getActorid()}"><img src="${a.getActorphoto()}" height="218" width="180"><p>${a.getActorname()}<p></a></div>  
  		 </c:forEach></span>
</div>
</div>

</div>
		</section>
<div class="div_review" >
<span>最近评论</span><br>
<span id="login_review"></span>
<button id="a_review"  onclick="publish()"><font size="3">我要写短评...</font></button><br>
<hr>
<c:forEach var="r" items="${requestScope.review}" varStatus="status">
  		 <a href="#" rel="v:directedBy">${r.getReviewuser()}</a>&nbsp;&nbsp;
  		 <span><font color="red">${r.getReviewscore()}</font></span>&nbsp;&nbsp;
  		<span>${r.getReviewtime()}</span><br>
  		 <span>${r.getReviewcontent()}</span>
  		  <hr style=" height:2px;border:none;border-top:2px dotted #185598;"size=2>
  		 </c:forEach>
  		 	  <div id="footer">
            <div class="footer-extra"></div>
         <div class="col-md-12 text-center">
		            <ul class="pagination" id="page">
		            
		              <li class="prev" id="prev_page"><a href="" ><i class="ion-ios-arrow-left"></i></a></li>
		              
		              
		              <li class="next" id="next_page"><a href=""><i class="ion-ios-arrow-right"></i></a></li>
		            </ul>
		            
		          </div>
		          </div>
  		 </div>
  		
  		    

 
		
		          
		
	<!-- Start footer -->
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
		<!-- End Footer -->

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