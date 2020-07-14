<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${txt == null}">
		<a href="index.jsp">Menu Principal</a>
	</c:if>
	<c:if test="${txt != null}">
		<a href="../index.jsp">Menu Principal</a>
	</c:if>
	<hr>
	<h1>Administrar Empleados (Agregar/Modificar/Eliminar)</h1>	
	<c:if test="${txt != null}">
		<h4><c:out value="${txt}"></c:out></h4>
	</c:if>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Especialidad</th>
		</tr>
		<c:forEach items="${list}" var="emp">
			<tr>
				<td>${emp.getNombreEmpleado()}</td>
				<td>${emp.getEspecialidadEmpleado()}</td>
				<c:if test="${txt == null}">
					<td><a href="eliminarempleado/${emp.getIdEmpleado()}">Eliminar</a></td>
					<td><a href="editarempleado/${emp.getIdEmpleado()}">Modificar</a></td>
				</c:if>
				<c:if test="${txt != null}">
					<td><a href="../eliminarempleado/${emp.getIdEmpleado()}">Eliminar</a></td>
					<td><a href="../editarempleado/${emp.getIdEmpleado()}">Modificar</a></td>
				</c:if>
		</c:forEach>
	</table>
	<br>
	<c:if test="${txt == null}">
		<a href="formempleado">Agregar Empleado</a>
	</c:if>
	<c:if test="${txt != null}">
		<a href="../formempleado">Agregar Empleado</a>
	</c:if>
	
</body>
</html>