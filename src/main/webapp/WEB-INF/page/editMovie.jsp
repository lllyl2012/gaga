<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basePath" scope="request"
	value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电影编辑</title>
</head>
<body>
	<form action="${basePath}/admin/editMovie" method="post">
		<input hidden="hidden" name="id" value="${movie.id}">
		<input type="text" name="name" value="${movie.name}">
		<input type="text" name="director" value="${movie.director}">
		<input type="text" name="createTime" value="${movie.createTime}">
		<input type="text" name="language" value="${movie.language}">
		<input type="text" name="resolutionRatio" value="${movie.resolutionRatio}">
		<input type="text" name="format" value="${movie.format}">
		<input type="text" name="country" value="${movie.country}">
		<input type="text" name="subtitles" value="${movie.subtitles}">
		<input type="text" name="beanScore" value="${movie.beanScore}">
		<input type="text" name="size" value="${movie.size}">
		<input type="text" name="time" value="${movie.time}">
		<input type="text" name="remark" value="${movie.remark}">
		<input type="submit" value="提交">
		<input type="button" value="取消">
	</form>
</body>
</html>