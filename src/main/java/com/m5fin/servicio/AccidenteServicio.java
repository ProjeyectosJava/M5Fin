package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Accidentes;

public interface AccidenteServicio {
	
	List<Accidentes> listarAccidentes();
	void agregarAccidente(Accidentes accidente);
}
