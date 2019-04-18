<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<h1>Gestion des roles</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off"> Déconnexion</i></button>
	</div>

</nav>


<form:form modelAttribute="role" action="/college-web/addRole" style="margin-left:40%">

Role : <form:input path="roleName" type="text" style = "width:20%" class="form-control"/> <br>
User : <form:select path="user.idUser" items="${users}"
itemValue="idUser" itemLabel="userName" style = "width:20%" class="form-control"></form:select>
 <br>

<form:button type="submit" class="btn btn-primary" style = "margin-left:10%"  >Valider</form:button>
</form:form>
</body>
</html>