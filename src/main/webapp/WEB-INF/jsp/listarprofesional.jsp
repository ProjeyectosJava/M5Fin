<%@ include file="menuadmin.jsp" %>


	<div class="table-responsive-md">
	<table class="table">
		<thead class="thead-dark">
		<tr>
			<th>Nombre</th>
			<th>Especialidad</th>
		</tr>
		</thead>
		<c:forEach items="${lempleado}" var="emp">
			<tr>
				<td>${emp.getNombreempleado()}</td>
				<td>${emp.getEspecialidadempleado()}</td>
				
					<td><a href="eliminarprofesional/${emp.getIdempleado()}">Eliminar</a></td>
					<td><a href="editarprofesional/${emp.getIdempleado()}">Modificar</a></td>
	
		</c:forEach>
	</table>
	</div>
	<br />
	
	
	<a href="formprofesional" class="btn btn-dark">Agregar Profesional</a>


</body>
</html>