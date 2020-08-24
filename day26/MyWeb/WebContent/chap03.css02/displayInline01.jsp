<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title>목록 요소를 가로로 배치하기</title>
	<meta charset="UTF-8">
	<style type="text/css">
	body
	{
		magin:50px 0px;
	}

	
	#topMenu {
		list-style:none;
		width:100%;
		background-color:yellow;
		margin:0px;
		padding:15px;
		text-align:center;
		text-decoration:none;
	}
	
	#topMenu li{
		display:inline;
		padding-left:70px;
		
	}
	
	a{
		color:black;
		font:1.5em serif;
		text-decoration: none;
	}
	a:hover{
		color:red;
	}
	
	</style>
</head>

<body>
	<ul id="topMenu">
		<li><a href="#">Home</a></li>
		<li><a href="#">About</a></li>
		<li><a href="#">Sitemap</a></li>
		<li><a href="#">BBS</a></li>
		<li><a href="#">Help</a></li>
	</ul>
</body>
</html>