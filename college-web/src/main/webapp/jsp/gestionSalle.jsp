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
<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Gestion des salles</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off"> Déconnexion</i></button>
	</div>

</nav>


<p><h1 style="margin-left:38%">Ajouter/modifier une salle</h1></p>
<form:form modelAttribute="salle" action="/college-web/admin/addSalle" style="margin-left:44%">

<form:input path="idSalle" type="hidden"/> <br>
Nombre de places : <form:input path="nbrPlace" type="text" class="form-control" required="true" style = "width:10%"/> <br><br>


<form:button type="submit" class="btn btn-primary" style = "margin-left:2%">Valider</form:button>
<!-- </div> -->
</form:form>
<!-- </div> -->

<br><br><br>
<p><h1 style="margin-left:40%">Liste des salles</h1></p>
<table class = "table table-hover" style = "width:50%; margin-left:25%">



<thead>
<tr>
<th scope = "col">Id</th>
<th scope = "col">Nombre de places</th>
<th scope = "col">Modifier</th>
<th scope = "col">Supprimer</th>
</tr>
</thead>

<tbody>

<c:forEach items="${listSalles}" var="salle">

<tr>
<td>${salle.idSalle}</td>
<td>${salle.nbrPlace}</td>
<td><a href="modifierSalle?id=${salle.idSalle}"><i class="glyphicon glyphicon-pencil"></i></a></td> 
<td><a href="supprimerSalle?id=${salle.idSalle}"><i class="glyphicon glyphicon-trash"></i></a></td>
</tr>

</c:forEach>

</tbody>

</table>

</body>
</html>