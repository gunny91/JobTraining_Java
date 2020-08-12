<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %> 
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table Ex</title>
<style type="text/css"> </style>

</head>
<body>
	<div class="container">
		<div class="panel panel-success">
			
			<div class="panel-heading">
				<h2 class="panel-title" align="left"> List of panel</h2>
				
			</div>
			
			<div class="panel-body">
				<table class="table">
					<tr>
						<th>Number</th>
						<th>Title</th>
						<th>Author</th>
						
					</tr>
					  <%
    					//differenciate even and odd area
  	  				for(int i =1; i < 11; i ++) {%>
  	  					<% if(i%2==0){%>
  	  					<tr class="info">
  	  						<td><%=i %></td>
  	  						<td>Mother</td>
  	  						<td>Kim</td>
  	  					</tr>
  	  					
  	  					
  	  					<%} else{ %>
  	  					<tr class="danger">
  	  						<td><%=i %></td>
  	  						<td>Father</td>
  	  						<td>Park</td>
  	  						
  	  					</tr>
  	  					
  	  					
  	  					<%}%>
  	  					
  	  				<%} %>
				</table>
				
			</div>
			
		</div>
			<div align="center">
				<ul class="pagination pagination-sm" >
					  <li><a href="#">1</a></li>
					  <li class="active"><a href="#">2</a></li>
					  <li><a href="#">3</a></li>
					  <li><a href="#">4</a></li>
					  <li class="disabled"><a href="#">5</a></li>
				</ul>
			
			
			</div>
		
		
	</div>


</body>
</html>