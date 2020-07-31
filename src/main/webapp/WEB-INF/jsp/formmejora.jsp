<%@ include file="menupro.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Creando Mejora a Cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="../../agregarmejora" modelAttribute="regmejora">
					
					<div class="form-group row">
						<label for="fechamej" class="col-md-2 col-form-label mr-1">Fecha:</label>
						<div class="col-md-7">
							<form:input class="form-control" id="fechamej" path="fechamejora"/>
						</div>
					</div>
					<div class="form-group row">
						<label for="motivomej" class="col-md-2 col-form-label mr-1">Motivo:</label> 
						<div class="col-md-7">
							<form:input class="form-control" id="motivomej" path="motivomejora" />
						</div>						
					</div>
					<div class="form-group row">
						<label for="actimejora" class="col-md-2 col-form-label mr-1">Actividad:</label> 
						<div class="col-md-7">
							<form:input class="form-control" id="actimejora" path="actividadesmejora" />
						</div>
					</div>
					<div class="form-group row">
						<label for="estmejora" class="col-md-2 col-form-label mr-1">Estado:</label>  
						<div class="col-md-7">
							<form:select class="form-control" id="estmejora" path="estadomejora">
								<div class="input-group-prepend">
									<option>En Curso</option>
									<option>Pendiente</option>
									<option>Finalizada</option>
									<option>No Iniciada</option>
								</div>
							</form:select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-md-7">
							<form:input class="form-control" id="idclimej" path="cliente.idcliente" readonly="true"/>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-md-7">
							<input type="submit" value="Guardar" />
						</div>
					</div>	
			</form:form>
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>
