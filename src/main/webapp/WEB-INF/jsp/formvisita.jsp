<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="../../planificarvisita">Volver</a>
	<hr>
	<h1>Generar Visita Cliente ${ncliente}</h1>
	<c:if test="${ccmensaje != null}">
		<h3><c:out value="${ccmensaje}"></c:out></h3>
	</c:if>
	<%-- <form:form method="post" action="generarvisita" modelAttribute="creavisita">
		<form:input path="fechaVisita"/>
	
	</form:form> 
	aqui: ${visita.idClienteVisita}, ${visita.fechaVisita}
	--%>
	<form:form method="post" action="../../guardarvisita"  modelAttribute="creavisita">
		<table>
			<tr>
				<td>
					Fecha de Visita: 
				</td>
				<td>
					<form:input path="fechavisita"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Ciudad: 
				</td>
				<td>
					<form:input path="ciudadvisita"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Direccion: 
				</td>
				<td>
					<form:input path="direccionvisita"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Observaciones: 
				</td>
				<td>
					<form:input path="observacionvisita"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Resumen: 
				</td>
				<td>
					<form:input path="resumenvisita"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Empleado: 
				</td>
				<td>
					<form:select path="idempleadovisita">
						<form:options items="${listaemp}" itemLabel="nombreempleado"  itemValue="idempleado"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>
					IdClienteVisita: 
				</td>
				<td>
					<form:input path="idclientevisita" readonly="true"/><br>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Generar visita" />
				</td>
			</tr>
		</table>
		<br>
	
	</form:form>

</body>
</html>