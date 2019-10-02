<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="e" uri="/WEB-INF/MyTag.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<body >
<h3 style="color:blue;font-size:22px;"><e:error property="reg_error"/></h3>
<form action="register" method="post" enctype="multipart/form-data">
<center>
<table  >
<tr>
<td style="font-size:22px;">Username</td>
<td><input type = "text" name = "username"></td>
<td style="color:red;font-size:18px;"><e:error property="username"></e:error></td>
</tr>
<tr>
<td style="font-size:22px;">Email</td>
<td><input type = "text" name = "email"></td>
<td style="color:red;font-size:18px;"><e:error property="email"></e:error></td>
</tr>
<tr>
<td style="font-size:22px;">Phone No</td>
<td><input type = "text" name = "phone"></td>
<td style="color:red;font-size:18px;"><e:error property="phone"></e:error></td>
</tr>
<tr>
<td style="font-size:22px;">Password</td>
<td><input type = "password" name = "password"></td>
<td style="color:red;font-size:18px;"><e:error property="password"></e:error></td>
</tr>
<tr>
<tr>
<td style="font-size:22px;">Photo</td>
<td><input type = "file" name = "photo"></td>
<td style="color:red;font-size:18px;"><e:error property="photo"></e:error></td>
</tr>
<tr>
<td style="font-size:22px;">Upload Resume</td>
<td><input type = "file" name = "resume"></td>
<td style="color:red;font-size:18px;"><e:error property="photo"></e:error></td>
</tr>
<tr>
</tr>

</table>
<br>

<input style="font-size:18px;background-color: yellow;" type="submit" value="submit">
</center></form>
<br>
<a style="font-size: 32px;font-weight: bold;" href= "index.jsp">Login</a>
</body>
</html>