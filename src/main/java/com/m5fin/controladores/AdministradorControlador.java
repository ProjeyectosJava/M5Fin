package com.m5fin.controladores;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Accidentes;
import com.m5fin.dao.Asesorias;
import com.m5fin.dao.Capacitaciones;
import com.m5fin.dao.Clientes;
import com.m5fin.dao.Empleados;
import com.m5fin.dao.ListaPagoMorosos;
import com.m5fin.dao.Mejoras;
import com.m5fin.dao.Pagos;
import com.m5fin.dao.Visitas;
import com.m5fin.servicio.AccidenteServicio;
import com.m5fin.servicio.AsesoriaServicio;
import com.m5fin.servicio.CapacitacionServicio;
import com.m5fin.servicio.ClienteServicio;
import com.m5fin.servicio.EmpleadoServicio;
import com.m5fin.servicio.MejoraServicio;
import com.m5fin.servicio.PagosServicio;
import com.m5fin.servicio.VisitaServicio;

@Controller
@RequestMapping("/administrador")
public class AdministradorControlador {

	static Logger log = LogManager.getLogger(ClienteControlador.class);

	@Autowired
	ClienteServicio cs;

	@Autowired
	CapacitacionServicio cap;

	@Autowired
	VisitaServicio vs;

	@Autowired
	MejoraServicio ms;

	@Autowired
	AsesoriaServicio as;

	@Autowired
	AccidenteServicio ac;

	@Autowired
	EmpleadoServicio es;

	@Autowired
	PagosServicio pse;

	boolean noexiste;

	// --- *** CU1 CRUD CLIENTES *** ----//
	@RequestMapping("/listarclientes")
	public String verclientes(Model m) {
		List<Clientes> listacliente = cs.listarClientes();
		m.addAttribute("lclientes", listacliente);
		return "listarclientes";
	}

	@RequestMapping("/formcliente")
	public String newcliente(Model m) {
		m.addAttribute("cliente", new Clientes());
		return "formcliente";
	}

	/*
	 * */
	@RequestMapping(value = "/guardarcliente")
	public String savecliente(@ModelAttribute("cliente") Clientes cliente, Model m) {
		System.out.println("cliente: " + cliente);
		cs.agregarCliente(cliente);
		log.info("Se registró un nuevo cliente " + "Id:" + cliente.getIdcliente() + " Nombre:"
				+ cliente.getNombrecliente());
		return "redirect:/administrador/listarclientes";
	}

	@RequestMapping("/eliminarcliente/{id}")
	public String eliminar(@PathVariable int id, Model m) {
		int elimino = cs.eliminarCliente(id);
		if(elimino == 1) {
			log.debug("Se eliminó el cliente id:" + id);
			m.addAttribute("mensaje", "El cliente se eliminó exitosamente");
			return "redirect:/administrador/listarclientes";			
		} else {
			/*aqui tenemos que crear una lista con todos los registros asociados a este cliente*/
			List<Accidentes> listaaccidentes = filtrarListaAccidente(ac.listarAccidentes(), id);
			List<Mejoras>    listamejoras    = filtrarListaMejoras(ms.listarMejoras(), id);
			List<Pagos>      listapagos      = filtrarListaPagos(pse.listarPagos(), id);
			List<Visitas>    listavisitas    = filtrarListaVisitas(vs.ListarVisitas(), id);
			
			m.addAttribute("idcliente", id);
			m.addAttribute("listaaccidentes",listaaccidentes);
			m.addAttribute("listamejoras",listamejoras);
			m.addAttribute("listapagos",listapagos);
			m.addAttribute("listavisitas", listavisitas);
			
			
			return "listarregistrosaeliminar";
		}
	}
	
	/***retornamos una lista de Accidentes solo con registros del cliente con id entregado***/
	public List<Accidentes> filtrarListaAccidente(List<Accidentes> lista, int id) {
		List<Accidentes> listafiltrada = new ArrayList<Accidentes>();
		for(Accidentes list:lista) {
			if(list.getCliente().getIdcliente() == id)
				listafiltrada.add(list);
		}
		return listafiltrada;
	}
	
	
	/***retornamos una lista de Mejoras solo con registros del cliente con id entregado***/
	public List<Mejoras> filtrarListaMejoras(List<Mejoras> lista, int id) {
		List<Mejoras> listafiltrada = new ArrayList<Mejoras>();
		for(Mejoras list:lista) {
			if(list.getCliente().getIdcliente() == id)
				listafiltrada.add(list);
		}
		return listafiltrada;
	}
	
