<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="font-size:26px;color:red;">


	<br>
	<form action="send_mail">
		<table align="center" border="1" >
			<tr >
			<td>Name </td>
			<td><input type="text" name = "name"></td>
			</tr>
			<tr>
			<td>Mobile No </td>
			<td><input type="text" name = "mobileno"></td>
			</tr>
			<tr>
			<td>Email </td>
			<td><input type="text" name = "email"></td>
			</tr>
			<tr>
			<td>Gender </td>
			<td><input type="radio" name = "gender" value="male">Male
			<input type="radio" name = "gender" value="female">Female</td>
			</tr>
			<tr>
			<br>
			<td style="background-color:Lightblue;">Total Amount </td>
			<td style="background-color:yellow;"> ${TOTALAMOUNT}</td>
			</tr>
			<tr>
			
			

		</table>
		<br>
		<input style="font-size: 22px; background-color: green;" type="submit"
			value="submit">
	</form>
	
	

</body>
</html>