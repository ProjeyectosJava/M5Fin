package com.m5fin.controladores;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.m5fin.dao.ClienteDao;
import com.m5fin.dao.ReporteDao;
import com.m5fin.dao.VisualizaActividadesDao;
import com.m5fin.modelo.beans.Clientes;
import com.m5fin.modelo.beans.Reportes;
import com.m5fin.modelo.beans.ReportesActividades;

@Controller
public class ReporteControlador {
	
	@Autowired
	ReporteDao daorep;
	
	@Autowired
	ClienteDao dao;
	
	@Autowired
	VisualizaActividadesDao daova;
	
	static Logger log = Logger.getLogger(ReporteControlador.class.getName());
	
	
	/*REPORTES GLOBALES Y ESPECIFICCOS DE CLIENTE*/
	@RequestMapping("/reporteglobal")    
	public String listareporteglobal(Model m) { 
		List<Reportes>listarepomejora = daorep.getListarMejoras(0);
		List<Reportes>listarepoaccidente = daorep.getListarAccidentes(0);
		List<Reportes>listarepovisita = daorep.getListarVisitas(0);
		List<Reportes>listarepovisitacapacitacion = daorep.getListarVisitasCapacitacion(0);
		/*
*/
		System.out.println("listmejora: " + listarepomejora);
		System.out.println("listaccidente: " + listarepoaccidente);
		System.out.println("listvisita: " + listarepovisita);
		System.out.println("listvisitacapacitacion: " + listarepovisitacapacitacion);
		/*
		*/
		
		m.addAttribute("listmejora", listarepomejora);
		m.addAttribute("listaccidente", listarepoaccidente);
		m.addAttribute("listvisita", listarepovisita);
		m.addAttribute("listvisitacapacitacion", listarepovisitacapacitacion);
		/*
*/
		System.out.println("model m: " + m);
		
		return "reporteglobal";
	}
	
	/*reporte por cliente*/
	@RequestMapping("/reportecliente")    
	public String listareportecliente(Model m) {
		/*String idcli="";
		m.addAttribute("idcli", idcli);*/
		return "reportecliente";
	}
	
	/*reporte por cliente*/
	@RequestMapping(value="/buscauncliente",method = RequestMethod.POST)    
	public String buscaruncliente(@RequestParam("idcli") String id, Model m) {
		
		Clientes datocliente = dao.getClienteById(Integer.parseInt(id));
		System.out.println(datocliente);

		System.out.println("idcli: " + id);
		boolean existecliente = false;
		String mensaje = "";
		String nomcliente = "";
		String urlRevisarCliente = "";
		
		//ReporteDao daoreporte = new ReporteDao();
		List<Reportes> listarepomejora = new ArrayList<Reportes>();
		List<Reportes> listarepoaccidente = new ArrayList<Reportes>();
		List<Reportes> listarepovisita = new ArrayList<Reportes>();
		List<Reportes> listarepovisitacapacitacion = new ArrayList<Reportes>();
		
		if(datocliente.getIdCliente() == 0) {
			System.out.println("es cero cliente no existe");
			mensaje = "Cliente no existe, confirme ID Cliente en ";
			urlRevisarCliente = "revisarclientes";
		} else {
			System.out.println("cliente existe" + datocliente.getNombreCliente());
			existecliente = true;
			nomcliente = datocliente.getNombreCliente();
			listarepomejora = daorep.getListarMejoras(datocliente.getIdCliente());
			listarepoaccidente = daorep.getListarAccidentes(datocliente.getIdCliente());
			listarepovisita = daorep.getListarVisitas(datocliente.getIdCliente());
			listarepovisitacapacitacion = daorep.getListarVisitasCapacitacion(datocliente.getIdCliente());
		}
		
		m.addAttribute("idtrue", existecliente);
		m.addAttribute("ccmensaje", mensaje);
		m.addAttribute("urlrc", urlRevisarCliente);
		m.addAttribute("nomcli", nomcliente);
		m.addAttribute("listmejora", listarepomejora);
		m.addAttribute("listaccidente", listarepoaccidente);
		m.addAttribute("listvisita", listarepovisita);
		m.addAttribute("listvisitacapacitacion", listarepovisitacapacitacion);
		
		
		return "reportecliente";
	}

	
	/*VISUALIZACION DE ACTIVIDADES POR TIPO*/
	@RequestMapping("/visualizadoractividades")    
	public String menuvactividades() {
		return "menuvisact";
	}
	
	
	@RequestMapping("/vcapacitaciones")    
	public String vcapacitaciones(Model m) { 
		int opcion = 1;
		List<ReportesActividades> listacapacitaciones = daova.getListarCapacitaciones();
		System.out.println("listacapacitaciones: " + listacapacitaciones);
		m.addAttribute("listacapacitaciones", listacapacitaciones);
		m.addAttribute("opcion", opcion);
		System.out.println("model m: " + m);
		
		return "menuvisact";
	}
	
	@RequestMapping("/vvisitas")    
	public String vvisitas(Model m) { 
		int opcion = 2;
		List<ReportesActividades> listavisitas = daova.getListarVisitas();
		System.out.println("listavisitas: " + listavisitas);
		m.addAttribute("listavisitas", listavisitas);
		m.addAttribute("opcion", opcion);
		System.out.println("model m: " + m);
		
		return "menuvisact";
	}
	
	@RequestMapping("/vmejoras")    
	public String vmejoras(Model m) { 
		int opcion = 3;
		List<ReportesActividades> listamejoras = daova.getListarMejoras();
		System.out.println("listamejoras: " + listamejoras);
		m.addAttribute("listamejoras", listamejoras);
		m.addAttribute("opcion", opcion);
		System.out.println("model m: " + m);
		
		return "menuvisact";
	}
	
	@RequestMapping("/vasesorias")    
	public String vasesorias(Model m) { 
		int opcion = 4;
		List<ReportesActividades> listaasesorias = daova.getListarAsesorias();
		System.out.println("listaasesorias: " + listaasesorias);
		m.addAttribute("listaasesorias", listaasesorias);
		m.addAttribute("opcion", opcion);
		System.out.println("model m: " + m);
		
		return "menuvisact";
	}

	
}
