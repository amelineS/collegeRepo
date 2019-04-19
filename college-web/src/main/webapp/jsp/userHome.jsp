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

<th scope = "col" style="text-align:center; padding:50px;font-size:x-large"><i class="glyphicon glyphicon-edit"></i><br>
<a href="<c:url value="/user/Noter"/>" >Noter</a></th>
<th scope = "col" style="text-align:center; padding:50px; font-size:x-large"><i class="glyphicon glyphicon-education"></i><br>
<a href="<c:url value="/user/suivietudiant"/>" >Suivi Etudiant</a></th>
<th scope = "col" style="text-align:center; padding:50px; font-size:x-large"><i class="glyphicon glyphicon-folder-open"></i><br>
<a href="<c:url value="/user/suivi"/>" >Suivi général</a></th>

</tr>





</table>







</body>
</html>