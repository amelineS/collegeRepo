<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"></meta>
		<title>Gestion Enseignant</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	</head>
	<body>
	
	<!-- Barre de navigation -->

<nav class="navbar navbar-dark bg-primary">
	<div class=pull-left>
		<h1>Gestion des Enseignants</h1>
	</div>
	
	<div class=pull-right>
		<a href="<c:url value="/admin/home"/>" ><button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-home"> Accueil</i></button></a>
		<button class="btn btn-default" type="submit" style = "margin-top:10%">
		<i class="glyphicon glyphicon-off"> D�connexion</i></button>
	</div>

</nav>
	<p><h1 style="margin-left:40%">Ajouter un enseignant</h1>
	
		<form:form modelAttribute="enseignant" action ="/college-web/admin/redirectEnseignant"  style="margin-left:40%">
			<div class="form-row">
			<form:input type="hidden" path="idPersonne"/>
		 		<div class="form-group"  style="width:40%">
		     		<label for="nom">Nom</label>
		   		    <form:input path="nom" type="text" class="form-control" id="nom"/>
	     		</div>
	     		<div class="form-group" style="width:40%">
		     		<label for="prenom">Pr�nom</label>
		   		    <form:input path="prenom" type="text" class="form-control" id="prenom"/>
	     		</div>
	     	</div>
	     	<div class="form-row"style="width:40%">
	     		<div class="form-group">
		     		<label for="mail">Email</label>
		   		    <form:input path="mail" type="email" class="form-control" id="mail"/>
	     		</div>
		     </div>
		     	<div class="form-row">
		     		<div class="form-group" style="width:40%">
			     		<label for="tel">T�l�phone</label>
			   		    <form:input path="tel" type="text" class="form-control" id="tel"/>
		     		</div>
	     		</div>
	     		<div class="form-row" style="margin:auto;"> 
		     		<div class="form-group" style="width:40%">
			     		<label for="indice">Indice</label>
			   		    <form:input path="indice" type="number" class="form-control" id="indice"/>
			   		    
		     		</div>
		     		<div class="form-group" style="width:40% ">
			     		<label for="tel">Date (aaaa/mm/jj)</label>
			   		    <form:input path="datePriseFonction" type="text" class="form-control" id="tel"/>
			   		    	
		     		</div>
		     		<div class="form-group"  style="width:40%">
			     		<label for="dep">D�partement</label>
			   		    	<form:select id="dep"  class="form-control col-md-3" path="Departement.idDepartement" items="${departement}"  itemValue="idDepartement" itemLabel="nomDepartement" ></form:select>	
		     		</div>
		     	</div><br><br>
		     	
	     		<div class="form-row">
   					<form:button type="submit" class="btn btn-primary">Valider</form:button>
				</div>

					

 </form:form>
			
		
			
		
<!-- Liste de coll�ges -->

<p><h1 style="margin-left:40%">Liste des enseignants</h1>
<table class = "table" style = "width:50%; margin-left:20%">

<thead>
<tr>

<th scope = "col">Id</th>
<th scope = "col">Nom</th>
<th scope = "col">Pr�nom</th>
<th scope = "col">Mail</th>
<th scope = "col">T�l�phone</th>
<th scope = "col">Date</th>
<th scope = "col">Indice</th>
<th scope = "col">D�partement</th>
<th scope = "col">Modifier</th>
<th scope = "col">Supprimer</th>
</tr>
</thead>

<center>
<tbody>



<c:forEach items = "${listenseignant}" var = "ens">
<tr>

					<td>${ens.idPersonne}</td>
					<td>${ens.nom}</td>
					<td>${ens.prenom}</td>
					<td>${ens.mail}</td>
					<td>${ens.tel}</td>
					<td>${ens.datePriseFonction}</td>
					<td>${ens.indice}</td>
					<td>${ens.departement.nomDepartement}</td>
					<td><a href="modifierEnseignant?id=${ens.idPersonne}"> <i class="glyphicon glyphicon-pencil"></i>   </a></td> 
					<td><a href="supprimerEnseignant?id=${ens.idPersonne}"><i class="glyphicon glyphicon-trash"></i></a></td>



</tr>
</c:forEach>



</tbody>
			</table>
			
			</body>
</html>