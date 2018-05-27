<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
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
.myTitle{
	text-align:center;
	margin-top:42px;
	font-weight:900;
	font-size:200%;
}
</style>
	<div class="myTitle">添加和编辑电影</div>
	<div style="padding: 5px 0; color: #ccc">中间隔离带</div>
	<div id="div" class="text">
		<!--可使用 min-height 实现编辑区域自动增加高度-->
	</div>
	<button id="btn1">getJSON</button>
	<script type="text/javascript"
		src="${basePath}/js/wangEditor/wangEditor.min.js"></script>
	<!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
	<script type="text/javascript">
		var E = window.wangEditor
		var editor = new E('#div') // 两个参数也可以传入 elem 对象，class 选择器
// 		editor.customConfig.uploadImgShowBase64 = true 
		editor.customConfig.uploadImgMaxSize = 10 * 1024 * 1024
		editor.customConfig.uploadImgHeaders = {
			"${_csrf.headerName}":"${_csrf.token}"
		}
		// 配置服务器端地址
		editor.customConfig.uploadFileName = 'images'
	    editor.customConfig.uploadImgServer = '/wangEditor/upload'
    	editor.customConfig.uploadImgHooks = {
    	    success: function (xhr, editor, result) {
    	        // 图片上传并返回结果，图片插入成功之后触发
    	        // xhr 是 XMLHttpRequst 对象，editor 是编辑器对象，result 是服务器端返回的结果
    	        console.log(result);
    	        var image = result.data;
    	        var p = '';
    	        for(var i=0;i<image.length;i++){
    	        	p = '<img src="';
    	        	p += image[i];
    	        	p += '">';
    	        }
    	        $('#div p').parent().append('<p></p>').children('p').last().text(p);
    	    },
    	    fail: function (xhr, editor, result) {
    	    	console.log(result);
    	        // 图片上传并返回结果，但图片插入错误时触发
    	        // xhr 是 XMLHttpRequst 对象，editor 是编辑器对象，result 是服务器端返回的结果
    	    },
    	    error: function (xhr, editor) {
    	    	console.log(editor)
    	    	console.log(xhr)
    	        // 图片上传出错时触发
    	        // xhr 是 XMLHttpRequst 对象，editor 是编辑器对象
    	    },
    	    // 如果服务器端返回的不是 {errno:0, data: [...]} 这种格式，可使用该配置
    	    // （但是，服务器端返回的必须是一个 JSON 格式字符串！！！否则会报错）
    	    customInsert: function (insertImg, result, editor) {
    	        // 图片上传并返回结果，自定义插入图片的事件（而不是编辑器自动插入图片！！！）
    	        // insertImg 是插入图片的函数，editor 是编辑器对象，result 是服务器端返回的结果

    	        // 举例：假如上传图片成功后，服务器端返回的是 {url:'....'} 这种格式，即可这样插入图片：
    	        var url = result.url
    	        insertImg(url)

    	        // result 必须是一个 JSON 格式字符串！！！否则报错
    	    }
    	}
		editor.create()
		
		document.getElementById('btn1').addEventListener('click', function () {
	        var json = editor.txt.getJSON()  // 获取 JSON 格式的内容
	        var jsonStr = JSON.stringify(json)
	        console.log(json)
	        console.log(jsonStr)
	    })
	</script>
