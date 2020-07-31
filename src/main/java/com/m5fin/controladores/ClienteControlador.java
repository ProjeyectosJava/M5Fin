package com.m5fin.controladores;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Accidentes;
import com.m5fin.dao.Asesorias;
import com.m5fin.dao.Clientes;
import com.m5fin.dao.Visitas;
import com.m5fin.servicio.AccidenteServicio;
import com.m5fin.servicio.AsesoriaServicio;
import com.m5fin.servicio.ClienteServicio;
import com.m5fin.servicio.VisitaServicio;



@Controller
@RequestMapping("/cliente")
public class ClienteControlador {
	
	static Logger log = LogManager.getLogger(ClienteControlador.class);
	
	@Autowired
	ClienteServicio cl;

	@Autowired
	AccidenteServicio ac;
	
	@Autowired
	VisitaServicio vs;
	
	
	@Autowired
	AsesoriaServicio as;
	
	// --- *** CU INICIO AGREGAR ACCIDENTE *** ----//
	@RequestMapping("/reportaraccidente")
	public String reportaraccidente(Model m) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("Entramos a acceso usuario");
        
		
		  if (auth != null){ System.out.println("acceso usuario dentro del if: :" +
		  auth.getName());
		  
		  }
		 
        // buscamos email (nombre de usuario) y buscamos el id del cliente
        List<Clientes> listacliemail =  cl.ListarClienteporEmail(auth.getName());
        System.out.println("Listamos el cliente por id que tenia un email:" + listacliemail);
        
		Accidentes accidente = new Accidentes();
		Clientes clie = new Clientes();
		
		for (Clientes L:listacliemail) {
			
			 System.out.println("Listamos capid el cliente dentro del for:" + L.getIdcliente());
			 clie.setIdcliente(L.getIdcliente());

		
		
		accidente.setCliente(clie);
		m.addAttribute("accidente", accidente);
		System.out.println("pasamos objeto accidente: " + accidente);
		
		List<Accidentes> listaaccidentes = ac.ListarPorId(L.getIdcliente());
		System.out.println("Listamos toda la tabla de asesorias" + listaaccidentes);
		m.addAttribute("listaaccidentes", listaaccidentes);
		
		}
		

		return "reportaraccidente";
	}
	
	
	
	@RequestMapping(value = "/guardaraccidente")
	public String saveaccidente(@ModelAttribute("accidente") Accidentes accidente, Model m) {
		System.out.println("Accidente a guardar: " + accidente);
		ac.agregarAccidente(accidente);
		System.out.println("accidente guardado: " + accidente);
		return "redirect:/submenucliente";
	}
	
	// --- *** CU FIN AGREGAR ACCIDENTE *** ----//
	
	
	// --- *** CU INICIO AGREGAR CASO DE ASESORIAS  *** ----//
	
	// listamos las visitas para generar una asesoria
  @RequestMapping("/visitasasesoria") 
  public String viewcli(Model m) {
	  		  
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
              
        List<Clientes> listacliemail =  cl.ListarClienteporEmail(auth.getName());
        System.out.println("Listamos el cliente por emial:" + listacliemail);
       
		
		Clientes clie = new Clientes();
		
		for (Clientes L:listacliemail) {
			int capid = L.getIdcliente();
			 System.out.println("Listamos el cliente capid");
			 System.out.println("Listamos el cliente:" + L.getIdcliente());
			 
			List<Visitas> listajpql = vs.ListarPorId(L.getIdcliente());
			//List<Visitas> listajpql = vs.ListarVisitasEspecial();
			m.addAttribute("listavisitasase", listajpql);
			System.out.println("lista de objeto jspl: " + listajpql);	 
			
			
			List<Asesorias> listaasesorias = as.ListarPorId(L.getIdcliente());
			System.out.println("Listamos toda la tabla de asesorias");
			m.addAttribute("lasesorias", listaasesorias);
			
		}
	  
	
	
	
	return "listvisase";
	
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
	 return "formasesoriaespecial";
    }
    
    // guardamos el formulario de asesoria
    @RequestMapping(value = "/guardarasesoria") 
	 public String guardarasesoria(@ModelAttribute("regase") Asesorias asesoria, Model m) {
		 System.out.println("Estamos guardando la Asesoria " + asesoria);
		 as.agregaAsesoria(asesoria);
		
	return "redirect:/cliente/visitasasesoria";
	}
  
    // Eliminamos la asesoria del cliente
	@RequestMapping("/eliminarasesoria/{id}")
	public String eliminarasesoria(@PathVariable int id, Model m) {
		System.out.println("Id visita asesoria: " + id);
		System.out.println("Elimnado Asesoria");
		as.eliminaAsesoria(id);
		m.addAttribute("mensaje", "La asesoria se eliminó exitosamente");
		return "redirect:/cliente/visitasasesoria";
	}

// --- *** CU FIN  AGREGAR CASO DE ASESORIAS  *** ----//
	

	
	
	

}