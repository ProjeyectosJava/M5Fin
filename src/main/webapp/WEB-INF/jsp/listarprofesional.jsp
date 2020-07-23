<%@ include file="menuadmin.jsp" %>


<div class="table-responsive-md">
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Nombre</th>
			<th scope="col">Especialidad</th>
			<th scope="col">Editar</th>
			<th scope="col">Eliminar</th>
		</tr>
	</thead>
	<c:forEach items="${lempleado}" var="emp">
		<tr>
			<th scope="row">${emp.getNombreempleado()}</th>
			<td>${emp.getEspecialidadempleado()}</td>
			<td><a href="editarprofesional/${emp.getIdempleado()}">Editar</a></td>
			<td><a href="eliminarprofesional/${emp.getIdempleado()}">Eliminar</a></td>
	</c:forEach>
</table>
</div>
<br />

<a href="formprofesional" class="btn btn-dark">Agregar Profesional</a>


</body>
</html>