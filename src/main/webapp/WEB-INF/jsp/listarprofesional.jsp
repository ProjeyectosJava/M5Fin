<%@ include file="menuadmin.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Administrando Profesionales</h4>
<div class="container">
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
					<td><a class="btn-sm btn-warning" href="editarprofesional/${emp.getIdempleado()}">Editar</a></td>
					<td><a class="btn-sm btn-danger" href="eliminarprofesional/${emp.getIdempleado()}">Eliminar</a></td>
			</c:forEach>
		</table>
	</div>
	<br>
	<a href="formprofesional" class="btn btn-success">Agregar Profesional</a>
</div>

<%@ include file="footer.jsp"%>