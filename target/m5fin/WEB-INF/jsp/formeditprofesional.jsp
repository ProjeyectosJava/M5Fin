<%@ include file="menuadmin.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Editando profesional ${empleado.getNombreempleado()}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="../editguardarpro" modelAttribute="empleado">
				<div class="form-group row">
					<label for="nombreempl" class="col-md-2 col-form-label mr-1">Nombre:</label> 
					<div class="col-md-7">
						<form:input class="form-control" id="nombreempl" path="nombreempleado"/>
					</div>
				</div>
				<div class="form-group row">
					<label for="especialidadempl" class="col-md-2 col-form-label mr-1">Especialidad:</label>
					<div class="col-md-7">
						<form:input class="form-control" id="especialidadempl" path="especialidadempleado"/>
						<form:hidden path="idempleado"/>
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

<%@ include file="footer.jsp"%>