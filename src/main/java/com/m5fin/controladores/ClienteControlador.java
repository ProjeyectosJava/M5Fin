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
import com.m5fin.controladores.ClienteControlador;
import com.m5fin.dao.ClienteDao;   

@Controller
public class ClienteControlador {

	@Autowired
	ClienteDao dao;
	
	static Logger log = Logger.getLogger(ClienteControlador.class.getName());
	
    
    /*formulario agregar cliente nuestro proyecto*/
    @RequestMapping("/formcliente")    
    public String showform(Model m){    
        m.addAttribute("command", new Clientes());  
        System.out.println("valor m tipo Model: " + m);
        return "formcliente";
    } 
    
    /*agregar cliente nuestro poryecto*/
    @RequestMapping(value="/guardar",method = RequestMethod.POST)    
    public String guardar(@ModelAttribute("cli") Clientes cli){   
    	System.out.println("valor cli: " + cli);
        dao.save(cli);
        log.info("Registramos al nuevo cliente: " + cli.getNombreCliente() + " id: " + cli.getIdCliente());
        return "redirect:/listarclientes";
    }
 
    
    /*listar clientes nuestro proyecto*/
    @RequestMapping("/listarclientes")    
    public String listarclientes(Model m){    
        List<Clientes> list=dao.getClientes();
        System.out.println("listaclientes: " + list);
        m.addAttribute("list",list);
        return "listarclientes";
    }
    
    /*listar clientes para revisar clientes*/
    @RequestMapping("/revisarclientes")    
    public String revisarcli(Model m){    
        List<Clientes> list=dao.getClientes();
        System.out.println("listaclientes: " + list);
        m.addAttribute("listaclientes",list);  
        return "revisarcliente";
    }
    
    /*listar clientes para ingresar mejoras*/
    @RequestMapping("/lpmclientes")    
    public String listarclim(Model m){    
        List<Clientes> list=dao.getClientes();
        System.out.println("listaclientes: " + list);
        m.addAttribute("listaclientes",list);  
        return "preingresomejoras";
    }
    

    @RequestMapping(value="/editarcliente/{id}")    
    public String editcliente(@PathVariable int id, Model m){  
        Clientes cli=dao.getCliById(id);
        m.addAttribute("command",cli);
        return "formeditcliente";
    }
    
      
    /*editar cliente nuestro poryecto*/
    @RequestMapping(value="/editguardar",method = RequestMethod.POST)    
    public String editsavecliente(@ModelAttribute("cli") Clientes cli){
        dao.update(cli);
        log.info("Editamos el cliente: " + cli.getNombreCliente());
        return "redirect:/listarclientes";
    }

    
    @RequestMapping(value="/eliminarcliente/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id, Model m){    
        int del = dao.delete(id);
        String txt = "Cliente eliminado exitosamente";
        List<Clientes> list=dao.getClientes();
        
        if(del == 0) {
        	txt = "No es posible eliminar cliente debido a que tiene registros asociados";
        } else {
        	log.debug("Eliminamos el cliente id: " + id);        	
        }
        
        m.addAttribute("txt", txt);
        m.addAttribute("list",list);
        
        return "listarclientes";
    }
    
    
}