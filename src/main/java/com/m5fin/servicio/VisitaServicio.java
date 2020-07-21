package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Clientes;
import com.m5fin.dao.Empleados;
import com.m5fin.dao.Visitas;

public interface VisitaServicio {
	
	List<Clientes> getAllClientes();
	List<Visitas> getAllVisitas();
	List<Empleados> getAllEmpleados();
	Visitas getVisitasById(int idvisita);
	void addVisita(Visitas visita);

}
