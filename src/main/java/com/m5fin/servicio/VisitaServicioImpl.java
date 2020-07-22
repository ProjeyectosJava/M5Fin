package com.m5fin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.VisitaRepositorio;
import com.m5fin.dao.Visitas;


@Service
public class VisitaServicioImpl implements VisitaServicio{

	@Autowired
	VisitaRepositorio vr;
	

	@Override
	public List<Visitas> ListarVisitas() {
		return (List<Visitas>) vr.findAll();
	}

	@Override
	public void agregarVisita(Visitas visita) {
		vr.save(visita);
		
	}
	
	


}
