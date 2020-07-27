<%@ include file="menuadmin.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Reportes del cliente ${ncliente}</h4>

<div class="container">
	<c:if test="${listamejoras.size() == 0}">
	<h5 class="text-center bg-secondary text-white-50 py-2">No contiene reportes de mejora</h5>
	</c:if>
	
	<c:if test="${listamejoras.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0">Reporte de Mejoras</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Nombre </th>
						<th scope="col">Rubro</th>
						<th scope="col">Fecha</th>
						<th scope="col">Motivo</th>
						<th scope="col">Estado</th>
					</tr>
				</thead>
				<c:forEach items="${listamejoras}" var="lm">
					<tr>
						<th scope="row">${lm.getCliente().getNombrecliente()}</th>
						<td>${lm.getCliente().getRubrocliente()}</td>
						<td>${lm.getFechamejora()}</td>
						<td>${lm.getMotivomejora()}</td>
						<td>${lm.getEstadomejora()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>
</div>

<div class="container">
	<c:if test="${listaaccidentes.size() == 0}">
		<h5 class="text-center bg-secondary text-white-50 py-2 mt-5">No contiene reportes de accidentes</h5>
	</c:if>
	
	<c:if test="${listaaccidentes.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0 mt-5">Reporte de Accidentes</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<!-- <th>Id </th> -->
						<th scope="col">Nombre </th>
						<th scope="col">Rubro</th>
						<th scope="col">Fecha</th>
						<th scope="col">Hora</th>
						<th scope="col">Suceso</th>
						<th scope="col">Lugar</th>
					</tr>
				</thead>
				<c:forEach items="${listaaccidentes}" var="la">
					<tr>
						<th scope="row">${la.getCliente().getNombrecliente()}</th>
						<td>${la.getCliente().getRubrocliente()}</td>
						<td>${la.getFechaaccidente()}</td>
						<td>${la.getHoraaccidente()}</td>
						<td>${la.getSucesoaccidente()}</td>
						<td>${la.getLugaraccidente()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>
</div>

<div class="container">
	<c:if test="${listavisitas.size() == 0}">
		<h5 class="text-center bg-secondary text-white-50 py-2 mt-5">No contiene reportes de visitas</h5>
	</c:if>
	
	<c:if test="${listavisitas.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0 mt-5">Reporte de Visitas</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Nombre </th>
						<th scope="col">Rubro</th>
						<th scope="col">Direccion</th>
						<th scope="col">Fecha</th>
						<th scope="col">Ciudad</th>
						<th scope="col">Resumen</th>
						<th scope="col">Empleado</th>
					</tr>
				</thead>
				<c:forEach items="${listavisitas}" var="lv">
					<tr>
						<th scope="row">${lv.getCliente().getNombrecliente()}</th>
						<td>${lv.getCliente().getRubrocliente()}</td>
						<td>${lv.getDireccionvisita()}</td>
						<td>${lv.getFechavisita()}</td>
						<td>${lv.getCiudadvisita()}</td>
						<td>${lv.getResumenvisita()}</td>
						<td>${lv.getEmpleado().getNombreempleado()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>
</div>

<div class="container">
	<c:if test="${listacapacitaciones.size() == 0}">
		<h5 class="text-center bg-secondary text-white-50 py-2 mt-5">No contiene reportes de visitas y capacitaciones</h5>
	</c:if>
	
	<c:if test="${listacapacitaciones.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0 mt-5">Reporte de Visitas</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Nombre Cliente </th>
						<th scope="col">Direccion Visita</th>
						<th scope="col">Fecha Visita </th>
						<th scope="col">Ciudad Visita</th>
						<th scope="col">Empleado</th>
						<th scope="col">Fecha Capacitacion</th>
						<th scope="col">Hora Capacitacion</th>
						<th scope="col">Asistentes a capacitacion</th>
					</tr>
				</thead>
				<c:forEach items="${listacapacitaciones}" var="lvc">
					<tr>
						<th scope="row">${lvc.getVisita().getCliente().getNombrecliente()}</th>
						<td>${lvc.getVisita().getDireccionvisita()}</td>
						<td>${lvc.getVisita().getFechavisita()}</td>
						<td>${lvc.getVisita().getCiudadvisita()}</td>
						<td>${lvc.getVisita().getEmpleado().getNombreempleado()}</td> 
						<td>${lvc.getFechacapacitacion()}</td>
						<td>${lvc.getHoracapacitacion()}</td>
						<td>${lvc.getNumasistcapacitacion()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>		
</div>

	
<%@ include file="footer.jsp" %>