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
						<form:input class="form-control" type="date" id="fechaccid" path="fechaaccidente"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="horaaccid" class="col-md-2 col-form-label mr-1">Hora Accidente:</label>
					<div class="col-md-7">
						<form:input class="form-control" type="time" id="horaaccid" path="horaaccidente"/>
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
						<input type="submit" class="btn btn-success" value="Guardar">
				</div>
	
			</form:form>
		</div>
	</div>
</div>


<div class="container">
	<c:if test="${listaaccidentes.size() == 0}">
		<h5 class="text-center bg-secondary text-white-50 py-2 mt-5">No contiene reportes de accidentes</h5>
	</c:if>
	
	<c:if test="${listaaccidentes.size() > 0}">
		<h5 class="text-center bg-dark text-white py-2 mb-0 mt-5">Reportes de accidentes realizados por el Cliente </h5>
		<br>
		<div class="table-responsive-md">
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Fecha</th>
						<th scope="col">Hora</th>
						<th scope="col">Suceso</th>
						<th scope="col">Lugar</th>
					</tr>
				</thead>
				<c:forEach items="${listaaccidentes}" var="la">
					<tr>
						<td scope="row">${la.getFechaaccidente()}</td>
						<td>${la.getHoraaccidente()}</td>
						<td>${la.getSucesoaccidente()}</td>
						<td>${la.getLugaraccidente()}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>
</div>



	
<%@ include file="footer.jsp"%>