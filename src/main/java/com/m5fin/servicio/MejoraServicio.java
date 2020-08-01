package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Mejoras;

public interface MejoraServicio {
	Mejoras findMejoraByid(int id);

	List<Mejoras> listarMejoras();
	List<Mejoras> findAll(Iterable<Integer> id); 
	List<Mejoras> ListarMejorasEspecial();
	List<Mejoras> ListarPorId(Integer id);

	void agregarMejora(Mejoras mejora);
	void eliminarMejoras(int id);
	void editarMejoras(Mejoras mejora);
}
