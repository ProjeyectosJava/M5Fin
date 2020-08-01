<%@ include file="menupro.jsp" %>


<h4 class="text-center bg-dark text-white py-3">Actualizar Checklist ID Visita ${listachequeos[0].getVisita().getIdvisita()} del Cliente ${listachequeos[0].getVisita().getCliente().getNombrecliente()}</h4>
<div class="container">
	<div class="container mt-3 px-0">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Visita</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Profesional Asignado</th>
						<th scope="col">Ciudad</th>
						<th scope="col">Resumen</th>
						<th scope="col">Observacion</th>
						
					</tr>
				</thead>
					<tr>
						<th scope="row">${listachequeos[0].getVisita().getIdvisita()}</th>
						<td>${listachequeos[0].getVisita().getCliente().getNombrecliente()}</td>
						<td>${listachequeos[0].getVisita().getEmpleado().getNombreempleado()}</td>
						<td>${listachequeos[0].getVisita().getCiudadvisita()}</td>
						<td>${listachequeos[0].getVisita().getResumenvisita()}</td>
						<td>${listachequeos[0].getVisita().getObservacionvisita()}</td>
					</tr>
			</table>
		</div>
	</div>


	<div class="container mt-3">
		<div class="row justify-content-center align-items-center  text-center">
		<div class="col-md-12 px-0">
			<h5 class=" pl-2 py-2 bg-dark text-white text-left">Checklist</h5>
		</div>
			<div class="col-md-12">
				<c:forEach items="${listachequeos}" var="lc">
				
					<form:form method="post" action="../actualizarchecklist" modelAttribute="chequeo${lc.getIdchequeo()}">
						<div class="form-group row">
						
							<div class="col-md-1  my-auto">
								${lc.getIdchequeo()}
								<form:hidden path="idchequeo"/>
								<form:hidden path="visita.idvisita" readonly="true" size="1"/>
							</div>
							
							<div class="col-md-3  my-auto">
								${lc.getDetallechequeo()}
								<form:hidden path="detallechequeo"/>
							</div>
						
							<div class="col-md-3  align-items-center">
								<c:if test="${lc.getEstadochequeo() != 'Finalizado'}">
									<form:select class="form-control-sm text-center" path="estadochequeo" >
										<option selected>${lc.getEstadochequeo()}</option>
										
										<c:if test="${lc.getEstadochequeo() != 'Iniciado'}">
											<option>Iniciado</option>
										</c:if>
										<c:if test="${lc.getEstadochequeo() == 'Iniciado'}">
											<option>Finalizado</option>
										</c:if>
										
									</form:select>
								</c:if>	
								<c:if test="${lc.getEstadochequeo() == 'Finalizado'}">
									${lc.getEstadochequeo()}
									<form:hidden path="estadochequeo" readonly="true"/>
								</c:if>
													
							</div>
							
							<div class="col-md-3 ">
								<c:if test="${lc.getEstadochequeo() != 'Finalizado'}">
									<input type="submit" class="btn-sm btn-success " value="Actualizar">
								</c:if>  
							</div>
						</div>
					</form:form>
				</c:forEach>
			</div>
		</div>
	</div>

</div>


<%@ include file="footer.jsp" %>