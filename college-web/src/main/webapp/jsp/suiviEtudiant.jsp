<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi des étudiants</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>



<body>

<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Suivi des étudiants</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home" style ="font-size:large"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off" style ="font-size:large"> Déconnexion</i></button>
	</div>

</nav>



<!-- Partie calcul moyenne -->

<h1 align="center">Calcul moyenne</h1>

<form:form modelAttribute="etudiant" action="/college-web/user/calculmoyenne"
style="width:10%; margin-left: auto; margin-right: auto;"><br>

	<label>Sélectionnez un étudiant :</label>		
 		<form:select path="idPersonne" items="${listeEtu}" itemValue="idPersonne"
 		itemLabel="nom" class="form-control"></form:select><br>
 		
<form:button class="btn btn-primary" type="submit" value="valider" style="margin-left: auto; margin-right: auto;">
Calculer la moyenne</form:button>

</form:form><br><br>



<!-- Informations étudiant -->



<table class = "table" style = "width:50%; margin-left:25%">

<thead>
<tr>

<th scope = "col">Id</th>
<th scope = "col">Nom</th>
<th scope = "col">Prénom</th>
<th scope = "col">Moyenne générale</th>

</tr>
</thead>

<tbody>

<tr>

<td>${id}</td>
<td>${nom}</td>
<td>${prenom}</td>
<td>${moy}</td>

</tr>

</tbody>
</table><br><br>



<!-- Matières pour lesquelles l'étudiant n'a pas de notes -->

<h3 align="center"> Liste des matières pour lesquelles l'étudiant n'a pas de notes</h3>

<form:form modelAttribute="etudiant" action="/college-web/user/manquenotes"
style="width:10%; margin-left: auto; margin-right: auto;"><br>
	<label>Sélectionnez un étudiant :</label>		
 		<form:select path="idPersonne" items="${listeEtud}" itemValue="idPersonne"
 		itemLabel="nom" class="form-control"></form:select><br>
<form:button class="btn btn-primary" type="submit" value="valider" >Afficher matières</form:button>
</form:form>

<table class = "table" style = "width:50%; margin-left:25%">

<thead>
<tr>

<th scope = "col">Id</th>
<th scope = "col">Matière</th>

</tr>
</thead>

<tbody>

<c:forEach items = "${matNotes}" var = "mat">
<tr>

<td>${mat.idMatiere}</td>
<td>${mat.nom}</td>

</tr>
</c:forEach>

</tbody>
</table><br><br>



<!-- Liste des étudiants admis -->

<h1 align="center"> Liste des étudiants admis</h1>

<form:form modelAttribute="etudiant" action="/college-web/user/listeadmis"
style="width:10%; margin-left: auto; margin-right: auto;"><br>
<form:button class="btn btn-primary" type="submit" value="valider" >Afficher la liste</form:button>
</form:form>

<table class = "table" style = "width:50%; margin-left:25%">

<thead>
<tr>

<th scope = "col">Nom</th>
<th scope = "col">Prénom</th>

</tr>
</thead>

<tbody>

<c:forEach items = "${etuAdmis}" var = "etu">
<tr>

<td>${etu.nom}</td>
<td>${etu.prenom}</td>

</tr>
</c:forEach>

</tbody>
</table>



</body>
</html>