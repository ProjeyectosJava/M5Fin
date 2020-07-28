<%@ include file="menupro.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Creando Asesooria a cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="../../guardarasesoria" modelAttribute="regase">
				<div class="form-group row">
					<label for="detalleasesoria" class="col-md-2 col-form-label mr-1">Detalle</label>
						<div class="col-md-7"> 
							<form:input class="form-control" id="detalleasesoria" path="detalleasesoria" readonly="true"/> 
						</div>
				</div>
				<div class="form-group row">
					<label for="gestionasesoria" class="col-md-2 col-form-label mr-1">Gestion</label>
						<div class="col-md-7"> 
							<form:input class="form-control" id="gestionasesoria" path="gestionasesoria" value="No Iniciada" readonly="true"/>
						</div>
				</div>
				<div class="form-group row">
					<label for="propuestaasesoria" class="col-md-2 col-form-label mr-1">Propuesta</label>
						<div class="col-md-7">  
							<form:input class="form-control" id="propuestaasesoria" path="propuestaasesoria" readonly="true"/>
						</div>
				</div>
				
				<div class="form-group row">
					<label for="fechaasesoria" class="col-md-2 col-form-label mr-1">Fecha Asesoria</label>
						<div class="col-md-7">  
							<form:input class="form-control" id="fechaasesoria" path="fechaasesoria"/>
						</div>
				</div>
				
				<div class="form-group row">
					<label for="especialasesoria" class="col-md-2 col-form-label mr-1">Asesoria Especial</label>
						<div class="col-md-7">  
							<form:input class="form-control" id="especialasesoria" path="especialasesoria" value="No" readonly="true"/>
						</div>
				</div>
				
			
				<div class="form-group row">
					<label for="idvivisita" class="col-md-2 col-form-label mr-1">IdVisitaAsesoria</label>
						<div class="col-md-7"> 
							<form:input class="form-control" id="idvivisita" path="visita.idvisita" readonly="true"/>
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

