package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Chequeos;

public interface ChequeoServicio {
	
	List<Chequeos> ListarChequeos();
	void agregarChequeo(Chequeos chequeo);
	Chequeos findChequeoById(int id);
	void editalChequeo(Chequeos chequeo);
	void eliminarChequeo(int id);
	
	
	

}
