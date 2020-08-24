<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

		<h1> Making Form</h1>
		<form action="imageEx01.jsp">
			<p>
				<label for="id">ID</label>
				<input id="id" name="id" type="text"/>
			<p/>
			
			<p>
				<label for="name">Name</label>
				<input id="name" name="name" type="text"/>
			<p/>
			
			<p>
				<label for="address">Address</label>
				<input id="address" name="address" type="text"/>
			<p/>
			
			<p>
				<label for="salary">Income</label>
				<input id="salary" name="salary" type="number"/>
			<p/>
			
				
			<p>
				<label for="point">Range Salary</label>
				<input id="point" name="point" type="range" min="0" max="100" step="1" value="5"/>
			<p/>
			
			
			
			
			<p>
				<label for="gender">Gender</label>
				<label >
						<input name="gender" type="radio" value="1"/>Male
				</label>
				<label>
						<input name="gender" type="radio" value="2"/>Female	
				</label>
				
			<p/>
			
				<p>
				<label for="hobby">Hobby</label>
				<label >
						<input name="hobby" type="checkbox" value="sports"/>Sports
				</label>		
				<label >
						<input name="hobby" type="checkbox" value="hunting"/>Hunting	
				</label>
				
			<p/>
		
		 	writer: <input name="Myname" type="text"/>
		 	<br>
		 	<br>
		 	<input type="submit" value="Hit"/>
		 	<input type="reset" value="Reset">
		 
		 <br>		
		</form>
		
		
			
			<h1> Making Books form</h1>
			
			<form>
				<p>
					<label> 	
					
					</label>
				
				
				
				
				</p>
				
			
			
			</form>

</body>
</html>