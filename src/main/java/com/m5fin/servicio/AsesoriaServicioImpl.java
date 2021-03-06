package com.m5fin.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m5fin.dao.AsesoriaRepositorio;
import com.m5fin.dao.Asesorias;


@Service
public class AsesoriaServicioImpl implements AsesoriaServicio{

	@Autowired
	AsesoriaRepositorio ar;

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Asesorias> listarAsesorias() {
		return (List<Asesorias>) ar.findAll();
	}

	@Override
	public void agregaAsesoria(Asesorias asesoria) {
		ar.save(asesoria);
		
	}

	@Override
	public void eliminaAsesoria(int idasesoria) {
		ar.delete(idasesoria);
		
	}

	@Override
	public List<Asesorias> ListarAsesoriasEspecial() {
		String jpql = "SELECT ase FROM Asesorias ase "; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		
		System.out.println("Listando cap jpql " + jpql);
		System.out.println("Listando cap query " + query);
		return query.getResultList();
	}
	
	

	@Override
	public Asesorias findAsesoriaByid(int id) {
		return ar.findOne(id);
	}

	@Override
	public void editarAsesoria(Asesorias a) {
		ar.save(a);
		
	}

	@Override
	public List<Asesorias> ListarPorId(Integer id) {
		String jpql = "SELECT a FROM Asesorias a WHERE a.visita.cliente.idcliente=:codigo"; // esto es solo un string 
		Query query = em.createQuery(jpql); // esto transforma el String en jpql
		query.setParameter("codigo", id); //pasamos el id a la consulta jpql
		
		System.out.println("Listando query en accidentes " + query);
		return query.getResultList();
	}



}
