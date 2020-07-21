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
<h4>Administrar Clientes</h4>
<c:if test="${txt != null}">
	<h4>
		<c:out value="${txt}"></c:out>
	</h4>
</c:if>

<!-- border="2" width="70%" cellpadding="2" -->
	<table>
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Telefono</th>
			<th>Email</th>
			<th>Rubro</th>
			<th>Direccion</th>
		</tr>
		<c:forEach items="${lclientes}" var="cli">
			<tr>
				<td>${cli.getIdcliente()}</td>
				<td>${cli.getNombrecliente()}</td>
				<td>${cli.getTelefonocliente()}</td>
				<td>${cli.getEmailcliente()}</td>
				<td>${cli.getRubrocliente()}</td>
				<td>${cli.getDireccioncliente()}</td>
				<td>
				<c:if test="${txt == null}">
					<a href="eliminarcliente/${cli.getIdcliente()}">Eliminar</a>
				</c:if>
				<c:if test="${txt != null}">
					<a href="../eliminarcliente/${cli.getIdcliente()}">Eliminar</a>
				</c:if>
				</td>
				<td>
				<c:if test="${txt == null}">
					<a href="editarcliente/${cli.getIdcliente()}">Modificar</a>
				</c:if>
				<c:if test="${txt != null}">
					<a href="../editarcliente/${cli.getIdcliente()}">Modificar</a>
				</c:if>
				</td>
			</tr>
		</c:forEach>
	</table>
<br>
<c:if test="${txt == null}">
	<a href="formcliente">Agregar Cliente</a>
</c:if>
<c:if test="${txt != null}">
	<a href="../formcliente">Agregar Cliente</a>
</c:if>
</body>
</html>