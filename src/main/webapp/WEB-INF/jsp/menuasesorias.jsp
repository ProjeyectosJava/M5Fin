<%@ include file="menupro.jsp" %>


	<nav class="navbar navbar-expand-sm bg-dark navbar-dark mt-0">
		<a class="navbar-brand" href="${baseURL}/profesional/menuasesorias"> 
			Asesorias
		</a>
		
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown2" aria-controls="navbarNavDropdown2"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	
		<div class="collapse navbar-collapse" id="navbarNavDropdown2">
			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link"	href="${baseURL}/profesional/gestionasesorianormal">Normales </a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${baseURL}/profesional/gestionasesoriaespecial">Especiales</a>
				</li>
			</ul>
		</div>
	</nav>
 