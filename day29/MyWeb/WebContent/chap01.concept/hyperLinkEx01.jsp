<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>하이퍼링크 연결하기</h1>
	<hr>	
	<h2>a 요소를 이용한 하이퍼링크 텍스트 </h2>	
	
	<ul>
		<li>
			<a href="http://www.naver.com" target="_blank">
				네이버
		    </a>
		</li>
		
		<li>
			<a href="./../chap01.concept/imageEx01.jsp" target="_blank">
				자동차 박람회 갤러리
			</a> 
	   	</li>
	   	<li> 
		   		<a href="mailto:webmaster@naver.com" target="_blank">
	   			운영자에게 메일 보내기
	   			</a>					
		</li>				
	</ul>	
		

	<hr>	
	<h2>이미지와 함께 사용한 하이퍼 링크 </h2>	
	
	<ul>
		<li>
			<a href="http://www.naver.com" target="_blank">
				<img src="./../images/banner_jungbo.gif" width="150" height="27">
		    </a>
		</li>
		
		<li>
			<a href="./../chap01.concept/imageEx01.jsp" target="_blank">
				<img src="./../images/banner_gallery.gif" width="200" height="27">
			</a> 
	   	</li>
	   	<li> 
		   		<a href="mailto:webmaster@naver.com" target="_blank">
	   			<img src="./../images/email.gif" width="200" height="27">
	   			</a>					
		</li>				
	</ul>





</body>
</html>