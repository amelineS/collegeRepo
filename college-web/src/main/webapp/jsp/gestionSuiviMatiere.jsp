<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi des matières</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
	<body>
		<nav class="navbar navbar-dark bg-primary">
			<div class=pull-left>
				<h1>Suivi des matières</h1>
			</div>
	
			<div class=pull-right>
				<a href="<c:url value="/user/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
				<i class="glyphicon glyphicon-home" style ="font-size:large"> Accueil</i></button></a>
				<a href="<c:url value="/j_spring_security_logout"/>" >
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off" style ="font-size:large"> Déconnexion</i></button>
		</a>
			</div>

		</nav>
	
			<p><h1 style="margin-left:30%">Calcul moyenne par Matiere </h1> 
			<form:form style="margin-left:35%; margin-bottom:10px" modelAttribute="matiere" action="/college-web/user/suiviMat/calculMatiere">
				<div class="form-group"  style="width:40%">
			     		<label for="mat">Matiere</label>
			   		    	<form:select  required="true" id="mat"  class="form-control col-md-3" 
 			   		    	path="idMatiere" items="${matieres}"  itemValue="idMatiere" itemLabel="nom" > 
			   		    	</form:select>	 
		     		</div> <br>
 		     		<form:button style="margin-left:5px" type="submit" class="btn btn-primary">Calculer</form:button> <br><br>
				<output style="margin-left:10%" id="moyenneMatiere" >${calculmoyenneMatiere}</output>
			</form:form>

	</body>
</html>