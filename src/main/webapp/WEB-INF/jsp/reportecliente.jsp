<%@ include file="menuadmin.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Reportes por Cliente</h4>
<div class="container">
	<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Reporte</th>
				</tr>
			</thead>
			<c:forEach var="cli" items="${listacliente}">
				<tr>
					<th scope="row">${cli.getIdcliente()}</th>
					<td>${cli.getNombrecliente()}</td>
					<td><a href="listarreporte/${cli.getIdcliente()}/${cli.getNombrecliente()}">Listar</a></td>
		
				</tr>
			</c:forEach>
		</table>
</div>
</div>
	
<%@ include file="footer.jsp" %>