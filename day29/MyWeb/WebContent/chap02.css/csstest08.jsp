<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style> 
	
	#box1 h2{
	font-family:"Times New Roman", sans-serif;
	font-size:2em;
	font-weight:normal;
	color:blue;
	}

	#box1 p{
	font-family:"Times New Roman", sans-serif;
	font-size:20px;
	font-weight:bold;
	color:red;
	}
	#box2 h2{
	font-family:"Times New Roman", sans-serif;
	font-style:italic;
	color:lightblue;
	}
	
	#box2 p{
	font-family:"Times New Roman", sans-serif;
	font-variant:small-caps;
	color:yellow;
	}	
	
	#box3 h2{ /*Font way to write*/
	font:3em Arial;
	}
	#box3 p{
	font:small-caps italic 30px;
	color:green;
	}
 </style>


</head>
<body>
	<div id="box1">
		<h2>font-family, font-size, font-weight</h2>
		<p>Well done is better than well said.</p>
		<h2>ABCD </h2>
	</div>
	
	<div id="box2">
		<h2>font-style, font-variant, color</h2>
		<p>Seeing much, suffering much, and studying much, are the three
			pillars of learning.</p>
	</div>
	
	<div id="box3">
		<h2>font</h2>
		<p>Education is a progressive discovery of our own ignorance.</p>
	</div>

</body>
</html>