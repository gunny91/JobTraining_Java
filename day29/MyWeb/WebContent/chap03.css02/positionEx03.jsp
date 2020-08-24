<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">
		div{width:100px;height:100px; position:relative;}
		
		#mydiv{
		background:red;
		 top:50px; 
		 left:50px; 
		 width: 400px; 
		 height:400px;}
	
		.test1{
			background:aqua;
			top:10px;
			left:40px;
		}
		
		.test2{
			background:fuchsia;
			top:30px;
			left:20px;
		}
		
		.test3{
			background:yellow;
				top:40px;
				left:40px;
		}
	</style>
</head>
<body>
	<div id="mydiv">
		<div class="test1">소녀 시대</div>
		<div class="test2">원더 걸스</div>
		<div class="test3">티아라</div>
	</div>
</body>
</html>