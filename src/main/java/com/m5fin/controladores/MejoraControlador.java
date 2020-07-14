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

import com.m5fin.dao.MejoraDao;
import com.m5fin.modelo.beans.Mejoras;
import com.m5fin.modelo.beans.MejorasVisitas;

@Controller
public class MejoraControlador {
	
	@Autowired
	MejoraDao daomej;
	
	static Logger log = Logger.getLogger(MejoraControlador.class.getName());
	
	/*pasamos los datos del cliente id y nombre para luego entregarlos al formulario*/
    @RequestMapping(value="/gestionarmejora/{id}/{ncliente}")    
    public String mejorascliente(@PathVariable int id, @PathVariable String ncliente, Model m){  
    	Mejoras regmejcli = new Mejoras();
    	regmejcli.setIdClienteMejora(id);	
    	m.addAttribute("command", regmejcli);     
		return "formmejora";
    }

    
    @RequestMapping(value="agregarmejora",method = RequestMethod.POST)
    public String guardarmejora(@ModelAttribute("mej") Mejoras mej, Model m){   
    	String mensaje = "";
    	System.out.println("valor mejp: " + mej);
    	
    	int agregar = daomej.save(mej);
        System.out.println("agregar: " + agregar);
    	
    	if(agregar == 1) {
    		mensaje = "Mejora agregada exitosamente";
    		log.info("Mejora agregada y asociada al id cliente: " + mej.getIdClienteMejora());
    	} else {
    		mensaje = "No fue posible realizar la solicutud";
    	}
    	
    	m.addAttribute("ccmensaje", mensaje);
    	
        return "formmejora";
    }
    
    
    @RequestMapping("/revisarmejoras")    
	public String listarmejoras(Model m) { 
		List<MejorasVisitas> listamejoras = daomej.getListarMejoras();
		m.addAttribute("listmej", listamejoras);
		return "listarmejoras";
	}
    
}
