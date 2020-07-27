<%@ include file="menupro.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Revision de Clientes</h4>

<div class="container">
	<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">ID Cliente</th>
					<th scope="col">Nombre</th>
					<th scope="col">Telefono</th>
					<th scope="col">Email</th>
					<th scope="col">Rubro</th>
					<th scope="col">Direccion</th>
				</tr>
			</thead>
			<c:forEach items="${listaclientes}" var="cli">
				<tr>
		   			<th scope="row">${cli.getIdcliente()}</th>
					<td>${cli.getNombrecliente()}</td>
					<td>${cli.getTelefonocliente()}</td>
					<td>${cli.getEmailcliente()}</td>
					<td>${cli.getRubrocliente()}</td>
					<td>${cli.getDireccioncliente()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>

<%@ include file="footer.jsp"%>