<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="./../common/common.jsp" %>   
    
    <%
    	//int twelve=12;
    	int leftSide =4;
    	int rightSide = twelve- leftSide; //8
    	int myoffSet =3 ; //num offset
    	int mywidth = twelve-(2*myoffSet); // total - offset =6
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gridEX</title>
	
	<style type="text/css">
		.style1{ background-color:Red; }
		.style2{ background-color:blue;}
		.style3{ background-color:green;}
	 </style>


</head>
<body>
	<div class="container-fluid">
		<h1>3 Divider</h1>
		<div class="row">
			<div class="col-sm-4 col-lg-4 col-xs-4 style1">First</div>
			<div class="col-sm-4 style2">Second</div>
			<div class="col-sm-4 style3">Third</div>
		</div>
	</div>
	<hr>
	
	<div class="container">
		<h1>3 Divider</h1>
		<div class="row">
			<div class="col-sm-4 col-lg-4 col-xs-4 style1">First</div>
			<div class="col-sm-4 style2">Second</div>
			<div class="col-sm-4 style3">Third</div>
		</div>
	</div>
	
	<hr>
		<div class="container">
		<h1>1:2 Divider</h1>
		<div class="row">
			<div class="col-sm-4 col-lg-4 col-xs-4 style1">First</div>
			<div class="col-sm-8 style2">Second</div>
		</div>
	</div>
	<hr>
	
		<div class="container">
		<h1>Offset</h1>
		<div class="row">
			<div class="col-sm-offset2 col-sm-8 style1">First</div>
		</div>
	</div>
	
	<%=myoffSet%>
	
	<hr>
		<div class="container">
		<h1>Test Offset</h1>
		<div class="row">
			<div class="col-sm-offset-<%=myoffSet%> col-sm-<%=mywidth%> style1">First</div>
		</div>
	</div>
	
	
</body>
</html>