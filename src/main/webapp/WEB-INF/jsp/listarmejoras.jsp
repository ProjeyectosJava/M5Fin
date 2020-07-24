<%@ include file="menupro.jsp" %>


<div class="table-responsive-md">
<h4 class="text-center bg-dark text-white py-3">Listado Actividad de Mejora</h4>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Fecha Mejora</th>
				<th scope="col">Id Cliente</th>
				<th scope="col">Motivo Mejora</th>
				<th scope="col">Actividades Mejora</th>
				<th scope="col">Estado Mejora</th>
			</tr>
		</thead>
		<c:forEach items="${listamejoras}" var="lm">
			<tr>
				<th scope="row">${lm.getIdclientemejora()}</th>
				<td>${lm.getFechamejora()}</td>
				<td>${lm.getMotivomejora()}</td>
				<td>${lm.getActividadesmejora()}</td>
				<td>${lm.getEstadomejora()}</td>
			</tr>
		</c:forEach>
	</table>
</div>

<%@ include file="footer.jsp" %>
