<%@ include file="menucli.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Creando Asesooria a cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form:form method="post" action="../../guardarasesoria" modelAttribute="regase">
				<div class="form-group row">
					<label for="detalleasesoria" class="col-md-2 col-form-label mr-1">Detalle</label>
						<div class="col-md-7"> 
							<form:input class="form-control" id="detalleasesoria" path="detalleasesoria"/> 
						</div>
				</div>
				<div class="form-group row">
					<label for="gestionasesoria" class="col-md-2 col-form-label mr-1">Gestion</label>
						<div class="col-md-7"> 
							<form:input class="form-control" id="gestionasesoria" path="gestionasesoria"/>
						</div>
				</div>
				<div class="form-group row">
					<label for="propuestaasesoria" class="col-md-2 col-form-label mr-1">Propuesta</label>
						<div class="col-md-7">  
							<form:input class="form-control" id="propuestaasesoria" path="propuestaasesoria"/>
						</div>
				</div>
				
				<div class="form-group row">
					<label for="fechaasesoria" class="col-md-2 col-form-label mr-1">Fecha Asesoria</label>
						<div class="col-md-7">  
							<form:input class="form-control" id="fechaasesoria" path="fechaasesoria"/>
						</div>
				</div>
				
				<div class="form-group row">
					<label for="especialasesoria" class="col-md-2 col-form-label mr-1">Fecha Asesoria</label>
						<div class="col-md-7"> 
							<form:input class="form-control" id="especialasesoria" path="especialasesoria"/>
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

<<<<<<< HEAD
	<br>
	<c:if test="${msg == null}">
	<h2>Formulario asesoria cliente</h2>
	<form:form method="post" action="../guardarasesoria" modelAttribute="regase">
		<table>
			<tr>
				<td>
					Detalle Asesoria
				</td>
				<td> 
					<form:input path="detalleasesoria"/><br> 
				</td>
			</tr>
			<tr>
				<td>
					Gestion Asesoria
				</td>
				<td>
					<form:input path="gestionasesoria"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Propuesta 
				</td>
				<td>
					<form:input path="propuestaasesoria"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Fecha Asesoria 
				</td>
				<td>
					<form:input path="fechaasesoria"/><br>
				</td>
			</tr>
			<tr>
				<td>
					Asesoria Especial 
				</td>
				<td>
					<form:select path="especialasesoria">
						<option>Si</option>
						<option selected>No</option>
					</form:select>			
				</td>
			</tr>		
			<tr>
				<td>
					Id Visita de Asesoria
				</td>
				<td>
					<form:input path="idvisitaasesoria" readonly="true"/><br>
				</td>
			</tr>
			<tr>
			<td colspan="2">
				<input type="submit" value="Guardar">  
			</td>
			</tr>
		</table>
	</form:form>
	</c:if>
</body>
</html>
=======
<%@ include file="footer.jsp"%>
>>>>>>> 8c3152ea630fa75779b427be8b6bf53276beb2fb
