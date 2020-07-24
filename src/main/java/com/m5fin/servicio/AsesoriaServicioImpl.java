package com.m5fin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.AsesoriaRepositorio;
import com.m5fin.dao.Asesorias;


@Service
public class AsesoriaServicioImpl implements AsesoriaServicio{

	@Autowired
	AsesoriaRepositorio ar;
	

	@Override
	public List<Asesorias> listarAsesorias() {
		return (List<Asesorias>) ar.findAll();
	}

	@Override
	public void agregaAsesoria(Asesorias asesoria) {
		ar.save(asesoria);
		
	}

	@Override
	public void eliminaAsesoria(int idasesoria) {
		ar.delete(idasesoria);
		
	}



}
