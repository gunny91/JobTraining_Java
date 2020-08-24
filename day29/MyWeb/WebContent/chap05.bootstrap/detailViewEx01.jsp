<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail View Example</title>

	<style type="text/css">
		.badge {background-color:red;}
		.label {background-color:red;}
		table{ border:0px; background-color=white;}
	</style>
	<script type="text/javascript">
	function func1(){
		alert('Validation check');
		return false;
	}	
	
	$(document).ready(function(){
		  $('[data-toggle="popover"]').popover();
		});
	</script>
</head>
<body>
	 <div class="container">
		<div class="panel panel-success">
			<div class="panel-heading">
				<h2 class="panel-title" align="left"> List of panel</h2>
				
			</div>
			<div class="panel-body">
				<div class="col-sm-12" >
					<div class="col-sm-4" align="center">
						
						<table class="table-bordered" cellspacing=0 cellpadding=0 >
								<tr>
									<td><img align="middle" width="200" height="200" 
										class="img-rounded " alt="Left Photo" src="./../images/Lighthouse.jpg"> </td>
								</tr>  
						</table>
					
					</div>
					<div class="col-sm-8" align="center">
						<table class="table table-hover table-striped">
							<tr>
								<td width="25%"># contents </td>
								<td width="75%">100</td>
							</tr>
							<tr>
								<td width="25%"># title</td>
								<td width="75%">MF<span class="badge">20</span></td>
							</tr>
							<tr>
								<td width="25%"># Writer </td>
								<td width="75%">Jiga <span class="label label-default">New</span></td>
							</tr>
								<tr>
								<td width="25%"># Order Count</td>
								<td width="75%">
								
								<form class="form-horizontal" action="#">
								  <div class="form-group">
								    <div class="col-sm-4">
								    
								      <input type="text" class="form-control" id="qty" 
								    
								      placeholder="Enter ordered count"
								      data-toggle="popover" title="order Enter Section" data-content="Enter the number of order"
								      data-placement="auto top"
								      data-trigger="hover">
								  
								       
								    </div>
								    
								     <div class="col-sm-3">
								      <input type="button" class="btn btn-info form-control" 
								      value="order" onclick="return func1();">
								    </div>
								  </div>
								  
								 </form>
								
								</td>
							</tr>
								<tr>
								<td width="25%">#Ordered Date</td>
								<td width="75%">2020/08/12</td>
							</tr>
								<tr>
								<td width="25%"># What?</td>
								<td width="75%">etc</td>
							</tr>
						</table>
					</div>					
				</div>
				<hr>
				<div class="col-md-offest-5 col-md-4">
					<button class="btn btn-primary" onclick="history.back();"> Return to home</button>	
				</div>
				
		</div>		
	</div>
</div>
			


</body>
</html>