package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Capacitaciones;

public interface CapacitacionServicio {
	
	void agregarCapacitacion(Capacitaciones cap);
	List<Capacitaciones> listarCapacitaciones();
	
	List<Capacitaciones> ListarCapacitacionesEspecial(); 
	
	List<Capacitaciones> ListarPorId(Integer id);

}
