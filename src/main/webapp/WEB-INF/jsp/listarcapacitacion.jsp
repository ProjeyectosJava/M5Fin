<%@ include file="menupro.jsp" %>
<c:if test="${listavisitas.size() == 0}">
	<h4 class="text-center bg-dark text-white py-3">No existen visitas creadas</h4>
</c:if>

<c:if test="${listavisitas.size() > 0}">
<h4 class="text-center bg-dark text-white py-3">Visitas Creadas</h4>
<div class="container mt-3">
	<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id Visita </th>
					<th scope="col">Direccion</th>
					<th scope="col">Ciudad </th>
					<th scope="col">Fecha Visita</th>
					<th scope="col">Id Cliente</th>
					<th scope="col">Nombre Cliente</th>
					<th scope="col">Id Empleado</th>
					<th scope="col">Nombre Empleado</th>
					<th scope="col">Crear</th>
				</tr>
			</thead>
			
			<c:forEach items="${listavisitas}" var="lgv">
				<tr>
					<th scope="row">${lgv.getIdvisita()}</th>
					<td>${lgv.getDireccionvisita()}</td>
					<td>${lgv.getCiudadvisita()}</td>
					<td>${lgv.getFechavisita()}</td>
					<td>${lgv.cliente.idcliente}</td>
					<td>${lgv.cliente.nombrecliente}</td>
					<td>${lgv.empleado.idempleado}</td>
					<td>${lgv.empleado.nombreempleado}</td>
					<td><a href="generarcapacitacion/${lgv.getIdvisita()}/${lgv.cliente.nombrecliente}">Crear</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
</c:if>


<c:if test="${listacapacitaciones.size() == 0}">
	<h4 class="text-center bg-dark text-white py-3 mt-3">No existen capacitaciones creadas</h4>
</c:if>

<c:if test="${listacapacitaciones.size() > 0}">
<h4 class="text-center bg-dark text-white py-3 mt-3">Capacitaciones Creadas</h4>
<div class="container mt-3">
	<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id Capacitacion:</th>
					<th scope="col">Fecha:</th>
					<th scope="col">Hora: </th>
					<th scope="col">Asistentes:</th>
					<th scope="col">Id Visita</th>
				</tr>
			</thead>
			
			<c:forEach items="${listacapacitaciones}" var="lc">
				<tr>
					<th scope="row">${lc.getIdcapacitacion()}</th>
					<td>${lc.getFechacapacitacion()}</td>
					<td>${lc.getHoracapacitacion()}</td>
					<td>${lc.getNumasistcapacitacion()}</td>
					<td>${lc.getIdvisitacapacitacion()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
</c:if>



		
<%@ include file="footer.jsp" %>
