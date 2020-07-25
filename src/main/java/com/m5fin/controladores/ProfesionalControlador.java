package com.m5fin.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Capacitaciones;
import com.m5fin.dao.Clientes;
import com.m5fin.dao.Empleados;
import com.m5fin.dao.Mejoras;
import com.m5fin.dao.Visitas;
import com.m5fin.servicio.CapacitacionServicio;
import com.m5fin.servicio.ClienteServicio;
import com.m5fin.servicio.EmpleadoServicio;
import com.m5fin.servicio.MejoraServicio;
import com.m5fin.servicio.VisitaServicio;


@Controller
@RequestMapping("/profesional")
public class ProfesionalControlador {
	
	@Autowired
	ClienteServicio cs;
	
	@Autowired
	EmpleadoServicio es;
	
	@Autowired
	VisitaServicio vs;
	
	@Autowired
	CapacitacionServicio cap;
	
	@Autowired
	MejoraServicio ms;
	
	// CU5 ---*** REVISAR CLIENTES *** --- //
	/* Lista los clientes existentes es una vista */
    @RequestMapping("/revisarclientes")    
    public String revisarcli(Model m){    
        List<Clientes> listrevisarcli= cs.listarClientes();  
        m.addAttribute("listaclientes",listrevisarcli);  
        return "revisarcliente";
    }
    
    // CU5 ---*** FIN REVISAR CLIENTES *** --- //
    
	// CU4 ---*** PLANIFICAR VISITAS *** --- //
    
	  @RequestMapping("/planificarvisitas") 
	  public String viewcli(Model m) {
		  System.out.println("Estamos en planificar visita en la sesion de listar clientes");
		  List<Clientes> listcli = cs.listarClientes(); 
		  m.addAttribute("list",listcli);
		  
			List<Visitas> listajpql = vs.ListarVisitasEspecial();
			m.addAttribute("listavisitas", listajpql);
			System.out.println("lista de objeto jspl: " + listajpql);
			return "planificarvisita";

	  }	
    
    
    
    
    
    /*  Planificar Visitas con ForEACH 
    @RequestMapping("/planificarvisitas")
	public String viewcli(Model m) {
		System.out.println("Estamos en planificar visita en la sesion de listar clientes");
		List<Clientes> listcli = cs.listarClientes();
		m.addAttribute("list", listcli);
		
		List<Visitas> listavisexis = vs.ListarVisitas();
		System.out.println("Visitas generadas" + listavisexis);
		m.addAttribute("listavisgen", listavisexis);
		System.out.println("Estamos en lista de visitas existentes ");
		
		List<Empleados> listaempleados = es.listarempleados();
		List<VisitasGeneradas> listavisitas = new ArrayList<VisitasGeneradas>();
		listcli.stream().forEach((L) ->{
				System.out.println("recorriendo lista"+ L);
				listavisexis.stream().forEach((V)->{
					System.out.println("recorriendo lista visita" + V);		
					if (L.getIdcliente() == V.getIdclientevisita()) {
						VisitasGeneradas vistagenerada = new VisitasGeneradas();
						System.out.println("Encontre uno igual " + L.getNombrecliente());
						vistagenerada.setNombrecliente(L.getNombrecliente());
						vistagenerada.setCiudadvisita(V.getCiudadvisita());
						vistagenerada.setDireccioncliente(L.getDireccioncliente());
						vistagenerada.setFechavisita(V.getFechavisita());
						vistagenerada.setTelefonocliente(L.getTelefonocliente());
						
						listaempleados.stream().forEach((E)->{
							System.out.println("recorriendo lista empelado"+ E);
							if (V.getIdempleadovisita() == E.getIdempleado()) {
								vistagenerada.setNombreempleado(E.getNombreempleado());
								listavisitas.add(vistagenerada);
							}
						});
					}		
						

				});
		});
		
		System.out.println("Lista de visitas + clientes + empleado: " + listavisitas);
		 
	    m.addAttribute("listavisitas",listavisitas);  
		return "planificarvisita";
		 
	} */
	
	
	
	
	  @RequestMapping(value = "/generarvisita/{id}/{ncliente}") 
	  public String visitacliente(@PathVariable int id, @PathVariable String ncliente, Model m){
	  
	  Visitas regvisita = new Visitas(); 
	  Clientes cliente = new Clientes();
	  cliente.setIdcliente(id);
	  regvisita.setCliente(cliente);
	  m.addAttribute("creavisita",regvisita);
	  System.out.println("Mostramos despues de crear Visita m:" + m);
	  
	  
	  List<Empleados> listemp=es.listarempleados();
	  m.addAttribute("listaemp",listemp);
	  System.out.println("Mostramos despues de listaemp:" + m);
	  
	  return "formvisita"; }
	  
	  
	  //guardamos el formulario en tabla visita
	  
