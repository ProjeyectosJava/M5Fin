<%@ include file="menuadmin.jsp" %>


<h4 class="text-center bg-dark text-white py-3">Administrando Clientes para Gestion Pagos</h4>
<div class="container">
	<div class="table-responsive-md">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Telefono</th>
					<th scope="col">Correo Electronico</th>
					<th scope="col">Gestion</th>
				</tr>
			</thead>	
			<c:forEach var="clip" items="${listacligp}">	
				 <tr>
					<th scope="row">${clip.getIdcliente()}</th>
					<td>${clip.getNombrecliente()}</td>
					<td>${clip.getTelefonocliente()}</td>
					<td>${clip.getEmailcliente()}</td>
					<td><a href="generapagosporcliente/${clip.getIdcliente()}/${clip.getNombrecliente()}">Gestionar Pago</a></td>
				</tr> 

			</c:forEach> 
		</table>
	</div>
	<br>
</div>


<c:if test="${listapagos.size() > 0}">
	<h4 class="text-center bg-dark text-white py-3">Gestion de Pagos por Clientes</h4>
	<div class="container">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Cliente</th>
						<th scope="col">Id Pagos</th>
						<th scope="col">Día de pagos</th>
						<th scope="col">Monto adicional pagos</th>
						<th scope="col">Monto regular pagos</th>
					</tr>
				</thead>
				<c:forEach var="pago" items="${listapagos}">
					<tr>
						<th scope="row">${pago.getCliente().getIdcliente()}</th>
						<td>${pago.getIdpago()}</td>
						<td>${pago.getMesaniopago()}</td>
						<td>${pago.getMontoadicionalpago()}</td>
						<td>${pago.getMontoregularpago()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br>
	</div>

</c:if>
	
<%@ include file="footer.jsp"%>

<%-- 



			<c:forEach var="clip" items="${listacligp}">
				<c:set var="idcliente"  value="${clip.getIdcliente()}"/>
			
				
		 		<c:forEach var="pag" items="${listapagos}">	
		 			<c:set var="idpago" value="${pag.getCliente().getIdcliente()}"/>
		 			
		 				
		 				
						<c:if test="${idpago != idcliente}" var="booleanValue"></c:if>
						
							<c:if test="${booleanValue == true}">
								<p>El valor de cliente es <c:out value="${idcliente}"/></p>
								<p>El valor de pago es <c:out value="${idpago}"/></p>
								
							
									<p>El resultado es <c:out value="${booleanValue}"/></p>
									 <tr>
										<th scope="row">${clip.getIdcliente()}</th>
										<td>${clip.getNombrecliente()}</td>
										
										<td>${clip.getTelefonocliente()}</td>
										<td>${clip.getEmailcliente()}</td>
										<td><a href="generapagosporcliente/${clip.getIdcliente()}/${clip.getNombrecliente()}">Gestionar Pago</a></td>
									</tr>
							</c:if> 
							<c:if test="${booleanValue == false}">
								Lo sentimos es false 
							</c:if>
							
						<td>El valor boolean es: ${booleanValue}</td> --%>
						
						