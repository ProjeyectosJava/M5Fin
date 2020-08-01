<%@ include file="menuasesorias.jsp" %>

		<h5 class="text-center bg-dark text-white py-2">Gestionar Asesorias Especiales</h5>
		
		<!-- Aseorias Especiales No Iniciadas -->
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
							<th scope="col">Detalle</th>
							<th scope="col">Propuesta</th>
							<th scope="col">Fecha Asesoria</th>
							<th scope="col">Gestionar Asesoria</th>
						</tr>
					</thead>	
					<c:forEach items="${listespecial}" var="lg">
						<c:if test="${lg.getGestionasesoria() == 'No Iniciada' && lg.getEspecialasesoria() == 'Si'}">
							<tr>
								<th scope="row">${lg.getIdasesoria()}</th>
								<td>${lg.getVisita().getIdvisita()}</td>
								<td>${lg.getVisita().getCliente().getNombrecliente()}</td>
								<td>${lg.getVisita().getEmpleado().getNombreempleado()}</td> 	 	 
								<td>${lg.getGestionasesoria()}</td>
								<td>${lg.getEspecialasesoria()}</td>
								<td>${lg.getDetalleasesoria()}</td>
								<td>${lg.getPropuestaasesoria()}</td>
								<td>${lg.getFechaasesoria()}</td>
								<td><a class="btn-sm btn-danger" href="inciarasesoria/${lg.getVisita().getIdvisita()}/${lg.getIdasesoria()}/${lg.getFechaasesoria()}/${lg.getVisita().getCliente().getNombrecliente()}/${lg.getEspecialasesoria()}/${lg.getDetalleasesoria()}/${lg.getPropuestaasesoria()}">Gestioinar</a></td> 	 
							</tr>
						</c:if>
					</c:forEach>
				</table>
			</div>
		</div>
		
		<!-- Aseorias Especiales En Curso -->
		<div class="container mt-4">
			<h5 class="text-center bg-dark text-white py-2 mb-0">En Curso</h5>
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
					<c:forEach items="${listespecial}" var="lg">
						<c:if test="${lg.getGestionasesoria() == 'En Curso' && lg.getEspecialasesoria() == 'Si'}">
							<tr>
								<th scope="row">${lg.getIdasesoria()}</th>
								<td>${lg.getVisita().getIdvisita()}</td>
								<td>${lg.getVisita().getCliente().getNombrecliente()}</td>
								<td>${lg.getVisita().getEmpleado().getNombreempleado()}</td> 	 	 
								<td>${lg.getGestionasesoria()}</td>
								<td>${lg.getEspecialasesoria()}</td>
								<td>${lg.getDetalleasesoria()}</td>
								<td>${lg.getFechaasesoria()}</td>
								<td><a class="btn-sm btn-warning" href="actualizarasesoria/${lg.getIdasesoria()}/${lg.getVisita().getCliente().getNombrecliente()}">Actualizar</a></td> 	 
							</tr>
						</c:if>
					</c:forEach>
				</table>
			</div>
		</div>
		
		
		<!-- Aseorias Especiales Finalizadas -->
		<div class="container mt-4">
			<h5 class="text-center bg-dark text-white py-2 mb-0">Finalizadas</h5>
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
							<th scope="col">Fecha Asesoria</th>
						</tr>
					</thead>	
					<c:forEach items="${listespecial}" var="lg">
						<c:if test="${lg.getGestionasesoria() == 'Finalizada' && lg.getEspecialasesoria() == 'Si'}">
							<tr>
								<th scope="row">${lg.getIdasesoria()}</th>
								<td>${lg.getVisita().getIdvisita()}</td>
								<td>${lg.getVisita().getCliente().getNombrecliente()}</td>
								<td>${lg.getVisita().getEmpleado().getNombreempleado()}</td> 	 	 
								<td>${lg.getGestionasesoria()}</td>
								<td>${lg.getEspecialasesoria()}</td>
								<td>${lg.getDetalleasesoria()}</td>
								<td>${lg.getFechaasesoria()}</td>
							</tr>
						</c:if>
					</c:forEach>
				</table>
			</div>
		</div>		
		
		

<%@ include file="footer.jsp"%>