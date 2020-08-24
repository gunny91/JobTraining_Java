<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
	<head>
		<title>제목 텍스트 대신 이미지로 대체하기</title>
		<meta charset="UTF-8">
		<style type="text/css">
			body{	
				magin:0px;
				font:12px;
				background-color:#EBEBEB;
				
			}
			
			img{
				float:left;
				display:block;
				padding:0px 70px 0px 50px;
			}
			
			ul{
				padding-top:20px;
				line-height:200%;
			}
			
			li{
				text-decoration: none;
			}
			
			
			h1{
				width:630px;
				height: 500px;	
			}
			
			h1 span{
				display:none;
			}
			
		</style>
	</head>

	<body>
		<h1><span>잘 팔리는 제품 디자인 포토샵으로 따라잡기</span></h1>
		<figure>
			<img src="../images/book_photoshop.gif" width="135" height="168" alt="잘팔리는 제품 디자인" />
		</figure>
		<ul>
			<li>저 자 한상진 , 이명종 </li>  
			<li>구 분  국내서 </li>   
			<li>발행일 2011년 10월 21일 </li>  
			<li>페이지 512 페이지 </li>  
			<li>ISBN 978-89-5674-538-1 </li>  
		</ul>
	</body>
</html>