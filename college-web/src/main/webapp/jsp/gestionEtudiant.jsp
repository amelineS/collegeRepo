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
		<h1>Gestion des étudiants</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off"> Déconnexion</i></button>
	</div>

</nav>

<p><h1 style="margin-left:38%">Ajouter/modifier un étudiant</h1></p>
<form:form modelAttribute="etudiant" action="/college-web/admin/addEtudiant" style="margin-left:44%">

<form:input path="idPersonne" type="hidden"/> <br>
Nom : <form:input path="nom" type="text" class="form-control" required="true" style = "width:20%"/> <br>
Prenom : <form:input path="prenom" type="text" class="form-control" required="true" style = "width:20%"/> <br>
Mail : <form:input path="mail" type="email" class="form-control" required="true" style = "width:20%"/> <br>
Telephone : <form:input path="tel" type="number" class="form-control" required="true" style = "width:20%"/> <br>
Annee entree: <form:input path="anneEntree" type="number" class="form-control" required="true" style = "width:20%"/> <br><br>

<form:button type="submit" value="valider" class="btn btn-primary" style = "margin-left:5%">Valider</form:button>

</form:form>


<br><br><br>
<p><h1 style="margin-left:40%">Liste des étudiants</h1></p>
<table class = "table table-hover" style = "width:50%; margin-left:25%">
<thead>

         <tr>
            <th>Id</th>
           <th>Nom</th>
           <th>prenom</th>
            <th>Mail</th>
            <th>Telephone</th>
            <th>Annee entree</th>
            <th>Edit</th>
           <th>Delete</th>
         </tr>
         </thead>
         
         <tbody>
         <c:forEach items="${listEtudiants}" var="etud">
         <tr>
           <td>${etud.idPersonne}</td>
           <td>${etud.nom}</td>
           <td>${etud.prenom}</td>
           <td>${etud.mail}</td>
           <td>${etud.tel}</td>
           <td>${etud.anneEntree}</td>
           
           <td><a href="modifierEtudiant?id=${etud.idPersonne}" class="glyphicon glyphicon-pencil"></a></td>
          <td><a href="supprimerEtudiant?id=${etud.idPersonne}" class="glyphicon glyphicon-trash"></a></td>
         </tr>
      </c:forEach>
      </tbody>
</table>


</body>
</html>