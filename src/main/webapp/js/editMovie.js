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
            dataType:"text",
            processData:false, //不要处理 data数据！！！
            contentType:false, //不要有JQuery设定ContentType
            beforeSend: function(request) {
                request.setRequestHeader(header, token);
            },
            success:function(j){
            	console.log(j);
                ajaxBtn.val("JQuery 上载");
                
                var content = '<input type="hidden" class="image" value="'+j+'">';
                $("#form").append(content);
            }
        });

    });

//