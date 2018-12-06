
$(document).ready(function(){
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
//	    	alert(result.list[0].title);
	    	
		    $("#paragraph").text(result.list[0].content);
		    $("#mainText").text(result.list[0].title);
	    	
	    },
	    error: function(XMLHttpRequest, textStatus, errorThrown) {
	    	alert(1);
	    }
	});
	
}

