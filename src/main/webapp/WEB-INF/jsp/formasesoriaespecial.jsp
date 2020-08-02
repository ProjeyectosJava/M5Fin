<%@ include file="menucli.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Creando Asesoria Especial a cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="../../guardarasesoria" modelAttribute="regase">
				
				<div class="form-group row">
					<label for="idvivisita" class="col-md-2 col-form-label mr-1">IdVisitaAsesoria</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="idvivisita" path="visita.idvisita" readonly="true"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="fechaasesoria" class="col-md-2 col-form-label mr-1">Fecha Asesoria</label>
					<div class="col-md-7">  
						<form:input class="form-control" type="date" id="fechaasesoria" path="fechaasesoria"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="propuestaasesoria" class="col-md-2 col-form-label mr-1">Propuesta</label>
					<div class="col-md-7">  
						<form:input class="form-control" id="propuestaasesoria" path="propuestaasesoria"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="detalleasesoria" class="col-md-2 col-form-label mr-1">Detalle</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="detalleasesoria" path="detalleasesoria"/> 
						<form:hidden class="form-control" id="gestionasesoria" path="gestionasesoria" value="No Iniciada" readonly="true"/>
						<form:hidden class="form-control" id="especialasesoria" path="especialasesoria" value="Si" readonly="true"/>
					</div>
				</div>
							
				
				<div class="form-group row">
					<input type="submit" class="btn btn-success" value="Guardar">  
				</div>
			</form:form>
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>

