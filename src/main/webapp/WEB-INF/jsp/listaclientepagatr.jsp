<%@ include file="menuadmin.jsp" %>


<c:if test="${listapag.size() == null}">
	<h5><div class="text-center alert alert-warning" role="alert">No existen Clientes Morosos</h5>
</div>
</c:if>

<c:if test="${listapag.size() > 0}">
	<h4 class="text-center bg-dark text-white py-3">Listado Clientes con morosidad </h4>
	<h5>
	 <div class="text-center">Fecha de hoy  <script> var f = new Date();document.write(f.getDate() + "/" + (f.getMonth() +1) + "/" + f.getFullYear());</script></div>
	</h5>	
	<div class="container">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Cliente</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Id Pagos</th>
						<th scope="col">Día de pagos</th>
						<th scope="col">Monto adicional pagos</th>
						<th scope="col">Monto regular pagos</th>
						<th scope="col">Tiempo de morosidad</th>
						<th>			
					</tr>
				</thead>
				<c:forEach var="pago" items="${listapag}">
					<tr>
						<th scope="row">${pago.getIdclientepago()}</th>
						<th scope="row">${pago.getNombrecliente()}</th>
						<td>${pago.getIdpago()}</td>
						<td>${pago.getMesaniopago()}</td>
						<td>${pago.getMontoadicionalpago()}</td>
						<td>${pago.getMontoregularpago()}</td>
								
						<c:if test="${pago.getPeriodoYear() > 0}">  
							<td>Han transcurrido : ${pago.getPeriodoYear()} años ${pago.getPeriodoMes()} meses ${pago.getPeriodoDia()} días desde ultima fecha  maxima de pago</td>
						</c:if>
						<c:if test="${pago.getPeriodoMes() > 0 and pago.getPeriodoYear() ==  0}">   
							<td>Han transcurrido : ${pago.getPeriodoMes()} meses ${pago.getPeriodoDia()} días desde ultima fecha  maxima de pago</td>
						</c:if>
						<c:if test="${pago.getPeriodoMes() == 0 and pago.getPeriodoYear() <=  0}">  
							<td>Han transcurrido : ${pago.getPeriodoDia()} dias desde ultima fecha maxima de pago</td>
						</c:if>
						
					</tr>
				</c:forEach>
			</table>
	</div>
</div>

</c:if>
<%@ include file="footer.jsp"%>

