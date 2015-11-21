<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Sales</title>
</head>
<body>
<form  action="registers" method="post">
<p><h2>Customer Details</h2></p>

		<p>Enter  first name : <input type="text" name="fname" required=""></p></br>
		
		<p>Enter  middle name: <input type="text" name="mname" required=""></p></br>
		
		<p>Enter  last name  : <input type="text" name="lname" required=""></p></br>
		
		<p>Enter username     : <input type="text" name="username" required=""></p></br>
		
		<p>Enter email id     : <input type="text" name="emailid" required=""></p></br>
		
		<p>Enter mobile number: <input type="text" name="mobno" required=""></p></br>
		
		<p>Enter address     : <textarea rows="5" cols="5" name="address" required=""></textarea></p><br>
		
		<p>Enter the password  : <input type="password" name="password1" required=""></p></br>
		
		<p>Reenter the password: <input type="password" name="password2" required=""></p></br>
		
		<p><input type="submit"></p><br>
		
		
		
		</form>
</body>
</html>