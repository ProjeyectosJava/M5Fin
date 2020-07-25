<%@ include file="menuadmin.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Nuevo cliente</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="guardarcliente" modelAttribute="cliente">
				<div class="form-group row">
					<label for="nombre" class="col-md-1 col-form-label mr-1">Nombre:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="nombre" path="nombrecliente" />
					</div>
				</div>
				<div class="form-group row">
					<label for="telefono" class="col-md-1 col-form-label mr-2">Telefono:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="telefono" path="telefonocliente" />
					</div>
				</div>
				<div class="form-group row">	
					<label for="email" class="col-md-1 col-form-label mr-2">Email:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="email" path="emailcliente" />
					</div>
				</div>
				<div class="form-group row">
					<label for="rubro" class="col-md-1 col-form-label mr-2">Rubro:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="rubro" path="rubrocliente" />
					</div>
				</div>
				<div class="form-group row">
					<label for="direccion" class="col-md-1 col-form-label mr-2">Direccion:</label>
					<div class="col-md-7">
						<form:input class="form-control form-control" id="direccion" path="direccioncliente" />
					</div>
				</div>
				<div class="form-group row">
					<div class="col-md-7">
						<input type="submit" class="btn btn-dark" value="Guardar" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</div>

<%@ include file="menupro.jsp"%>