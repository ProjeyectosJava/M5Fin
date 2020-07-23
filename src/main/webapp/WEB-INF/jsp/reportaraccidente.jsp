<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Agregando Accidente</h4>
	<form:form action="guardaraccidente" method="post" modelAttribute="accidente">
	<table>
		<tr>
			<td>
				IdCliente
			</td>
			<td>
			<form:input path="idclienteaccidente"/>
			</td>
		</tr>
		<tr>
			<td>Fecha Accidente</td>
			<td><form:input path="fechaaccidente"/></td>
		</tr>
		<tr>
			<td>Hora Accidente</td>
			<td><form:input path="horaaccidente"/></td>
		</tr>
		<tr>
			<td>Suceso Accidente</td>
			<td><form:input path="sucesoaccidente"/></td>
		</tr>
		<tr>
			<td>Lugar Accidente</td>
			<td><form:input path="lugaraccidente"/></td>
		</tr>
		<tr>
			<td>								  
				<input type="submit" value="Guardar">
			</td>
		</tr>
	</table>
	</form:form>
	
	
	
</body>
</html>