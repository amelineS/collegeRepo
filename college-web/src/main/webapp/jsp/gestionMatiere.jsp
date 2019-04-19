<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<h1>Gestion des matières</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home" style ="font-size:large"> Accueil</i></button></a>
	<a href="<c:url value="/j_spring_security_logout"/>" >
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off" style ="font-size:large"> Déconnexion</i></button>
		</a>
	</div>

</nav>

<p><h1 style="margin-left:40%">Ajouter/modifier une matière</h1></p>
<form:form modelAttribute="matiere" action="/college-web/admin/addMatiere" style="margin-left:42%">

  
<form:input path="idMatiere" type="hidden" /> <br>
<h5>Nom : </h5> <form:input path="nom" type="text" class="form-control" required="true" style = "width:20%"/>
<h5>Salle : </h5> <form:select path="Salle.idSalle" items="${salles}"
itemValue="idSalle" itemLabel="nbrPlace" class="form-control" required="true" style = "width:20%"></form:select><br>

<form:button type="submit" class="btn btn-primary" style = "margin-left:5%">Valider</form:button>
</form:form>

<br><br><br>
<p><h1 style="margin-left:40%">Liste des matières</h1></p>
<table class = "table table-hover" style = "width:50%; margin-left:25%">
<thead>
<tr>
<th>Id</th>
<th>Nom</th>
<th>Salle</th>
<th>Modifier</th>
<th>Supprimer</th>
</tr>
</thead>

<tbody>

<c:forEach items="${listMatieres }" var="mat">

<tr>
<td>${mat.idMatiere}</td>
<td>${mat.nom}</td>
<td>${mat.salle}</td>
<td><a href="modifierMatiere?id=${mat.idMatiere}"  class="glyphicon glyphicon-pencil" ></a></td> 
<td><a href="supprimerMatiere?id=${mat.idMatiere}" class="glyphicon glyphicon-trash" ></a></td>
</tr>

</c:forEach>

</tbody>

</table>



</body>
</html>