<%@ include file="menupro.jsp" %>


<div class="table-responsive-md">
<h4 class="text-center bg-dark text-white py-3">Listado Accidentes reportados</h4>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Id Accidente</th>
				<th scope="col">Id Cliente</th>
				<th scope="col">Nombre Cliente</th>
				<th scope="col">Fecha accidente</th>
				<th scope="col">Hora accidente</th>
				<th scope="col">Lugar Accidente</th>
				<th scope="col">Suseso Accidente</th>
			</tr>
		</thead>
		<c:forEach items="${listaaccidentes}" var="la">
			<tr>
				<th scope="row">${la.getIdaccidente()}</th>
				<td>${la.getCliente().getIdcliente()}</td>
				<td>${la.getCliente().getNombrecliente()}</td>
				<td>${la.getFechaaccidente()}</td>
				<td>${la.getHoraaccidente()}</td>
				<td>${la.getLugaraccidente()}</td>
				<td>${la.getSucesoaccidente()}</td>
				
			</tr>
		</c:forEach>

	</table>
	<div>
	
	<p>Total de accidentes reportados:${listaaccidentes.size()} </p>
	</div>
</div>

<%@ include file="footer.jsp" %>
