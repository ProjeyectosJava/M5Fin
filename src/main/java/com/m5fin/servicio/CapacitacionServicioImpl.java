package com.m5fin.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.CapacitacionRepositorio;
import com.m5fin.dao.Capacitaciones;

@Service
public class CapacitacionServicioImpl implements CapacitacionServicio{

	@Autowired
	CapacitacionRepositorio cr;
	

	@Override
	public void agregarCapacitacion(Capacitaciones cap) {
		cr.save(cap);	
	}

}
