
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ccmensaje == null}">
		<a href="../../lpmclientes">Volver</a>
	</c:if>
	<c:if test="${ccmensaje != null}">
		<a href=" lpmclientes">Volver</a>
	</c:if>
	<hr>
	<c:if test="${ccmensaje == null}">
		<h1>Ingresar Mejora para ${ncliente}</h1>
	</c:if>
	<c:if test="${ccmensaje != null}">
		<h3><c:out value="${ccmensaje}"></c:out></h3>
	</c:if>
	
	<c:if test="${ccmensaje == null}">
		<form:form method="post" action="../../agregarmejora">
		<table>
			<tr>
				<td>
					Fecha:
				</td>
				<td>
					<form:input path="fechaMejora"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Motivo: 
				</td>
				<td>
					<form:input path="motivoMejora" /><br/>						
				</td>
			</tr>
			<tr>
				<td>
					Actividad: 
				</td>
				<td>
					<form:input path="actividadesMejora" /><br/>
				</td>
			</tr>		
			<tr>
				<td>
					Estado: 
				</td>
				<td>
					<form:select path="estadoMejora">
						<option>En Curso</option>
						<option>Pendiente</option>
						<option>Finalizada</option>
						<option>No Iniciada</option>
					</form:select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<form:input path="idClienteMejora" readonly="true"/>
				</td>
			<tr>
				<td>
					<input type="submit" value="Ingresar Mejora" />
				</td>
			</tr>
		</table>
		</form:form>
	</c:if>

</body>
</html>