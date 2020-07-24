package com.m5fin.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Accidentes;
import com.m5fin.dao.Asesorias;
import com.m5fin.dao.Visitas;
import com.m5fin.servicio.AccidenteServicio;
import com.m5fin.servicio.AsesoriaServicio;
import com.m5fin.servicio.VisitaServicio;



@Controller
@RequestMapping("/cliente")
public class ClienteControlador {
	

	@Autowired
	AccidenteServicio ac;
	
	@Autowired
	VisitaServicio vs;
	
	
	@Autowired
	AsesoriaServicio as;
	
	// --- *** CU INICIO AGREGAR ACCIDENTE *** ----//
	@RequestMapping("/reportaraccidente")
	public String reportaraccidente(Model m) {
		Accidentes accidente = new Accidentes();
		m.addAttribute("accidente", accidente);
		System.out.println("pasamos objeto accidente: " + accidente);
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
	  		  
	List<Visitas> listajpql = vs.ListarVisitasEspecial();
	m.addAttribute("listavisitasase", listajpql);
	System.out.println("lista de objeto jspl: " + listajpql);
	

	List<Asesorias> listaasesorias = as.listarAsesorias();
	System.out.println("Listamos toda la tabla de asesorias");
	m.addAttribute("lasesorias", listaasesorias);
	
	return "listvisase";
	
	}
	
  
   // enviamos al cliente con una visita a formulario de asesorias 
    @RequestMapping(value = "/generarasesoria/{id}") 
	 public String generaasesoria(@PathVariable int id, Model m){
	 Asesorias regasesoria = new Asesorias();
	 regasesoria.setIdvisitaasesoria(id);
	 m.addAttribute("regase",regasesoria); 
	 System.out.println("regcap que va al formulario: " + regasesoria);
	 return "formasesoria";
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