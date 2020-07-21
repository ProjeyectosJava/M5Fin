package com.m5fin.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Clientes;
import com.m5fin.servicio.ClienteServicio;



@Controller
public class ClienteControlador {
	
	@Autowired
	ClienteServicio cs;
	
	@RequestMapping("/listarclientes")
	public String verclientes(Model m) {
		List<Clientes> listacliente = cs.listarClientes();
		m.addAttribute("lclientes",listacliente);
		return "listarclientes";
	}
	
	@RequestMapping("/formcliente") 
	public String newcliente(Model m) {
		m.addAttribute("cliente", new Clientes()); 
		return "formcliente"; 
	}
	 
	/*
	 * */
	@RequestMapping(value = "/guardarcliente") 
	public String savecliente(@ModelAttribute("cliente") Clientes cliente, Model m) {
		System.out.println("cliente: " + cliente);
		cs.agregarCliente(cliente); 
		return "redirect:/listarclientes"; 
	}

	@RequestMapping("/eliminarcliente/{id}") 
	public String eliminar(@PathVariable int id, Model m) { 
		cs.eliminarCliente(id); 
		m.addAttribute("mensaje", "El cliente se eliminó exitosamente"); 
		return "redirect:/listarclientes"; 
	}

	@RequestMapping(value = "/editarcliente/{id}") 
	public String updatecliente(@PathVariable int id, Model m) { 
		Clientes cli = new Clientes();
		System.out.println("new cli:" + cli);
		cli = cs.findClienteByid(id); 
		System.out.println("cli pasado: " + cli);
		m.addAttribute("cliente", cli); 
		return "formeditcliente"; 
	}
	
	@RequestMapping(value = "/editguardar") 
	public String udatacliente(@ModelAttribute("cliente") Clientes cliente, Model m) {
		cs.editarCliente(cliente); 
		m.addAttribute("mensaje", "El cliente ha sido editado exitosamente"); 
		return "redirect:/listarclientes"; 
	}
	
}