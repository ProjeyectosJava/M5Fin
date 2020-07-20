package com.m5fin.modelo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CAPACITACIONES")
public class Capacitaciones {
	
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
	
	@Column(name="idvisitacapacitacion")
	private int idvisitacapacitacion;
	
	public Capacitaciones() {

	}
	
	public Capacitaciones(int idcapacitacion, String fechacapacitacion, String horacapacitacion,
			int numasistcapacitacion, int idvisitacapacitacion) {
		super();
		this.idcapacitacion = idcapacitacion;
		this.fechacapacitacion = fechacapacitacion;
		this.horacapacitacion = horacapacitacion;
		this.numasistcapacitacion = numasistcapacitacion;
		this.idvisitacapacitacion = idvisitacapacitacion;
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

	public int getIdvisitacapacitacion() {
		return idvisitacapacitacion;
	}

	public void setIdvisitacapacitacion(int idvisitacapacitacion) {
		this.idvisitacapacitacion = idvisitacapacitacion;
	}

	@Override
	public String toString() {
		return "Capacitaciones [idcapacitacion=" + idcapacitacion + ", fechacapacitacion=" + fechacapacitacion
				+ ", horacapacitacion=" + horacapacitacion + ", numasistcapacitacion=" + numasistcapacitacion
				+ ", idvisitacapacitacion=" + idvisitacapacitacion + "]";
	}
	
	
	

}
