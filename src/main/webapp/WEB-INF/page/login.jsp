<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/login" var="loginUrl" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>
<body>
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
</body>
</html>