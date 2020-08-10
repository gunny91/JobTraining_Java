<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- h, p, br 요소 삽입하기 -->
		
		
		<h1>제목 서식과 문단 편집에 관련된 요소 알아보기    This is h1 </h1>
		<h2>h 요소  This is h2</h2>
		<h3>This is h3</h3>
		<h4>This is h4</h4>
		<h5>This is h5</h5>
		<h6>This is h6</h6>
		<p>
			h1~h6 태그를 사용한다.<br>
			문서의 제목을 표시하는 용도로 사용된다. <br>
			진하게 표시되며 숫자가 커질 수록 글자크기가 작아진다.
		</p>

		
		<h2>p, br 요소</h2>
		<p>
			p는 문단을 구성하는 요소이며 br 요소는 단순 줄바꿈 용도로 사용한다.
			br 요소의 경우 종료 태그가 없이 사용된다.
		</p>
		
		<h1>Entity  코드를 이용한 공백 문자 및 특수 문자 삽입</h1>
		<p>
			서울시 종로구 동숭동 정보 빌딩. <br>정보문화사&amp;
			인포북&nbsp;&nbsp;&nbsp; <br>
			&lt;TEL:02-3673-0114&gt;
			<br>COPYRIGHT &copy;
			2008 Information Publishing Group ALL RIGHTS RESERVED.
		</p>
</body>
</html>