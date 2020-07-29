<%@ include file="menuasesorias.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Iniciando Asesooria a cliente ${ncliente}</h4>
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
						<!--
						<form:input class="form-control" id="gestionasesoria" path="gestionasesoria" readonly="true"/>
						-->
						<form:select path="gestionasesoria" >
							<option selected>En Curso</option>
							<option>Finalizada</option>
						</form:select>
					</div>
				</div>
				
				<!-- 
				 <select NAME="choice" SIZE="5" width="20">
	              <c:forEach var="item" items="${list}">
	                <option>
	                  <c:out value="${item}" />
	                </option>
	              </c:forEach>
	            </select>
				 -->
				<div class="form-group row">
					<label for="especialasesoria" class="col-md-2 col-form-label mr-1">Asesoria Especial</label>
					<div class="col-md-7">  
						<form:input class="form-control" id="especialasesoria" path="especialasesoria" readonly="true"/>
					</div>
				</div>
				
			
				<div class="form-group row">
					<label for="idvivisita" class="col-md-2 col-form-label mr-1">IdVisitaAsesoria</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="idvivisita" path="visita.idvisita" readonly="true"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label for="idasesoria" class="col-md-2 col-form-label mr-1">idasesoria</label>
					<div class="col-md-7"> 
						<form:input class="form-control" id="idasesoria" path="idasesoria" readonly="true"/>
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

