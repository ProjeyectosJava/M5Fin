<%@ include file="menuadmin.jsp" %>

<c:if test="${listamejoras.size() == 0}">
<h4 class="text-center bg-dark text-white py-3">No hay reportes de mejora</h4>
</c:if>

	<c:if test="${listamejoras.size() > 0}">

			<h3>Reporte de Mejoras</h3>
			<table>
				<tr>
					<th>Nombre </th>
					<th>Rubro</th>
					<th>Fecha</th>
					<th>Motivo</th>
					<th>Estado</th>
				</tr>
					<c:forEach items="${listamejoras}" var="lm">
						<tr>
							
							<td>${lm.getCliente().getNombrecliente()}</td>
							<td>${lm.getCliente().getRubrocliente()}</td>
							<td>${lm.getFechamejora()}</td>
							<td>${lm.getMotivomejora()}</td>
							<td>${lm.getEstadomejora()}</td>
						</tr>
					</c:forEach>
			</table>
	</c:if>
	
	<c:if test="${listaaccidentes.size() > 0}">
			<hr>
			<h3>Reporte de Accidentes</h3>
			<table>
				<tr>
					<!-- <th>Id </th> -->
					<th>Nombre </th>
					<th>Rubro</th>
					<th>Fecha</th>
					<th>Hora</th>
					<th>Suceso</th>
					<th>Lugar</th>
				</tr>
					<c:forEach items="${listaaccidentes}" var="la">
						<tr>
							<td>${la.getCliente().getNombrecliente()}</td>
							<td>${la.getCliente().getRubrocliente()}</td>
							<td>${la.getFechaaccidente()}</td>
							<td>${la.getHoraaccidente()}</td>
							<td>${la.getSucesoaccidente()}</td>
							<td>${la.getLugaraccidente()}</td>
						</tr>
					</c:forEach>
			</table>
		</c:if>
		
<c:if test="${listavisitas.size() > 0}">
			<hr>
			<h3>Reporte de Visitas</h3>
			<table>
				<tr>
					<!-- <th>Id </th> -->
					<th>Nombre </th>
					<th>Rubro</th>
					<th>Direccion</th>
					<th>Fecha</th>
					<th>Ciudad</th>
					<th>Resumen</th>
					<th>Empleado</th>
				</tr>
					<c:forEach items="${listavisitas}" var="lv">
						<tr>
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
	</c:if>
<c:if test="${listacapacitaciones.size() > 0}">
			<hr>
			<h3>Reporte de Visitas y Capacitacion</h3>
			<table>
				<tr>
					<!-- <th>Id </th> -->
					<th>Nombre Cliente </th>
					<th>Direccion Visita</th>
					<th>Fecha Visita </th>
					<th>Ciudad Visita</th>
					<th>Empleado</th>
					<th>Fecha Capacitacion</th>
					<th>Hora Capacitacion</th>
					<th>Asistentes a capacitacion</th>
				</tr>
					<c:forEach items="${listacapacitaciones}" var="lvc">
						<tr>
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
</c:if>		
	
	
</body>
</html>