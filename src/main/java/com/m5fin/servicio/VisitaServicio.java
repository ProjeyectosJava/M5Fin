package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Visitas;
import com.m5fin.dao.VisitasGeneradas;

public interface VisitaServicio {
	
	List<Visitas> ListarVisitas();
	void agregarVisita(Visitas visita);
	
	List<Visitas> ListarVisitasDemo(); 
	

}
