<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE> JQuery 실습하기 </TITLE>
	<script type="text/javascript">
		$(document).ready(function(){
			
			/*var --> variable*/
			var first = $('h1');
			var second = $('h2');
			
			/*Method chaining*/
			first.css('background-color','yellow');
			first.css('color','blue');
			second.css('background-color','black').css('color','white');
			first.css('background','')
			
			/*Specific area of html source code*/
			$('#myarea').html("<em>Yo</em> <b>Ny man</b>");
			
			var result='';
			var searchItems=$('p,span,div.simpletext1');
			/*alert(searchItems.length);*/
			
			result+='Searching count: ' + searchItems.length +'<br>';
			
			searchItems.each(function(){
				result+=$(this).text()+'&nbsp;&nbsp;&nbsp;';
				/*alert('You got the for loop!!!!');*/
			});

			searchItems.each(function(index,element){
				/*alert(index+'/' +element);*/
				result+=$(this).text()+'&nbsp;&nbsp;&nbsp;';
				/*alert('You got the for loop!!!!');*/
			});
			
			$('#myarea').html(result);
			
		});
	</script>
</HEAD>
<BODY>
	<h1>jQuery 실습하기</h1>
	<h2>jQuery 실습하기</h2>
	
	<h4>한 번에 다양한 엘리먼트에 접근하여 개수와 텍스트 얻기 : selector1, selector2, selectorN</h4>
	<span>simple</span>
	<div class='simpletext1'>jQuery</div>
	<div>basic</div>
	<p>example</p>	
	
	<hr>
	
	<div id="myarea"></div>
</BODY>
</HTML>