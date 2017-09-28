<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<title>Vira | Home</title>
	<link rel="shortcut icon" type="image/x-icon"
		href="resource/images/logo.png" />
	
	<link href="resource/css/bootstrap.min.css" rel="stylesheet">
	<link href="resource/css/bootstrap-theme.min.css" rel="stylesheet">
	
	<link href="resource/css/owl.carousel.css" rel="stylesheet">
	<link href="resource/css/owl.theme.default.min.css" rel="stylesheet">
	
	<link href="resource/css/magnific-popup.css" rel="stylesheet">
	
	<link href="resource/css/style.css" rel="stylesheet">
	
	
	<!--[if lt IE 9]>
	        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	        <![endif]-->
</head>
<body>
	<div id="menu-item" class="menu-item hide-menu">
		<div class="container">
			<ul>
				<a href="index.html"><li>主页</li></a>
				<a href="#about"><li>关于</li></a>
				<a href="#expertise"><li>专家设计意见</li></a>
				<a href="#workstation"><li>工作站</li></a>
				<a href="#team"><li>团队成员</li></a>
				<a href="#contact"><li>联系我们</li></a>
				<a href="elements.html"><li>管理</li></a>
			</ul>
		</div>
	</div>
	<div class="main">
		<header class="bg-img header"> <nav
			class="navbar navbar-default navbar-vira">
		<div class="container">
			<div class="navigation-bar">
				<div class="row">
					<div class="col-xs-6">
						<div class="logo">
							<a href="index.jsp"><span class="fa fa-viacoin"></span></a>
						</div>
					</div>
					<div class="col-xs-6 text-right">
						<div class="menu m">
							<a href="#"><span class="ion-navicon _ion-android-menu"></span></a>
						</div>
					</div>
				</div>
			</div>
		</div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="intro-box">
					<div class="intro">
						<h1>We are vira agency</h1>
						<p>Creative digital agency based in US</p>
						<a class="btn vira-btn" href="#">Explore us</a>
					</div>
				</div>
			</div>
		</div>
		</header>
		<section id="about" class="about section">
		<div class="container">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-2">
					<h2 class="title">关于机构</h2>
					<p id="p_about_description">
						<%--Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
						<%--enkele risico’s die The Garment Club met zich meebrengt. Onze--%>
						<%--enige missie is dat jij de best geklede man van de omgeving bent.--%>
						<%--Laat gratis een op eden box samenstellen door je personal shopper--%>
						<%--en betaal.--%>
					</p>
					<img src="resource/images/signature.png"> <span>Vira
						Studio-ceo</span>
				</div>
			</div>
		</div>
		</section>
		<section class="purpose section">
		<div class="container">
			<h2 class="title">我们的工作</h2>
			<div class="row" id="div_work">
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<div class="card-icon">--%>
								<%--<span class="fa fa-diamond" aria-hidden="true"></span>--%>
							<%--</div>--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Digital Design</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<div class="card-icon">--%>
								<%--<span class="fa fa-cogs" aria-hidden="true"></span>--%>
							<%--</div>--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Web Development</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<div class="card-icon">--%>
								<%--<span class="fa fa-bicycle" aria-hidden="true"></span>--%>
							<%--</div>--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Digital Marketing</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
			</div>
		</div>
		</section>
		<section id="expertise" class="expert">
		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-6 bg-img">
					<div></div>
				</div>
				<div class="col-sm-5 section">
					<h2 class="title">专家设计意见</h2>
					<div id="expert-slider" class="owl-carousel">
						<%--<div class="item">--%>
							<%--<p id="p_expertise_description">--%>
								<%--Leverage agile frameworks to provide a robust synopsis for--%>
								<%--high level overviews. Iterative approaches to corporate strategy--%>
								<%--foster collaborative thinking to further the overall--%>
								<%--proposition. Organically grow the holistic world view of--%>
								<%--disruptiveinnovationvia workplace diversity and empowerment.--%>
							<%--</p>--%>
						<%--</div>--%>
						<%--<div class="item">--%>
							<%--<p>Bring to the table win-win survival strategies to ensure--%>
								<%--proactive domination. At the end of the day, going forward, a--%>
								<%--new normal that has evolved from generation X is on the runway--%>
								<%--heading towards a streamlined cloud solution. User generated--%>
								<%--content in real-time will have multiple touchpoints for--%>
								<%--offshoring.</p>--%>
						<%--</div>--%>
					</div>
				</div>
			</div>
		</div>
		</section>
		<section class="vira-quote section bg-img">
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<img class="quote" src="resource/images/quote.png">
					<p>A user interface is like a joke. If you have to explain it,
						it’s not that good.</p>
					<p class="author">Martin leBlance, Iconfinder</p>
					<img src="resource/images/mouse.png">
				</div>
			</div>
		</div>
		</section>
		<section id="workstation" class="work section">
		<div class="container">
			<h2 class="title">工作站</h2>
			<div id="workstation-slider" class="owl-carousel">
				<%--<div class="item">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/4.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Creative geeks</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="item">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/5.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Creative freaks</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="item">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/6.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Creative nerds</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="item">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/4.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Creative geeks</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="item">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/5.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Creative freaks</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="item">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/6.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Creative nerds</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club met zichlaim meebrengt.--%>
								<%--Onze enige missiede</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
			</div>
		</div>
		</section>
		<section class="watch bg-img">
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<span>Watch showreel</span> <a class="popup-youtube btn" style="display: inline-grid;"
						href="https://www.youtube.com/watch?v=4KRHIbsl8BE"><span
						class="fa fa-play" style="margin: auto;"></span></a> <span>with us</span>
				</div>
			</div>
		</div>
		</section>
		<section id="team" class="team section">
		<div class="container">
			<h2 class="title">团队成员</h2>
			<div class="row" id="div_user_list">
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/8.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Pink Floyd</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club</p>--%>
							<%--<div class="social-icons">--%>
								<%--<ul>--%>
									<%--<a href="#"><li><span class="ion-social-facebook"></span></li></a>--%>
									<%--<a href="#"><li><span class="ion-social-twitter"></span></li></a>--%>
								<%--</ul>--%>
							<%--</div>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/9.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Eric Clapton</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club</p>--%>
							<%--<div class="social-icons">--%>
								<%--<ul>--%>
									<%--<a href="#"><li><span class="ion-social-facebook"></span></li></a>--%>
									<%--<a href="#"><li><span class="ion-social-twitter"></span></li></a>--%>
								<%--</ul>--%>
							<%--</div>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<img class="img-responsive" src="resource/images/10.jpg">--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>Elton Jhon</h3>--%>
							<%--<p>Complimenten, bewonderend gefluit en lonkende blikken zijn--%>
								<%--enkele risico’s die The Garment Club</p>--%>
							<%--<div class="social-icons">--%>
								<%--<ul>--%>
									<%--<a href="#"><li><span class="ion-social-facebook"></span></li></a>--%>
									<%--<a href="#"><li><span class="ion-social-twitter"></span></li></a>--%>
								<%--</ul>--%>
							<%--</div>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
			</div>
		</div>
		</section>
		<section class="subscribe section bg-img">
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<p>发送你的email邮箱，我们将持续为你推送最新信息</p>
					<form class="form-inline" method="post" action="<%=path%>/subscribeAction_saveSubscribe">
						<div class="form-group">
							<input name="user-email" type="email" class="form-control" id="user-email"
								placeholder="在这里输入你的email">
						</div>
						<button type="button" id="btn_send" class="btn vira-btn">发送</button>
					</form>
				</div>
			</div>
		</div>
		</section>
		<section id="contact" class="contact section">
		<div class="container">
			<h2 class="title">联系我们</h2>
			<div class="row" id="div_contacts">
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<span class="fa fa-map-o" aria-hidden="true"></span>--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>地址</h3>--%>
							<%--<p>Level 5, 25 pitt st, US</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<span class="fa fa-phone" aria-hidden="true"></span>--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>电话</h3>--%>
							<%--<p>+555 211 3747</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<%--<div class="col-sm-4">--%>
					<%--<div class="vira-card">--%>
						<%--<div class="vira-card-header">--%>
							<%--<span class="fa fa-paper-plane" aria-hidden="true"></span>--%>
						<%--</div>--%>
						<%--<div class="vira-card-content">--%>
							<%--<h3>邮箱</h3>--%>
							<%--<p>hey@themewagon.com</p>--%>
						<%--</div>--%>
					<%--</div>--%>
				<%--</div>--%>
				<div class="col-sm-12">
					<div class="social-icons">
						<ul>
							<a href="#"><li><span class="ion-social-facebook"></span></li></a>
							<a href="#"><li><span class="ion-social-twitter"></span></li></a>
							<a href="#"><li><span class="ion-social-pinterest"></span></li></a>
						</ul>
					</div>
				</div>
			</div>
		</div>
		</section>
		<footer class="footer">
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<p>
						<span class="fa fa-heart"></span>
						<a href="http://118.89.25.195/tourInteraction" target="_blank" title="tourInteraction">tourInteraction</a>
						- Design by <a href="http://118.89.25.195/tourInteraction" title="tourInteraction"
							target="_blank">tourInteraction</a>
					</p>
				</div>
			</div>
		</div>
		</footer>
	</div>

	<script src="<%=path%>/resource/js/jquery-3.1.1.js"></script>
	<script src="<%=path%>/resource/js/bootstrap.min.js"></script>
	<script src="<%=path%>/resource/js/fontawesome.js"></script>
	<script src="<%=path%>/resource/js/jquery.magnific-popup.js"></script>

	<script src="<%=path%>/resource/js/owl.carousel.min.js"></script>
	<script src="<%=path%>/resource/js/script.js"></script>

	<script src="<%=path%>/resource/js/myJs/getPath.js"></script>
	<script src="<%=path%>/resource/js/myJs/index.js"></script>


</body>
</html>
