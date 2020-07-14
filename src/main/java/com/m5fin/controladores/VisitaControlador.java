package com.m5fin.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;   
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;

import com.m5fin.modelo.beans.Clientes;
import com.m5fin.dao.ClienteDao;
import com.m5fin.modelo.beans.Visitas;
import com.m5fin.modelo.beans.VisitasGeneradas;
import com.m5fin.dao.VisitaDao;
import com.m5fin.modelo.beans.Empleados;
import com.m5fin.dao.EmpleadoDao;

@Controller
public class VisitaControlador {

	@Autowired
	ClienteDao dao;
	
	@Autowired
	EmpleadoDao daoemp;
	
	@Autowired
	VisitaDao daovis;
	

	static Logger log = Logger.getLogger(VisitaControlador.class.getName());
	 
       
    /*agregar visita a nuestro poryecto*/
    @RequestMapping(value="/guardarvisita",method = RequestMethod.POST)    
    public String guardarvisita(@ModelAttribute("vis") Visitas vis){   
        daovis.save(vis);
        log.info("Visita generada de cliente id: " + vis.getIdClienteVisita() + " con empleado id: " + vis.getIdEmpleadoVisita());
        System.out.println("vis: " + vis);
        return "redirect:/planificarvisita";
    }
    

    /*listar clientes y visitas generadas en nuestro proyecto*/
    @RequestMapping("/planificarvisita")    
    public String listarclientes(Model m){    
        List<Clientes> list=dao.getClientes();
        System.out.println("listaclientes: " + list);
        m.addAttribute("list",list);  
        System.out.println("m con list " + m);
        List<VisitasGeneradas> listagenerada = daovis.getVisitasGeneradas();
        m.addAttribute("listagenerada", listagenerada);
        return "planificarvisita";
    }
    

    /*pasamos los datos del cliente id y nombre para luego entregarlos al formulario*/
    @RequestMapping(value="/generarvisita/{id}/{ncliente}")    
    public String gestionaempleado(@PathVariable int id, @PathVariable String ncliente, Model m){  
    	Visitas regvisita = new Visitas();
    	regvisita.setIdClienteVisita(id);
    	m.addAttribute("command", regvisita);
    	
		List<Empleados> listaemp = daoemp.getEmpleados();
		m.addAttribute("listaemp", listaemp); 
		
		System.out.println("model m add listaemp: " + m);
        
		return "formvisita";
    }
    
    public void listaempleado() {
    	List<Empleados> listaemp=daoemp.getEmpleados();
    	System.out.println("listaempleados: " + listaemp);
    }
         
}