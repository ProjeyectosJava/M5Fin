package com.m5fin.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.ClienteRepositorio;
import com.m5fin.dao.Clientes;


@Service
public class ClienteServicioImpl implements ClienteServicio{
	
	@PersistenceContext
	EntityManager em;

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
			//System.out.println("me cai con error: " + e);
			return 0;
		}
		
		return 1;
	}

	@Override
	public void editarCliente(Clientes c) {
		cr.save(c);
	}

	@Override
	public List<Clientes> ListarClienteporEmail(String email) {
		String jpql = "SELECT c FROM Clientes c WHERE c.emailcliente LIKE :codigo";
		// SELECT * FROM Clientes 	WHERE emailcliente LIKE 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		query.setParameter("codigo", email); //pasamos el id a la consulta jpql
		
		System.out.println("Listando query en accidentes " + query);
		return query.getResultList();
		
	
		
		
	}


	
	

	

}
