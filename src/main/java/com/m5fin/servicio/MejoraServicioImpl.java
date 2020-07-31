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

	@Override
	public Mejoras findMejoraByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mejoras> findAll(Iterable<Integer> id) {
		return (List<Mejoras>) mr.findAll(id);
	}

	@Override
	public List<Mejoras> ListarPorId(Integer id) {
		String jpql = "SELECT m FROM Mejoras m WHERE m.cliente.idcliente=:codigo"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		query.setParameter("codigo", id); //pasamos el id a la consulta jpql
		
		System.out.println("Listando jpql " + jpql);
		System.out.println("Listando query " + query);
		return query.getResultList();
	}

	@Override
	public void eliminarMejoras(int id) {
		mr.delete(id);
	}

	/*
	@Override
	public List ListarPorId(Integer id); {
		String jpql = "SELECT m FROM Mejoras m WHERE m.cliente.idclientemejora=:codigo"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		query.setParameter("codigo", id);
		
		System.out.println("Listando jpql " + jpql);
		System.out.println("Listando query " + query);
		return query.getResultList();
	}*/

	

}
