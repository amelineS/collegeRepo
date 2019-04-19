<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Authentification</h1>
	</div>
	


</nav>


<form action="j_spring_security_check" method="post" style="margin-left:40%;margin-top:10% ">
<table>
<tr>
<td>Login </td>
<td><input type="text" name="j_username" class="form-control"></td>
</tr>
<tr>
<td>Pass word </td>
<td><input type="password" name="j_password"  class="form-control"></td>
</tr>
<tr>
<td><input type="submit" value="Login"  class="btn btn-primary" style = "margin-left:10%"></td>
</tr>
</table>
</form>

</body>
</html>