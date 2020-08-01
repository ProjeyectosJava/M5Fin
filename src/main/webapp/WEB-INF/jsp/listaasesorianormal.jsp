<%@ include file="menuasesorias.jsp" %>

	<c:if test="${lasesorias.size() == 0}">
		<h5 class="text-center bg-dark text-white py-2">No existen Asesorias para Gestionar</h5>
	</c:if>
	
	<c:if test="${lasesorias.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2">Gestionar Asesorias Normales</h5>
		
		<!-- Aseorias No Iniciadas -->
		<div class="container mt-3">
			<h5 class="text-center bg-dark text-white py-2 mb-0">No Iniciadas</h5>
			<div class="table-responsive-md">
				<table class="table table-danger">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Asesoria</th>
							<th scope="col">Id Visita</th>
							<th scope="col">Cliente</th>
							<th scope="col">Profesional Asignado</th>
							<th scope="col">Gestion Asesoria</th>
							<th scope="col">Asesoria Especial</th>
							<th scope="col">Fecha Asesoria</th>
							<th scope="col">Gestionar Asesoria</th>
						</tr>
					</thead>	
					<c:forEach items="${lasesorias}" var="lg">
						<tr>
							<c:if test="${lg.getEspecialasesoria() == 'No' && lg.getGestionasesoria() == 'No Iniciada' }">
								<th scope="row">${lg.getIdasesoria()}</th>
								<td>${lg.getVisita().getIdvisita()}</td>
								<td>${lg.getVisita().getCliente().getNombrecliente()}</td>
								<td>${lg.getVisita().getEmpleado().getNombreempleado()}</td> 	 	 
								<td>${lg.getGestionasesoria()}</td>
								<td>${lg.getEspecialasesoria()}</td>
								<td>${lg.getFechaasesoria()}</td>
								<td><a class="btn-sm btn-danger" href="inciarasesorianormal/${lg.getVisita().getIdvisita()}/${lg.getIdasesoria()}/${lg.getFechaasesoria()}/${lg.getVisita().getCliente().getNombrecliente()}/${lg.getEspecialasesoria()}">Gestionar</a></td> 	 
							</c:if>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
		<!-- Asesorias Normales En Curso -->
		<div class="container mt-4">
			<h5 class="text-center bg-dark text-white py-3 mb-0">En Curso</h5>
			<div class="table-responsive-md">
				<table class="table table-warning">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Asesoria</th>
							<th scope="col">Id Visita</th>
							<th scope="col">Cliente</th>
							<th scope="col">Profesional Asignado</th>
							<th scope="col">Gestion Asesoria</th>
							<th scope="col">Asesoria Especial</th>
							<th scope="col">Detalle Asesoria</th>
							<th scope="col">Propuesta Asesoria</th>
							<th scope="col">Fecha Asesoria</th>
							<th scope="col">Actualizar</th>
						</tr>
					</thead>	
					<c:forEach items="${lasesorias}" var="lg">
						<tr>
							<c:if test="${lg.getEspecialasesoria() == 'No' && lg.getGestionasesoria() == 'En Curso' }">
								<th scope="row">${lg.getIdasesoria()}</th>
								<td>${lg.getVisita().getIdvisita()}</td>
								<td>${lg.getVisita().getCliente().getNombrecliente()}</td>
								<td>${lg.getVisita().getEmpleado().getNombreempleado()}</td> 	 
								<td>${lg.getGestionasesoria()}</td>
								<td>${lg.getEspecialasesoria()}</td>
							 	<td>${lg.getDetalleasesoria()}</td>
								<td>${lg.getPropuestaasesoria()}</td> 
								<td>${lg.getFechaasesoria()}</td>
								<td><a class="btn-sm btn-warning" href="actualizarasesoria/${lg.getIdasesoria()}/${lg.getVisita().getCliente().getNombrecliente()}">
										Actualizar
									</a>
								</td>
							</c:if>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
		<!-- Asesorias Finalizadas -->
		<div class="container mt-4">
			<h5 class="text-center bg-dark text-white py-3 mb-0">Finalizada</h5>
			<div class="table-responsive-md">
				<table class="table table-success">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Asesoria</th>
							<th scope="col">Id Visita</th>
							<th scope="col">Cliente</th>
							<th scope="col">Profesional Asignado</th>
							<th scope="col">Gestion Asesoria</th>
							<th scope="col">Asesoria Especial</th>
							<th scope="col">Detalle Asesoria</th>
							<th scope="col">Propuesta Asesoria</th>
							<th scope="col">Fecha Asesoria</th>
						</tr>
					</thead>	
					<c:forEach items="${lasesorias}" var="lg">
						<tr>
							<c:if test="${lg.getEspecialasesoria() == 'No' && lg.getGestionasesoria() == 'Finalizada' }">
								<th scope="row">${lg.getIdasesoria()}</th>
								<td>${lg.getVisita().getIdvisita()}</td>
								<td>${lg.getVisita().getCliente().getNombrecliente()}</td>
								<td>${lg.getVisita().getEmpleado().getNombreempleado()}</td> 	 
								<td>${lg.getGestionasesoria()}</td>
								<td>${lg.getEspecialasesoria()}</td>
							 	<td>${lg.getDetalleasesoria()}</td>
								<td>${lg.getPropuestaasesoria()}</td> 
								<td>${lg.getFechaasesoria()}</td>
							</c:if>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</c:if>
		
		




	

<%@ include file="footer.jsp"%>