package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Mejoras;

public interface MejoraServicio {
	void agregarMejora(Mejoras mejora);
	List<Mejoras> listarMejoras();
	
	List<Mejoras> ListarMejorasEspecial(); 
}
