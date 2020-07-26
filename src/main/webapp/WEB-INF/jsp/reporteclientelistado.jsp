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
	
	<c:if test="${listaccidente.size() > 0}">
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
					<c:forEach items="${listaccidente}" var="la">
						<tr>
							<!-- <td>${lm.getIdcliente()}</td>  -->
							<td>${la.getNombrecliente()}</td>
							<td>${la.getRubrocliente()}</td>
							<td>${la.getFechaaccidente()}</td>
							<td>${la.getHoraaccidente()}</td>
							<td>${la.getSucesoaccidente()}</td>
							<td>${la.getLugaraccidente()}</td>
						</tr>
					</c:forEach>
			</table>
		</c:if>
		
<c:if test="${listvisita.size() > 0}">
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
					<c:forEach items="${listvisita}" var="lv">
						<tr>
							<!-- <td>${lm.getIdcliente()}</td>  -->
							<td>${lv.getNombrecliente()}</td>
							<td>${lv.getRubrocliente()}</td>
							<td>${lv.getDireccionvisita()}</td>
							<td>${lv.getFechavisita()}</td>
							<td>${lv.getCiudadvisita()}</td>
							<td>${lv.getResumenvisita()}</td>
							<td>${lv.getNombremepleado()}</td>
						</tr>
					</c:forEach>
			</table>
			
			<hr>
			<h3>Reporte de Visitas y Capacitacion</h3>
			<table>
				<tr>
					<!-- <th>Id </th> -->
					<th>Nombre </th>
					<th>Rubro</th>
					<th>Fecha</th>
					<th>Fecha</th>
					<th>Ciudad</th>
					<th>Resumen</th>
					<th>Empleado</th>
					<th>Fecha</th>
					<th>Hora</th>
					<th>Asistentes</th>
				</tr>
					<c:forEach items="${listvisitacapacitacion}" var="lvc">
						<tr>
							<!-- <td>${lm.getIdcliente()}</td>  -->
							<td>${lvc.getNombrecliente()}</td>
							<td>${lvc.getRubrocliente()}</td>
							<td>${lvc.getDireccionvisita()}</td>
							<td>${lvc.getFechavisita()}</td>
							<td>${lvc.getCiudadvisita()}</td>
							<td>${lvc.getResumenvisita()}</td>
							<td>${lvc.getNombremepleado()}</td>
							<td>${lvc.getFechacapacitacion()}</td>
							<td>${lvc.getHoracapacitacion()}</td>
							<td>${lvc.getNumasistcapacitacion()}</td>
						</tr>
					</c:forEach>
			</table>
</c:if>		
	
	
</body>
</html>