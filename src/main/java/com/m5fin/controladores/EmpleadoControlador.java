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

import com.m5fin.modelo.beans.Empleados;
import com.m5fin.dao.EmpleadoDao;  

@Controller
public class EmpleadoControlador {
	@Autowired
	EmpleadoDao daoemp;
	
	static Logger log = Logger.getLogger(EmpleadoControlador.class.getName());
	
	
	/*   
    /*formulario agregar empleado a nuestro proyecto*/
    @RequestMapping("/formempleado")    
    public String showform(Model m){    
        m.addAttribute("command", new Empleados());  
        System.out.println("valor m tipo Model: " + m);
        return "formempleado";
    } 
	
	
    /*agregar empleado nuestro poryecto*/
    @RequestMapping(value="/guardarempleado",method = RequestMethod.POST)    
    public String guardarempleado(@ModelAttribute("emp") Empleados emp){   
    	System.out.println("valor emp: " + emp);
        daoemp.save(emp);
        log.info("Agregamos un nuevo empleado: " + emp.getNombreEmpleado());
        return "redirect:/listarempleados";
    }
    
    /*listar empleados nuestro proyecto*/
    @RequestMapping("/listarempleados")    
    public String listarempleados(Model m){    
        List<Empleados> list=daoemp.getEmpleados();
        System.out.println("listarempleados: " + list);
        m.addAttribute("list",list);  
        return "listarempleados";
    }
    
    /*Editar empleado toma los datos y lo reenvia a un formulario*/
    @RequestMapping(value="/editarempleado/{id}")    
    public String editempleado(@PathVariable int id, Model m){  
        Empleados emp=daoemp.getCliById(id);
        System.out.println("daoemp.getCliById(Id): " + emp);
        m.addAttribute("command",emp);
        System.out.println("valor emp " + m);
        return "formeditempleado";
    }
    
     
    /*muestra un formulario con los datos del empleado listo para editar y guardar*/
    @RequestMapping(value="/editarguardarempleado",method = RequestMethod.POST)    
    public String editsaveempleado(@ModelAttribute("emp") Empleados emp){
    	System.out.println("valor emp: " + emp);
        daoemp.update(emp);
        log.info("Actualizamos datos del empleado: " + emp.getNombreEmpleado());
        return "redirect:/listarempleados";
    }
	
   /*eliminar un empleado*/
    @RequestMapping(value="/eliminarempleado/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id, Model m){    
        int del = daoemp.delete(id);
        String txt = "Empleado eliminado exitosamente";
        List<Empleados> list=daoemp.getEmpleados();

        if(del == 0) {
        	txt = "No es posible eliminar empleado debido a que tiene visitas asociadas";
        } else {
        	log.debug("Eliminamos empleado id: " + id);        	
        }
        
        m.addAttribute("txt", txt);
        m.addAttribute("list",list);
        
        return "listarempleados";
    }
   
    
}
