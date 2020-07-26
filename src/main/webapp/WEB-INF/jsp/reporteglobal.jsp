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
	<h2>
		Reporte Global Clientes
	</h2>	
	<h3>Reporte de Mejoras</h3>
		<table>
			<tr>
				<th>Id </th>
				<th>Nombre </th>
				<th>Rubro</th>
				<th>Fecha</th>
				<th>Motivo</th>
				<th>Estado</th>
			</tr>
				<c:forEach items="${listmejora}" var="lm">
					<tr>
						<td>${lm.getCliente().getIdcliente()}</td> 
						<td>${lm.getCliente().getNombrecliente()}</td>
						<td>${lm.getRubrocliente()}</td>
						<td>${lm.getFechamejora()}</td>
						<td>${lm.getMotivomejora()}</td>
						<td>${lm.getEstadomejora()}</td>
					</tr>
				</c:forEach>
		</table>
		<hr>
		<h3>Reporte de Accidentes</h3>
		<table>
			<tr>
				<th>Id </th>
				<th>Nombre </th>
				<th>Rubro</th>
				<th>Fecha</th>
				<th>Hora</th>
				<th>Suceso</th>
				<th>Lugar</th>
			</tr>
				<c:forEach items="${listaccidente}" var="la">
					<tr>
						<td>${la.getCliente().getIdcliente()}</td>
						<td>${la.getCliente().getNombrecliente()}</td>
						<td>${la.getCliente().getRubrocliente()}</td>
						<td>${la.getFechaaccidente()}</td>
						<td>${la.getHoraaccidente()}</td>
						<td>${la.getSucesoaccidente()}</td>
						<td>${la.getLugaraccidente()}</td>
					</tr>
				</c:forEach>
		</table>
		<hr>
		<h3>Reporte de Visitas</h3>
		<table>
			<tr>
				<th>Id </th>
				<th>Nombre </th>
				<th>Rubro</th>
				<th>Direccion</th>
				<th>Fecha</th>
				<th>Ciudad</th>
				<th>Resumen</th>
				<th>Empleado</th>
			</tr>
				<c:forEach items="${listavisycap}" var="lv">
					<tr>
						<td>${lv.getVisita().getCliente().getIdcliente()}</td>
						<td>${lv.getVisita().getCliente().getNombrecliente()}</td>
						<td>${lv.getVisita().getCliente().getRubrocliente()}</td>
						<td>${lv.getVisita().getDireccionvisita()}</td>
						<td>${lv.getVisita().getFechavisita()}</td>
						<td>${lv.getVisita().getCiudadvisita()}</td>
						<td>${lv.getVisita().getResumenvisita()}</td>
						<td>${lv.getVisita().getEmpleado().getNombreempleado()}</td>
					</tr>
				</c:forEach>
		</table>
		
		<hr>
		<h3>Reporte de Visitas y Capacitacion</h3>
		<table>
			<tr>
				<th>Id Cliente</th>
				<th>Nombre Cliente</th>
				<th>Direccion Visita </th>
				<th>Fecha visita </th>
				<th>Ciudad visita </th>
				<th>Empleado</th>
				<th>Fecha Capacitacion</th>
				<th>Hora Capacitacion </th>
				<th>Asistentes a Capacitacion</th>
			</tr>
				<c:forEach items="${listavisycap}" var="lvc">
					<tr>
						<td>${lvc.getVisita().getCliente().getIdcliente()}</td> 
						<td>${lvc.getVisita().getCliente().getNombrecliente()}</td>
						<td>${lvc.getVisita().getDireccionvisita()}</td>
						<td>${lvc.getVisita().getFechavisita()}</td>
						<td>${lvc.getVisita().getCiudadvisita()}</td>
						<td>${lvc.getVisita().getEmpleado().getNombreempleado()}</td>
						<td>${lvc.getFechacapacitacion()}</td>
						<td>${lvc.getHoracapacitacion()}</td>
						<td>${lvc.getNumasistcapacitacion()}</td>
					</tr>
				</c:forEach>
		</table>

</body>
</html>