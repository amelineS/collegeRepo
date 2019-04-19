<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<h1>Gestion des Utilisateurs</h1>
	</div>
	


</nav>


<form:form modelAttribute="admin" action="/college-web/addAdmin" style="margin-left:40%">

login : <form:input path="userName" type="text" style = "width:20%" class="form-control"/> <br>
password : <form:input path="password" type="text" style = "width:20%" class="form-control"/> <br>
activer : <form:checkbox value="1" path="actived" /><br><br>
<form:button type="submit" class="btn btn-primary" style = "margin-left:6%" >Valider</form:button>
</form:form>
<br><br>
<a href="<c:url value="/formRole"/>" style="margin-left:42%">Attribuer un role</a><br>
<a href="<c:url value="/admin/home"/>" style="margin-left:42%">Authentification Admin</a><br>
<a href="<c:url value="/user/home"/>" style="margin-left:42%">Authentification User</a><br>
</body>
</html>