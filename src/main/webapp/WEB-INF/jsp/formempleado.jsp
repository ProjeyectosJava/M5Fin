<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- tag de Spring -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="listarempleados">Volver</a>
	<hr>
	<h1>Agregar empleado</h1>
	<c:if test="${ccmensaje != null}">
		<h3><c:out value="${ccmensaje}"></c:out></h3>
	</c:if>
	
	<c:if test="${ccmensaje == null}">
		<form:form method="post" action="guardarempleado">
			<table>
				<tr>
					<td>
						Nombre: 
					</td>
					<td>
						<form:input path="nombreEmpleado"/><br>
					</td>
				</tr>
				<tr>
					<td>
						Especialidad: 
					</td>
					<td>
						<form:input path="especialidadEmpleado"/><br>
						<form:hidden path="idEmpleado"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Agregar Empleado">
					</td>
				</tr>
			</table>
		</form:form>
	</c:if>
</body>
</html>