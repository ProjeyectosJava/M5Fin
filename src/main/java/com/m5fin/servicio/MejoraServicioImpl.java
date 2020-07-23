package com.m5fin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.MejoraRepositorio;
import com.m5fin.dao.Mejoras;

@Service
public class MejoraServicioImpl implements MejoraServicio {

	@Autowired
	MejoraRepositorio mr;
	
	@Override
	public void agregarMejora(Mejoras mejora) {
		mr.save(mejora);
	}

	@Override
	public List<Mejoras> listarMejoras() {
		return (List<Mejoras>) mr.findAll();
	}

}
