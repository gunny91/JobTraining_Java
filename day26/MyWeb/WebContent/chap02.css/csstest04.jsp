<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

a[class]{ 
	color:red;
	test-decoration:none;
}

a[title]
{
	color:pink;
	background-color:black;
	fron-weight:bold;
	
}


a[title="조주기능사"]
{
	color:pink;
	background-color:yellow;
	fron-weight:bold;
	color:white;
	
}


a[title^="제과"]
{
	color:pink;
	background-color:yellow;
	fron-weight:bold;
	color:white;
	
}

a[title$="기능사"]
{
	color:pink;
	background-color:pink;
	fron-weight:bold;
	color:white;
	
}

a[title*="산업기사"]
{
	color:pink;
	background-color:green;
	fron-weight:bold;
	color:white;
	
}


</style>

</head>
<body>
<body>
	<h1>속성 선택자 사용하기</h1>
	<hr />
	<h2>조리학부 자격증</h2>
	<ul>
		<li><a href="http://www.q-net.or.kr">복어조리기능사</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank" class="abc">양식조리기능사</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank">일식조리기능사</a></li>
		<li><a href="http://www.q-net.or.kr">제과기능장</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank">제과기능사</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank">제빵기능사</a></li>
		<li><a href="http://www.q-net.or.kr">조리기능장</a></li>
		<li><a href="http://www.q-net.or.kr">조리산업기사(복어조리)</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank"title="제과조리산업기사(양식)">조리산업기사(양식)</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank"title="제과조리산업기사(일식)">조리산업기사(일식)</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank"title="조리산업기사(중식) 기능장">조리산업기사(중식)</a></li>
		<li><a href="http://www.q-net.or.kr" target="_blank"title="조리산업기사(한식) 기능장">조리산업기사(한식)</a></li>
		<li><a href="http://www.q-net.or.kr">조주기능사</a></li>
		<li><a href="http://www.q-net.or.kr" title="중식조리기능사" class="abc">중식조리기능사</a></li>
		<li><a href="http://www.q-net.or.kr" title="한식조리기능사">한식조리기능사</a></li>
		
		
	</ul>
</body>
</body>
</html>