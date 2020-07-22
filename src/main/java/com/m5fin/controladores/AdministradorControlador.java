package com.m5fin.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Clientes;
import com.m5fin.dao.Empleados;
import com.m5fin.servicio.ClienteServicio;
import com.m5fin.servicio.EmpleadoServicio;

@Controller
@RequestMapping("/administrador")
public class AdministradorControlador {

	@Autowired
	ClienteServicio cs;

	// --- *** CU1 CRUD CLIENTES *** ----//
	@RequestMapping("/listarclientes")
	public String verclientes(Model m) {
		List<Clientes> listacliente = cs.listarClientes();
		m.addAttribute("lclientes", listacliente);
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
		return "redirect:/administrador/listarclientes";
	}

	@RequestMapping("/eliminarcliente/{id}")
	public String eliminar(@PathVariable int id, Model m) {
		cs.eliminarCliente(id);
		m.addAttribute("mensaje", "El cliente se eliminó exitosamente");
		return "redirect:/administrador/listarclientes";
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
		return "redirect:/administrador/listarclientes";
	}

	// --- *** FIN CU1 CRUD CLIENTES *** ----//
	
	
	@Autowired
	EmpleadoServicio ps;

	// --- *** CU1 CRUD PROFESIONALES *** ----//
	@RequestMapping("/listarprofesionales")
	public String verempleaddo(Model m) {
		System.out.println("Estamos en listar profesionales");
		List<Empleados> listaempleado = ps.listarempleados();
		m.addAttribute("lempleado", listaempleado);
		System.out.println("Profesionales lista:"  + listaempleado);
		return "listarprofesional";
	}

	
	  @RequestMapping("/formprofesional") 
	  public String newempleado(Model m) {
		  m.addAttribute("empleado", new Empleados()); 
	  return "formprofesional"; }
	  
	  
	  
	  @RequestMapping(value = "/guardarprofesional") 
	  public String saveempleado(@ModelAttribute("cliente") Empleados empleado, Model m) {
		  System.out.println("empleado: " + empleado); 
		  ps.agregarEmpleado(empleado);
	  return "redirect:/administrador/listarprofesionales"; 
	  }
	  
	  @RequestMapping("/eliminarprofesional/{id}") 
	  public String eliminarempleado(@PathVariable int id, Model m) { 
		  ps.eliminarempleado(id);
		  m.addAttribute("mensaje", "El Profesional se eliminó exitosamente"); 
	  return "redirect:/administrador/listarprofesionales"; }
	  
	  @RequestMapping(value = "/editarprofesional/{id}") 
	  public String updateempleado(@PathVariable int id, Model m) { 
		  Empleados emp = new Empleados(); 
		  System.out.println("new emp:" + emp); 
		  emp = ps.FindEmpleadoById(id); 
		  System.out.println("emp pasado: " + emp);
		  m.addAttribute("empleado", emp); 
	  return "formeditprofesional"; }
	  
	  @RequestMapping(value = "/editguardarpro") public String
	  udataempleado(@ModelAttribute("empleado") Empleados empleado, Model m) {
	  ps.editarEmpleado(empleado); m.addAttribute("mensaje",  "El empleado ha sido editado exitosamente"); 
	  return  "redirect:/administrador/listarprofesionales"; }
	  
	  // --- *** FIN CU1 CRUD PROFESIONALES *** ----//
	  
	  
	  
	  
	 

}
