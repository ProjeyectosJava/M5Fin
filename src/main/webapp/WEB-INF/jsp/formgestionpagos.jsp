<%@ include file="menuadmin.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Gestion pago de Cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
		
			<form:form method="post" action="../../guardapagos"  modelAttribute="creapagos">
				<div class="form-group row">
					<label for="mesaniopago" class="col-md-2 col-form-label mr-1">Proxima fecha de pago:</label>
					<div class="col-md-7"> 
						<form:input  class="form-control" id="mesaniopago" path="mesaniopago" placeholder="dd/mm/yyyy"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="montoadicionalpago" class="col-md-2 col-form-label mr-1">Monto Adicional Pago:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="montoadicionalpago" path="montoadicionalpago"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="montoregularpago" class="col-md-2 col-form-label mr-1">Monto Regular de Pago:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="montoregularpago" path="montoregularpago"/>
					</div>
				</div>

				<div class="form-group row">
					<label for="idclientepago" class="col-md-2 col-form-label mr-1">id cliente:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="idclientepago" path="cliente.idcliente" readonly="true"/>
					</div>
				</div>
				<div class="form-group row">
					<input type="submit" class="btn btn-dark" value="Guardar" />
				</div>
			</form:form>
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>