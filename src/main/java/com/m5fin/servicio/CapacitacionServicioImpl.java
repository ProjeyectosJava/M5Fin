package com.m5fin.servicio;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.CapacitacionRepositorio;
import com.m5fin.dao.Capacitaciones;

@Service
public class CapacitacionServicioImpl implements CapacitacionServicio{

	@Autowired
	CapacitacionRepositorio cr;
	
	@PersistenceContext
	EntityManager em;
	

	@Override
	public void agregarCapacitacion(Capacitaciones cap) {
		cr.save(cap);	
	}


	@Override
	public List<Capacitaciones> listarCapacitaciones() {
		return (List<Capacitaciones>) cr.findAll();
	}


	@Override
	public List<Capacitaciones> ListarCapacitacionesEspecial() {
		String jpql = "SELECT cap FROM Capacitaciones cap "; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		
		System.out.println("Listando cap jpql " + jpql);
		System.out.println("Listando cap query " + query);
		return query.getResultList();
	}
	

}
