<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basePath" scope="request"
	value="${pageContext.request.contextPath}"></c:set>
<!-- 这个是导航-->
	<nav>
		<ul>
			<li><a id="nav-ul-first" href="${basePath}">首页</a></li>
			<li><a href="${basePath}/index.do">漫改真人电影</a></li>
		</ul>
	</nav>
