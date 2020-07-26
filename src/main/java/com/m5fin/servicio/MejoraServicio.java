package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Mejoras;

public interface MejoraServicio {
	void agregarMejora(Mejoras mejora);
	List<Mejoras> listarMejoras();
	Mejoras findMejoraByid(int id);
	
	List<Mejoras> findAll(Iterable<Integer> id); 
	
	List<Mejoras> ListarMejorasEspecial();
	
	List<Mejoras> ListarPorId(Integer id);
}
