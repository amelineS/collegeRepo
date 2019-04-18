<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<title>Gestion Collège</title>
</head>



<body>

<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Gestion des collèges</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit">
		<i class="glyphicon glyphicon-home" style ="font-size:large"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit">
		<i class="glyphicon glyphicon-off" style ="font-size:large"> Déconnexion</i></button>
	</div>

</nav>



<!-- Formulaire pour ajouter un collège -->

<form:form modelAttribute = "college" action = "/college-web/admin/addCollege" style="margin-left:40%">

<p><h1>Ajouter un collège</h1></p>

<form:input path="idCollege" type = "hidden"/>
Site internet : <form:input path="siteInternet" type = "text"  required="true"/><br><br>

<form:button class="btn btn-primary" type ="submit" style = "margin-left:10%">Valider</form:button>

</form:form>
<br><br><br>


<!-- Liste de collèges -->

<p><h1 style="margin-left:40%">Liste des collèges</h1></p>
<table class = "table" style = "width:50%; margin-left:25%">

<thead>
<tr>

<th scope = "col">Id</th>
<th scope = "col">Site internet</th>
<th scope = "col">Modifier</th>
<th scope = "col">Supprimer</th>

</tr>
</thead>

<tbody>



<c:forEach items = "${listeC}" var = "co">
<tr>

<td>${co.idCollege}</td>
<td>${co.siteInternet}</td>

<td><a href = "editCollege?id=${co.idCollege}"><i class="glyphicon glyphicon-pencil"></i></a></td>
<td><a href = "supprCollege?id=${co.idCollege}"><i class="glyphicon glyphicon-trash"></i></a></td>

</tr>
</c:forEach>



</tbody>


</table>

</body>
</html>