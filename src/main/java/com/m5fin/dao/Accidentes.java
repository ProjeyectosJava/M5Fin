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
@Table(name="ACCIDENTES")
public class Accidentes {
	
	/*
	@SequenceGenerator(name = "AccidenteIdGenerator", sequenceName = "ACCIDENTES_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccidenteIdGenerator")
	 */
	
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
	
	@Column(name="lugaraccidente")
	private String lugaraccidente;
	
	/*
	@Column(name="idclienteaccidente")
	private int idclienteaccidente;
	*/
	
	@ManyToOne (fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinColumn(name = "idclienteaccidente")
	Clientes cliente;

	public Accidentes() {
		
	}

	public Accidentes(int idaccidente, String fechaaccidente, String horaaccidente, String sucesoaccidente,
			String lugaraccidente, Clientes cliente) {
		this.idaccidente = idaccidente;
		this.fechaaccidente = fechaaccidente;
		this.horaaccidente = horaaccidente;
		this.sucesoaccidente = sucesoaccidente;
		this.lugaraccidente = lugaraccidente;
		this.cliente = cliente;
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

	public String getLugaraccidente() {
		return lugaraccidente;
	}

	public void setLugaraccidente(String lugaraccidente) {
		this.lugaraccidente = lugaraccidente;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Accidentes [idaccidente=" + idaccidente + ", fechaaccidente=" + fechaaccidente + ", horaaccidente="
				+ horaaccidente + ", sucesoaccidente=" + sucesoaccidente + ", lugaraccidente=" + lugaraccidente
				+ ", cliente=" + cliente + "]";
	}


	
	

}