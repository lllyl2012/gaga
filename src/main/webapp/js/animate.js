/*轮播*/
var time = null;
var i = 1;
$(function(){
	time = setInterval(changeHide,5000);
	$(".guichu-everyday-guichuName").mouseenter(function(){
		 var  a =$(this).children(".guichu-everyday-collandshot")[0];
		 $(a).slideUp(100);
	});
	$(".guichu-everyday-guichuName").mouseleave(function(){
		 var  a =$(this).children(".guichu-everyday-collandshot")[0];
		 $(a).slideDown(100);
	});
});


function changeHide(a){
	i++;
	if(i>5){
		i=1;
	}
	for(var a=1;a<=5;a++){
		$("#lunbo-div"+a).removeClass();
		$("#lunbo-li"+a).removeClass();
		if(a==i){
			$("#lunbo-li"+a).addClass("tiaoyelight");
			continue;
		}
		$("#lunbo-div"+a).addClass("tiaoye-on");
	}
}
function stoponit(t){
	clearInterval(time);
	for(var a=0;a<=5;a++){
		$("#lunbo-li"+a).removeClass();
		$("#lunbo-div"+a).addClass("tiaoye-on");
	}
	t.className = "tiaoyelight";
	var k = t.value;
	$("#lunbo-div"+k).removeClass();
}
function startagain(t){
	i=t.value;
	clearInterval(time);
	time=setInterval(changeHide,5000);

}
function stoponit2(t){
	clearInterval(time);
	for(var a=0;a<=5;a++){
		$("#lunbo-li"+a).removeClass();
		$("#lunbo-div"+a).addClass("tiaoye-on");
	}
	$("#lunbo-div"+i).removeClass();
	$("#lunbo-li"+i).addClass("tiaoyelight");
}
function startagain2(t){
	clearInterval(time);
	time=setInterval(changeHide,5000);

}
function displaytiaoyemore(){
	$("#tiaoye-more").removeClass();
}
function undisplaytiaoyemore(){
	$("#tiaoye-more").addClass("tiaoye-more-nosee");
}

/*注册*/
function register(){
	location.href="";
}