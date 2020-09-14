<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%
	String managerId="";
	managerId=(String)session.getAttribute("managerId");
	
	if(managerId == null || managerId.equals("")){
			PrintWriter pw = response.getWriter();
			pw.println("<script>");
			pw.println("alert('ID not found!')");
			pw.println("location.href='logon/managerLoginForm.jsp?useSSL=false'");
			pw.println("</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>manager Main</title>
</head>
<body>

</body>
</html>