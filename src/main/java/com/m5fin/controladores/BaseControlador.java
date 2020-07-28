package com.m5fin.controladores;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseControlador {
	
	 
	@RequestMapping("/")
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
	
	
	@RequestMapping("/pendientes")
	public String pendientes(Model m) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		
		
		m.addAttribute("auth",auth.getName());
	     /*   if (auth != null){    
	        	SecurityContextHolder.getContext().setAuthentication(null);
	     */
		return "pendientes";
	}
	
	@RequestMapping("/rest/infoapirest")
	public String infoapirest() {
		return "infoapirest";
	}
	
	/*
	@RequestMapping("/error")
    public String error(ModelMap model)
    {
        model.addAttribute("error", "true");
        return "login";

    }

    @RequestMapping("/login")
    public String login()
    {
        System.out.println("Inside login");
        return "index";
    }
    
    @RequestMapping("/logout")
    public String logout()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
        	SecurityContextHolder.getContext().setAuthentication(null);
        }
        return "redirect:/login?logout"; //You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }
    */
	

}
