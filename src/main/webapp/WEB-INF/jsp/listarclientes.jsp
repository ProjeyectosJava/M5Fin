<%@ include file="../../header.jsp"%>
<c:if test="${txt == null}">
	<a href="index.jsp">Menu Principal</a>
</c:if>
<c:if test="${txt != null}">
	<a href="../index.jsp">Menu Principal</a>
</c:if>
<hr>
<h1>Administrar Clientes (Agregar/Modificar/Eliminar)</h1>
<c:if test="${txt != null}">
	<h4>
		<c:out value="${txt}"></c:out>
	</h4>
</c:if>
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Nombre</th>
			<th scope="col">Teléfono</th>
			<th scope="col">Correo Electrónico</th>
			<th scope="col">Rubro</th>
			<th scope="col">Dirección</th>
			<th scope="col">Editar</th>
			<th scope="col">Eliminar</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="cli" items="${list}">
			<tr>
				<td scope="row">${cli.idCliente}</td>
				<td>${cli.nombreCliente}</td>
				<td>${cli.telefonoCliente}</td>
				<td>${cli.emailCliente}</td>
				<td>${cli.rubroCliente}</td>
				<td>${cli.direccionCliente}</td>


				<c:if test="${txt ==null}">
					<td><a href="editarcliente/${cli.idCliente}">Editar</a></td>
					<td><a href="eliminarcliente/${cli.idCliente}">Eliminar</a></td>
				</c:if>
				<c:if test="${txt !=null}">
					<td><a href="../editarcliente/${cli.idCliente}">Editar</a></td>
					<td><a href="../eliminarcliente/${cli.idCliente}">Eliminar</a></td>
				</c:if>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br>
<c:if test="${txt == null}">
	<a type="button" class="btn btn-primary" href="formcliente">Agregar
		Cliente</a>
</c:if>
<c:if test="${txt != null}">
	<a type="button" class="btn btn-primary" class="stretched-link"
		href="../formcliente">Agregar Cliente</a>
</c:if>
<!-- border="2" width="70%" cellpadding="2" 
	<table>
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Telefono</th>
			<th>Email</th>
			<th>Rubro</th>
			<th>Direccion</th>
		</tr>
		<c:forEach items="${list}" var="cli">
			<tr>
				<td>${cli.getIdCliente()}</td>
				<td>${cli.getNombreCliente()}</td>
				<td>${cli.getTelefonoCliente()}</td>
				<td>${cli.getEmailCliente()}</td>
				<td>${cli.getRubroCliente()}</td>
				<td>${cli.getDireccionCliente()}</td>
				<td>
				<c:if test="${txt == null}">
					<a href="eliminarcliente/${cli.getIdCliente()}">Eliminar</a>
				</c:if>
				<c:if test="${txt != null}">
					<a href="../eliminarcliente/${cli.getIdCliente()}">Eliminar</a>
				</c:if>
				</td>
				<td>
				<c:if test="${txt == null}">
					<a href="editarcliente/${cli.getIdCliente()}">Modificar</a>
				</c:if>
				<c:if test="${txt != null}">
					<a href="../editarcliente/${cli.getIdCliente()}">Modificar</a>
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
</body>
</html>