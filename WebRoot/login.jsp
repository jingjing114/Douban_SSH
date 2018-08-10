<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	</head>
    

	<body>
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
							
									<form class="search" autocomplete="off" action="SelectMovieServletByUser">
							
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
						<div class="col-md-3 col-sm-12 text-right">
							<ul class="nav-icons">
								<li><a href="register.html"><i class="ion-person-add"></i><div>注册</div></a></li>
								<li><a href="login.html"><i class="ion-person"></i><div>登录</div></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<!-- Start nav -->
		<!--  	<nav class="menu">
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
								<a href="index.html">主页 </a>
								<ul class="dropdown-menu">
								
									<li class="dropdown magz-dropdown">
										<a href="#">账户<i class="ion-ios-arrow-right"></i></a>
										<ul class="dropdown-menu">
											<li><a href="login.html">登录</a></li>
											<li><a href="register.html">注册</a></li>
											<li><a href="passwordchange.html">重置密码</a></li>
										</ul>
									</li>
									<li><a href="moviesearch.html">电影</a></li>
									<li><a href="actor.html">演员</a></li>
									
									<li><a href="moviesearch.html">搜索</a></li>
									<li><a href="contact.html">更多</a></li>
									
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
							<li class="dropdown magz-dropdown magz-dropdown-megamenu"><a href="moviesearch.html">热门电影  </a>
								<div class="dropdown-menu megamenu">
									<div class="megamenu-inner">
										<div class="row">
											<a href="www.baidu.com"><div class="col-md-3">
												<div class="row">
													<div class="col-md-12">
														<h2 class="megamenu-title">电影分类</h2>
													</div>
												</div>
												<ul class="vertical-menu">
													<li><a href="moviesearch.html"><i class="ion-ios-circle-outline"></i> 高分电影</a></li>
													<li><a href="#"><i class="ion-ios-circle-outline"></i> 热门影评</a></li>
													<li><a href="#"><i class="ion-ios-circle-outline"></i> 电影壁纸</a></li>
													<li><a href="#"><i class="ion-ios-circle-outline"></i> 正在上映</a></li>
													
												</ul>
											</div></a>
											<div class="col-md-9">
												<div class="row">
													<div class="col-md-12">
														<h2 class="megamenu-title">热门电影</h2>
													</div>
												</div>
												<div class="row">
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="moviepage2.html">
																	<img src="images/yao.jpg" alt="Sample Article">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">December 10, 2018</div>
																	<div class="category"><a href="category.html">了解详情</a></div>
																</div>
																<h2><a href="moviepage2.html">我不是药神</a></h2>
															</div>
														</div>
													</article>
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="moviepage.html">
																	<img src="images/ran.jpg" alt="Sample Article">
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">December 11, 1996</div>
																	<div class="category"><a href="moviepage.html">了解详情</a></div>
																</div>
																<h2><a href="moviepage.html">燃烧烈爱</a></h2>
															</div>
														</div>
													</article>
													<article class="article col-md-4 mini">
														<div class="inner">
															<figure>
																<a href="single.html">
																	<img src="images/yourname.jpg" alt="Sample Article"ur>
																</a>
															</figure>
															<div class="padding">
																<div class="detail">
																	<div class="time">June 14, 2016</div>
																	<div class="category"><a href="category.html">了解详情</a></div>
																</div>
																<h2><a href="single.html">你的名字</a></h2>
															</div>
														</div>
													</article>
												</div>
											</div>
										</div>								
									</div>
								</div>
							</li>
							
							<li class="dropdown magz-dropdown"><a href="#">个人中心 <i class="ion-ios-arrow-right"></i></a>
								<ul class="dropdown-menu">
									<li><a href="login.html"><i class="icon ion-person"></i>我的主页</a></li>
									<li><a href="login.html"><i class="icon ion-heart"></i> 我的收藏</a></li>
									<li><a href="login.html"><i class="icon ion-chatbox"></i> 我的评论</a></li>
					
									<li><a href="#"><i class="icon ion-settings"></i> 设置</a></li>
									<li class="divider"></li>
									<li><a href="#"><i class="icon ion-log-out"></i> 注销</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</nav>-->
			<!-- End nav -->
		</header>


		<section class="login first grey">
			<div class="container">
				<div class="box-wrapper">				
					<div class="box box-border">
						<div class="box-body">
							<h4>登录</h4>
							 <span><font color="red">${requestScope.msg}</font></span>
							<form action="useraction_login"  method="post" >
							<div id="result"></div>
								<div class="form-group">
									<label>用户名</label>
									<input type="text" name="user.username" id="username" class="form-control"  required>
								</div>
								<div class="form-group">
									<label class="fw">密码
										<a href="passwordchange.html" class="pull-right" required>忘记密码?</a>
									</label>
									<input type="password" name="user.password" id="password" class="form-control">
								</div>
								<div class="form-group text-right">
									<input type="submit" class="btn btn-primary btn-block" value="登录" >	
								</div>
								<!-- <div class="form-group text-right">
									<input type="submit" class="btn btn-primary btn-block" value="登录" >	
								</div>-->
								<div class="form-group text-center">
									<span class="text-muted">没有账户?</span> <a href="register.html">Create one</a>
								</div>
								<div class="title-line">
									or
								</div>
              	<a href="#" class="btn btn-social btn-block facebook"><i class="ion-social-facebook"></i> Login with Facebook</a>
							</form>
						</div>
					</div>
				</div>
			</div>
		</section>
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