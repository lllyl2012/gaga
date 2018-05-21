<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${basePath}/css/wangEditor/wangEditor.min.css">
<style type="text/css">
body{
	background-color:white;
}
.toolbar {
	border: 1px solid #ccc;
}

.text {
	border: 1px solid #ccc;
	height: 400px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div id="div1" class="toolbar"></div>
	<div style="padding: 5px 0; color: #ccc">中间隔离带</div>
	<div id="div2" class="text">
		<!--可使用 min-height 实现编辑区域自动增加高度-->
		<p>请输入内容</p>
	</div>


	<script type="text/javascript"
		src="${basePath}/js/wangEditor/wangEditor.min.js"></script>
	<!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
	<script type="text/javascript">
		var E = window.wangEditor
		var editor1 = new E('#div1', '#div2') // 两个参数也可以传入 elem 对象，class 选择器
		editor1.create()
	</script>
</body>
</html>