function title(){
		    $("#paragraph").text("Hello world!");
		    $("#mainText").text("Hello world!");
}

$(document).ready(function(){
	title();
	a();
});


function a(){
	$.ajax({
	    type: "POST",
	    data: {id:1},
	    async: false,     //是否同步执行
	    cache: false,     //是否从缓存中读取数据
	    url: "../post/selectPostsById.do",
	    dataType: "json",
	    timeout: 30000,
	    success: function(result)
	    {
	    	alert(1);
	    },
	    error: function(XMLHttpRequest, textStatus, errorThrown) {
	    	alert(1);
	    }
	});
	
}

