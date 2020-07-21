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
	<!-- 
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
	 -->

