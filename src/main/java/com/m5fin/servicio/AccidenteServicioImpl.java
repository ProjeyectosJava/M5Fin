package com.m5fin.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.AccidenteRepositorio;
import com.m5fin.dao.Accidentes;

@Service
public class AccidenteServicioImpl implements AccidenteServicio{

	@Autowired
	AccidenteRepositorio ar;
	
	@Override
	public void agregarAccidente(Accidentes accidente) {
		ar.save(accidente);		
	}

}
