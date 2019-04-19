<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Département</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

</head>
<body>
<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Gestion des départements</h1>
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


 <p><h1 style="margin-left:37%">Ajouter un département</h1>
 <div class="container" style = "width:30%; margin-left:35%">


<form:form modelAttribute="Departement" action="/college-web/admin/Departementredirect">
 
		<form:input path="idDepartement" type="hidden"></form:input> 
	<br>
	<label>Nom :</label>
		<form:input path="nomDepartement" type="text" required="true" placeholder="Nom du Département" class="form-control"/> <br>
		
 	<label>Responsable :</label>
 		<form:select path="responsable.idPersonne" items="${responsables}" itemValue="idPersonne" itemLabel="nom" class="form-control"></form:select> <br>
	
	<label>College :</label>		
 		<form:select path="College.idCollege" items="${colleges}" itemValue="idCollege" itemLabel="siteInternet" class="form-control"></form:select><br><br>

<center>
<form:button class="btn btn-primary" type="submit" value="valider" >Valider</form:button></center>
</form:form>
</div>
<br>
 <div class="container">

<!-- Liste de collèges -->

<p><h1 style="margin-left:30%">Liste des départements</h1></p>
<table class = "table" style = "width:70%; margin-left:15%">


<thead>
<tr>
<th scope="col">Id</th>
<th scope="col">Nom</th>
<th scope="col">Responsable</th>
<th scope="col">College</th>
<th scope="col"></th>
<th scope="col"></th>

</tr>
</thead>

<tbody>

<c:forEach items="${listeDepartements}" var="dep"> 
<tr>
<td>${dep.idDepartement}</td>
<td>${dep.nomDepartement}</td>
<td>${dep.responsable.nom}</td>
<td>${dep.college.siteInternet}</td>
<td><a href="Departementedit?id=${dep.idDepartement}" class="glyphicon glyphicon-pencil"> </a></td>
<td><a href="Departementdelete?id=${dep.idDepartement}" class="glyphicon glyphicon-trash"></a></td>
</tr>
</c:forEach>

</tbody>
</table>
</div>
</html>