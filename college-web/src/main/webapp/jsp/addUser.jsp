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
		<h1>Gestion des Utilisateurs</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off"> Déconnexion</i></button>
	</div>

</nav>


<form:form modelAttribute="admin" action="/college-web/addAdmin" style="margin-left:40%">
<p><h1>Ajouter un utilisateur</h1></p>
login : <form:input path="userName" type="text" style = "width:20%" class="form-control"/> <br>
password : <form:input path="password" type="text" style = "width:20%" class="form-control"/> <br>
activer : <form:checkbox value="1" path="actived" /><br>
<form:button type="submit" class="btn btn-primary" style = "margin-left:10%" >Valider</form:button>
</form:form>
</body>
</html>