	  @RequestMapping(value = "/guardarvisita") 
	  public String guardarvisita(@ModelAttribute("creavisita") Visitas visita, Model m) {
		  System.out.println("Estamos guardando la visita"); vs.agregarVisita(visita);
	  return "redirect:/profesional/planificarvisitas"; 
	  }
	 
   
    // CU4 ---*** FIN PLANIFICAR VISITAS *** --- //
	 
	 
	// CU ---*** INICIO CREAR CAPACITACION *** --- //
	  
	 /* Lista los clientes para generar capacitaciones*/
	    @RequestMapping("/crearcapacitacion")    
	    public String crearcapacitacion(Model m){    
	        List<Visitas> listrevisita = vs.ListarVisitas();  
	        m.addAttribute("listavisitas",listrevisita);  
	        System.out.println("listrevisita: " + listrevisita);
	        
	        List<Capacitaciones> listcap = cap.listarCapacitaciones();
	        m.addAttribute("listacapacitaciones", listcap);
	        System.out.println("listacapacitaciones : " + listcap);

	        return "listarcapacitacion";
	    }
	 
	    
	    @RequestMapping(value = "/generarcapacitacion/{id}/{ncliente}") 
		 public String generarcapacitacion(@PathVariable int id, @PathVariable String ncliente, Model m){
		 Capacitaciones regcap = new Capacitaciones();
		 Visitas visita = new Visitas();
		 visita.setIdvisita(id);
		 regcap.setVisita(visita);
		 m.addAttribute("regcap",regcap); 
		 m.addAttribute("ncliente", ncliente);
		 System.out.println("regcap que va al formulario: " + regcap);
		 System.out.println("ncliente va al formcapacitacion: " + ncliente);
		 return "formcapacitacion";
	    }
	    
	    /* guardamos el formulario de capacitaion */
		 @RequestMapping(value = "/guardarcapacitacion") 
		 public String guardarcapacitacion(@ModelAttribute("regcap") Capacitaciones capacitacion, Model m) {
			 System.out.println("Estamos guardando la capacitacion: " + capacitacion);
			 cap.agregarCapacitacion(capacitacion);
	   
		return "redirect:/profesional/crearcapacitacion";
		}
	// CU ---*** FIN CREAR CAPACITACION *** --- //
		 
		 
		// CU ---*** INICIO CREAR ACTIVIDAD DE MEJORA *** --- //

		 /* mostramos listado de clientes mara crear una mejora */
		 @RequestMapping("/lpmclientes")
			public String lpmclientes(Model m) {
				List<Clientes> listacliente = cs.listarClientes();
				m.addAttribute("lclientes", listacliente);
				return "preingresomejoras";
			}
		 
		 /* desplegamos formulario para ingresar la mejora con id de cliente asociado */
		 @RequestMapping(value = "/gestionarmejora/{id}/{ncliente}") 
		  public String gestionarmejora(@PathVariable int id, @PathVariable String ncliente, Model m){
			  Mejoras regmejora = new Mejoras(); 
			  Clientes cliente = new Clientes();
			  cliente.setIdcliente(id);
			  regmejora.setCliente(cliente);
			  m.addAttribute("regmejora",regmejora);
			  System.out.println("Mostramos regmejora que pasamos al formmejora:" + regmejora);
		  return "formmejora"; 
		  }
		 
		 
		 /* guardamos el formulario de mejora */
		 @RequestMapping(value = "/agregarmejora") 
		 public String guardarmejora(@ModelAttribute("regmejora") Mejoras mejora, Model m) {
			 System.out.println("Estamos guardando la mejora: " + mejora);
			 ms.agregarMejora(mejora);
	   
		return "redirect:/profesional/revisarmejoras";
		}

		// CU ---*** FIN CREAR ACTIVIDAD DE MEJORA *** --- //
		 
		
		// CU ---*** INICIO LISTAR ACTIVIDAD DE MEJORA *** --- //
		 
		 /* mostramos listado de clientes mara crear una mejora */
		 @RequestMapping("/revisarmejoras")
			public String revisarmejoras(Model m) {
				List<Mejoras> listamejoras = ms.listarMejoras();
				m.addAttribute("listamejoras", listamejoras);
				System.out.println("Listamejoras: " + listamejoras);
				return "listarmejoras";
			}
    
		// CU ---*** FIN LISTAR ACTIVIDAD DE MEJORA *** --- //
    
    
     
    

}
