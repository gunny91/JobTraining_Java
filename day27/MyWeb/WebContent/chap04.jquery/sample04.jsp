<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>조건에 반대되는 엘리먼트 검색하기-:not()</title>
	<script type="text/javascript">

		
		var output = function(where, selector){
			alert(where+ '/'+selector);
			var len = $(selector).size(); /*count of attribute */
			var result = 'Attribute count: '+len + '<br>';
			
			$(selector).each(function(){
				result+=$(this).text()+"&nbsp;"
			});
			result +='<br>-----------------------------------------------';
			
			$(where).html(result);
		};
	
		$(document).ready(function() {
			$('span[id]').addClass('spotlight');
			$('span[id="simpletext1"]').addClass('redtext');
			
			output('#myarea01','span[id]');
			output('#myarea02','span[id ="simpletext1"]');
			output('#myarea03','span[id!="simpletext1"]');
			output('#myarea04','span[id^="complex"]');	
			output('#myarea05','span[id$="test1"]');
			output('#myarea06','span[id*="text"]');
			
			
			
		});
	</script>
</head>
<body>
	<div>
		<input type="checkbox" name="fruit" /><span>사과</span>
	</div>
	<div>
		<input type="checkbox" name="fruit" /><span>바나나</span>
	</div>
	<div>
		<input type="checkbox" name="fruit" checked="checked" /><span>오렌지</span>
	</div>
	<hr>
	<span id="simpletext1">simple</span>
	<span class="simpletext2">jQuery</span>
	<span id="complextext1">basic</span>
	<span id="complextext2">example</span>
	<span id="complex">book</span>
	<hr>
	<p id="myarea01"> My area</p>
	<p id="myarea02"> My area</p>
	<p id="myarea03"> My area</p>
	<p id="myarea04"> My area</p>
	<p id="myarea05"> My area</p>
	<p id="myarea06"> My area</p>
	
</body>
</html>