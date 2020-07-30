<%@ include file="menupro.jsp"%>

${registrovisita}

<h4 class="text-left bg-dark text-white py-3">Creando Checklist para el cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
		
			<form:form method="post" action="../../guardarchecklist" modelAttribute="chequeo">
				<div class="form-group row">
					<!-- 
					 <label for="idvisitachequeo" class="col-md-2 col-form-label mr-1">Id Visita Asociado</label>
					 -->
					<div class="col-md-7">
					</div>
				</div>
				
				<div class="form-group row">
					<!-- 
					 <label for="estadochequeo" class="col-md-2 col-form-label mr-1">Estado Chequeo</label>
					 -->
					<div class="col-md-7">
					</div>
				</div>
				
				
				<div class="form-group row">
					<label for="detallechequeo" class="col-md-2 col-form-label">Nombre de check:</label>
					<div class="col-md-5 mr-1">	
						<form:input class="form-control" id="detallechequeo" path="detallechequeo"/>
						<form:hidden class="form-control" id="idvisitachequeo"  path="visita.idvisita" readonly="true"/>
						<form:hidden class="form-control" id="estadochequeo"  path="estadochequeo" readonly="true"/>
					</div>
					<div class="form-group row col-md-2">
						<input type="submit" class="btn btn-dark" value="Crear">
					</div>
				</div>
				
			</form:form>
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>