	/***retornamos una lista de Pagos solo con registros del cliente con id entregado***/
	public List<Pagos> filtrarListaPagos(List<Pagos> lista, int id) {
		List<Pagos> listafiltrada = new ArrayList<Pagos>();
		for(Pagos list:lista) {
			if(list.getCliente().getIdcliente() == id)
				listafiltrada.add(list);
		}
		return listafiltrada;
	}
	
	/***retornamos una lista de Visitas solo con registros del cliente con id entregado***/
	public List<Visitas> filtrarListaVisitas(List<Visitas> lista, int id) {
		List<Visitas> listafiltrada = new ArrayList<Visitas>();
		for(Visitas list:lista) {
			if(list.getCliente().getIdcliente() == id)
				listafiltrada.add(list);
		}
		return listafiltrada;
	}
	
	@RequestMapping("/eliminaraccidente/{id}/{idcliente}")
	public String eliminaraccidente(@PathVariable int id, @PathVariable int idcliente, Model m) {
		ac.eliminarAccidente(id);
		return "redirect:/administrador/eliminarcliente/{idcliente}";
	}

	@RequestMapping(value = "/editarcliente/{id}")
	public String updatecliente(@PathVariable int id, Model m) {
		Clientes cli = new Clientes();
		System.out.println("new cli:" + cli);
		cli = cs.findClienteByid(id);
		System.out.println("cli pasado: " + cli);
		m.addAttribute("cliente", cli);
		return "formeditcliente";
	}

	@RequestMapping(value = "/editguardar")
	public String udatacliente(@ModelAttribute("cliente") Clientes cliente, Model m) {
		cs.editarCliente(cliente);
		m.addAttribute("mensaje", "El cliente ha sido editado exitosamente");
		log.info("Se modificó el registro del cliente" + " Id:" + cliente.getIdcliente() + " Nombre:"
				+ cliente.getNombrecliente());
		return "redirect:/administrador/listarclientes";
	}

	// --- *** FIN CU1 CRUD CLIENTES *** ----//

	// --- *** CU1 CRUD PROFESIONALES *** ----//
	@RequestMapping("/listarprofesionales")
	public String verempleaddo(Model m) {
		System.out.println("Estamos en listar profesionales");
		List<Empleados> listaempleado = es.listarempleados();
		m.addAttribute("lempleado", listaempleado);
		System.out.println("Profesionales lista:" + listaempleado);
		return "listarprofesional";
	}

	@RequestMapping("/formprofesional")
	public String newempleado(Model m) {
		m.addAttribute("empleado", new Empleados());
		return "formprofesional";
	}

	@RequestMapping(value = "/guardarprofesional")
	public String saveempleado(@ModelAttribute("cliente") Empleados empleado, Model m) {
		System.out.println("empleado: " + empleado);
		es.agregarEmpleado(empleado);
		log.info("Se registró un nuevo profesional" + " Id:" + empleado.getIdempleado() + " Nombre:"
				+ empleado.getNombreempleado());
		return "redirect:/administrador/listarprofesionales";
	}

	@RequestMapping("/eliminarprofesional/{id}")
	public String eliminarempleado(@PathVariable int id, Model m) {
		es.eliminarempleado(id);
		m.addAttribute("mensaje", "El Profesional se eliminó exitosamente");
		log.debug("Se eliminó el profesional Id:" + id);
		return "redirect:/administrador/listarprofesionales";
	}

	@RequestMapping(value = "/editarprofesional/{id}")
	public String updateempleado(@PathVariable int id, Model m) {
		Empleados emp = new Empleados();
		System.out.println("new emp:" + emp);
		emp = es.FindEmpleadoById(id);
		System.out.println("emp pasado: " + emp);
		m.addAttribute("empleado", emp);
		return "formeditprofesional";
	}

	@RequestMapping(value = "/editguardarpro")
	public String udataempleado(@ModelAttribute("empleado") Empleados empleado, Model m) {

		es.editarEmpleado(empleado);
		m.addAttribute("mensaje", "El empleado ha sido editado exitosamente");
		log.info("Se modifico el registro del profesional" + " Id:" + empleado.getIdempleado() + " Nombre:"
				+ empleado.getNombreempleado());
		return "redirect:/administrador/listarprofesionales";
	}

	// --- *** FIN CU1 CRUD PROFESIONALES *** ----//

