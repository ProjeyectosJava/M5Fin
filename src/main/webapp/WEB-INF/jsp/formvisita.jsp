<%@ include file="menupro.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Generando visita cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
		
			<form:form method="post" action="../../guardarvisita"  modelAttribute="creavisita">
				<div class="form-group row">
					<label for="fechavis" class="col-md-2 col-form-label mr-1">Fecha de Visita:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="fechavis" path="fechavisita"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="ciudadvis" class="col-md-2 col-form-label mr-1">Ciudad:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="ciudadvis" path="ciudadvisita"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="direccionvis" class="col-md-2 col-form-label mr-1">Direccion:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="direccionvis" path="direccionvisita"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="obsvis" class="col-md-2 col-form-label mr-1">Observaciones:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="obsvis" path="observacionvisita"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="resumenvis" class="col-md-2 col-form-label mr-1">Resumen:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="resumenvis" path="resumenvisita"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="empleadovis" class="col-md-2 col-form-label mr-1">Empleado:</label> 
					<div class="col-md-7">
						<form:select id="empleadovis" path="empleado.idempleado">
							<div class="input-group-prepend">
							<form:options class="input-group-text" items="${listaemp}" itemLabel="nombreempleado"  itemValue="idempleado"/>
							</div>
						</form:select>
					</div>
				</div>
				<div class="form-group row">
					<label for="idclivis" class="col-md-2 col-form-label mr-1">IdClienteVisita:</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="idclivis" path="cliente.idcliente" readonly="true"/>
					</div>
				</div>
				<div class="form-group row">
					<input type="submit" class="btn btn-dark" value="Guardar" />
				</div>
			</form:form>
		</div>
	</div>
</div>

</body>
</html>