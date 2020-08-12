<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="./../common/common.jsp" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PanelEx</title>
	<style type="text/css">
		.table{
		 
		}
	
	</style>

</head>
<body>
	<div class="container">
	<h3>Basic Panner </h3>
		<div class="panel panel-default">
	  		<div class="panel-heading">Panel Heading</div>
	  			make table
	  		<div class="panel-body">Panel Content</div>
				<table class="table table-hover">
					<tr >
						<th>Title </th>
						<th>Author </th>
					</tr>
					<tr class="info">
						<td>My G </td>
						<td>Jiwoo </td>
					</tr>
					<tr class="warning">
						<td>Awe </td>
						<td>My man </td>
					</tr>
					<tr class="danger">
						<td> G </td>
						<td>woo </td>
					</tr>
					<tr class="info">
						<td>Asdsdwe </td>
						<td>Mydf </td>
					</tr>
					<tr class="danger">
						<td class="warning">yp </td>
						<td>sdsd </td>
					</tr>
				</table>
		</div>
	</div>
	
<div class="container">
  <h2>Panels with Contextual Classes</h2>
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">Panel with panel-default class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-primary">
      <div class="panel-heading">Panel with panel-primary class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-success">
      <div class="panel-heading">Panel with panel-success class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-info">
      <div class="panel-heading">Panel with panel-info class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-warning">
      <div class="panel-heading">Panel with panel-warning class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-danger">
      <div class="panel-heading">Panel with panel-danger class</div>
      <div class="panel-body">Panel Content</div>
    </div>
  </div>
</div>
		



</body>
</html>