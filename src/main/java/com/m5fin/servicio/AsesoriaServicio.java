package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Asesorias;

public interface AsesoriaServicio {

	List<Asesorias> listarAsesorias();
	Asesorias findAsesoriaByid(int id);
	
	void editarAsesoria(Asesorias a);
	void agregaAsesoria(Asesorias asesoria);
	void eliminaAsesoria(int idasesoria);
	
	List<Asesorias> ListarAsesoriasEspecial(); 
	
	
	
}
