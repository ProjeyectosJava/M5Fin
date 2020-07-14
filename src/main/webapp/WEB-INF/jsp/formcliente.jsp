
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="listarclientes">Volver</a>
	<hr>
	<h1>Agregar cliente</h1>
	<c:if test="${ccmensaje != null}">
		<h3><c:out value="${ccmensaje}"></c:out></h3>
	</c:if>
	
	<!--<c:if test="${ccmensaje == null}">-->
		<form:form method="post" action="guardar">
		<table>
			<tr>
				<td>
					Nombre
				</td>
				<td>
					<form:input path="nombreCliente" /><br/>
				</td>
			</tr>
			<tr>
				<td>
					Telefono: 
				</td>
				<td>
					<form:input path="telefonoCliente" /><br/>						
				</td>
			</tr>
			<tr>
				<td>
					Correo electronico: 
				</td>
				<td>
					<form:input path="emailCliente" /><br/>
				</td>
			</tr>		
			<tr>
				<td>
					Rubro: 
				</td>
				<td>
					<form:input path="rubroCliente" /><br/>
				</td>
			</tr>
			<tr>
				<td>
					Direccion: 
				</td>
				<td>
					<form:input path="direccionCliente" /><br/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Agregar cliente" />
				</td>
			</tr>
		</table>
		</form:form>
	<!--</c:if>-->

</body>
</html>