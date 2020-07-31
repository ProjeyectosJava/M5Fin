package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CHEQUEOS")
public class Chequeos {
	
	/*
	@SequenceGenerator(name = "ChequeoIdGenerator", sequenceName = "CHEQUEOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChequeoIdGenerator")
	*/
	
	@Id
	@GeneratedValue
	@Column(name="idchequeo")
	private int idchequeo;
	
	@Column(name="detallechequeo")
	private String detallechequeo;
	
	@Column(name="estadochequeo")
	private String estadochequeo;
	

	
	 @ManyToOne
	 @JoinColumn(name = "idvisitachequeo") 
	 Visitas visita;



	public Chequeos() {
	
	}



	public Chequeos(int idchequeo, String detallechequeo, String estadochequeo, Visitas visita) {
		super();
		this.idchequeo = idchequeo;
		this.detallechequeo = detallechequeo;
		this.estadochequeo = estadochequeo;
		this.visita = visita;
	}



	public int getIdchequeo() {
		return idchequeo;
	}



	public void setIdchequeo(int idchequeo) {
		this.idchequeo = idchequeo;
	}



	public String getDetallechequeo() {
		return detallechequeo;
	}



	public void setDetallechequeo(String detallechequeo) {
		this.detallechequeo = detallechequeo;
	}



	public String getEstadochequeo() {
		return estadochequeo;
	}



	public void setEstadochequeo(String estadochequeo) {
		this.estadochequeo = estadochequeo;
	}



	public Visitas getVisita() {
		return visita;
	}



	public void setVisita(Visitas visita) {
		this.visita = visita;
	}



	@Override
	public String toString() {
		return "Chequeos [idchequeo=" + idchequeo + ", detallechequeo=" + detallechequeo + ", estadochequeo="
				+ estadochequeo + ", visita=" + visita + "]";
	}
	
	
	 
	 

}
