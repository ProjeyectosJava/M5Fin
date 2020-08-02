<%@ include file="menuadmin.jsp" %>


	<nav class="navbar navbar-expand-sm bg-dark navbar-dark mt-0">
		<a class="navbar-brand" href="${baseURL}/administrador/visualizadoractividades"> 
			Actividades
		</a>
		
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown2" aria-controls="navbarNavDropdown2"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	
		<div class="collapse navbar-collapse" id="navbarNavDropdown2">
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link"	href="${baseURL}/administrador/vcapacitaciones">Capacitaciones </a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${baseURL}/administrador/vvisitas">Visitas</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${baseURL}/administrador/vmejoras">Mejoras</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${baseURL}/administrador/vasesorias">Asesorias</a>
				</li>
			</ul>
		</div>
	</nav>
 
 
 	
	<c:if test="${opcion == 1}">
		<c:if test="${listacapacitaciones.size() == 0}">
			<h4 class="text-center bg-dark text-white py-3">No existen actividades creadas</h4>
		</c:if>
		
		<c:if test="${listacapacitaciones.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Actividades Capacitaciones</h4>
		<div class="container mt-3">
		<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id Capacitacion</th>
					<th scope="col">Id Cliente</th>
					<th scope="col">Nombre Cliente</th>
					<th scope="col">Fecha Capacitacion</th>
					<th scope="col">Hora Capacitacion</th>
					<th scope="col">Cantidad Asistentes</th>
				</tr>
			</thead>
			<c:forEach items="${listacapacitaciones}" var="lvc">
				<tr>
					<th scope="row">${lvc.getIdcapacitacion()}</th>
					<td>${lvc.getVisita().getCliente().getIdcliente()}</td>
					<td>${lvc.getVisita().getCliente().getNombrecliente()}</td> 
					<td>${lvc.getFechacapacitacion()}</td>
					<td>${lvc.getHoracapacitacion()}</td>
					<td>${lvc.getNumasistcapacitacion()}</td>
				</tr>
			</c:forEach>
		</table>
		</div>
		</div>
		</c:if>
	</c:if>
	
	<c:if test="${opcion == 2}">
		<c:if test="${listavisitas.size() == 0}">
			<h4 class="text-center bg-dark text-white py-3">No existen actividades creadas</h4>
		</c:if>
		
		<c:if test="${listavisitas.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Actividades Visitas</h4>
				<div class="container mt-3">
		<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id Visitas</th>
					<th scope="col">Id Cliente</th>
					<th scope="col">Nombre Cliente</th>
					<th scope="col">Ciudad</th>
					<th scope="col">Direccion</th>
					<th scope="col">Resumen</th>
					<th scope="col">Observacion</th>
					<th scope="col">Fecha</th>
					<th scope="col">Nombre Empleado</th>
				</tr>
			</thead>
				<c:forEach items="${listavisitas}" var="lvv">
					<tr>
						<th scope="row">${lvv.getIdvisita()}</th>
						<td>${lvv.getCliente().getIdcliente()}</td>
						<td>${lvv.getCliente().getNombrecliente()}</td>
						<td>${lvv.getCiudadvisita()}</td>
						<td>${lvv.getDireccionvisita()}</td>
						<td>${lvv.getResumenvisita()}</td>
						<td>${lvv.getObservacionvisita()}</td>
						<td>${lvv.getFechavisita()}</td>
						<td>${lvv.getEmpleado().getNombreempleado()}</td>
					</tr>
				</c:forEach>
		</table>
		</div>
		</div>
		</c:if>
	</c:if>
	

	<c:if test="${opcion == 3}">
		<c:if test="${listamejoras.size() == 0}">
			<h4 class="text-center bg-dark text-white py-3">No existen actividades creadas</h4>
		</c:if>
		
		<c:if test="${listamejoras.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Actividades Mejoras</h4>
		<div class="container mt-3">
			<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Mejoras</th>
						<th scope="col">Id Cliente</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Rubro</th>
						<th scope="col">Fecha </th>
						<th scope="col">Motivo</th>
						<th scope="col">Actividades</th>
						<th scope="col">Estado</th>
					</tr>
				</thead>
				<c:forEach items="${listamejoras}" var="lvm">
					<tr>
						<th scope="row">${lvm.getIdmejora()}</th>
						<td>${lvm.getCliente().getIdcliente()}</td>
						<td>${lvm.getCliente().getNombrecliente()}</td>
						<td>${lvm.getCliente().getRubrocliente()}</td>
						<td>${lvm.getFechamejora()}</td>
						<td>${lvm.getMotivomejora()}</td>
						<td>${lvm.getActividadesmejora()}</td>
						<td>${lvm.getEstadomejora()}</td>
					</tr>
				</c:forEach>
		</table>
		</div>
		</div>
		</c:if>
	</c:if>
	
		
	<c:if test="${opcion == 4}">
		<c:if test="${listaasesorias.size() == 0}">
			<h4 class="text-center bg-dark text-white py-3">No existen actividades creadas</h4>
		</c:if>
		
		<c:if test="${listaasesorias.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Actividades Asesorias</h4>
		<div class="container mt-3">
			<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Asesoria</th>
						<th scope="col">Id Cliente</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Detalle</th>
						<th scope="col">Gestion </th>
						<th scope="col">Propuesta</th>
						<th scope="col">Fecha</th>
						<th scope="col">Especial</th>
						<th scope="col">Empleado</th>
					</tr>
				</thead>
					<c:forEach items="${listaasesorias}" var="lva">
						<tr>
							<th scope="row">${lva.getIdasesoria()}</th>
							<td>${lva.getVisita().getCliente().getIdcliente()}</td>
							<td>${lva.getVisita().getCliente().getNombrecliente()}</td>
							<td>${lva.getDetalleasesoria()}</td>
							<td>${lva.getGestionasesoria()}</td>
							<td>${lva.getPropuestaasesoria()}</td>
							<td>${lva.getFechaasesoria()}</td>
							<td>${lva.getEspecialasesoria()}</td>
							<td>${lva.getVisita().getEmpleado().getNombreempleado()}</td>
						</tr>
					</c:forEach>
			</table>
		</div>
	</div>
	</c:if>
	</c:if>
	
	
<%@ include file="footer.jsp" %>