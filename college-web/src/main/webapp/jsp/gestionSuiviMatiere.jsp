<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi des mati�res</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
	<body>
		<nav class="navbar navbar-dark bg-primary">
			<div class=pull-left>
				<h1>Suivi des mati�res</h1>
			</div>
	
			<div class=pull-right>
				<a href="<c:url value="/user/accueil"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
				<i class="glyphicon glyphicon-home"> Accueil</i></button></a>
				<button class="btn btn-default" type="submit" style = "margin-top:10%">
				<i class="glyphicon glyphicon-off"> D�connexion</i></button>
			</div>

		</nav>
	
			<p><h1 style="margin-left:30%">Calcul moyenne par Matiere </h1> 
			<form:form modelAttribute="matiere" action="/college-web/user/suiviMat/calculMatiere">
				<div class="form-group"  style="width:40%">
			     		<label for="mat">Matiere</label>
			   		    	<form:select  required="true" id="mat"  class="form-control col-md-3" 
 			   		    	path="idMatiere" items="${matieres}"  itemValue="idMatiere" itemLabel="nom" > 
			   		    	</form:select>	 
		     		</div>
 		     		<form:button type="submit" class="btn btn-primary">Calculer</form:button> 
				<output id="moyenneMatiere" >${calculmoyenneMatiere}</output>
			</form:form>

	</body>
</html>