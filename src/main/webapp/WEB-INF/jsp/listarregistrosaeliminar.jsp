<%@ include file="menuadmin.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Cliente ${ncliente}</h4>

<div class="container">

	<h4>Eliminar cliente ${ncliente} </h4>
	<p>Este cliente cuenta con registros asociados a otras actividades, por tal motivo, no es posible eliminarlo directamente.
	<br>Para realizar esta accion existen 2 alternativas.</p>
	
	<h5>Opciones para eliminar </h5>
	<ul>
		<li>Eliminar los registros asociados al cliente uno a uno</li>
			<ul>
				<li><i>Cuando elimine el ultimo registro, automaticamente se eliminara el cliente</i></li>
				<li><i>Debe considerar que los ultimos registros a eliminar deben ser las Visitas asociadas, 
				ya que no podra eliminarlas hasta que haya eliminado los registros anteriores.</i></li>
			</ul>
			<br>
			
		<li>Presioinar el Boton <span class="btn-sm btn-danger">Eliminar todos los registros</span></li>
			<ul>
				<li><i>esta accion elimina todos los registos asociados y lo redirije al listado de clientes donde finalmente podra eliminar el cliente <b>${ncliente}</b></i></li>
			</ul>
	</ul>
	<div class="text-right">
		<a class="btn btn-danger" href="../../eliminartodoelcliente/${idcliente}">Eliminar todos los regitros</a>
 	</div>

	<div class="container mt-3">
		<c:if test="${listaaccidentes.size() == 0}">
			<h5 class="text-center bg-secondary text-white py-3 mb-0">No tiene Accidentes Asociados</h5>
		</c:if>
		
		<c:if test="${listaaccidentes.size() > 0}">
			<h5 class="text-center bg-dark text-white py-3 mb-0">Eliminar Accidentes Asociados</h5>
			<div class="table-responsive-md mt-0">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Accidente</th>
							<th scope="col">Fecha</th>
							<th scope="col">Hora </th>
							<th scope="col">Eliminar </th>
						</tr>
					</thead>
					<c:forEach items="${listaaccidentes}" var="a">
						<tr>
							<th scope="row">${a.getIdaccidente()}</th>
							<td>${a.getFechaaccidente()}</td>
							<td>${a.getHoraaccidente()}</td>
							<td><a class="btn-sm btn-danger" href="../../eliminaraccidente/${a.getIdaccidente()}/${a.getCliente().getIdcliente()}/${a.getCliente().getNombrecliente()}">Eliminar</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</c:if>		
	</div>
		
		
	<div class="container mt-3">
		<c:if test="${listamejoras.size() == 0}">
			<h5 class="text-center bg-secondary text-white py-3 mb-0">No tiene Mejoras Asociados</h5>
		</c:if>
		
		<c:if test="${listamejoras.size() > 0}">
			<h5 class="text-center bg-dark text-white py-3 mb-0">Eliminar Mejoras Asociados</h5>
				<div class="table-responsive-md">
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col">Id Mejora</th>
								<th scope="col">Fecha Pago</th>
								<th scope="col">Monto Pago</th>
								<th scope="col">Eliminar </th>
							</tr>
						</thead>
							<c:forEach items="${listamejoras}" var="m">
								<tr>
									<th scope="row">${m.getIdmejora()}</th>
									<td>${m.getFechamejora()}</td>
									<td>${m.getEstadomejora()}</td>
									<td><a class="btn-sm btn-danger" href="../../eliminarmejora/${m.getIdmejora()}/${m.getCliente().getIdcliente()}/${m.getCliente().getNombrecliente()}">Eliminar</a></td>
								</tr>
							</c:forEach>
					</table>
				</div>
		</c:if>
	</div>


	<div class="container mt-3">
		<c:if test="${listapagos.size() == 0}">
			<h5 class="text-center bg-secondary text-white py-3 mb-0">No tiene Pagos Asociados</h5>
		</c:if>
		
		<c:if test="${listapagos.size() > 0}">
			<h5 class="text-center bg-dark text-white py-3 mb-0">Eliminar Pagos Asociados</h5>
			<div class="table-responsive-md">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Pago</th>
							<th scope="col">Fecha</th>
							<th scope="col">Estado</th>
							<th scope="col">Eliminar </th>
						</tr>
					</thead>
						<c:forEach items="${listapagos}" var="p">
							<tr>
								<th scope="row">${p.getIdpago()}</th>
								<td>${p.getMesaniopago()}</td>
								<td>${p.getMontoregularpago()}</td>
								<td><a class="btn-sm btn-danger" href="../../eliminarpago/${p.getIdpago()}/${p.getCliente().getIdcliente()}/${p.getCliente().getNombrecliente()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</c:if>
	</div>

		
		
	<!-- Lista Asesorias -->
	<div class="container mt-3">
		<c:if test="${listaasesorias.size() == 0}">
			<h5 class="text-center bg-secondary text-white py-3 mb-0">No tiene Asesorias Asociadas</h5>
		</c:if>
		
		<c:if test="${listaasesorias.size() > 0}">
			<h5 class="text-center bg-dark text-white py-3 mb-0">Eliminar Asesorias Asociadas</h5>
			<div class="table-responsive-md">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Asesoria</th>
							<th scope="col">Fecha</th>
							<th scope="col">Detalle</th>
							<th scope="col">Eliminar </th>
						</tr>
					</thead>
						<c:forEach items="${listaasesorias}" var="a">
							<tr>
								<th scope="row">${a.getIdasesoria()}</th>
								<td>${a.getFechaasesoria()}</td>
								<td>${a.getDetalleasesoria()}</td>
								<td><a class="btn-sm btn-danger" href="../../eliminarsesoria/${a.getIdasesoria()}/${a.getVisita().getCliente().getIdcliente()}/${a.getVisita().getCliente().getNombrecliente()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</c:if>
	</div>
		

	<!-- Lista Capacitaciones -->
	<div class="container mt-3">
		<c:if test="${listacapacitaciones.size() == 0}">
			<h5 class="text-center bg-secondary text-white py-3 mb-0">No tiene Capacitaciones Asociadas</h5>
		</c:if>
		
		<c:if test="${listacapacitaciones.size() > 0}">
			<h5 class="text-center bg-dark text-white py-3 mb-0">Eliminar Capacitaciones Asociadas</h5>
			<div class="table-responsive-md">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Capacitacion</th>
							<th scope="col">Fecha</th>
							<th scope="col">Hora</th>
							<th scope="col">Eliminar </th>
						</tr>
					</thead>
						<c:forEach items="${listacapacitaciones}" var="c">
							<tr>
								<th scope="row">${c.getIdcapacitacion()}</th>
								<td>${c.getFechacapacitacion()}</td>
								<td>${c.getHoracapacitacion()}</td>
								<td><a class="btn-sm btn-danger" href="../../eliminarcapacitacion/${c.getIdcapacitacion()}/${c.getVisita().getCliente().getIdcliente()}/${c.getVisita().getCliente().getNombrecliente()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</c:if>
	</div>

	<!-- Lista Chequeos -->
	<div class="container mt-3">
		<c:if test="${listachequeos.size() == 0}">
			<h5 class="text-center bg-secondary text-white py-3 mb-0">No tiene Checklist Asociado</h5>
		</c:if>
		
		<c:if test="${listachequeos.size() > 0}">
			<h5 class="text-center bg-dark text-white py-3 mb-0">Eliminar Chekclist Asociadas</h5>
			<div class="table-responsive-md">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Chequeo</th>
							<th scope="col">Detalle</th>
							<th scope="col">Estado</th>
							<th scope="col">Eliminar </th>
						</tr>
					</thead>
						<c:forEach items="${listachequeos}" var="chk">
							<tr>
								<th scope="row">${chk.getIdchequeo()}</th>
								<td>${chk.getDetallechequeo()}</td>
								<td>${chk.getEstadochequeo()}</td>
								<td><a class="btn-sm btn-danger" href="../../eliminarchequeo/${chk.getIdchequeo()}/${chk.getVisita().getCliente().getIdcliente()}/${chk.getVisita().getCliente().getNombrecliente()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</c:if>
	</div>

	<!-- Lista Visistas -->
	<div class="container mt-3">
		<c:if test="${listavisitas.size() == 0}">
			<h5 class="text-center bg-secondary text-white py-3 mb-0">No tiene Visitas Asociadas</h5>
		</c:if>
		
		<c:if test="${listavisitas.size() > 0}">
		<h5 class="text-center bg-dark text-white py-3 mb-0">Eliminar Visitas Asociadas</h5>
			<div class="table-responsive-md">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id Visita</th>
							<th scope="col">Fecha</th>
							<th scope="col">Ciudad</th>
							<th scope="col">Eliminar </th>
						</tr>
					</thead>
						<c:forEach items="${listavisitas}" var="v">
							<tr>
								<th scope="row">${v.getIdvisita()}</th>
								<td>${v.getFechavisita()}</td>
								<td>${v.getCiudadvisita()}</td>
								<td><a class="btn-sm btn-danger" href="../../eliminarvisita/${v.getIdvisita()}/${v.getCliente().getIdcliente()}/${v.getCliente().getNombrecliente()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</c:if>
	</div>
		
	


</div>



<%@ include file="footer.jsp" %>