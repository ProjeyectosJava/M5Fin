<%@ include file="menuadmin.jsp" %>


<div class="table-responsive-md">
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Nombre</th>
			<th scope="col">Telefono</th>
			<th scope="col">Correo Electronico</th>
			<th scope="col">Rubro</th>
			<th scope="col">Direccion</th>
			<th scope="col">Editar</th>
			<th scope="col">Eliminar</th>
		</tr>
	</thead>
	<c:forEach var="cli" items="${lclientes}">
		<tr>
			<th scope="row">${cli.getIdcliente()}</th>
			<td>${cli.getNombrecliente()}</td>
			<td>${cli.getTelefonocliente()}</td>
			<td>${cli.getEmailcliente()}</td>
			<td>${cli.getRubrocliente()}</td>
			<td>${cli.getDireccioncliente()}</td>

			<td><a href="editarcliente/${cli.getIdcliente()}">Editar</a></td>
			<td><a href="eliminarcliente/${cli.getIdcliente()}">Eliminar</a></td>

		</tr>
	</c:forEach>
</table>
</div>
<br />

<a href="formcliente" class="btn btn-dark">Agregar Cliente</a>

	
<%@ include file="footer.jsp"%>