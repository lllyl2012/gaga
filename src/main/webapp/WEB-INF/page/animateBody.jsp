<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/" var="loginUrl" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css"
	href="${basePath}/css/animate/animate.css">
<title>Insert title here</title>
</head>
<body>
	<div class="nav">
		<img id="navBackground" alt="" src="${basePath}/img/view/nav.jpg">
		<div id="title">努力的桂</div>
		<form id="formKeyword" action="${basePath}/find.do">
			<input id="keyword" type="text" name="keyword"> <a href="#"><img
				id="keywordImage" src="${basePath}/img/keywordFind.jpg"></a>
		</form>
	</div>
	<div class="body">
		<div class="content">
			<!-- 轮播 -->
			<div id="tiaoye" onmouseover="displaytiaoyemore()"
				onmouseout="undisplaytiaoyemore()">
				<a href="#"><div value="1" onmouseover="stoponit2(this)"
						onmouseout="startagain2(this)" id="lunbo-div1" class="">
						<img class="lunbo-img" src="${base}/${hot0}">
					</div></a> <a href="#"><div value="2" onmouseover="stoponit2(this)"
						onmouseout="startagain2(this)" id="lunbo-div2" class="tiaoye-on">
						<img class="lunbo-img" src="${base}/${hot1}">
					</div></a> <a href="#"><div value="3" onmouseover="stoponit2(this)"
						onmouseout="startagain2(this)" id="lunbo-div3" class="tiaoye-on">
						<img class="lunbo-img" src="${base}/${hot2}">
					</div></a> <a href="#"><div value="4" onmouseover="stoponit2(this)"
						onmouseout="startagain2(this)" id="lunbo-div4" class="tiaoye-on">
						<img class="lunbo-img" src="${base}/${hot3}">
					</div></a> <a href="#"><div value="5" onmouseover="stoponit2(this)"
						onmouseout="startagain2(this)" id="lunbo-div5" class="tiaoye-on">
						<img class="lunbo-img" src="${base}/${hot4}">
					</div></a>
				<ul>

					<li id="lunbo-li5" value="5" onmouseover="stoponit(this)"
						onmouseout="startagain(this)" class=""></li>
					<li id="lunbo-li4" value="4" onmouseover="stoponit(this)"
						onmouseout="startagain(this)" class=""></li>
					<li id="lunbo-li3" value="3" onmouseover="stoponit(this)"
						onmouseout="startagain(this)" class=""></li>
					<li id="lunbo-li2" value="2" onmouseover="stoponit(this)"
						onmouseout="startagain(this)" class=""></li>
					<li id="lunbo-li1" value="1" onmouseover="stoponit(this)"
						onmouseout="startagain(this)" class="tiaoyelight"></li>
				</ul>
				<a href="#"><p id="tiaoye-more" class="tiaoye-more-nosee">更多></p></a>
			</div>
			<!-- 轮播右侧小道新闻 -->
			<div id="newspaper">
				<p id="newspaper-top">
					<a href="#">震惊，这个框架做网站真的好看！</a>
				</p>
				<ul id="newspaper-normal">
					<li class="newspaper-normal-li"><a href="#">JAVA与C激情搏斗！</a></li>
					<li class="newspaper-normal-li"><a href="#">程序员的日常</a></li>
					<li class="newspaper-normal-li"><a href="#">程序员女装进公司，竟然发现这些</a></li>
					<li class="newspaper-normal-li"><a href="#">嘎嘎嘎噶啊啊啊</a></li>
					<li class="newspaper-normal-li"><a href="#">113324324243</a></li>
				</ul>
			</div>
			<!-- 漫改真人电影区 -->
			<div id="animateMovie">
				<p id="animateMovieBrand">JAVA WEB</p>
				<ul id="animateMovieUl">
					<c:forEach var="item" begin="1" end="8" step="1">
						<li class="animateMovieLi"><img class="animateMovieImg"
							src="">
							<p class="animateMovieTitle">框架：</p>
							<p class="animateMovieDate">版本：</p></li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="rightAdv">
			<form id="loginForm" action="${loginUrl}" method="post">
				<c:if test="${param.error != null}">        
					<p>Invalid username and password.</p>
				</c:if>
				<c:if test="${param.logout != null}">       
					<p>You have been logged out.</p>
				</c:if>
				<input id="username"  type="text" name="username" placeholder="用户名">
				<input id="password" type="password" name="password"
					placeholder="密码"> 
				<input type="hidden"                        
					name="${_csrf.parameterName}"
					value="${_csrf.token}"/>
				<button id="loginButton" type="submit" class="btn">登陆</button>
				<input id="registerButton" type="button"
					value="注册" onclick="register()">
			</form>
		</div>
	</div>
	<div class="footer"></div>
	<script type="text/javascript" src="${basePath}/js/animate.js"></script>
</body>
</html>