	// --- *** INICIO CU VISUALIZAR ACTIVIDADES *** ----//

	  
	  @RequestMapping("/visualizadoractividades")
		public String visualizadoractividades(Model m) {
			System.out.println("lo enviamos a un menu para elejir una actividad");
			return "menuvisact";
		}
	  
	  @RequestMapping("/vcapacitaciones")
		public String vcapacitaciones(Model m) {
		  int opcion = 1;
		  List<Capacitaciones> listacapacitaciones = cap.ListarCapacitacionesEspecial();
		  m.addAttribute("listacapacitaciones", listacapacitaciones);
		  m.addAttribute("opcion", opcion);
		  /*
		  listacapacitaciones.stream().forEach((C)->{
			  System.out.println("Elemento: " + C);
			  System.out.println("Fechacap " + C.getFechacapacitacion());
			  System.out.println("Empleado name " + C.getVisita().getEmpleado().getNombreempleado());
		  });
		  */
		  System.out.println("pasamos una lista de capacitaciones " + listacapacitaciones);
		  System.out.println("pasamos opcion: " + opcion);
		  System.out.println("pasamo el model m asi: " + m);

		return "menuvisact";
	}

	
	@RequestMapping("/vvisitas")
	public String vvisitas(Model m) {
		int opcion = 2;
		List<Visitas> listavisitas = vs.ListarVisitasEspecial();
		m.addAttribute("listavisitas", listavisitas);
		m.addAttribute("opcion", opcion);

		listavisitas.stream().forEach((C) -> {
			System.out.println("Elemento: " + C);
			System.out.println("Fechacap " + C.getEmpleado().getNombreempleado());
		});
		System.out.println("pasamos una lista de capacitaciones " + listavisitas);
		System.out.println("pasamos opcion: " + opcion);
		System.out.println("pasamo el model m asi: " + m);
		return "menuvisact";
	}

	@RequestMapping("/vmejoras")
	public String vmejoras(Model m) {
		int opcion = 3;
		List<Mejoras> listamejoras = ms.ListarMejorasEspecial();
		m.addAttribute("listamejoras", listamejoras);
		m.addAttribute("opcion", opcion);

		listamejoras.stream().forEach((C) -> {
			C.getCliente().getIdcliente();
		});
		System.out.println("pasamos una lista de capacitaciones " + listamejoras);
		System.out.println("pasamos opcion: " + opcion);
		System.out.println("pasamo el model m asi: " + m);
		return "menuvisact";
	}

	@RequestMapping("/vasesorias")
	public String vasesorias(Model m) {
		int opcion = 4;
		List<Asesorias> listaasesorias = as.ListarAsesoriasEspecial();
		m.addAttribute("listaasesorias", listaasesorias);
		m.addAttribute("opcion", opcion);

		List<Visitas> listavisita = vs.ListarVisitasEspecial();

		System.out.println("pasamos una lista de capacitaciones " + listaasesorias);
		System.out.println("pasamos opcion: " + opcion);
		System.out.println("pasamo el model m asi: " + m);
		System.out.println("listavisita: " + listavisita);

		return "menuvisact";
	}

	// --- *** FIN CU VISUALIZAR ACTIVIDADES *** ----//

	// --- *** INICIO REPORTE GLOBAL *** ----//
	@RequestMapping("/reporteglobal")
	public String reporteglobal(Model m) {
		List<Mejoras> listamejoras = ms.listarMejoras();
		List<Accidentes> listaccidente = ac.listarAccidentes();
		List<Visitas> listavisitas = vs.ListarVisitas();
		List<Capacitaciones> listavisycap = cap.listarCapacitaciones();

		System.out.println("listamejoras   : " + listamejoras);
		System.out.println("listaccidente  : " + listaccidente);
		System.out.println("listaccidente  : " + listavisitas);
		System.out.println("listavisycap   : " + listavisycap);

		m.addAttribute("listamejoras", listamejoras);
		m.addAttribute("listaccidente", listaccidente);
		m.addAttribute("listavisitas", listavisitas);
		m.addAttribute("listavisycap", listavisycap);

		log.info("Se generó un reporte global");

		return "reporteglobal";
	}

	// --- *** FIN REPORTE GLOBAL *** ----//

	// --- *** INICIO REPORTE POR CLIENTE *** ----//
	@RequestMapping("/reportecliente")
	public String reportecliente(Model m) {
		List<Clientes> listacliente = cs.listarClientes();
		System.out.println("listacliente   : " + listacliente);
		m.addAttribute("listacliente", listacliente);
		return "reportecliente";
	}

