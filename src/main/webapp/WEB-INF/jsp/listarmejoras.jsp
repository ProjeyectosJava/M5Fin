<%@ include file="menupro.jsp" %>

	<c:if test="${listamejoras.size() == 0}">
		<h5 class="text-center bg-dark text-white py-2">No hay Actividades de Mejora para Gestionar</h5>
	</c:if>


	<c:if test="${listamejoras.size() > 0}">
	
		<h4 class="text-center bg-dark text-white py-3">Gestionar Actividades de Mejoras</h4>
	
		<!-- Mejora No Iniciada -->
		<div class="container mt-3">
			<h5 class="text-center bg-dark text-danger py-2 mb-0">No Iniciadas</h5>
			<div class="table-responsive-md">
				<table class="table table-danger">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Mejora</th>
							<th scope="col">Nombre Cliente</th>
							<th scope="col">Fecha Mejora</th>
							<th scope="col">Motivo Mejora</th>
							<th scope="col">Actividades Mejora</th>
							<th scope="col">Estado Mejora</th>
							<th scope="col">Actualizar</th>
						</tr>
					</thead>
					<c:forEach items="${listamejoras}" var="lm">
						<tr>
							<c:if test="${lm.getEstadomejora() == 'No Iniciada'}">
								<th scope="row">${lm.getIdmejora()}</th>
								<td>${lm.getCliente().getNombrecliente()}</td>
								<td>${lm.getFechamejora()}</td>
								<td>${lm.getMotivomejora()}</td>
								<td>${lm.getActividadesmejora()}</td>
															 
								<form:form method="post" action="actualizarrmejora" modelAttribute="mejora">
									<td>
										<c:if test="${lc.getEstadomejora() != 'Finalizado'}">
											<form:hidden path="idmejora" value="${lm.getIdmejora()}" />
											<form:hidden path="fechamejora" value="${lm.getFechamejora()}" />
											<form:hidden path="motivomejora" value="${lm.getMotivomejora()}" />
											<form:hidden path="actividadesmejora" value="${lm.getActividadesmejora()}" />
											<form:hidden path="cliente.idcliente" value="${lm.getCliente().getIdcliente()}" />
											<form:select class="form-control-sm text-center" path="estadomejora" >
												<option selected>${lm.getEstadomejora()}</option>
												
												<c:if test="${lm.getEstadomejora() == 'No Iniciada'}">
													<option>En Curso</option>
													<option>Finalizada</option>
												</c:if>
											
												
											</form:select>
										</c:if>	
										<c:if test="${lm.getEstadomejora() == 'Finalizada'}">
											${lm.getEstadochequeo()}
											<form:hidden path="estadomejora" readonly="true"/>
										</c:if>
									</td>
									<td>
										<input type="submit" class="btn-sm btn-danger" value="Actualizar">
									</td>
								</form:form>

							</c:if>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
		
		<!-- Mejora En Curso -->
		<div class="container mt-4">
			<h5 class="text-center bg-dark text-warning py-2 mb-0">En Curso</h5>
			<div class="table-responsive-md">
				<table class="table table-warning">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Mejora</th>
							<th scope="col">Nombre Cliente</th>
							<th scope="col">Fecha Mejora</th>
							<th scope="col">Motivo Mejora</th>
							<th scope="col">Actividades Mejora</th>
							<th scope="col">Estado Mejora</th>
							<th scope="col">Actualizar</th>
						</tr>
					</thead>
					<c:forEach items="${listamejoras}" var="lm">
						<tr>
							<c:if test="${lm.getEstadomejora() == 'En Curso'}">
								<th scope="row">${lm.getIdmejora()}</th>
								<td>${lm.getCliente().getNombrecliente()}</td>
								<td>${lm.getFechamejora()}</td>
								<td>${lm.getMotivomejora()}</td>
								<td>${lm.getActividadesmejora()}</td>
								<form:form method="post" action="actualizarrmejora" modelAttribute="mejora">
									<td>
										<c:if test="${lc.getEstadomejora() != 'Finalizado'}">
											<form:hidden path="idmejora" value="${lm.getIdmejora()}" />
											<form:hidden path="fechamejora" value="${lm.getFechamejora()}" />
											<form:hidden path="motivomejora" value="${lm.getMotivomejora()}" />
											<form:hidden path="actividadesmejora" value="${lm.getActividadesmejora()}" />
											<form:hidden path="cliente.idcliente" value="${lm.getCliente().getIdcliente()}" />
											<form:select class="form-control-sm text-center" path="estadomejora" >
												<option selected>${lm.getEstadomejora()}</option>
												
												<c:if test="${lm.getEstadomejora() == 'En Curso'}">
													<option>No Iniciada</option>
													<option>Finalizada</option>
												</c:if>
											</form:select>
										</c:if>	
										<c:if test="${lm.getEstadomejora() == 'Finalizada'}">
											${lm.getEstadochequeo()}
											<form:hidden path="estadomejora" readonly="true"/>
										</c:if>
									</td>
									<td>
										<input type="submit" class="btn-sm btn-warning" value="Actualizar">
									</td>
								</form:form>
								
							</c:if>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
		
		<!-- Mejora Finalizada -->
		<div class="container mt-4">
			<h5 class="text-center bg-dark text-success py-2 mb-0">Finalizadas</h5>
			<div class="table-responsive-md">
				<table class="table table-success">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Mejora</th>
							<th scope="col">Nombre Cliente</th>
							<th scope="col">Fecha Mejora</th>
							<th scope="col">Motivo Mejora</th>
							<th scope="col">Actividades Mejora</th>
							<th scope="col">Estado Mejora</th>
						</tr>
					</thead>
					<c:forEach items="${listamejoras}" var="lm">
						<tr>
							<c:if test="${lm.getEstadomejora() == 'Finalizada'}">
								<th scope="row">${lm.getIdmejora()}</th>
								<td>${lm.getCliente().getNombrecliente()}</td>
								<td>${lm.getFechamejora()}</td>
								<td>${lm.getMotivomejora()}</td>
								<td>${lm.getActividadesmejora()}</td>
								<td>${lm.getEstadomejora()}</td>
							</c:if>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		
		
		
	</c:if>










<!--  ORIGINAL 
	<c:if test="${listamejoras.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Gestionar Actividades de Mejoras</h4>
	
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
	</c:if>
-->








<%@ include file="footer.jsp" %>
