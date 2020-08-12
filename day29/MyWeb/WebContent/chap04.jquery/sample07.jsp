<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>엘리먼트의 어트리뷰트 값 제거하기</title>
	<style>
		p {   margin: 4px;  font-size: 20px;  font-weight: bolder; cursor: pointer;}
		.red {   color: red;}
		.under {   text-decoration: underline;}
		.highlight {   background: yellow;}
		.blue {
			color: blue;
		}		
	</style>	
	<script type="text/javascript">
		$(document).ready(function() {
			$('button#add').click(function(){
				
				/*attr is attribute 속성*/
				$('#img0').attr('src','./../images/im0.jpg');
				
			});
			
			$('button#remove').click(function(){
				$('#img0').attr('src','');	
			});
			
			$('p').addClass('red under');
			
			$('button#removeClass').click(function(){
				$('p:even').removeClass('red under');	
			});
			
			$('button#changeClass').click(function(){
				$('p:odd').removeClass('red under').addClass('highlight');
			});	
			
			$('p').click(function(){
				$(this).toggleClass('blue');
			});
		});
	</script>
</head>
<body>   
	<h2>버튼을 클릭해 보세요.</h2>
	<button id="add">add Attribute</button> 
	<button id="remove">remove Attribute</button>
	<img id="img0" src="./../images/im0.jpg" title="똘이군" alt="puppy picture">

	<hr>
	<button id="removeClass">removeClass</button>
	<button id="changeClass">changeClass</button>
	
	<p>엘리먼트로부터</p>
	<p>클래스를</p>
	<p>추가하고</p>
	<p>제거하는</p>
	<p>연습하기</p>
</body>
</html>