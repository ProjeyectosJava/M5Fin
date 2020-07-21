package com.m5fin.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseControlador {
	
	 
	@RequestMapping("/m5fin")
	public String inicio(Model m) {
		return "index";
	}
	
	@RequestMapping("/submenuadmin")
	public String menuadmin() {
		return "indexadmin";
	}
	
	@RequestMapping("/submenuprof")
	public String menupro() {
		return "indexpro";
	}

	
	@RequestMapping("/submenucliente")
	public String menucliente() {
		return "indexcli";
	}

}
