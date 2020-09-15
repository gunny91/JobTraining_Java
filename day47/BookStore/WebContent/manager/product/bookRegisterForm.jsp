<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.io.PrintWriter" %>
<%
//세션이 있는지 검사한다.
String managerId = "";
//매니저의 세션 아이디를 가져온다.
managerId = (String)session.getAttribute("managerId");

//세션값이 없이 들어온 경우는 로그인 화면으로 보내다.
if(managerId == null || managerId.equals("")) {
	PrintWriter pw = response.getWriter();
	pw.println("<script>");
	pw.println("alert('로그인을 하셔야 합니다.')");
	pw.println("location.href='logon/managerLoginForm.jsp?useSSl=false'");
	pw.println("</script>");
}

Timestamp nowTime = new Timestamp(System.currentTimeMillis());
int lastYear = Integer.parseInt(nowTime.toString().substring(0, 4));
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<title>Register the Products</title>
</head>
<body>

<div class="container">
	<form class="form-horizontal" name="writeform" action="bookRegisterPro.jsp"
		method="post" enctype="multipart/form-data">
		<div class="form-group">
			<div class="col-sm-2"></div>
			<div class="col-sm-6">
				<h2 align="center">Register the Item</h2>
			</div>
			<div class="col-sm-3">
				<a href="../managerMain.jsp" class="btn btn-success">Main Menu</a>
				<a href="bookList.jsp?book_kind=all" class="btn btn-info">Back to List</a>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Select Sort</label>
			<div class="col-sm-2">
				<select class="form-control" name="book_kind">
					<option value="100">Literature</option>
					<option value="200">English</option>
					<option value="300">Computer</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Title</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" maxlength="100" 
				name="book_title" onkeydown="nextFocus(book_price)" placeholder="title"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Price</label>
			<div class="col-sm-2">
				<div class="input-group">
					<input type="text" class="form-control" maxlength="8" 
					name="book_price" onkeydown="nextFocus(book_count)" placeholder="Price"/>
					<span class="input-group-addon">Won</span>
				</div>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Item Count</label>
			<div class="col-sm-2">
				<div class="input-group">
					<input type="text" class="form-control" maxlength="6" 
					name="book_count" onkeydown="nextFocus(author)" placeholder="Item Count"/>
					<span class="input-group-addon">Book Count</span>
				</div>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Author</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" maxlength="40" 
				name="author" onkeydown="nextFocus(publishing_com)" placeholder="Author"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Publisher</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" maxlength="40" 
				name="publishing_com" onkeydown="nextFocus(publishing_year)" placeholder="publisher"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2">Publish date</label>
			<div class="col-sm-2">
				<div class="input-group">
					<select class="form-control" name="publishing_year" style="width:120px;"
						onkeydown="nextFocus(publishing_month)">
						<%for(int i = lastYear; i >= 2010; i--) {%>
						<option value="<%=i%>"><%=i%></option>
						<% } %>
					</select>
					<span class="input-group-addon">year</span>
				</div>
			</div>
			<div class="col-sm-2">
				<div class="input-group">
					<select class="form-control" name="publishing_month" style="width:120px;"
						onkeydown="nextFocus(publishing_day)">
						<%for(int i = 1; i <= 12; i++) {%>
						<option value="<%=i%>"><%=i%></option>
						<% } %>
					</select>
					<span class="input-group-addon">Month</span>
				</div>
			</div>
			<div class="col-sm-2">
				<div class="input-group">
					<select class="form-control" name="publishing_day" style="width:120px;"
						onkeydown="nextFocus(book_image)">
						<%for(int i = 1; i <= 31; i++) {%>
						<option value="<%=i%>"><%=i%></option>
						<% } %>
					</select>
					<span class="input-group-addon">Date</span>
				</div>
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2">Image Name</label>
			<div class="col-sm-4">
				<input type="file" class="form-control" 
				name="book_image" onkeydown="nextFocus(book_content)"/>
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2">Content</label>
			<div class="col-sm-7">
				<textarea class="form-control col-sm-5" name="book_content" rows="10" cols="100" placeholder="contents"></textarea>
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2">Discount Rate</label>
			<div class="col-sm-2">
				<div class="input-group">
					<input type="text" class="form-control"  size="4" maxlength="10" 
					name="discount_rate" onkeydown="nextFocus(btn_OK)" placeholder="Discount Rate"/>
					<span class="input-group-addon">Percent</span>
				</div>
			</div>
		</div>
		
		<div class="form-group">
			<div class="col-sm-offset-4 col-sm-2">
				<input type="button" class="btn btn-primary" value="Register"
					   onclick="checkForm(this.form)" name="btn_OK"/>
				<input type="reset" class="btn btn-warning" value="Rewrite!"/>
			</div>
		</div>
	</form>

</div>

	<script src="../../js/jquery-3.5.1.min.js"></script>
	<script src="../../bootstrap/js/bootstrap.min.js"></script>
	<script src="../../js/bsfunction.js"></script>
	<script>
	function nextFocus(where)
	{
		if(event.keyCode == 13)
			where.focus();
	}
	</script>
</body>
</html>













