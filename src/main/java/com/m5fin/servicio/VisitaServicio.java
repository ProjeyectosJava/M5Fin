package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Visitas;

public interface VisitaServicio {
	
	List<Visitas> ListarVisitas();
	void agregarVisita(Visitas visita);

}
