<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Noter</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

</head>
<body>
<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Gestion des notes</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/user/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home" style ="font-size:large"> Accueil</i></button></a>
				<a href="<c:url value="/j_spring_security_logout"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off" style ="font-size:large"> Déconnexion</i></button></a>
	</div>

</nav>


 <p><h1 style="margin-left:37%">Ajouter une note</h1>
 <div class="container" style = "width:30%; margin-left:35%">


<form:form modelAttribute="Noter" action="/college-web/user/Noterredirect">
  
		
	<br>
	<label>Note :</label>
		<form:input path="note" type="text" required="true" placeholder="Note / 20" class="form-control"/> <br>
		
 	<label>Matière :</label>
 		<form:select path="matiere.idMatiere" items="${listMatieres}" itemValue="idMatiere" itemLabel="nom" class="form-control"></form:select> <br>
	
	<label>Étudiant :</label>		
 		<form:select path="etudiant.idPersonne" items="${etudiants}" itemValue="idPersonne" itemLabel="nom" class="form-control"></form:select><br><br>

<center>
<form:button class="btn btn-primary" type="submit" value="valider" >Valider</form:button></center>
</form:form>
</div>
<br>
 <div class="container">

<!-- Liste de collèges -->

<p><h1 style="margin-left:30%">Notes des étudiants</h1>
<table class = "table" style = "width:70%; margin-left:15%">


<thead>
<tr>
<th scope="col">Id Etudiant</th>
<th scope="col">Nom</th>
<th scope="col">Prénom</th>
<th scope="col">Matiere</th>
<th scope="col">Note</th>
<th scope="col"></th>
<th scope="col"></th>

</tr>
</thead>

<tbody>

<c:forEach items="${listeNoter}" var="n"> 
<tr>
<td>${n.etudiant.idPersonne}</td>
<td>${n.etudiant.nom}</td>
<td>${n.etudiant.prenom}</td>
<td>${n.matiere.nom}</td>
<td>${n.note}</td>

<td><a href="Noteredit?idMatiere=${n.matiere.idMatiere}&idEtudiant=${n.etudiant.idPersonne}" class="glyphicon glyphicon-pencil"> </a></td>
<td><a href="Noterdelete?idMatiere=${n.matiere.idMatiere}&idEtudiant=${n.etudiant.idPersonne}" class="glyphicon glyphicon-trash"></a></td>
</tr>
</c:forEach>

</tbody>
</table>
</div>
</html>