	@RequestMapping("/listarreporte/{id}/{ncliente}")
	public String listarreporte(@PathVariable Integer id, @PathVariable String ncliente, Model m) {
		m.addAttribute("ncliente", ncliente);
		// Reportamos Mejoras por id cliente
		List<Mejoras> listamejoras = ms.ListarPorId(id);
		System.out.println("listamejoras: " + listamejoras);
		m.addAttribute("listamejoras", listamejoras);

		// Reportamos Accidentes por id cliente
		List<Accidentes> listaaccidentes = ac.ListarPorId(id);
		m.addAttribute("listaaccidentes", listaaccidentes);
		System.out.println("listaaccidentes: " + listaaccidentes);

		// Reportamos visitas por id cliente
		List<Visitas> listavisitas = vs.ListarPorId(id);
		m.addAttribute("listavisitas", listavisitas);
		System.out.println("listavisitas: " + listavisitas);

		// Reportamos visitas por id cliente
		List<Capacitaciones> listacapacitaciones = cap.ListarPorId(id);
		m.addAttribute("listacapacitaciones", listacapacitaciones);
		System.out.println("listacapacitaciones: " + listacapacitaciones);

		log.info("Se generó reporte del cliente id:" + id);

		return "reporteclientelistado";
	}

	// --- *** FIN REPORTE POR CLIENTE GLOBAL *** ----//

	// --- *** INICIO CALCULAR ACCIDENTABILIDAD *** ----//

	// LISTAR TABLA DE ACCIDENTES COMPLETA
	@RequestMapping("/listaraccidentes")
	public String listaccidentes(Model m) {
		System.out.println("Estamos en listar accidentes");
		List<Accidentes> listaaccidentes = ac.listarAccidentes();
		List<Accidentes> listaaccidentesord = ac.listarAccidentesOrd();

		m.addAttribute("listaaccidentes", listaaccidentesord);
		System.out.println("listaaccidentes lista          : " + listaaccidentes);
		System.out.println("listaaccidentes lista ordenados: " + listaaccidentesord);

		log.info("Se calculó tabla de accidentabilidad");

		return "listaraccidentes";

	}

	// --- *** FIN CALCULAR ACCIDENTABILIDAD *** ----//

	// --- *** INICIO CONTROL DE PAGO DE CLIENTES *** ----//

	// Listamos los clientes para gestion de pagos
	@RequestMapping("/controldepago")
	public String listaclipagos(Model m) {
		// creamos lista de tabla pagos
		List<Clientes> listalosclientes = cs.listarClientes();
		m.addAttribute("listalosclientes", listalosclientes);
		System.out.println("Lista completa de clientes:" + listalosclientes);

		// creamos lista de tabla pagos
		List<Pagos> listapagos = pse.listarPagos();
		m.addAttribute("listapagos", listapagos);
		System.out.println("Lista completa de pagos:" + listapagos);

		// Lista nueva de clientes para almacenar los registros no repetidos
		List<Clientes> listacligp = new ArrayList<Clientes>();
		System.out.println("Creamos nueva lista vacia");

		listalosclientes.stream().forEach((L) -> {
			noexiste = true;
			// iterados lista pagos
			for (Pagos V : listapagos) {
				System.out.println("Valor lista Cliente:" + L.getIdcliente());
				System.out.println("Valor lista Pagos:" + V.getCliente().getIdcliente());

				if (L.getIdcliente() != V.getCliente().getIdcliente()) {
					// si la el el cliente es distinto de cliente pagos no existe = true
					noexiste = true;
					System.out.println("valor comparacion ¿Son distintos?: " + noexiste);
				} else {
					// si el cliente es igual de cliente pagos no existe = false
					// si es falso debe terminar el ciclo y volver al ciclo de clientes
					noexiste = false;
					System.out.println("valor comparacion ¿Son distintos?: " + noexiste);
					break;
				}

			}

			System.out.println("Termino el ciclo");
			System.out.println("preguntamos si el ciclo termino en false");

			if (noexiste == true) {
				System.out.println("No existe:" + noexiste);
				System.out.println("Guardamos los registros");
				Clientes listagenerada = new Clientes();
				listagenerada.setIdcliente(L.getIdcliente());
				listagenerada.setNombrecliente(L.getNombrecliente());
				listagenerada.setDireccioncliente(L.getDireccioncliente());
				listagenerada.setEmailcliente(L.getEmailcliente());
				listagenerada.setTelefonocliente(L.getTelefonocliente());
				listacligp.add(listagenerada);

			}

		});

		System.out.println("La lista generada final fue:" + listacligp);
		m.addAttribute("listacligp", listacligp);

		return "lcligenerapagos";

	}

