<%@ include file="menuasesorias.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Actualizando Asesoria ID: ${asesorianormal.getIdasesoria()} del Cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="../../guardarasesoriainiciada" modelAttribute="asesorianormal">
				
				<div class="form-group row">
					<label for="fechaasesoria" class="col-md-2 col-form-label mr-1">Fecha Asesoria</label>
					<div class="col-md-7">  
						<form:input class="form-control" id="fechaasesoria" path="fechaasesoria" readonly="true"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="detalleasesoria" class="col-md-2 col-form-label mr-1">Detalle</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="detalleasesoria" path="detalleasesoria" readonly="false"/> 
					</div>
				</div>

				<div class="form-group row">
					<label for="propuestaasesoria" class="col-md-2 col-form-label mr-1">Propuesta</label>
					<div class="col-md-7">  
						<form:input class="form-control" id="propuestaasesoria" path="propuestaasesoria" readonly="false"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="gestionasesoria" class="col-md-2 col-form-label mr-1">Gestion</label>
					<div class="col-md-7"> 
						<form:select class="form-control" path="gestionasesoria" >
							<div class="input-group-prepend">
								<option selected>${asesorianormal.getGestionasesoria()}</option>
								<option>Finalizada</option>
							</div>
						</form:select>
						<form:hidden class="form-control" id="especialasesoria" path="especialasesoria" readonly="true"/>
						<form:hidden class="form-control" id="idvivisita" path="visita.idvisita" readonly="true"/>
						<form:hidden class="form-control" id="idasesoria" path="idasesoria" readonly="true"/>
					</div>
				</div>
				
				<!-- 
				<div class="form-group row">
					<label for="especialasesoria" class="col-md-2 col-form-label mr-1">Asesoria Especial</label>
					<div class="col-md-7">  
					</div>
				</div>
				
			
				<div class="form-group row">
					<label for="idvivisita" class="col-md-2 col-form-label mr-1">IdVisitaAsesoria</label>
					<div class="col-md-7"> 
					</div>
				</div>
				
				<div class="form-group row">
					<label for="idasesoria" class="col-md-2 col-form-label mr-1">idasesoria</label>
					<div class="col-md-7"> 
					</div>
				</div>
				 -->
				 
				<div class="form-group row">
					<input type="submit" class="btn btn-success" value="Guardar">  
				</div>
			</form:form>
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>

