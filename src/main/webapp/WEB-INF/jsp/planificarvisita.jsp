<%@ include file="menupro.jsp" %>

<h4 class="text-center bg-dark text-white py-3">Clientes</h4>
	
<div class="container mt-3">
<div class="table-responsive-md">
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Nombre</th>
			<th scope="col">Telefono</th>
			<th scope="col">Direccion</th>
			<th scope="col" colspan="2">Opciones</th>
		</tr>
	</thead>
		<c:forEach items="${list}" var="cli">
			<tr>
				<th scope="row">${cli.getIdcliente()}</th>	
				<td>${cli.getNombrecliente()}</td>
				<td>${cli.getTelefonocliente()}</td>
				<td>${cli.getDireccioncliente()}</td>
				 <td><a href="generarvisita/${cli.getIdcliente()}/${cli.getNombrecliente()}">Generar Visita</a></td>
				<!-- 
				 <c:url var="url_confirm" value="/admin/orderList"/>
				<a href="${url_confirm}/${li.orderId}/${"confirmed"}" >Confirmed</a>
				 
				 -->
			</tr>
		</c:forEach>
</table>
</div>
</div>
	<br>
	<c:if test="${listavisgen.size() == 0}">
	<h4 class="text-center bg-dark text-white py-3">No existen Visitas Generadas</h4>
	</c:if>
	
	<c:if test="${listavisgen.size() > 0}">
		<h4 class="text-center bg-dark text-white py-3">Visitas Generadas</h4>
		<div class="container mt-3">
		<div class="table-responsive-md">
		<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Nombre Cliente</th>
				<th scope="col">Telefono</th>
				<th scope="col">Direccion</th>
				<th scope="col">Fecha Visita</th>
				<th scope="col">Ciudad</th>
				<th scope="col">Empleado Asignado</th>
			</tr>
		</thead>	
		<c:forEach items="${listavisitas}" var="lg">
			<tr>
				<th scope="row">${lg.nombrecliente}</th>
				<td>${lg.telefonocliente}</td>
				<td>${lg.direccioncliente}</td>
				<td>${lg.fechavisita}</td>
				<td>${lg.ciudadvisita}</td>
				<td>${lg.nombreempleado}</td>
			</tr>
		</c:forEach>
		</table>
		</div>
		</div>
	</c:if>

<%@ include file="footer.jsp"%>