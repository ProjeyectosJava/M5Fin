package com.m5fin.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.MejoraRepositorio;
import com.m5fin.dao.Mejoras;

@Service
public class MejoraServicioImpl implements MejoraServicio {

	@Autowired
	MejoraRepositorio mr;
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void agregarMejora(Mejoras mejora) {
		mr.save(mejora);
	}

	@Override
	public List<Mejoras> listarMejoras() {
		return (List<Mejoras>) mr.findAll();
	}

	@Override
	public List<Mejoras> ListarMejorasEspecial() {
		String jpql = "SELECT mej FROM Mejoras mej "; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		
		System.out.println("Listando mej jpql " + jpql);
		System.out.println("Listando mej query " + query);
		return query.getResultList();
	}

}
