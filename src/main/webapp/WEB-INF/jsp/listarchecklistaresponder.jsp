<%@ include file="menupro.jsp" %>



<h4 class="text-center bg-dark text-white py-3">Actualizar Checklist</h4>
	<div class="container mt-3">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Visita</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Profesional Asignado</th>
						
					</tr>
				</thead>
					<tr>
						<th scope="row">${listachequeos[0].getVisita().getIdvisita()}</th>
						<td>${listachequeos[0].getVisita().getCliente().getNombrecliente()}</td>
						<td>${listachequeos[0].getVisita().getEmpleado().getNombreempleado()}</td>
					</tr>
			</table>
		</div>
	</div>

	
	
	
	
	<div class="container mt-3">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col" colspan="4">Cheklist</th>
					</tr>
				</thead>
				<c:forEach items="${listachequeos}" var="lc">
					<tr>
						<th scope="row">${lc.getIdchequeo()}</th>
						<th>${lc.getDetallechequeo()}</th>
						<td>${lc.getEstadochequeo()}</td>
						<td>Link para guardar</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>


<c:forEach items="${listachequeos}" var="lc">
		<form:form method="post" action="#" modelAttribute="chequeo1">
			<form:input path="idchequeo"/>
		</form:form>
</c:forEach>

${listachequeos}

<%@ include file="footer.jsp" %>