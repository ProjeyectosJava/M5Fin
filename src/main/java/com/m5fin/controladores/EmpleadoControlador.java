package com.m5fin.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class EmpleadoControlador {

@RequestMapping("/testes")
public String verclientes(Model m) {
	//List<Clientes> listacliente = cs.listarClientes();
	//m.addAttribute("lclientes",listacliente);
	return "indexadmin";
}

}
