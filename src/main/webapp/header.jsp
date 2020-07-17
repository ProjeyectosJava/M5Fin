<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>

	
	
	 <nav class="navbar navbar-expand-sm bg-success navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="index.jsp">Home</a>

  <!-- Links -->
  <ul class="navbar-nav">
      <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Administrador
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="listarclientes">CU1 Administrar Clientes Listo</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
     <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Profesional
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>

    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Cliente
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="#">Link 1</a>
        <a class="dropdown-item" href="#">Link 2</a>
        <a class="dropdown-item" href="#">Link 3</a>
      </div>
    </li>
  </ul>
</nav> 

	<!-- 	<h1>Menu Principal</h1>

	<hr>
	<nav class="nav nav-pills nav-justified">
		<h4>AREA ADMINISTRADOR</h4>
		<ul>
			<li> <a class="nav-item nav-link" href="listarclientes">CU1 Administrar Clientes Listo</a> 
			</li>
			<li> <a class="nav-item nav-link" href="listarempleados">CU2 Administrar Empleados Listo</a>
				
			</li>
			<li>CU10 <a class="nav-item nav-link" href="#">Controlar Pagos Cliente</a>
			</li>
			<li>CU12 <a class="nav-item nav-link" href="#">Calcular Accidentabilidad</a>
			</li>
			<li>CU14 <a class="nav-item nav-link" href="visualizadoractividades">Visualizar
					Actividades</a> Listo
			</li>
			<li>CU15 <a class="nav-item nav-link" href="#">Notificar Atrasos</a>
			</li>
			<li>CU19 <a class="nav-item nav-link" href="reportecliente">Generar Reporte Cliente</a>
				Listo
			</li>
			<li>CU20 <a class="nav-item nav-link" href="reporteglobal">Generar reporte global</a>
				Listo
			</li>
		</ol>
		<hr>
		<h4>AREA EMPLEADO</h4>
		<ol start="9">
			<li>CU3 <a class="nav-item nav-link" href="lvparacapacitacion">Crear capacitacion</a>
				Listo
			</li>
			<li>CU4 <a class="nav-item nav-link" href="planificarvisita">Planificar Visita</a> Listo
			</li>
			<li>CU5 <a class="nav-item nav-link" href="revisarclientes">Revisar Cliente</a> Listo
			</li>
			<li>CU07 <a class="nav-item nav-link" href="#">Crear Caso Asesoria</a>
			</li>
			<li>CU08 <a class="nav-item nav-link" href="lpmclientes">Ingresar Actividad de mejora</a>
				Listo
			</li>
			<li>CU09 <a class="nav-item nav-link" href="revisarmejoras">Revisar Actividad de
					mejora</a> Listo
			</li>
			<li>CU13 <a class="nav-item nav-link" href="#">Ingresar Asesoria</a>
			</li>
			<li>CU17 <a class="nav-item nav-link" href="#">Crear Checklist</a>
			</li>
			<li>CU18 <a class="nav-item nav-link" href="#">Responder Checklist</a>
			</li>
		</ul>
		<h4>AREA CLIENTE</h4>
		<ol start="18">
			<li>CU6 <a class="nav-item nav-link" href="reportaraccidente">Reportar accidente</a> Listo
			</li>
			<li>CU16 <a class="nav-item nav-link" href="#">Solicitar Asesoria Especial</a>
			</li>
		</ol>
	</nav> -->