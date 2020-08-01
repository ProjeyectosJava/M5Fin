package com.m5fin.controladores;

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

import com.m5fin.dao.Asesorias;
import com.m5fin.dao.Capacitaciones;
import com.m5fin.dao.Chequeos;
import com.m5fin.dao.Clientes;
import com.m5fin.dao.Empleados;
import com.m5fin.dao.Mejoras;
import com.m5fin.dao.Visitas;
import com.m5fin.servicio.AsesoriaServicio;
import com.m5fin.servicio.CapacitacionServicio;
import com.m5fin.servicio.ChequeoServicio;
import com.m5fin.servicio.ClienteServicio;
import com.m5fin.servicio.EmpleadoServicio;
import com.m5fin.servicio.MejoraServicio;
import com.m5fin.servicio.VisitaServicio;


@Controller
@RequestMapping("/profesional")
public class ProfesionalControlador {
	
	static Logger log = LogManager.getLogger(ClienteControlador.class);

	
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
	
	@Autowired
	AsesoriaServicio as;
	
	@Autowired
	ChequeoServicio chk;
	
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
	  
	  return "formvisita"; 
	  }
	  
	  //guardamos el formulario en tabla visita
	  
	  @RequestMapping(value = "/guardarvisita") 
	  public String guardarvisita(@ModelAttribute("creavisita") Visitas visita, Model m) {
		  System.out.println("Estamos guardando la visita"); vs.agregarVisita(visita);
			log.info("Se registró una nueva visita " + "id:" + visita.getIdvisita());
	  return "redirect:/profesional/planificarvisitas"; 
	  }
	 
   
    // CU4 ---*** FIN PLANIFICAR VISITAS *** --- //
	 
	 
	// CU ---*** INICIO CREAR CAPACITACION *** --- //
	  
	 /* Lista las visitas para generar capacitaciones*/
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
			 log.info("Se registró una nueva capacitación " + "id:" + capacitacion.getIdcapacitacion());

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
				log.info("Se registró una nueva mejora " + "id:" + mejora.getIdmejora());
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
		 
		 
		 
		 
		// CU ---*** INICIO CREAR CASO DE ASESORIA *** --- //
		 @RequestMapping("/crearasesoria")    
		    public String crearasesoria(Model m){    
		        List<Visitas> listvisita = vs.ListarVisitas();  
		        m.addAttribute("listvisita",listvisita);  
		        System.out.println("listvisita asesoria: " + listvisita);
		        return "listavisitaasesoria";
		    }
		 
		// enviamos al cliente con una visita a formulario de asesorias 
		    @RequestMapping(value = "/generarasesoria/{id}/{ncliente}") 
			 public String generaasesoria(@PathVariable int id, @PathVariable String ncliente, Model m){
			 Asesorias regasesoria = new Asesorias();
			 Visitas visita = new Visitas();
			 visita.setIdvisita(id);
			 regasesoria.setVisita(visita);
			 m.addAttribute("regase",regasesoria); 
			 m.addAttribute("ncliente", ncliente);
			 System.out.println("regcap que va al formulario: " + regasesoria);
			 return "formasesoria";
		    }
		 
		 // guardamos el formulario de asesoria
		    @RequestMapping(value = "/guardarasesoria") 
			 public String guardarasesoria(@ModelAttribute("regase") Asesorias asesoria, Model m) {
				 System.out.println("Estamos guardando la Asesoria " + asesoria);
				 as.agregaAsesoria(asesoria);
				 log.info("Se registró una nueva asesoria " + "id:" + asesoria.getIdasesoria());
			return "redirect:/profesional/crearasesoria";
			}
		 
		// CU ---*** FIN CREAR CASO DE ASESORIA *** --- //
		    
		    
		    
		 // CU ---*** INICIO INGRESAR ASESORIA (GESTIONAR)*** --- //
		    
		    /*Ingresa al submenu de asesorias*/
		    @RequestMapping("/menuasesorias")    
		    public String menuasesorias(){
		    	return "menuasesorias";
		    }
		    
		    /*Ingresa a la gestion de asesorias normales*/
		    @RequestMapping("/gestionasesorianormal")    
		    public String ingresarasesoria(Model m){    
		    	List<Asesorias> listaasesorias = as.listarAsesorias();
		    	System.out.println("Listamos toda la tabla de asesorias : " + listaasesorias );
		    	m.addAttribute("lasesorias", listaasesorias);
		    	return "listaasesorianormal";
		    }
		    
		    /*Ingresa a la gestion de asesorias especiales*/
		    @RequestMapping("/gestionasesoriaespecial")    
		    public String gestionasesoriaespecial(Model m){
		    	boolean esEspecial = false;
		    	List<Asesorias> listaasesorias = as.listarAsesorias();
		    	System.out.println("Listamos asesorias : " + listaasesorias );
		    	m.addAttribute("listespecial", listaasesorias);
		    	
		    	for(Asesorias a:listaasesorias) {
		    		if(a.getEspecialasesoria().contentEquals("Si")){
		    			esEspecial = true;
		    		}		    		
		    	}
		    	
		    	m.addAttribute("esEspecial",esEspecial);
		    	
		    	System.out.println("pasamos m: " + m);
		        return "listaasesoriaespecial";
		    }
		    
		    

		    @RequestMapping(value = "/inciarasesorianormal/{idvi}/{idas}/{fechasesor}/{ncliente}/{especial}") 
			 public String inciarasesorianormal(@PathVariable int idvi, 
					 					  @PathVariable int idas, 
					 					  @PathVariable String fechasesor, 
					 					  @PathVariable String ncliente,
					 					  @PathVariable String especial,
					 					  Model m){
		    	
		    	Visitas regvisita = new Visitas();
		    	regvisita.setIdvisita(idvi);
				
		    	Asesorias regasesoria = new Asesorias();
				regasesoria.setIdasesoria(idas);
				regasesoria.setFechaasesoria(fechasesor);
				regasesoria.setGestionasesoria("En Curso");
				regasesoria.setEspecialasesoria(especial);
				regasesoria.setVisita(regvisita);
			 
				m.addAttribute("regase",regasesoria); 
				m.addAttribute("ncliente", ncliente);
				
				System.out.println("regcap que va al formulario: " + regasesoria);
				return "formasesoriainiciada";
		    }
		    
		    
		    
		    @RequestMapping(value = "/inciarasesoria/{idvi}/{idas}/{fechasesor}/{ncliente}/{especial}/{detalle}/{propuesta}") 
			 public String inciarasesoria(@PathVariable int idvi, 
					 					  @PathVariable int idas, 
					 					  @PathVariable String fechasesor, 
					 					  @PathVariable String ncliente,
					 					  @PathVariable String especial,
					 					  @PathVariable String detalle,
					 					  @PathVariable String propuesta,
					 					  Model m){
		    	
		    	Visitas regvisita = new Visitas();
		    	regvisita.setIdvisita(idvi);
				
		    	Asesorias regasesoria = new Asesorias();
				regasesoria.setIdasesoria(idas);
				regasesoria.setFechaasesoria(fechasesor);
				regasesoria.setGestionasesoria("En Curso");
				regasesoria.setEspecialasesoria(especial);
				regasesoria.setVisita(regvisita);
				regasesoria.setDetalleasesoria(detalle);
				regasesoria.setPropuestaasesoria(propuesta);
			 
				m.addAttribute("regase",regasesoria); 
				m.addAttribute("ncliente", ncliente);
				
				System.out.println("regcap que va al formulario: " + regasesoria);
				return "formasesoriainiciada";
		    }
		    
		    
		    
		    
		    
		    /*Guarda formulario formasesoriainiciada*/
		    @RequestMapping(value = "/guardarasesoriainiciada") 
			 public String guardarasesoriainiciada(@ModelAttribute("regase") Asesorias asesoria, Model m) {
				 as.agregaAsesoria(asesoria);
				 System.out.println("Asesoria Iniciada guardada: " + asesoria);
				 if(asesoria.getEspecialasesoria().contentEquals("No")) {
					 return "redirect:/profesional/gestionasesorianormal";
				 } else {
					 return "redirect:/profesional/gestionasesoriaespecial";
				 }
			}
		    
		    /*actualiza una asesoria en curso*/
		    @RequestMapping(value = "/actualizarasesoria/{idas}/{ncliente}") 
			 public String actualizarasesorianormal(@PathVariable int idas, @PathVariable String ncliente, Model m){		    	
		    	
		    	m.addAttribute("ncliente", ncliente);

		    	Asesorias asesorianormal = as.findAsesoriaByid(idas);
				m.addAttribute("asesorianormal", asesorianormal);
				//System.out.println("regcap que va al formulario: " + regasesoria);
				return "formeditasesorianormal";
		    }
		    
		 // CU ---*** FIN INGRESAR ASESORIA (GESTIONAR)*** --- //
    
		    
		    /*** INICIO CREAR CHECKLIST ***/
    
		    @RequestMapping("/crearchecklist")
			public String crearchecklist(Model m) {
			  List<Visitas> listavisita = vs.ListarVisitasEspecial();
			  m.addAttribute("listavisita", listavisita);
			  
			  System.out.println("pasamo el model m asi: " + m);
			  System.out.println("listavisita: " + listavisita);
			 
			return "crearchecklist";
			}
		    
		    
		    @RequestMapping(value = "/agregarchecklist/{idvis}/{ncliente}") 
			 public String agregarchecklist(@PathVariable int idvis, @PathVariable String ncliente, Model m){		    	
		    	
		    	m.addAttribute("ncliente", ncliente);
		    	Visitas visita = new Visitas();
		    	visita.setIdvisita(idvis);
	    		Chequeos chequeo = new Chequeos();
		    	chequeo.setVisita(visita);
		    	chequeo.setEstadochequeo("Iniciado");
		    	
		    	m.addAttribute("chequeo", chequeo);
				System.out.println("chequeo: " + chequeo);
				return "formchecklist";
		    }
		    
		    
		    /*Guarda formulario formasesoriainiciada*/
		    @RequestMapping(value = "/guardarchecklist") 
			 public String guardarchecklist(@ModelAttribute("chequeo") Chequeos chequeo, Model m) {
		    	System.out.println("chequeo a guardar: " + chequeo);
				 chk.agregarChequeo(chequeo);
				 log.info("Se registró una nuevo checklist " + "id:" + chequeo.getIdchequeo());
			return "redirect:/profesional/crearchecklist";
			}
		    
		 
    
		    /*** FIN CREAR CHECKLIST ***/
		    
		    
		    /*** INICIO RESPONDER CHECKLIST ***/
		    /*obtenemos una lista solo de las visitas que tienen creadas un checklist*/
		    @RequestMapping("/responderchecklist") 
			 public String responderchecklist(Model m) {
		    	List<Chequeos> listachequeos = filtrarListaVisitas(chk.ListarChequeos());
		    	m.addAttribute("listachequeos", eliminarDuplicados(listachequeos));
		    	System.out.println("lista visitas a mostrar: " + eliminarDuplicados(listachequeos));		
		
			return "listarchecklist";
		    }
		    
		    
		    /*Mostramos todos los chequeos asociados a una visita*/
		    @RequestMapping(value="/mostrarchecklist/{idvis}") 
			 public String mostrarchecklist(@PathVariable int idvis, Model m) {
		    	/*obtenemos una lista filtrada solo con las visitas que tienen chequeos*/
		    	List<Chequeos> listachequeos = filtrarListaChequeos(chk.ListarChequeos(), idvis);
		    	m.addAttribute("listachequeos", listachequeos);
   	
		    	for(Chequeos check:listachequeos) {
		    		m.addAttribute("chequeo"+check.getIdchequeo(),check);
		      	}
		    	System.out.println("m: " + m);
		    	//System.out.println("chequeo a guardar: " + listachequeos);		
		    	
			return "listarchecklistaresponder";
		    }
		    
		    
		    /*
		     * Eliminamos la duplicdad de visitas y entregamos 
		     * una lista de visitas sin duplicidad para ser mostrada en la vista
		     * */
		    public List<Chequeos> eliminarDuplicados(List<Chequeos> lista) {
		    	int[] arregloIdVisitas = new int[lista.size()];
		    	int i = 0;
		    	int cont = 0;
		    	ArrayList<Integer> arraylistConIdUnico = new ArrayList();
		    	List<Chequeos> listaConIdsUnicos = new ArrayList<Chequeos>();
		   
		    	/*
		    	 * pasamos todos los Idvisita que vienen de lista 
		    	 * a un arregloIdVisitas
		    	 * */
		    	for(Chequeos c:lista) {
		    		arregloIdVisitas[i] = c.getVisita().getIdvisita();
		    		i++;
		    	}
		    	
		    	/*
		    	 * recorremos el arregloIdVisitas 
		    	 * y los id duplicados son reemplazados por un cero
		    	 * */
		    	i = 0;
		    	for(int a:arregloIdVisitas) {
		    		int temp = arregloIdVisitas[i];
		    		for(int j = i+1; j < arregloIdVisitas.length; j++) {
		    			if(arregloIdVisitas[i] == arregloIdVisitas[j]) {
		    				arregloIdVisitas[j] = 0;
		    			}
		    		}
		    		i++;
		    	}
		    	
		    	/*
		    	 * recorremos el arregloIdVisitas y pasamos todos los valores 
		    	 * distintos de cero al arraylistConIdUnico
		    	 * */
		    	i = 0;
		    	for(int a:arregloIdVisitas) {
		    		if(arregloIdVisitas[i] != 0) {
		    			cont++;
		    			arraylistConIdUnico.add(arregloIdVisitas[i]);
		    		}
		    		i++;
		    	}
		    	
		    	/*
		    	 * Recorremos lista y comparamos su Idvisita con el idvisita del arraylistConIdUnico
		    	 * si es igual el registro de lista se almacena en listaConIdsUnicos
		    	 * como arraylistConIdUnico siempre sera de menor tamaño que lista
		    	 * la comparacion se realiza hasta que se recorre por completo el arraylistConIdUnico
		    	 * para ello el incrementador i antes de una accion consulta 
		    	 * si es menor que el tamaño del arraylistConIdUnico
		    	 * 
		    	 * finalmente retornamos la listaConIdsUnicos que sera mostrada en la vista
		    	 */
		    	i = 0;
		    	for(Chequeos chq:lista) {
		    		
		    		if(i < arraylistConIdUnico.size()) {
		    			if(chq.getVisita().getIdvisita() == arraylistConIdUnico.get(i).intValue()) {
		    				listaConIdsUnicos.add(chq);
		    				i++;
		    			}
		    		}
		    	}
		    	
		    	System.out.println("arregloIdVisitas.length: " + arregloIdVisitas.length);
		    	System.out.println("contador: " + cont);
		    	System.out.println("arregloConIdUnico: " + arraylistConIdUnico);
		    	System.out.println("listaConIdsUnicos: " + listaConIdsUnicos);
		    	System.out.println("listaConIdsUnicos.size(): " + listaConIdsUnicos.size());
		    	return listaConIdsUnicos;
		    }
		    
		    /***retornamos una lista de Chequeos solo con registros de la visita con id entregado***/
			public List<Chequeos> filtrarListaChequeos(List<Chequeos> lista, int id) {
				List<Chequeos> listafiltrada = new ArrayList<Chequeos>();
				for(Chequeos list:lista) {
					if(list.getVisita().getIdvisita() == id)
						listafiltrada.add(list);
				}
				return listafiltrada;
			}
			
		
			/***retornamos una lista solo con las visitas que tienen creado un cheklist***/
			public List<Chequeos> filtrarListaVisitas(List<Chequeos> lista) {
				int idvisita = 0;
				List<Chequeos> listafiltrada = new ArrayList<Chequeos>();
				for(Chequeos list:lista) {
					if(list.getVisita().getIdvisita() != idvisita )
						listafiltrada.add(list);
						idvisita = list.getVisita().getIdvisita();
				}
				return listafiltrada;
			}
		    
		
			
			 @RequestMapping(value = "/actualizarchecklist") 
			 public String actualizarchecklist(@ModelAttribute("chequeo") Chequeos chequeo, Model m){		    	
		    	chk.editalChequeo(chequeo);
		    	int idvis = chequeo.getVisita().getIdvisita();
		    	m.addAttribute("idvis",idvis);
		    	System.out.println("chequeo actualizado " + chequeo);
				return "redirect:/profesional/mostrarchecklist/{idvis}";
				
		    }
			
		    /*** FIN RESPONDER CHECKLIST ***/
		    
		    

}
