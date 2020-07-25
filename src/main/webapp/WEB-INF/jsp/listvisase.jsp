<%@ include file="menucli.jsp" %>

	<c:if test="${listavisitas.size() == 0}">
		<h4 class="text-center bg-dark text-white py-3">No se ha creado ninguna visita hasta el momento</h4>
	</c:if>
		
	<c:if test="${listavisitasase.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Listado de Visitas para Asesorias</h4>
		<div class="container mt-3">
			<div class="table-responsive-md">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Visita </th>
							<th scope="col">Direccion</th>
							<th scope="col">Ciudad </th>
							<th scope="col">Fecha Visita</th>
							<th scope="col">Identificador Cliente</th>
							<th scope="col">Nombre Cliente</th>
							<th scope="col">Empleado Asignado</th>
							<th scope="col">Nombre Empleado</th>
							<th scope="col">Crear Asesoria</th>
						</tr>
					</thead>
					<c:forEach items="${listavisitasase}" var="lgv">
						<tr>
							<th scope="row">${lgv.getIdvisita()}</th>
							<td>${lgv.getDireccionvisita()}</td>
							<td>${lgv.getCiudadvisita()}</td>
							<td>${lgv.getFechavisita()}</td>
							<td>${lgv.cliente.idcliente}</td>
							<td>${lgv.cliente.nombrecliente}</td>
							<td>${lgv.empleado.idempleado}</td>
							<td>${lgv.empleado.nombreempleado}</td>
							<td><a href="generarasesoria/${lgv.getIdvisita()}/${lgv.cliente.nombrecliente}">Generar Asesoria</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</c:if>
	
	
	<br>
	<c:if test="${lasesorias.size() == 0}">
	<h4 class="text-center bg-dark text-white py-3">No existen Asesorias</h4>
	</c:if>
	
	<c:if test="${lasesorias.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Asesorias Generadas</h4>
		<div class="container mt-3">
			<div class="table-responsive-md">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">id Asesoria</th>
							<th scope="col">Detalle Asesoria</th>
							<th scope="col">Gestion Asesoria</th>
							<th scope="col">Propuesta Asesoria</th>
							<th scope="col">Fecha Asesoria</th>
							<th scope="col">Asesoria Especial</th>
							<th scope="col">Id Visita</th>
						</tr>
					</thead>	
					<c:forEach items="${lasesorias}" var="lg">
						<tr>
							<th scope="row">${lg.getIdasesoria()}</th>
						 	<td>${lg.getDetalleasesoria()}</td>
							<td>${lg.getGestionasesoria()}</td>
							<td>${lg.getPropuestaasesoria()}</td> 
							<td>${lg.getFechaasesoria()}</td>
							<td>${lg.getEspecialasesoria()}</td>
							<td>${lg.getVisita().getIdvisita()}</td> 	 
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</c:if>

<%@ include file="footer.jsp"%>