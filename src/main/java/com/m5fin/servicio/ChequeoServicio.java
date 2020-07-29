package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Chequeos;

public interface ChequeoServicio {
	
	List<Chequeos> ListarChequeos();
	void agregarChequeo(Chequeos chequeo);
	

}
