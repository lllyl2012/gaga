<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basePath" scope="request"
	value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css"
	href="${basePath}/css/admin/editMovie.css">
<title>电影编辑</title>
</head>
<body>
<div id="body">
	<form action="${basePath}/admin/editMovie" method="post">
		<input hidden="hidden" name="id" value="${movie.id}"><hr>
		片名：<input type="text" name="name" value="${movie.name}"><hr>
		导演：<input type="text" name="director" value="${movie.director}"><hr>
		上映日期：<input type="text" name="createTime" value="${movie.createTime}" placeholder="格式：2011-11-11"><hr>
		语言：<input type="text" name="language" value="${movie.language}">
			<select name="language">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${languages}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		分辨率：<input type="text" name="resolutionRatio" value="${movie.resolutionRatio}">
			<select name="resolutionRatio">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${resolutionRatios}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		格式：<input type="text" name="format" value="${movie.format}">
			<select name="format">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${formats}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		国家：<input type="text" name="country" value="${movie.country}">
			<select name="country">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${countries}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		字幕：<input type="text" name="subtitles" value="${movie.subtitles}">
			<select name="subtitles">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${languages}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		豆瓣评分：<input type="text" name="beanScore" value="${movie.beanScore}"><hr>
		大小：<input type="text" name="size" value="${movie.size}" placeholder="单位为G或MB,例：700MB"><hr>
		片长：<input type="text" name="time" value="${movie.time}"><hr>
		简介：<input type="text" name="remark" value="${movie.remark}"><hr>
		图片：<input type="file" name="img"><hr>
		<input type="submit" value="提交">
		<input type="button" value="取消">
	</form>
</div>
</body>
</html>