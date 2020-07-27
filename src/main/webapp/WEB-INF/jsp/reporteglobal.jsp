<%@ include file="menuadmin.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Reporte Global de Clientes</h4>

<div class="container">
	<c:if test="${listamejoras.size() == 0}">
		<h5 class="text-center bg-secondary text-white-50 py-2">No existen clientes con Reportes de Mejoras</h5>
	</c:if>

	<c:if test="${listamejoras.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0">Reporte de Mejoras</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id </th>
						<th scope="col">Nombre </th>
						<th scope="col">Rubro</th>
						<th scope="col">Fecha</th>
						<th scope="col">Motivo</th>
						<th scope="col">Estado</th>
					</tr>
				</thead>
				<c:forEach items="${listamejoras}" var="lm">
					<tr>
						<th scope="row">${lm.getCliente().getIdcliente()}</th> 
						<td>${lm.getCliente().getNombrecliente()}</td>
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
	<c:if test="${listaccidente.size() == 0}">
		<h5 class="text-center bg-secondary text-white-50 py-2 mt-5">No existen clientes con Reportes de Accidentes</h5>
	</c:if>
	
	<c:if test="${listaccidente.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0 mt-5">Reporte de Accidentes</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id </th>
						<th scope="col">Nombre </th>
						<th scope="col">Rubro</th>
						<th scope="col">Fecha</th>
						<th scope="col">Hora</th>
						<th scope="col">Suceso</th>
						<th scope="col">Lugar</th>
					</tr>
				</thead>
				<c:forEach items="${listaccidente}" var="la">
					<tr>
						<th scope="row">${la.getCliente().getIdcliente()}</th>
						<td>${la.getCliente().getNombrecliente()}</td>
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
		<h5 class="text-center bg-secondary text-white-50 py-2 mt-5">No existen clientes con Reportes de Visitas</h5>
	</c:if>
	
	<c:if test="${listavisitas.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0 mt-5">Reporte de Visitas</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id </th>
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
						<th scope="row">${lv.getCliente().getIdcliente()}</th>
						<td>${lv.getCliente().getNombrecliente()}</td>
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
	<c:if test="${listavisycap.size() == 0}">
		<h5 class="text-center bg-secondary text-white-50 py-2 mt-5">No contiene reportes capacitaciones</h5>
	</c:if>
	
	<c:if test="${listavisycap.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0 mt-5">Reporte de Capacitaciones</h5>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
				<tr>
					<th scope="col">Id Cliente</th>
					<th scope="col">Nombre Cliente</th>
					<th scope="col">Direccion Visita </th>
					<th scope="col">Fecha visita </th>
					<th scope="col">Ciudad visita </th>
					<th scope="col">Empleado</th>
					<th scope="col">Fecha Capacitacion</th>
					<th scope="col">Hora Capacitacion </th>
					<th scope="col">Asistentes a Capacitacion</th>
				</tr>
				</thead>
				<c:forEach items="${listavisycap}" var="lvc">
					<tr>
						<th scope="row">${lvc.getVisita().getCliente().getIdcliente()}</th> 
						<td>${lvc.getVisita().getCliente().getNombrecliente()}</td>
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