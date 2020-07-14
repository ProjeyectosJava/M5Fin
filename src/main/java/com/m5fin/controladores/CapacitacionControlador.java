package com.m5fin.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.m5fin.dao.CapacitacionDao;
import com.m5fin.dao.VisitaDao;
import com.m5fin.modelo.beans.Capacitaciones;
import com.m5fin.modelo.beans.Visitas;

@Controller
public class CapacitacionControlador {

	@Autowired
	VisitaDao daovis;
	
	@Autowired
	CapacitacionDao daocap;
	
	static Logger log = Logger.getLogger(CapacitacionControlador.class.getName());
	
	/*lista las visitas y un link para crear capacitacion con idcliente asociado*/
    @RequestMapping("/lvparacapacitacion")    
    public String listarvisitas(Model m){    
        List<Visitas> listavisitas = daovis.getVisitas();
        System.out.println("lista visitas: " + listavisitas);
        m.addAttribute("listavisitas", listavisitas);
        return "agregarcapacitacion";
    }
    
    @RequestMapping(value="/generarcapacitacion/{id}")    
    public String gestionaempleado(@PathVariable int id, Model m){  
       	Capacitaciones capacitacion = new Capacitaciones();
    	capacitacion.setIdVisitaCapacitacion(id);
    	m.addAttribute("command", capacitacion);    	
		System.out.println("model m add capacitacion: " + m);
		return "formcapacitacion";
    }
    
    
    @RequestMapping(value="crearcapacitacion",method = RequestMethod.POST)
    public String guardarcap(@ModelAttribute("cap") Capacitaciones cap, Model m){   
    	String mensaje = "";
    	System.out.println("valor cap: " + cap);
    	
    	int agregar = daocap.save(cap);
        System.out.println("agregar: " + agregar);
    	
    	if(agregar == 1) {
    		mensaje = "Capacitacion agregada exitosamente";
    		log.info("Capacitacion agregada de visita id: " + cap.getIdVisitaCapacitacion());
    	} else {
    		mensaje = "No fue posible realizar la solicutud";
    	}
    	
    	m.addAttribute("msg", mensaje);
    	
        return "formcapacitacion";
    }
    
}
