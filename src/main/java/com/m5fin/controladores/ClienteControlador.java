package com.m5fin.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5fin.dao.Accidentes;
import com.m5fin.servicio.AccidenteServicio;



@Controller
@RequestMapping("/cliente")
public class ClienteControlador {
	
	@Autowired
	AccidenteServicio ac;
	
	// --- *** CU INICIO AGREGAR ACCIDENTE *** ----//
	@RequestMapping("/reportaraccidente")
	public String reportaraccidente(Model m) {
		Accidentes accidente = new Accidentes();
		m.addAttribute("accidente", accidente);
		System.out.println("pasamos objeto accidente: " + accidente);
		return "reportaraccidente";
	}
	
	
	
	@RequestMapping(value = "/guardaraccidente")
	public String saveaccidente(@ModelAttribute("accidente") Accidentes accidente, Model m) {
		System.out.println("Accidente a guardar: " + accidente);
		ac.agregarAccidente(accidente);
		System.out.println("accidente guardado: " + accidente);
		return "redirect:/submenucliente";
	}
	
	// --- *** CU FIN AGREGAR ACCIDENTE *** ----//

}