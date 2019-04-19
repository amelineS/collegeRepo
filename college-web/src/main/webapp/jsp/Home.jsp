<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>



<body>

<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Accueil</h1>
	</div>
	
	<div class=pull-right>

	<a href="<c:url value="/j_spring_security_logout"/>" >
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off" style ="font-size:large"> Déconnexion</i></button>
		</a>
	</div>
</nav>



<table class= "table table-bordered" style ="width:50%; margin-top:10%; margin-left:25%">

<tr>

<th scope = "col" style="text-align:center; padding:50px;font-size:x-large"><i class="glyphicon glyphicon-home"></i><br>
<a href="<c:url value="/admin/formcollege"/>" >Gestion des collèges</a></th>
<th scope = "col" style="text-align:center; padding:50px; font-size:x-large"><i class="glyphicon glyphicon-th-list"></i><br>
<a href="<c:url value="/admin/Departement"/>" >Gestion des départements</a></th>
<th scope = "col" style="text-align:center; padding:50px; font-size:x-large"><i class="glyphicon glyphicon-calendar"></i><br>
<a href="<c:url value="/admin/formSalle"/>" >Gestion des salles</a></th>

</tr>

<tr>

<th scope = "col" style="text-align:center; padding:50px; font-size:x-large"><i class="glyphicon glyphicon-user"></i><br>
<a href="<c:url value="/admin/addEnseignant"/>" >Gestion des enseignants</a></th>
<th scope = "col" style="text-align:center; padding:50px; font-size:x-large"><i class="glyphicon glyphicon-education"></i><br>
<a href="<c:url value="/admin/formEtudiant"/>" >Gestion des étudiants</a></th>
<th scope = "col" style="text-align:center; padding:50px; font-size:x-large"><i class="glyphicon glyphicon-th-list"></i><br>
<a href="<c:url value="/admin/formMatiere"/>" >Gestion des matières</a></th>

</tr>



</table>







</body>
</html>