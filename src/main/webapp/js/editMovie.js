//增加演员
function addProformer(){
	var str = '<br><input type="text" name="performer" class="performer" value="">';
	$("input[name='performer']").parent().append(str);
}

/*AJAX上传图片*/
var photos=$("#photos");
var selectedPhotos=$("#selected_photos");
photos.change(function(){
    var files=this.files;
    selectedPhotos.empty();
    for(var i=0; i<files.length; i++){
        var f = files[i];
        var url = window.URL.createObjectURL(f);
        var img = $("<img src='"+url+"'>");
        selectedPhotos.append(img);
    }
});
    var ajaxBtn=$("#jquery_upload");
    ajaxBtn.click(function(){
        var url="uploadImages.do";
        var data=new FormData();

        var files = photos[0].files;
        for(var i=0; i<files.length; i++){
            var f = files[i];
            data.append("images", f, f.name);
        }
        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");
        ajaxBtn.val("上载中...");
        $.ajax({
            url:url,
            type:"POST",
            data:data,
            dataType:"json",
            processData:false, //不要处理 data数据！！！
            contentType:false, //不要有JQuery设定ContentType
            beforeSend: function(request) {
                request.setRequestHeader(header, token);
            },
            success:function(j){
            	console.log(j.data);
                ajaxBtn.val("JQuery 上载");
                var content = '';
                for(var i=0;i<j.data.length;i++){
                	content = '<input type="hidden" class="image" value="'+j.data[i]+'">';
                	$("#form").append(content);
                }
            }
        });

    });

//提交表单
function checkAll(){
	if($("#name").val() == ''){
		console.log("need name")
		return;
	}
	var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    var id = $("#id").val();
    var name = $("#name").val();
    var director = $("#director").val();
    var createTime0 = $("#createTime").val(); 
    var createTimeArr = createTime0.split("-");
    var createTime = new Date();
    if(createTimeArr.length!=1){
    	createTime.setFullYear(createTimeArr[0],++createTimeArr[1],createTimeArr[2]);
    }
    var language=$("#language").val();
    var resolutionRatio = $("#resolutionRatio").val();
    var format=$("#format").val();
    var country=$("#country").val();
    var subtitles=$("#subtitles").val();
    var beanScore=$("#beanScore").val();
    var size=$("#size").val();
    var time=$("#time").val();
    var remark=$("#remark").val();
    var baiduyun=$("#baiduyun").val();
    var baiduyunmm=$("#baiduyunmm").val();
    var xunlei=$("#xunlei").val();
    var performer = new Array();
    var i = 0;
    $("input[name='performer']").each(function(){
    	if($(this).val() != ''){
    		performer[i++] = $(this).val();
    	}
    });
    var image = new Array();
    i = 0;
    $(".image").each(function(){
    	if($(this).val() != ''){
    		image[i++] = $(this).val();
    	}
    })
    console.log(image);
	$.ajax({
        url:"/addMovieHandle.do",
        type:"POST",
        data:{id:id,name:name,director:director,createTime:createTime,language:language,resolutionRatio:resolutionRatio,
        	format:format,conntry:country,subtitles:subtitles,beanScore:beanScore,
        	size:size,time:time,remark:remark,baiduyun:baiduyun,
        	baiduyunmm:baiduyunmm,xunlei:xunlei,performerName:performer,imagePath:image},
        dataType:"text",
        traditional: true,
        beforeSend: function(request) {
            request.setRequestHeader(header, token);
        },
        success:function(j){
        	console.log(j)
        	if(j=='ok'){
        		alert('上传成功');
        	}
        }
    });
}