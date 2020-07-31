<%@ include file="menucli.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Reportando Accidente</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form action="guardaraccidente" method="post" modelAttribute="accidente">
				<div class="form-group row">	
					<label for="idcliente" class="col-md-2 col-form-label mr-1">Id Cliente</label>
					<div class="col-md-7">
						<form:input class="form-control" id="idcliente" path="cliente.idcliente" readonly="true"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="fechaccid" class="col-md-2 col-form-label mr-1">Fecha Accidente:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="fechaccid" path="fechaaccidente"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="horaaccid" class="col-md-2 col-form-label mr-1">Hora Accidente:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="horaaccid" path="horaaccidente"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="sucaccid" class="col-md-2 col-form-label mr-1">Suceso Accidente:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="sucaccid" path="sucesoaccidente"/>
					</div>
				</div>

				<div class="form-group row">				
					<label for="lugaraccid" class="col-md-2 col-form-label mr-1">Lugar Accidente:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="lugaraccid" path="lugaraccidente"/>
					</div>
				</div>
				
				<div class="form-group row">
						<input type="submit" class="btn btn-dark" value="Guardar">
				</div>
	
			</form:form>
		</div>
	</div>
</div>
	
<%@ include file="footer.jsp"%>