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
	<a href="index.jsp">Menu Principal</a>
	<hr>
	<h2>Reportar Accidente</h2>	
	
	<c:if test="${agregado == null}">
	
	<c:if test="${ccmensaje != null}">
		<h4>
			<c:out value="${ccmensaje}"></c:out> 
			<c:if test="${idtrue == false }"><a href="${urlrc}">Revisar Clientes</a></c:if>
		</h4>
	</c:if>
	
	<c:if test="${idtrue == null}">
		<form action="buscacliente" method="post">
		Ingrese Id Cliente 
		<input type="number" name="idcli" required>
		<input type="submit" value="Revisar">
		</form>
	</c:if>
	
	<c:if test="${idtrue == false}">
		<form action="buscacliente" method="post">
		Ingrese Id Cliente 
		<input type="number" name="idcli" required>
		<input type="submit" value="Revisar">
		</form>
	</c:if>
	
	<c:if test="${idtrue != null}">
		<c:if test="${idtrue == true }">
			<form:form action="agregaraccidente" method="post" modelAttribute="accidente">
			<table>
				<tr>
					<td>Fecha Accidente</td>
					<td><form:input path="fechaAccidente"/></td>
				</tr>
				<tr>
					<td>Hora Accidente</td>
					<td><form:input path="horaAccidente"/></td>
				</tr>
				<tr>
					<td>Suceso Accidente</td>
					<td><form:input path="sucesoAccidente"/></td>
				</tr>
				<tr>
					<td>Lugar Accidente</td>
					<td><form:input path="lugarAccidente"/></td>
				</tr>
				<tr>
					<td>
						<form:input path="clienteIdAcciedente" readonly="true"/>
										  
						<input type="submit" value="ingresar accidente">
					</td>
				</tr>
			</table>
			</form:form>
		</c:if>
	</c:if>

	</c:if>
	
	<c:if test="${agregado != null}">
		<c:if test="${agregado == 1}">
			<h3>Accidente agregado exitosamente</h3>
		</c:if>	
		<c:if test="${agregado != 1}">
			<h3>No fue posible cursar la solicitud</h3>
		</c:if>
	</c:if>
	
	
</body>
</html>