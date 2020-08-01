<%@ include file="menupro.jsp"%>



<h4 class="text-left bg-dark text-white text-center py-3">Creando Checklist para el cliente ${ncliente}</h4>
<div class="container mt-4">
	
	<div class="container mt-3 px-0">
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Id Visita</th>
						<th scope="col">Nombre Cliente</th>
						<th scope="col">Profesional Asignado</th>
						<th scope="col">Ciudad</th>
						<th scope="col">Resumen</th>
						<th scope="col">Observacion</th>
						
					</tr>
				</thead>
					<tr>
						<th scope="row">${lavisita.getIdvisita()}</th>
						<td>${lavisita.getCliente().getNombrecliente()}</td>
						<td>${lavisita.getEmpleado().getNombreempleado()}</td>
						<td>${lavisita.getCiudadvisita()}</td>
						<td>${lavisita.getResumenvisita()}</td>
						<td>${lavisita.getObservacionvisita()}</td>
					</tr>
			</table>
		</div>
	</div>
	
	<div class="row justify-content-center align-items-center mt-3 ">
		<div class="col-md-12">
			<form:form method="post" action="../../guardarchecklist" modelAttribute="chequeo">
				<div class="form-group row justify-content-center align-items-center my-0">
					<label for="detallechequeo" class="col-md-2 col-form-label">Nuevo check:</label>
					<div class="col-md-5">	
						<form:input class="form-control" id="detallechequeo" path="detallechequeo"/>
						<form:hidden class="form-control" id="idvisitachequeo"  path="visita.idvisita" readonly="true"/>
						<form:hidden class="form-control" id="estadochequeo"  path="estadochequeo" readonly="true"/>
					</div>
					<div class="col-md-1 my-0 mx-0">
						<input type="submit" class="btn-sm btn-success" value="Agregar">
					</div>
				</div>
			</form:form>
		</div>
	</div>
	
	
	<div class="container mt-3">
		<div class="row justify-content-center align-items-center  text-center">
		<div class="col-md-12 px-0">
			<h5 class=" pl-2 py-2 bg-dark text-white text-left">Checklist Agregado:</h5>
		</div>
			<div class="col-md-12">
				<ul>
				<c:forEach items="${listachequeos}" var="lc">
				
					<li>
					<div class="col-md-4 text-left">
						${lc.getDetallechequeo()}
						<!-- 
						${lc.getIdchequeo()}
						${lc.getVisita().getIdvisita()}
						 -->
					</div>
					</li>
							
				</c:forEach>
				</ul>
			 
			</div>
		</div>
	</div>
	
		
	
</div>

<%@ include file="footer.jsp"%>