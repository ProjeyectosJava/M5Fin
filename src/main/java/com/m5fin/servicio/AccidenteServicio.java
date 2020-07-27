package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Accidentes;

public interface AccidenteServicio {
	
	List<Accidentes> listarAccidentes();
	
	List<Accidentes> listarAccidentesOrd();
	
	void agregarAccidente(Accidentes accidente);
	
	List<Accidentes> ListarPorId(Integer id);
	
	
}
