<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<h1>Menu Principal</h1>

	<hr>
	<h4>AREA ADMINISTRADOR</h4>
	<ul>
		<li>CU1 <a class="nav-item nav-link" href="listarclientes">Administrar Clientes</a> Listo 
		</li>
		<li>CU2 <a class="nav-item nav-link" href="listarempleados">Administrar Empleados</a> Listo
		</li>
		<li>CU10 <a class="nav-item nav-link" href="#">Controlar Pagos Cliente</a>
		</li>
		<li>CU12 <a class="nav-item nav-link" href="#">Calcular Accidentabilidad</a>
		</li>
		<li>CU14 <a class="nav-item nav-link" href="visualizadoractividades">Visualizar Actividades</a> Listo
		</li>
		<li>CU15 <a class="nav-item nav-link" href="#">Notificar Atrasos</a>
		</li>
		<li>CU19 <a class="nav-item nav-link" href="reportecliente">Generar Reporte Cliente</a> Listo
		</li>
		<li>CU20 <a class="nav-item nav-link" href="reporteglobal">Generar reporte global</a> Listo
		</li>
	</ul>
	<hr>
	<h4>AREA EMPLEADO</h4>
	<ul start="9">
		<li>CU3 <a class="nav-item nav-link" href="lvparacapacitacion">Crear capacitacion</a> Listo
		</li>
		<li>CU4 <a class="nav-item nav-link" href="planificarvisita">Planificar Visita</a> Listo
		</li>
		<li>CU5 <a class="nav-item nav-link" href="revisarclientes">Revisar Cliente</a> Listo
		</li>
		<li>CU07 <a class="nav-item nav-link" href="#">Crear Caso Asesoria</a>
		</li>
		<li>CU08 <a class="nav-item nav-link" href="lpmclientes">Ingresar Actividad de mejora</a> Listo
		</li>
		<li>CU09 <a class="nav-item nav-link" href="revisarmejoras">Revisar Actividad de mejora</a> Listo
		</li>
		<li>CU13 <a class="nav-item nav-link" href="#">Ingresar Asesoria</a>
		</li>
		<li>CU17 <a class="nav-item nav-link" href="#">Crear Checklist</a>
		</li>
		<li>CU18 <a class="nav-item nav-link" href="#">Responder Checklist</a>
		</li>
	</ul>
	<hr>
	<h4>AREA CLIENTE</h4>
	<ul start="18">
		<li>CU6 <a class="nav-item nav-link" href="reportaraccidente">Reportar accidente</a> Listo
		</li>
		<li>CU16 <a class="nav-item nav-link" href="#">Solicitar Asesoria Especial</a>
		</li>
	</ul>

	
</body>
</html>