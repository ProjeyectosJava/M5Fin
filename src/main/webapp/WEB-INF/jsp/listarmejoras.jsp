<%@ include file="menupro.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Listado Actividad de Mejora</h4>

<div class="container">
	<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id Cliente</th>
					<th scope="col">Nombre Cliente</th>
					<th scope="col">Fecha Mejora</th>
					<th scope="col">Motivo Mejora</th>
					<th scope="col">Actividades Mejora</th>
					<th scope="col">Estado Mejora</th>
				</tr>
			</thead>
			<c:forEach items="${listamejoras}" var="lm">
				<tr>
					<th scope="row">${lm.getCliente().getIdcliente()}</th>
					<td>${lm.getCliente().getNombrecliente()}</td>
					<td>${lm.getFechamejora()}</td>
					<td>${lm.getMotivomejora()}</td>
					<td>${lm.getActividadesmejora()}</td>
					<td>${lm.getEstadomejora()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>

<%@ include file="footer.jsp" %>
