package com.m5fin.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Clientes;
import com.m5fin.servicio.ClienteServicio;

//import jdk.internal.org.jline.utils.Log;

@Controller
public class VisitaControlador {

	@Autowired
	ClienteServicio cs;

	/*
	 * @Autowired IEmpleadoServicio servicioempref;
	 * 
	 * @Autowired IVisitaServicio serviciovispref;
	 */

	/* listamos datos del cliente */
	@RequestMapping("/planificarvisitas")
	public String viewcli(Model m) {
		System.out.println("Estamos en planificar visita en la sesion de listar clientes");
		List<Clientes> listcli = cs.listarClientes();
		m.addAttribute("list", listcli);

		/*
		 * List<Visitas> listagenerada = serviciovispref.getAllVisitas();
		 * System.out.println("Visitas generadas" + listagenerada);
		 * m.addAttribute("listagenerada", listagenerada);
		 * System.out.println("Estamos en lista de visitas existentes ");
		 */
	
		 
		 return "planificarvisita";
		 
	}
}

/*
 * pasamos los dastos del cliente para generar una planificacion de visita
 * 
 * @RequestMapping(value = "/generarvisita/{id}/{ncliente}") public String
 * visitacliente(@PathVariable int id, @PathVariable String ncliente, Model m){
 * 
 * Visitas regvisita = new Visitas(); regvisita.setIdClienteVisita(id);
 * m.addAttribute("command",regvisita);
 * System.out.println("Mostramos despues de command m:" + m);
 * 
 * List<Empleados> listemp=daoemp.getEmpleados();
 * m.addAttribute("listaemp",listemp);
 * System.out.println("Mostramos despues de listaemp:" + m);
 * 
 * return "formvisita"; }
 * 
 * guardamos el formulario en tabla visita
 * 
 * @RequestMapping(value = "/guardarvisita", method = RequestMethod.POST) public
 * String guardarvisita(@ModelAttribute("vis") Visitas vis) { daovis.save(vis);
 * return "redirect:planificarvisita"; }
 * 
 * 
 * }
 */