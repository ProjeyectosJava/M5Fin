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
	<c:if test="${msg != null}">
	<h3><c:out value="${msg}"></c:out></h3>
	</c:if>
	
	<c:if test="${listavisitasase.size() == 0}">
	<h3>No se ha creado ninguna visita hasta el momento</h3>
	</c:if>
	
	<c:if test="${listavisitasase.size() > 0}">
		<br>
		<h2>Listado de Visitas para Asesorias </h2>
		<table>
			<tr>
				<th>Id Visita </th>
				<th>Direccion</th>
				<th>Ciudad </th>
				<th>Fecha Visita</th>
				<th>Identificador Cliente</th>
				<th>Nombre Cliente</th>
				<th>Empleado Asignado</th>
				<th>Nombre Empleado</th>
			</tr>
			<c:forEach items="${listavisitasase}" var="lgv">
				<tr>
					<td>${lgv.getIdvisita()}</td>
					<td>${lgv.getDireccionvisita()}</td>
					<td>${lgv.getCiudadvisita()}</td>
					<td>${lgv.getFechavisita()}</td>
					
					<td>${lgv.cliente.idcliente}</td>
					<td>${lgv.cliente.nombrecliente}</td>
					<td>${lgv.empleado.idempleado}</td>
					<td>${lgv.empleado.nombreempleado}</td>
					<td><a href="generarasesoria/${lgv.getIdvisita()}">Generar Asesoria</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	
	<br>
	<c:if test="${lasesorias.size() == 0}">
	<h4 class="text-center bg-dark text-white py-3">No existen Asesorias</h4>
	</c:if>
	
	<c:if test="${lasesorias.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Asesorias Generadas</h4>
		<div class="container mt-3">
		<div class="table-responsive-md">
		<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">id Asesoria</th>
				<th scope="col">Detalle Asesoria</th>
				<th scope="col">Gestion Asesoria</th>
				<th scope="col">Propuesta Asesoria</th>
				<th scope="col">Fecha Asesoria</th>
				<th scope="col">Asesoria Especial</th>
				<th scope="col">Id Visita</th>

					
			</tr>
		</thead>	
		<c:forEach items="${lasesorias}" var="lg">
			<tr>
					<td>${lg.getIdasesoria()}</td>
				 	<td>${lg.getDetalleasesoria()}</td>
					<td>${lg.getGestionasesoria()}</td>
					<td>${lg.getPropuestaasesoria()}</td> 
					<td>${lg.getFechaasesoria()}</td>
					<td>${lg.getEspecialasesoria()}</td>
					<td>${lg.getIdvisitaasesoria()}</td> 	 
			</tr>
		</c:forEach>
		</table>
		</div>
		</div>
	</c:if>
	
	
	
		
</body>
</html>


<%@ include file="footer.jsp"%>