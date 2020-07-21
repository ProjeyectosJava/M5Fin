package com.m5fin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.EmpleadoRepositorio;
import com.m5fin.dao.Empleados;


@Service
public class EmpleadoServicioImpl implements EmpleadoServicio{
	
	@Autowired
	EmpleadoRepositorio pr;

	@Override
	public Empleados FindEmpleadoById(int idempleado) {
		return pr.findOne(idempleado);
	}

	@Override
	public List<Empleados> listarempleados() {
		return (List<Empleados>) pr.findAll();
	}

	@Override
	public void agregarEmpleado(Empleados empleado) {
		pr.save(empleado);
		
	}

	@Override
	public void eliminarempleado(int idempleado) {
		pr.delete(idempleado);
		
	}

	@Override
	public void editarEmpleado(Empleados empleado) {
		pr.save(empleado);
		
	}

	

}
