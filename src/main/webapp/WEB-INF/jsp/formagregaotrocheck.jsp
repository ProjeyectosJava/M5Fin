<%@ include file="menupro.jsp"%>

<h4 class="text-center bg-dark text-white py-3">Creando Checklist para el cliente ${ncliente}</h4>
<div class="container mt-4">
	<div class="row justify-content-center align-items-center">
		<div class="col-md-10">
			<form action="">
			Si
			<input type="radio" name="consulta" value="si">
			NO
			<input type="radio" name="consulta" value="no">
			<input type="submit" value="Enviar">
			</form>
		
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>