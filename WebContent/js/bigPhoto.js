window.onload=function(){
	function bigPhoto(obj){
		var path = $("#bigimage").attr("src");
		path = $(obj).attr("src");
		$(".photobigshow").css("display","block");
		$(".content").css("display","block")
		$(".content").css("opacity","0.5")
	}
}