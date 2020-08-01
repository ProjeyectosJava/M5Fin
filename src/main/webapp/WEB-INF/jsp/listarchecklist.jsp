<%@ include file="menupro.jsp" %>



<h4 class="text-center bg-dark text-white py-3">Seleccionar Visita</h4>
	<div class="container mt-3">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Visita</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Nombre Empleado</th>
						<th scope="col">Responder Checklist</th>
					</tr>
				</thead>
				<c:forEach items="${listachequeos}" var="lc">
					<tr>
						<th scope="row">${lc.getVisita().getIdvisita()}</th>
						<td>${lc.getVisita().getCliente().getNombrecliente()}</td>
						<td>${lc.getVisita().getEmpleado().getNombreempleado()}</td>
						<td><a class="btn-sm btn-info" href="mostrarchecklist/${lc.getVisita().getIdvisita()}">Responder</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>



<%@ include file="footer.jsp" %>