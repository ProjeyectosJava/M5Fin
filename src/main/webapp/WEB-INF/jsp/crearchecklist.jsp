<%@ include file="menupro.jsp" %>

<c:if test="${listavisita.size() == 0}">
	<h4 class="text-center bg-dark text-white py-3">No existen actividades creadas</h4>
</c:if>
		
<c:if test="${listavisita.size() > 0}">
	<h4 class="text-center bg-dark text-white py-3">Actividades Visitas</h4>
	<div class="container mt-3">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Visita</th>
						<th scope="col">Id Cliente</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Ciudad</th>
						<th scope="col">Direccion</th>
						<th scope="col">Resumen</th>
						<th scope="col">Observacion</th>
						<th scope="col">Fecha</th>
						<th scope="col">Nombre Empleado</th>
						<th scope="col">Agregar Checklist</th>
					</tr>
				</thead>
				<c:forEach items="${listavisita}" var="lv">
					<tr>
						<th scope="row">${lv.getIdvisita()}</th>
						<td>${lv.getCliente().getIdcliente()}</td>
						<td>${lv.getCliente().getNombrecliente()}</td>
						<td>${lv.getCiudadvisita()}</td>
						<td>${lv.getDireccionvisita()}</td>
						<td>${lv.getResumenvisita()}</td>
						<td>${lv.getObservacionvisita()}</td>
						<td>${lv.getFechavisita()}</td>
						<td>${lv.getEmpleado().getNombreempleado()}</td>
						<td><a href="agregarchecklist/${lv.getIdvisita()}/${lv.getCliente().getNombrecliente()}">Agreagar</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</c:if>
