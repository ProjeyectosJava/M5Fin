package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCIDENTES")
public class Accidentes {
	@Id
	@GeneratedValue
	@Column(name="idaccidente")
	private int idaccidente;
	
	@Column(name="fechaaccidente")
	private String fechaaccidente;
	
	@Column(name="horaaccidente")
	private String horaaccidente;
	
	@Column(name="sucesoaccidente")
	private String sucesoaccidente;
	
	@Column(name="lugarAaccidente")
	private String lugarAaccidente;
	
	@Column(name="clienteadacciedente")
	private int clienteadacciedente;

	public Accidentes(int idaccidente, String fechaaccidente, String horaaccidente, String sucesoaccidente,
			String lugarAaccidente, int clienteadacciedente) {
		this.idaccidente = idaccidente;
		this.fechaaccidente = fechaaccidente;
		this.horaaccidente = horaaccidente;
		this.sucesoaccidente = sucesoaccidente;
		this.lugarAaccidente = lugarAaccidente;
		this.clienteadacciedente = clienteadacciedente;
	}
	
	public Accidentes(String fechaaccidente, String horaaccidente, String sucesoaccidente,
			String lugarAaccidente, int clienteadacciedente) {
		this.fechaaccidente = fechaaccidente;
		this.horaaccidente = horaaccidente;
		this.sucesoaccidente = sucesoaccidente;
		this.lugarAaccidente = lugarAaccidente;
		this.clienteadacciedente = clienteadacciedente;
	}

	public int getIdaccidente() {
		return idaccidente;
	}

	public void setIdaccidente(int idaccidente) {
		this.idaccidente = idaccidente;
	}

	public String getFechaaccidente() {
		return fechaaccidente;
	}

	public void setFechaaccidente(String fechaaccidente) {
		this.fechaaccidente = fechaaccidente;
	}

	public String getHoraaccidente() {
		return horaaccidente;
	}

	public void setHoraaccidente(String horaaccidente) {
		this.horaaccidente = horaaccidente;
	}

	public String getSucesoaccidente() {
		return sucesoaccidente;
	}

	public void setSucesoaccidente(String sucesoaccidente) {
		this.sucesoaccidente = sucesoaccidente;
	}

	public String getLugarAaccidente() {
		return lugarAaccidente;
	}

	public void setLugarAaccidente(String lugarAaccidente) {
		this.lugarAaccidente = lugarAaccidente;
	}

	public int getClienteadacciedente() {
		return clienteadacciedente;
	}

	public void setClienteadacciedente(int clienteadacciedente) {
		this.clienteadacciedente = clienteadacciedente;
	}

	@Override
	public String toString() {
		return "Accidentes [idaccidente=" + idaccidente + ", fechaaccidente=" + fechaaccidente + ", horaaccidente="
				+ horaaccidente + ", sucesoaccidente=" + sucesoaccidente + ", lugarAaccidente=" + lugarAaccidente
				+ ", clienteadacciedente=" + clienteadacciedente + "]";
	}
	
	
	

}