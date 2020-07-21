<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">



<title>Zona Profesional</title>
</head>
<body>
	<c:set var="baseURL" value="${pageContext.request.contextPath}"></c:set>
	<header>
		<h3 class="bg-success text-white" style="margin-bottom: 0px;">
			Zona Profesional
		</h3>
		<nav class="navbar navbar-expand-md bg-success navbar-dark">
			<a class="navbar-brand" href="${baseURL}"> 
				<svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-house-door-fill" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
		  		<path d="M6.5 10.995V14.5a.5.5 0 0 1-.5.5H2a.5.5 0 0 1-.5-.5v-7a.5.5 0 0 1 .146-.354l6-6a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 .146.354v7a.5.5 0 0 1-.5.5h-4a.5.5 0 0 1-.5-.5V11c0-.25-.25-.5-.5-.5H7c-.25 0-.5.25-.5.495z" />
		 	 	<path fill-rule="evenodd" d="M13 2.5V6l-2-2V2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5z" />
			  	</svg>
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a class="nav-link"	href="/lvparacapacitacion">Crear capacitacion </a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="/planificarvisita">Planificar visita</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="/revisarclientes">Revisar Cliente</a>
					</li>
					<li class="nav-item">
						<a class="nav-link disabled" href="#">Crear caso de asesoría</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="/lpmclientes">Ingresar actividad de mejora </a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="/revisarmejoras">Revisar actividad de mejora </a>
					</li>
					<li class="nav-item">
						<a class="nav-link disabled" href="#">Ingresar asesoria</a>
					</li>
					<li class="nav-item">
						<a class="nav-link disabled" href="#">Crear	Checklist</a>
					</li>
					<li class="nav-item">
						<a class="nav-link disabled" href="#">Responder Checklist</a>
					</li>
				</ul>
			</div>
		</nav>
	</header>