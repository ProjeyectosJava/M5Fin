<%@ include file="menupro.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Creando Capacitacion a Cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="../../guardarcapacitacion" modelAttribute="regcap">
			
				<div class="form-group row">
					<label for="fechacap" class="col-md-2 col-form-label mr-1">Fecha:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="fechacap" path="fechacapacitacion"/> 
					</div>
				</div>
				<div class="form-group row">
					<label for="fechacap" class="col-md-2 col-form-label mr-1">Hora:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="fechacap" path="horacapacitacion"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="numasiscap" class="col-md-2 col-form-label mr-1">Nro. Asistentes:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="numasiscap" path="numasistcapacitacion"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="idclicap" class="col-md-2 col-form-label mr-1">Id Visita:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="idclicap" path="visita.idvisita" readonly="true"/>
					</div>
				</div>
				<div class="form-group row">
					<div class="col-md-7">
						<input type="submit" class="btn btn-dark" value="Guardar">  
					</div>
				</div>
			</form:form>
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>