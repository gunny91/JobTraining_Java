<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style> body{font:0.95em "맑은고딕",sans-serif;}
		
		#box1 h2
		{
			word-spacing:20px;
			text-align:center;	
			letter-spacing:-1px;
			color:red;
		}
		#box1 p
		{
			letter-spacing:5px;
			line-height:200%;
			color:blue;
		
		}
		
		#box2 h2
		{
			text-transform:uppercase;
			text-decoration:line-through;
			color:yellow;
		}
		#box2 p
		{
			text-indent:10%;
			text-decoration: underline;
			color:silver;
		}

 </style>
</head>
<body>
		<div id="box1">
		<h2>text-align, line-height, word-spacing, letter-spacing</h2>
		<p>Only actions give life strength; only moderation gives it a charm. <br />
		(Jean Paul Richter) <br />
		행동만이 삶에 힘을 주고, 절제만이 삶에 매력을 준다. 
		</p>
	</div>
	<div id="box2">
		<h2>text-decoration, text-indent,  text-transform </h2>
		<p>Good teaching is one-fourth preparation and three-fourths theater. (Gail Godwin) <br />
		훌륭한 가르침은 1/4이 준비 과정, 3/4은 현장에서 이루어진다.
		</p>
		<p>The endeavor to understand is the first and only basis of virtue. (Baruch Spinoza) <br />
		이해하려고 노력하는 행동이 미덕의 첫 단계이자 유일한 기본이다. 
		</p>
	</div>
</body>
</html>