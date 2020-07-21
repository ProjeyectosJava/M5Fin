<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="../listarclientes">Volver</a>
	<hr>
	<h1>Modificar cliente</h1>
	<c:if test="${txt != null}">
		<h3><c:out value="${txt}"></c:out></h3>
	</c:if>
	
	<form:form method="post" action="../editguardar" modelAttribute="cliente">
		<table>
			<tr>
				<td>
					Nombre: 
				</td>
				<td>
					<form:input path="nombrecliente"/><br/>
				</td>
			</tr>
			<tr>
				<td>
					Telefono: 
				</td>
				<td>
					<form:input path="telefonocliente"/><br/>
				</td>
			</tr>
			<tr>
				<td>
					Correo electronico: 
				</td>
				<td>
					<form:input path="emailcliente"/><br/>
				</td>
			</tr>
			<tr>
				<td>
					Rubro: 
				</td>
				<td>
					<form:input path="rubrocliente" /><br/>
				</td>
			</tr>
			<tr>
				<td>
					Direccion: 
				</td>
				<td>
					<form:input path="direccioncliente" /><br/>
					<form:input path="idcliente" readonly="true"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Modificar" />
				</td>
			</tr>
		</table>
	</form:form>

</body>
</html>