package com.m5fin.controladores;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.m5fin.dao.AccidenteDao;
import com.m5fin.dao.ClienteDao;
import com.m5fin.modelo.beans.Accidentes;
import com.m5fin.modelo.beans.Clientes;

@Controller
public class AccidenteControlador {
	
	@Autowired
	ClienteDao dao;
	
	@Autowired
	AccidenteDao daoacc;
	
	static Logger log = Logger.getLogger(AccidenteControlador.class.getName());

	@RequestMapping("/reportaraccidente")    
	public String listareportecliente() {
		return "reportaraccidente";
	}
	
	@RequestMapping(value="/buscacliente",method = RequestMethod.POST)    
	public String buscarcliente(@RequestParam("idcli") String id, Model m) {

		Accidentes accidente = new Accidentes();
		Clientes datocliente = new Clientes();
		System.out.println("datocliente antes de asignar busqueda: " + datocliente);
		
		datocliente = dao.getClienteById(Integer.parseInt(id));
		
		boolean existecliente = false;
		String mensaje = "";
		String urlRevisarCliente = "";
		
		if(datocliente.getIdCliente() == 0) {
			System.out.println("es cero cliente no existe");
			mensaje = "Cliente no existe, confirme ID Cliente en ";
			urlRevisarCliente = "revisarclientes";
		} else {
			System.out.println("cliente existe" + datocliente.getNombreCliente());
			existecliente = true;
			mensaje = "Ingrese el reporte del cliente " + datocliente.getNombreCliente();
			accidente.setClienteIdAcciedente(datocliente.getIdCliente());
		}
		System.out.println("datocliente: " + datocliente);
		System.out.println("existecliente: " + existecliente);
		System.out.println("accidente: " + accidente);
		
		m.addAttribute("idtrue", existecliente);
		m.addAttribute("ccmensaje", mensaje);
		m.addAttribute("urlrc", urlRevisarCliente);
		m.addAttribute("datocli", datocliente);
		m.addAttribute("accidente", accidente);
	
		return "reportaraccidente";
	}
	
	
	 /*agregar accidente a base de datos*/
    @RequestMapping(value="/agregaraccidente",method = RequestMethod.POST)    
    public String agregaraccidente(@ModelAttribute("acc") Accidentes acc, Model m){   
        int agregado = daoacc.save(acc);
        System.out.println("acc: " + acc);
        System.out.println("agregado: " + agregado);
        m.addAttribute("agregado", agregado);
        log.info("Agregamos accidente asociado al cliente id: " + acc.getClienteIdAcciedente());
        return "reportaraccidente";
    }
	
	
	
	
	
}