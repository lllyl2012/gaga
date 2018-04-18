<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="basePath" scope="request" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css" href="${basePath}/css/animate.css">
<title>Insert title here</title>
</head>
<body>
	<div class="nav">
		<img id="navBackground" alt="" src="${basePath}/img/nav.jpg">
		<div id="title">矮油，做的不错哦</div>
		<ul class="nav_list">
			<li class="nav_list_li"><a href="#">首页</a></li>
			<li class="nav_list_li"><a href="#">漫改真人</a></li>
		</ul>
	</div>
	<div class="body">
	<div class="content"></div>
	<div class="rightAdv"></div>
</div>
<div class="footer"></div>
</body>
</html>