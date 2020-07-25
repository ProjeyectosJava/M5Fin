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
<a href="index.jsp">Menu Principal</a>
<hr>
<h2>Seleccione Actividad a Visaulizar</h2>
<ul>
	<li><a href="vcapacitaciones">Capacitaciones</a></li>
	<li><a href="vvisitas">Visitas</a></li>
	<li><a href="vmejoras">Mejoras</a></li>
	<li><a href="vasesorias">Asesorias</a></li>
</ul>
	
	
	<c:if test="${opcion == 1}">
	
	<hr>
	<h3>Actividad Capacitaciones</h3>
	<table>
	<tr>
		<th>Id Cliente</th>
		<th>Nombre Cliente</th>
		<th>Fecha Capacitacion</th>
		<th>Hora Capacitacion</th>
		<th>Cantidad Asistentes</th>
	</tr>
	<c:forEach items="${listacapacitaciones}" var="lvc">
		<tr>
			<td>${lvc.getVisita().getCliente().getIdcliente()}</td>
			<td>${lvc.getVisita().getCliente().getNombrecliente()}</td> 
			<td>${lvc.getFechacapacitacion()}</td>
			<td>${lvc.getHoracapacitacion()}</td>
			<td>${lvc.getNumasistcapacitacion()}</td>
		</tr>
	</c:forEach>
	</table>
	</c:if>
	
	<c:if test="${opcion == 2}">
	<hr>
	<h3>Actividad Visitas</h3>
	<table>
	<tr>
		<th>Id Cliente</th>
		<th>Nombre Cliente</th>
		<th>Ciudad</th>
		<th>Direccion</th>
		<th>Resumen</th>
		<th>Observacion</th>
		<th>Fecha</th>
		<th>Nombre Empleado</th>
	</tr>
	<c:forEach items="${listavisitas}" var="lvv">
		<tr>
			<td>${lvv.getCliente().getIdcliente()}</td>
			<td>${lvv.getCliente().getNombrecliente()}</td>
			<td>${lvv.getCiudadvisita()}</td>
			<td>${lvv.getDireccionvisita()}</td>
			<td>${lvv.getResumenvisita()}</td>
			<td>${lvv.getObservacionvisita()}</td>
			<td>${lvv.getFechavisita()}</td>
			<td>${lvv.getEmpleado().getNombreempleado()}</td>
		</tr>
	</c:forEach>
	</table>
	</c:if>
	

	<c:if test="${opcion == 3}">
	<hr>
	<h3>Actividad Mejoras</h3>
	<table>
	<tr>
		<th>Id Cliente</th>
		<th>Nombre Cliente</th>
		<th>Rubro</th>
		<th>Fecha </th>
		<th>Motivo</th>
		<th>Actividades</th>
		<th>Estado</th>
	</tr>
	<c:forEach items="${listamejoras}" var="lvm">
		<tr>
			<td>${lvm.getCliente().getIdcliente()}</td>
			<td>${lvm.getCliente().getNombrecliente()}</td>
			<td>${lvm.getCliente().getRubrocliente()}</td>
			<td>${lvm.getFechamejora()}</td>
			<td>${lvm.getMotivomejora()}</td>
			<td>${lvm.getActividadesmejora()}</td>
			<td>${lvm.getEstadomejora()}</td>
		</tr>
	</c:forEach>
	</table>
	</c:if>
	
		
	<c:if test="${opcion == 4}">
	<hr>
	<h3>Actividad Mejoras</h3>
	<table>
	<tr>
		<th>Id Cliente</th>
		<th>Nombre Cliente</th>
		<th>Detalle</th>
		<th>Gestion </th>
		<th>Propuesta</th>
		<th>Fecha</th>
		<th>Especial</th>
		<th>Empleado</th>
	</tr>
	<c:forEach items="${listaasesorias}" var="lva">
		<tr>
			<td>${lva.getVisita().getCliente().getIdcliente()}</td>
			<td>${lva.getVisita().getCliente().getNombrecliente()}</td>
			<td>${lva.getDetalleasesoria()}</td>
			<td>${lva.getGestionasesoria()}</td>
			<td>${lva.getPropuestaasesoria()}</td>
			<td>${lva.getFechaasesoria()}</td>
			<td>${lva.getEspecialasesoria()}</td>
			<td>${lva.getVisita().getEmpleado().getNombreempleado()}</td>
		</tr>
	</c:forEach>
	</table>
	</c:if>
	
	
	
</body>
</html>