<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="basePath" scope="request"
	value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<link rel="Stylesheet" type="text/css"
	href="${basePath}/css/admin/editMovie.css">
<title>电影编辑</title>
</head>
<body>
<div id="body">
	<form id="form" action="${basePath}/admin/editMovie" method="post" enctype="multipart/form-data">
		<input hidden="hidden" name="id" value="${movie.id}"><hr>
		百度云链接：<input type="text" name="baiduyun" value="${movie.baiduyun}"><hr>
		百度云密码：<input type="text" name="baiduyunmm" value="${movie.baiduyunmm}"><hr>
		迅雷链接：<input type="text" name="xunlei" value="${movie.xunlei}"><hr>
		片名：<input type="text" name="name" value="${movie.name}"><hr>
		导演：<input type="text" name="director" value="${movie.director}"><hr>
		演员：
			<div>
				<c:forEach var="item" items="${performer}">
					<input type="text" name="performer" class="performer" value="${item}"><hr>
				</c:forEach>
				<input type="text" name="performer" class="performer" value="">
			</div>
			<input type="button" id="performerAdd" onclick="addProformer()" value="增加">
			<hr>
		上映日期：<input type="text" name="createTime" value="<fmt:formatDate value="${movie.createTime}" pattern="yyyy-MM-dd" />" placeholder="格式：2011-11-11"><hr>
		语言：
			<select name="language">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${languages}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		分辨率：
			<select name="resolutionRatio">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${resolutionRatios}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		格式：
			<select name="format">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${formats}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		国家：
			<select name="country">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${countries}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		字幕：
			<select name="subtitles">
				<option value="">===请选择===</option>
				<c:forEach var="item" items="${languages}">
					<option value="${item}">${item}</option>
				</c:forEach>
			</select><hr>
		豆瓣评分：<input type="text" name="beanScore" value="${movie.beanScore}"><hr>
		大小：<input type="text" name="size" value="${movie.size}" placeholder="单位为G或MB,例：700MB"><hr>
		片长：<input type="text" name="time" value="${movie.time}" placeholder="例：120分钟"><hr>
		简介：<input type="text" name="remark" value="${movie.remark}"><hr>
		图片：
		<h2>JQuery 上载</h2>
			<div>
			    <label>选择图片</label>
			    <input type="file" id="photos"  
			        multiple="multiple"><br>
			    <input id="jquery_upload" type="button" 
			        value="jquery上载">
			</div>
			<h3>选择了：</h3>
			<div id="selected_photos">
			</div>
		
		<input type="submit" value="提交" onclick="checkAll()">
		<input type="button" value="取消">
	</form>
</div>
<script type="text/javascript" src="${basePath}/js/editMovie.js"></script>
</body>
</html>