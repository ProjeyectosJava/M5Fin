<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${msg == null}">
		<a href="../index.jsp">Menu Principal</a>
	</c:if>

	<c:if test="${msg != null}">
		<a href="index.jsp">Menu Principal</a>
	</c:if>
	<hr>
	<c:if test="${msg != null}">
		<h3><c:out value="${msg}"></c:out></h3>
	</c:if>

	<br>
	<c:if test="${msg == null}">
	<h2>Creacion de Capacitacion para cliente</h2>
	<form:form method="post" action="../crearcapacitacion">
		<table>
			<tr>
				<td>
					Fecha Capacitacion
				</td>
				<td> 
					<form:input path="fechaCapacitacion"/><br> 
				</td>
			</tr>
			<tr>
				<td>
					Hora Capacitacion 
				</td>
				<td>
					<form:input path="horaCapacitacion"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Numero asistente capacitacion
				</td>
				<td>
					<form:input path="numAsistCapacitacion"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Id visita
				</td>
				<td>
					<form:input path="idVisitaCapacitacion" readonly="true"/><br>
				</td>
			</tr>
			<tr>
			<td colspan="2">
				<input type="submit" value="Enviar Capacitacion">  
			</td>
			</tr>
		</table>
	</form:form>
	</c:if>
</body>
</html>