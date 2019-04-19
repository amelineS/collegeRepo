<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Suivi Général</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
	<body>
		<nav class="navbar navbar-dark bg-primary">
			<div class=pull-left>
				<h1>Suivi général</h1>
			</div>
	
			<div class=pull-right>
				<a href="<c:url value="/user/accueil"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
				<i class="glyphicon glyphicon-home"> Accueil</i></button></a>
				<button class="btn btn-default" type="submit" style = "margin-top:10%">
				<i class="glyphicon glyphicon-off"> Déconnexion</i></button>
			</div>

		</nav>
	
 			<p><h1 style="margin-left:30%">Calcul moyenne par département</h1> 
			<form:form style="margin-left:35%; margin-bottom:10px" modelAttribute="departement" action="/college-web/user/suivi/calculDep">
				<div class="form-group"  style="width:40%">
			     		<label for="dep">Département</label>
			   		    	<form:select  required="true" id="dep"  class="form-control col-md-3" 
  			   		    	path="idDepartement" items="${departements}"  itemValue="idDepartement"   
 		   		    			itemLabel="nomDepartement">  
		   		    	</form:select>	  
		     		</div>
 		     		<form:button  style="margin-left:5px" type="submit" class="btn btn-primary">Calculer</form:button> <br><br>
				 <output style="margin-left:10%" id="moyenne" >${calculmoyenne}</output>
			</form:form>
			
	</body>
</html>