package com.m5fin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.ChequeoRepositorio;
import com.m5fin.dao.Chequeos;

@Service
public class ChequeoServicioImpl implements ChequeoServicio	 {

	@Autowired
	ChequeoRepositorio chk;	
	
	@Override
	public List<Chequeos> ListarChequeos() {
		return (List<Chequeos>) chk.findAll();
	}

	@Override
	public void agregarChequeo(Chequeos chequeo) {
		chk.save(chequeo);
	}

}