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
	<h2>Formulario asesoria cliente</h2>
	<form:form method="post" action="../guardarasesoria" modelAttribute="regase">
		<table>
			<tr>
				<td>
					Detalle Asesoria
				</td>
				<td> 
					<form:input path="detalleasesoria"/><br> 
				</td>
			</tr>
			<tr>
				<td>
					Gestion Asesoria
				</td>
				<td>
					<form:input path="gestionasesoria"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Propuesta 
				</td>
				<td>
					<form:input path="propuestaasesoria"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Fecha Asesoria 
				</td>
				<td>
					<form:input path="fechaasesoria"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Asesoria Especial 
				</td>
				<td>
					<form:select path="especialasesoria">
						<option>Si</option>
						<option selected>No</option>
					</form:select>			
				</td>
			</tr>		
			<tr>
				<td>
					Id Visita de Asesoria
				</td>
				<td>
					<form:input path="idvisitaasesoria" readonly="true"/><br>
				</td>
			</tr>
			<tr>
			<td colspan="2">
				<input type="submit" value="Guardar">  
			</td>
			</tr>
		</table>
	</form:form>
	</c:if>
</body>
</html>
