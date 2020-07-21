package com.m5fin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.ClienteRepositorio;
import com.m5fin.dao.Clientes;
import com.m5fin.dao.Empleados;
import com.m5fin.dao.Visitas;


@Service
public class VisitaServicioImpl implements VisitaServicio{

	@Autowired
	ClienteRepositorio cr;
	
	
	@Override
	public List<Clientes> getAllClientes() {
		return (List<Clientes>) cr.findAll();
	}

	@Override
	public List<Visitas> getAllVisitas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> getAllEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitas getVisitasById(int idvisita) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addVisita(Visitas visita) {
		// TODO Auto-generated method stub
		
	}

}
