package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Empleados;

public interface EmpleadoServicio {
	
	 
	 Empleados FindEmpleadoById(int idempleado);
	 List<Empleados> listarempleados();
	 
	 void agregarEmpleado(Empleados empleado);
	 void eliminarempleado(int idempleado);
	 void editarEmpleado(Empleados empleado);
	 

}

