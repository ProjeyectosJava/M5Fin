package com.m5fin.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.VisitaRepositorio;
import com.m5fin.dao.Visitas;

@Service
public class VisitaServicioImpl implements VisitaServicio{

	@Autowired
	VisitaRepositorio vr;
	
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Visitas> ListarVisitas() {
		return (List<Visitas>) vr.findAll();
	}

	@Override
	public void agregarVisita(Visitas visita) {
		vr.save(visita);
		
	}

	@Override
	public List<Visitas> ListarVisitasEspecial() {
		// TODO Auto-generated method stub
		
		/*
		 * String jpql = "SELECT v FROM Visitas v "; // esto es solo un string
		 */		
		
		String jpql = "SELECT v FROM Visitas v "; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		
		
		
		System.out.println("Listando jpql " + jpql);
		System.out.println("Listando query " + query);
		return query.getResultList();
	}
	
	
	

	@Override
	public List<Visitas> ListarPorId(Integer id) {
		String jpql = "SELECT v FROM Visitas v WHERE v.cliente.idcliente=:codigo"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		query.setParameter("codigo", id); //pasamos el id a la consulta jpql
		
		System.out.println("Listando query en accidentes " + query);
		return query.getResultList();
	}

	@Override
	public Visitas findVisitaById(int id) {
		return 	vr.findOne(id);
	}
	
	
	
	


}
