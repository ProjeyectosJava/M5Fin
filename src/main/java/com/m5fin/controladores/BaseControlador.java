package com.m5fin.controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import com.m5fin.servicio.ClienteServicio;

@Controller
public class BaseControlador {
	
	
	@Autowired
	ClienteServicio cl;
	
	 
	@RequestMapping("/")
	public String inicio(Model m) {
		return "index";
	}
	
	
	@RequestMapping("/submenuadmin")
	public String menuadmin(SecurityContextHolderAwareRequestWrapper request) {
		
		return "indexadmin";
	}
	
	
	
	@RequestMapping("/submenuprof")
	public String menupro(SecurityContextHolderAwareRequestWrapper request) {		
		return "indexpro";
	}

	
	
	@RequestMapping("/submenucliente")
	public String menucliente(SecurityContextHolderAwareRequestWrapper request) {
		 
		/*
		 * Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		 * System.out.println("Listamos auth:" + auth.getAuthorities());
		 * 
		 * 
		 * if (request.isUserInRole("ROLE_CLIENTE")) {
		 * System.out.println("ENTRANDO COMO CLIENTE"); }
		 */

		return "indexcli";
	}
	
	
	@RequestMapping("/pendientes")
	public String pendientes(Model m) {	
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
