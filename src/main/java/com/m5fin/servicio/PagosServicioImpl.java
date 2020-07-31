package com.m5fin.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.ClienteRepositorio;
import com.m5fin.dao.Clientes;
import com.m5fin.dao.Pagos;
import com.m5fin.dao.PagosRepositorio;

@Service
public class PagosServicioImpl implements PagosServicio{
	
	@Autowired
	PagosRepositorio pr;
	
	
	@Autowired
	ClienteRepositorio cr;
	

	@PersistenceContext
	EntityManager em;

	@Override
	public Pagos findPagosByid(int id) {
		// TODO Auto-generated method stub
		return pr.findOne(id);
	}

	@Override
	public List<Pagos> listarPagos() {
		// TODO Auto-generated method stub
		return (List<Pagos>) pr.findAll();
	}

	@Override
	public List<Pagos> listarPagosAtrasados(Integer fecha) {
		String jpql = "SELECT p FROM Pagos v WHERE p.mesaniopago=:fechaactual"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		query.setParameter("fechaactual", fecha); //pasamos el id a la consulta jpql
		
		System.out.println("Listando query en accidentes " + query);
		return query.getResultList();
	}

	@Override
	public void agregarPago(Pagos p) {
		pr.save(p);
		
	}

	@Override
	public void editarCliente(Pagos p) {
		pr.save(p);
		
	}

	@Override
	public List<Clientes> listarClientesnoPagos() {
		String jpql = "SELECT c FROM CLIENTES c JOIN PAGOS p ON c.idcliente = p.idclientepago WHERE p.idclientepago IS NULL"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
	
		
		
		/*
		 * SELECT * FROM CLIENTES C LEFT JOIN PAGOS P ON c.idcliente = p.idclientepago
		 * WHERE p.idclientepago is null;
		 */
		
		
		
		System.out.println("Listando query en accidentes " + query);
		return query.getResultList();
	}

	@Override
	public void eliminarPagos(int id) {
		pr.delete(id);
	}



}
