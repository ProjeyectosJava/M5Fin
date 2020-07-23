package com.m5fin.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m5fin.dao.Clientes;
import com.m5fin.dao.Empleados;
import com.m5fin.dao.Visitas;
import com.m5fin.dao.VisitasGeneradas;
import com.m5fin.servicio.ClienteServicio;
import com.m5fin.servicio.EmpleadoServicio;
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
					VisitasGeneradas vistagenerada = new VisitasGeneradas();
					if (L.getIdcliente() == V.getIdclientevisita()) {
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
		 
	}
    
    @RequestMapping(value = "/generarvisita/{id}/{ncliente}") 
	 public String visitacliente(@PathVariable int id, @PathVariable String ncliente, Model m){

	 Visitas regvisita = new Visitas();
	 regvisita.setIdclientevisita(id);
	 m.addAttribute("creavisita",regvisita); 
	 System.out.println("Mostramos despues de crear Visita m:" + m);
	 
	 List<Empleados> listemp=es.listarempleados();
	 m.addAttribute("listaemp",listemp); 
	 System.out.println("Mostramos despues de listaemp:" + m);
	 
	 return "formvisita";
}
    
    
	/* guardamos el formulario en tabla visita */
	 @RequestMapping(value = "/guardarvisita") 
	 public String guardarvisita(@ModelAttribute("creavisita") Visitas visita, Model m) {
		 System.out.println("Estamos guardando la visita");
		 vs.agregarVisita(visita);
  
		 
	return "redirect:/profesional/planificarvisitas";
	}
 
    
    
    
    
    // CU4 ---*** PLANIFICAR VISITAS *** --- //
    
    
    

}