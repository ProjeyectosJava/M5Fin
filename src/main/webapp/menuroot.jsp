<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">


<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<title>Zona Super Administrador</title>
</head>
<body>

	
<c:set var="baseURL" value="${pageContext.request.contextPath}"></c:set>

<header>
	<nav class="navbar navbar-expand-md bg-success navbar-dark">
		 <a class="navbar-brand" href="${baseURL}"> <span class="fas fa-home"></span></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	    
	  	<div class="collapse navbar-collapse" id="navbarNavDropdown">
		    <ul class="navbar-nav">
		      <li class="nav-item">
		        <a class="nav-link" href="${baseURL}/submenuadmin">Administrador <span class="fas fa-user-plus"></span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="${baseURL}/submenuprof">Profesional <span  class="fas fa-user-tie"></span> </a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="${baseURL}/submenucliente">Cliente  <span class="fas fa-user-alt"></span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="${baseURL}/rest/infoapirest">Info Rest</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="${baseURL}/logout">Logout  <span class="fas fa-sign-in-alt"></span> </a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="${baseURL}/pendientes">Tareas por hacer</a>
		      </li>
		      
		    </ul>
	  	</div>
	</nav>
</header>
</body>