<%@ include file="menupro.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Ingresar Actividad de Mejora</h4>
<div class="container">
	<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Nombre</th>
					<th scope="col">Telefono</th>
					<th scope="col">Email</th>
					<th scope="col">Crear Mejora</th>
				</tr>
			</thead>
				<c:forEach items="${lclientes}" var="cli">
					<tr>
						<th scope="row">${cli.getNombrecliente()}</th>
						<td>${cli.getTelefonocliente()}</td>
						<td>${cli.getEmailcliente()}</td>
						<td><a class="btn btn-dark" href="gestionarmejora/${cli.getIdcliente()}/${cli.getNombrecliente()}">Crear</a>
						</td>
					</tr>
				</c:forEach>
	</table>
</div>
</div>

<%@ include file="footer.jsp" %>