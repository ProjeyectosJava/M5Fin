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
	
	<c:if test="${listavisitas.size() == 0}">
	<h3>No se ha creado ninguna visita hasta el momento</h3>
	</c:if>
	
	<c:if test="${listavisitas.size() > 0}">
		<br>
		<h2>Listado de visitas generadas</h2>
		<table>
			<tr>
				<th>Id Visita </th>
				<th>Direccion</th>
				<th>Ciudad </th>
				<th>Fecha Visita</th>
				<th>Identificador Cliente</th>
				<th>Empleado Asignado</th>
			</tr>
			<c:forEach items="${listavisitas}" var="lgv">
				<tr>
					<td>${lgv.getIdvisita()}</td>
					<td>${lgv.getDireccionvisita()}</td>
					<td>${lgv.getCiudadvisita()}</td>
					<td>${lgv.getFechavisita()}</td>
					<td>${lgv.getIdclientevisita()}</td>
					<td>${lgv.getIdempleadovisita()}</td>
					<td><a href="generarcapacitacion/${lgv.getIdvisita()}">Generar Capacitacion</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
		
</body>
</html>

