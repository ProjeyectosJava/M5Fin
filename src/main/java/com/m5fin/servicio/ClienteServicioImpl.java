package com.m5fin.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.ClienteRepositorio;
import com.m5fin.dao.Clientes;


@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	ClienteRepositorio cr;

	@Override
	public Clientes findClienteByid(int id) {
		return cr.findOne(id);
	}

	@Override
	public List<Clientes> listarClientes() {
		return (List<Clientes>) cr.findAll();
	}

	@Override
	public void agregarCliente(Clientes c) {
		cr.save(c);
	}

	@Override
	public int eliminarCliente(int clienteid) {
		try {
			cr.delete(clienteid);
		
		} catch (Exception e) {
			System.out.println("me cai con error: " + e);
			return 0;
		}
		
		return 1;
	}

	@Override
	public void editarCliente(Clientes c) {
		cr.save(c);
	}

}
