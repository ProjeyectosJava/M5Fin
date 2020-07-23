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
	<h1>Ingresar Mejoras</h1>	
	<c:if test="${txt != null}">
	<h3><c:out value="${txt}"></c:out></h3>
</c:if>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Telefono</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${lclientes}" var="cli">
			<tr>
				<td>${cli.getNombrecliente()}</td>
				<td>${cli.getTelefonocliente()}</td>
				<td>${cli.getEmailcliente()}</td>
				<td><a href="gestionarmejora/${cli.getIdcliente()}/${cli.getNombrecliente()}">Gestionar Mejora</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br>
</body>
</html>