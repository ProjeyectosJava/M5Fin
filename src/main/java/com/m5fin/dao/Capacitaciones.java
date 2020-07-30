package com.m5fin.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="CAPACITACIONES")
public class Capacitaciones {
	
	/*
	@SequenceGenerator(name = "CapacitacionIdGenerator", sequenceName = "CAPACITACIONES_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CapacitacionIdGenerator")
	 */
	
	@Id
	@GeneratedValue
	
	@Column(name="idcapacitacion")
	private int idcapacitacion;
	
	@Column(name="fechacapacitacion")
	private String fechacapacitacion;
	
	@Column(name="horacapacitacion")
	private String horacapacitacion;
	
	@Column(name="numasistcapacitacion")
	private int numasistcapacitacion;
	
	/* reemplazamos la llave foranea por el @many y @join
	@Column(name="idvisitacapacitacion")
	private int idvisitacapacitacion;
	*/
	
	@ManyToOne
	@JoinColumn(name = "idvisitacapacitacion") 
	Visitas visita;
	  
	
	public Capacitaciones(int idcapacitacion, String fechacapacitacion, String horacapacitacion,
			int numasistcapacitacion, Visitas visita) {
		this.idcapacitacion = idcapacitacion;
		this.fechacapacitacion = fechacapacitacion;
		this.horacapacitacion = horacapacitacion;
		this.numasistcapacitacion = numasistcapacitacion;
		this.visita = visita;
	}



	public Capacitaciones() {

	}



	public int getIdcapacitacion() {
		return idcapacitacion;
	}



	public void setIdcapacitacion(int idcapacitacion) {
		this.idcapacitacion = idcapacitacion;
	}



	public String getFechacapacitacion() {
		return fechacapacitacion;
	}



	public void setFechacapacitacion(String fechacapacitacion) {
		this.fechacapacitacion = fechacapacitacion;
	}



	public String getHoracapacitacion() {
		return horacapacitacion;
	}

	public void setHoracapacitacion(String horacapacitacion) {
		this.horacapacitacion = horacapacitacion;
	}


	public int getNumasistcapacitacion() {
		return numasistcapacitacion;
	}


	public void setNumasistcapacitacion(int numasistcapacitacion) {
		this.numasistcapacitacion = numasistcapacitacion;
	}


	public Visitas getVisita() {
		return visita;
	}


	public void setVisita(Visitas visita) {
		this.visita = visita;
	}


	@Override
	public String toString() {
		return "Capacitaciones [idcapacitacion=" + idcapacitacion + ", fechacapacitacion=" + fechacapacitacion
				+ ", horacapacitacion=" + horacapacitacion + ", numasistcapacitacion=" + numasistcapacitacion
				+ ", visita=" + visita + "]";
	}
	
	
	
	

}
