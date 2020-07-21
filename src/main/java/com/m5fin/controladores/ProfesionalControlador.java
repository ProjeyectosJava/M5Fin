package com.m5fin.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Clientes;
import com.m5fin.servicio.ClienteServicio;


@Controller
@RequestMapping("/profesional")
public class ProfesionalControlador {
	
	@Autowired
	ClienteServicio cs;
	
	
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

		/*
		 * List<Visitas> listagenerada = serviciovispref.getAllVisitas();
		 * System.out.println("Visitas generadas" + listagenerada);
		 * m.addAttribute("listagenerada", listagenerada);
		 * System.out.println("Estamos en lista de visitas existentes ");
		 */
	
		 
		 return "planificarvisita";
		 
	}
    
    
    // CU4 ---*** PLANIFICAR VISITAS *** --- //
    
    
    

}
