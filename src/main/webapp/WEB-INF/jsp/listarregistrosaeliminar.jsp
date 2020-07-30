<%@ include file="menuadmin.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Elimando registros del cliente ${ncliente}</h4>

<div class="container">
<strong>Consideraciones</strong>
<p>Para eliminar el cliente, deberá eliminar todos los registros asociados
al ejecutar estos pasos se perderna todos los registros que elimine y no podra recuperarlo.</p>

<p>Si aun desea continuar siga el orden que se indica a continuación para eliminar al cliente</p>


		<div class="container mt-3">
		<h4 class="text-center bg-dark text-white py-3 mb-0">Eliminar Accidentes Asociados</h4>
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
								<td><a href="../eliminaraccidente/${a.getIdaccidente()}/${a.getCliente().getIdcliente()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</div>
		
		
		<div class="container mt-3">
		<h4 class="text-center bg-dark text-white py-3 mb-0">Eliminar Mejoras Asociados</h4>
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
								<td><a href="../delaccidente/${m.getIdmejora()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</div>


		<div class="container mt-3">
		<h4 class="text-center bg-dark text-white py-3 mb-0">Eliminar Pagos Asociados</h4>
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
								<td><a href="../eliminarpago/${p.getIdpago()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</div>

		<!-- Lista Visistas -->
		<div class="container mt-3">
		<h4 class="text-center bg-dark text-white py-3 mb-0">Eliminar Visitas Asociadas</h4>
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
								<td><a href="../eliminavisita/${v.getIdvisita()}/${v.getCliente().getIdcliente()}">Eliminar</a></td>
							</tr>
						</c:forEach>
				</table>
			</div>
		</div>

</div>

<%@ include file="footer.jsp" %>