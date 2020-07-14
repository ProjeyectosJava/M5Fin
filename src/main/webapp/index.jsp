<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<ol>
		<li>CU1
			<a href="listarclientes">Administrar Clientes</a> Listo
		</li>
		<li>CU2
			<a href="listarempleados">Administrar Empleados</a> Listo
		</li>
		<li>CU10
			<a href="#">Controlar Pagos Cliente</a>
		</li>
		<li>CU12
			<a href="#">Calcular Accidentabilidad</a>
		</li>
		<li>CU14
			<a href="visualizadoractividades">Visualizar Actividades</a> Listo
		</li>
		<li>CU15
			<a href="#">Notificar Atrasos</a>
		</li>
		<li>CU19
			<a href="reportecliente">Generar Reporte Cliente</a> Listo
		</li>
		<li>CU20 
			<a href="reporteglobal">Generar reporte global</a> Listo
		</li>
	</ol>
	<hr>
	<h4>AREA EMPLEADO</h4>
	<ol start="9">	
		<li>CU3
			<a href="lvparacapacitacion">Crear capacitacion</a> Listo
		</li>
		<li>CU4 
			<a href="planificarvisita">Planificar Visita</a> Listo
		</li>
		<li>CU5 
			<a href="revisarclientes">Revisar Cliente</a> Listo
		</li>		
		<li>CU07 
			<a href="#">Crear Caso Asesoria</a>
		</li>
		<li>CU08 
			<a href="lpmclientes">Ingresar Actividad de mejora</a> Listo
		</li>
		<li>CU09 
			<a href="revisarmejoras">Revisar Actividad de mejora</a> Listo
		</li>
		<li>CU13 
			<a href="#">Ingresar Asesoria</a>
		</li>
		<li>CU17 
			<a href="#">Crear Checklist</a>
		</li>
		<li>CU18 
			<a href="#">Responder Checklist</a>
		</li>
	</ol>
	<h4>AREA CLIENTE</h4>
	<ol start="18">
		<li>CU6 
			<a href="reportaraccidente">Reportar accidente</a> Listo
		</li>
		<li>
			CU16
			<a href="#">Solicitar Asesoria Especial</a>
		</li>	
	</ol>
	
<%@ include file="footer.jsp" %>