	// Una vez escogido el cliente lo enviamos a un formulario para gestion de pagos
	@RequestMapping(value = "/generapagosporcliente/{id}/{ncliente}")
	public String gestionclientepago(@PathVariable int id, @PathVariable String ncliente, Model m) {
		System.out.println("estamos  en generar por cliente");
		Pagos regpagos = new Pagos();
		Clientes cliente = new Clientes();
		cliente.setIdcliente(id);
		regpagos.setCliente(cliente);
		m.addAttribute("creapagos", regpagos);
		System.out.println("Mostramos despues de crear Pagos m:" + m);
		System.out.println("estamos enviando al formulario formgestionpagos");
		return "formgestionpagos";
	}

	// guardamos el formulario en tabla visita

	@RequestMapping(value = "/guardapagos")
	public String guardarpagos(@ModelAttribute("creapago") Pagos pago, Model m) {
		System.out.println("Estamos guardando el formulario de gestion pagos ");
		pse.agregarPago(pago);
		return "redirect:/administrador/controldepago";

	}

	// Listamos todos los clientes con morosidad
	@RequestMapping("/listaclientepagatr")
	public String listaclientesmoroso(Model m) {

		// creamos lista de todos los pagos
		List<Pagos> listamorosos = pse.listarPagos();
		m.addAttribute("listamorosos", listamorosos);
		System.out.println("Lista completa de pagos dentro de morosidad:" + listamorosos);
		
		// Capturo fecha de hoy 
		LocalDate today = LocalDate.now();
		// le doy un formato 
		//String fechaActual = today.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
		System.out.println("La fecha de hoy es: " + today);
		
		List<ListaPagoMorosos> listapag = new ArrayList<ListaPagoMorosos>();

		
		listamorosos.stream().forEach((L) -> {
			
			// asignamos fecha String BD a variable
			String fechap = L.getMesaniopago();
			System.out.println("Fecha de Pago capturada en String :" + fechap);
					
			// Convertimos fecha String a Date
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechapagos = LocalDate.parse(fechap, formateador);
			System.out.println(fechapagos);
			
			formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			//System.out.println(formateador.format(fechapagos));
			 
			System.out.println("Fecha de Pago:" + fechapagos);
			System.out.println("Fecha Actual:" + today);
			
			// Realizo comparacion de fechas para determinar si hay atrasos. 
			 Period periodo = Period.between(fechapagos, today);
			 if (periodo.getDays() > 1) {
				System.out.println("El Cliente: " + L.getCliente().getNombrecliente() + " Esta con morosidad"); 
				 
				 
				System.out.println("Han transcurrido " + periodo.getYears() + " años y " + periodo.getMonths() + " meses y "
						 + periodo.getDays() + " dias, desde " + fechapagos + " hasta " + today);
	
				m.addAttribute("year", periodo.getYears());
				m.addAttribute("mes", periodo.getMonths());
				m.addAttribute("dia", periodo.getDays());
				System.out.println("Tiempo morosidad " + periodo.toString());
				
				// Creo un nuevo objeto de Pagos
				
				//Pagos listaM = new Pagos();
				ListaPagoMorosos listaM = new ListaPagoMorosos();
				listaM.setIdclientepago(L.getCliente().getIdcliente());	
				listaM.setNombrecliente(L.getCliente().getNombrecliente());
				listaM.setIdpago(L.getIdpago());
				listaM.setMesaniopago(L.getMesaniopago());
				listaM.setMontoadicionalpago(L.getMontoadicionalpago());
				listaM.setMontoregularpago(L.getMontoregularpago());
				listaM.setPeriodoDia(periodo.getDays());
				listaM.setPeriodoMes(periodo.getMonths());
				listaM.setPeriodoYear(periodo.getYears());
				listapag.add(listaM);
				
				System.out.println("La lista generada de Morosos final fue:" + listapag);
				System.out.println("La lista generada de pagos:" + listamorosos);
				
				m.addAttribute("listapag", listapag);
				System.out.println("Ultima lista generada:" + listapag);
		 
			 }

		});
	

		return "listaclientepagatr";
	}


}
