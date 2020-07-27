package com.m5fin.controladores;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.m5fin.dao.Mejoras;
import com.m5fin.dao.Visitas;
import com.m5fin.servicio.AccidenteServicio;
import com.m5fin.servicio.AsesoriaServicio;
import com.m5fin.servicio.CapacitacionServicio;
import com.m5fin.servicio.ClienteServicio;
import com.m5fin.servicio.EmpleadoServicio;
import com.m5fin.servicio.MejoraServicio;
import com.m5fin.servicio.VisitaServicio;



@Controller
@RequestMapping("/administrador")
public class AdministradorControlador {

	static Logger log = LoggerFactory.getLogger(ClienteControlador.class.getName());
	
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
	EmpleadoServicio ps;
	

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
		 log.info("Registramos al nuevo cliente: " + cliente.getNombrecliente() + " id: " + cliente.getIdcliente());
		return "redirect:/administrador/listarclientes";
	}

	@RequestMapping("/eliminarcliente/{id}")
	public String eliminar(@PathVariable int id, Model m) {
		cs.eliminarCliente(id);
		log.debug("Eliminamos el cliente id: " + id);
		m.addAttribute("mensaje", "El cliente se eliminó exitosamente");
		return "redirect:/administrador/listarclientes";
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
		return "redirect:/administrador/listarclientes";
	}

	// --- *** FIN CU1 CRUD CLIENTES *** ----//
	
	


	// --- *** CU1 CRUD PROFESIONALES *** ----//
	@RequestMapping("/listarprofesionales")
	public String verempleaddo(Model m) {
		System.out.println("Estamos en listar profesionales");
		List<Empleados> listaempleado = ps.listarempleados();
		m.addAttribute("lempleado", listaempleado);
		System.out.println("Profesionales lista:"  + listaempleado);
		return "listarprofesional";
	}

	
	  @RequestMapping("/formprofesional") 
	  public String newempleado(Model m) {
		  m.addAttribute("empleado", new Empleados()); 
	  return "formprofesional"; }
	  
	  
	  
	  @RequestMapping(value = "/guardarprofesional") 
	  public String saveempleado(@ModelAttribute("cliente") Empleados empleado, Model m) {
		  System.out.println("empleado: " + empleado); 
		  ps.agregarEmpleado(empleado);
	  return "redirect:/administrador/listarprofesionales"; 
	  }
	  
	  @RequestMapping("/eliminarprofesional/{id}") 
	  public String eliminarempleado(@PathVariable int id, Model m) { 
		  ps.eliminarempleado(id);
		  m.addAttribute("mensaje", "El Profesional se eliminó exitosamente"); 
	  return "redirect:/administrador/listarprofesionales"; }
	  
	  @RequestMapping(value = "/editarprofesional/{id}") 
	  public String updateempleado(@PathVariable int id, Model m) { 
		  Empleados emp = new Empleados(); 
		  System.out.println("new emp:" + emp); 
		  emp = ps.FindEmpleadoById(id); 
		  System.out.println("emp pasado: " + emp);
		  m.addAttribute("empleado", emp); 
	  return "formeditprofesional"; }
	  
	  @RequestMapping(value = "/editguardarpro") public String
	  udataempleado(@ModelAttribute("empleado") Empleados empleado, Model m) {
	  ps.editarEmpleado(empleado); m.addAttribute("mensaje",  "El empleado ha sido editado exitosamente"); 
	  return  "redirect:/administrador/listarprofesionales"; }
	  
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
		  
		  listacapacitaciones.stream().forEach((C)->{
			  System.out.println("Elemento: " + C);
			  System.out.println("Fechacap " + C.getFechacapacitacion());
			  System.out.println("Empleado name " + C.getVisita().getEmpleado().getNombreempleado());
		  });
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
		  
		  listavisitas.stream().forEach((C)->{
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
		  
		  listamejoras.stream().forEach((C)->{
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
			
			m.addAttribute("listamejoras",listamejoras);
			m.addAttribute("listaccidente",listaccidente);
			m.addAttribute("listavisitas", listavisitas);
			m.addAttribute("listavisycap",listavisycap);
			
			return "reporteglobal";
		}
	  
	  
	  
	  // --- *** FIN REPORTE GLOBAL *** ----//
	 

	  // --- *** INICIO REPORTE POR CLIENTE *** ----//
	  @RequestMapping("/reportecliente")
		public String reportecliente(Model m) {
			List<Clientes> listacliente = cs.listarClientes();
			System.out.println("listacliente   : " + listacliente);
			m.addAttribute("listacliente",listacliente);
			return "reportecliente";
		}
	  
	  @RequestMapping("/listarreporte/{id}/{ncliente}") 
	  public String listarreporte(@PathVariable Integer id, @PathVariable String ncliente, Model m) {
		  m.addAttribute("ncliente", ncliente);
		  // Reportamos Mejoras por id cliente
		  List<Mejoras> listamejoras = ms.ListarPorId(id);
		  System.out.println("listamejoras: " + listamejoras);
		  m.addAttribute("listamejoras",listamejoras);
		  
		  // Reportamos Accidentes por id cliente
		  List<Accidentes> listaaccidentes = ac.ListarPorId(id);
		  m.addAttribute("listaaccidentes",listaaccidentes);
		  System.out.println("listaaccidentes: " + listaaccidentes);
		  
		  // Reportamos visitas por id cliente
		  List<Visitas> listavisitas = vs.ListarPorId(id);
		  m.addAttribute("listavisitas",listavisitas);
		  System.out.println("listavisitas: " + listavisitas);
		  
		  
		  // Reportamos visitas por id cliente
		  List<Capacitaciones> listacapacitaciones = cap.ListarPorId(id);
		  m.addAttribute("listacapacitaciones",listacapacitaciones);
		  System.out.println("listacapacitaciones: " + listacapacitaciones);
		  
	
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
			System.out.println("listaaccidentes lista          : "  + listaaccidentes);
			System.out.println("listaaccidentes lista ordenados: "  + listaaccidentesord);
			return "listaraccidentes";
		}
	  
	  
	
	  

}
