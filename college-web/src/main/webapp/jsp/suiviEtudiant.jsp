<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
            <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi des �tudiants</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>



<body>

<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Suivi des �tudiants</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home" style ="font-size:large"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off" style ="font-size:large"> D�connexion</i></button>
	</div>

</nav>



<!-- Partie calcul moyenne -->

<h1 align="center">Calcul moyenne</h1>

<form:form modelAttribute="etudiant" action="/college-web/user/calculmoyenne"
style="width:10%; margin-left: auto; margin-right: auto;"><br>

	<label>S�lectionnez un �tudiant :</label>		
 		<form:select path="idPersonne" items="${listeEtu}" itemValue="idPersonne"
 		itemLabel="nom" class="form-control"></form:select><br>
 		
<form:button class="btn btn-primary" type="submit" value="valider" style="margin-left: auto; margin-right: auto;">
Calculer la moyenne</form:button>

</form:form><br><br>



<!-- Informations �tudiant -->



<table class = "table" style = "width:50%; margin-left:25%">

<thead>
<tr>

<th scope = "col">Id</th>
<th scope = "col">Nom</th>
<th scope = "col">Pr�nom</th>
<th scope = "col">Moyenne g�n�rale</th>

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



<!-- Mati�res pour lesquelles l'�tudiant n'a pas de notes -->

<h3 align="center"> Liste des mati�res pour lesquelles l'�tudiant n'a pas de notes</h3>

<form:form modelAttribute="etudiant" action="/college-web/user/manquenotes"
style="width:10%; margin-left: auto; margin-right: auto;"><br>
	<label>S�lectionnez un �tudiant :</label>		
 		<form:select path="idPersonne" items="${listeEtud}" itemValue="idPersonne"
 		itemLabel="nom" class="form-control"></form:select><br>
<form:button class="btn btn-primary" type="submit" value="valider" >Afficher mati�res</form:button>
</form:form>

<table class = "table" style = "width:50%; margin-left:25%">

<thead>
<tr>

<th scope = "col">Id</th>
<th scope = "col">Mati�re</th>

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



<!-- Liste des �tudiants admis -->

<h1 align="center"> Liste des �tudiants admis</h1>

<form:form modelAttribute="etudiant" action="/college-web/user/listeadmis"
style="width:10%; margin-left: auto; margin-right: auto;"><br>
<form:button class="btn btn-primary" type="submit" value="valider" >Afficher la liste</form:button>
</form:form>

<table class = "table" style = "width:50%; margin-left:25%">

<thead>
<tr>

<th scope = "col">Nom</th>
<th scope = "col">Pr�nom</th>

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