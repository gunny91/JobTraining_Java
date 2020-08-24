<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">
	
	div 
	{
		width:100px;
		height:100px;
		position:absolute;
	}
	
	#mydiv{
		top:30px;
		left:20px;
		width:300px;
		height: 300px;
		background: red;
	}
	
	.test1{
	top:10px;
	left:10px;
	background:aqua;
	}
	
	.test2{
	background:fuchsia;
	bottom:20px;
	
	}
	
	.test3{
	background:yellow;	
	top:10px;
	left:150px;
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