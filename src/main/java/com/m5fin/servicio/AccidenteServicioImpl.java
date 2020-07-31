package com.m5fin.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.AccidenteRepositorio;
import com.m5fin.dao.Accidentes;

@Service
public class AccidenteServicioImpl implements AccidenteServicio{

	@Autowired
	AccidenteRepositorio ar;
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void agregarAccidente(Accidentes accidente) {
		ar.save(accidente);		
	}

	@Override
	public List<Accidentes> listarAccidentes() {
		return (List<Accidentes>) ar.findAll();
	}

	@Override
	public List<Accidentes> ListarPorId(Integer id) {
		String jpql = "SELECT a FROM Accidentes a WHERE a.cliente.idcliente=:codigo"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		query.setParameter("codigo", id); //pasamos el id a la consulta jpql
		
		System.out.println("Listando query en accidentes " + query);
		return query.getResultList();
	}

	@Override
	public List<Accidentes> listarAccidentesOrd() {
		String jpql = "SELECT a FROM Accidentes a ORDER BY a.cliente.idcliente"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		System.out.println("Listando query en accidentes " + query);
		
		
		return query.getResultList();
	}

	@Override
	public void eliminarAccidente(int id) {
		ar.delete(id);
		
	}
	
	
	
	
	

}
