package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Clientes;

public interface ClienteServicio {

	Clientes findClienteByid(int id);
	List<Clientes> listarClientes();
	
	void agregarCliente(Clientes c);
	int eliminarCliente(int clienteid);
	void editarCliente(Clientes c);
}
