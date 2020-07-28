<%@ include file="/menuroot.jsp" %>

<div class="container">
<h1>Informacion para Consumir Api Rest</h1>
<strong>Consideraciones:</strong>
<ul>
	<li>La api esta creada sobre la tabla Clientes.</li>
	<li>Tomar en cuenta que localhost:8181 debera adaptarlo en funcion de su configuracion local.</li>
	<li>Recomendamos usar Postman para realizar las pruebas.</li>
	<li>La aplicacion debe estar en ejecucion para realizar las pruebas con Postman</li>
	<li>El formato de entrada y salida de informacion es JSON</li>
</ul>

<table border="1" cellpadding="3">
<tr>
	<td>Listar todos los registros</td>
	<td>GET: http://localhost:8181/m5fin/rest/clilist</td>
</tr>
<tr>
	<td>Listar un resgitro</td>
	<td>GET: http://localhost:8181/m5fin/rest/clidetalle/ID <- reemplazar ID por un id de registro valido</td>
</tr>
<tr>
	<td>Guardar un nuevo resgitro</td>
	<td>POST: http://localhost:8181/m5fin/rest/clilist</td>
</tr>
<tr>
	<td>Actualizar un resgitro</td>
	<td>PUT: http://localhost:8181/m5fin/rest/clilist</td>
</tr>
<tr>
	<td>Eliminar un resgitro</td>
	<td>DELETE: http://localhost:8181/m5fin/rest/clidetalle/ID <- reemplazar ID por un id de registro valido</td>
</tr>
</table>


</div>

</body>
</html>