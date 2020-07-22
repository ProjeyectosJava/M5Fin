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
	<br>
	<c:if test="${listavisgen.size() == 0}">
	<h3>No hay visitas generadas</h3>
	</c:if>
	
	<c:if test="${listavisgen.size() > 0}">
		<hr>
		<h2>Listado de visitas generadas</h2>
		<table border="1">
			<tr>
				<th>Nombre Cliente</th>
				<th>Telefono</th>
				<th>Direccion</th>
				<th>Fecha Visita</th>
				<th>Ciudad</th>
				<th>Empleado Asignado</th>
			</tr>
			
			<c:forEach items="${listavisitas}" var="lg">
				<tr>
					<td>${lg.nombrecliente}</td>
					<td>${lg.telefonocliente}</td>
					<td>${lg.direccioncliente}</td>
					<td>${lg.fechavisita}</td>
					<td>${lg.ciudadvisita}</td>
					<td>${lg.nombreempleado}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</div>
</div>
<%@ include file="footer.jsp"%>