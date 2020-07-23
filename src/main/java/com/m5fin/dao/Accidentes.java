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
	
	@Column(name="lugaraccidente")
	private String lugaraccidente;
	
	@Column(name="idclienteaccidente")
	private int idclienteaccidente;

	public Accidentes() {
		
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

	public int getIdclienteaccidente() {
		return idclienteaccidente;
	}

	public void setIdclienteaccidente(int idclienteaccidente) {
		this.idclienteaccidente = idclienteaccidente;
	}

	@Override
	public String toString() {
		return "Accidentes [idaccidente=" + idaccidente + ", fechaaccidente=" + fechaaccidente + ", horaaccidente="
				+ horaaccidente + ", sucesoaccidente=" + sucesoaccidente + ", lugaraccidente=" + lugaraccidente
				+ ", idclienteaccidente=" + idclienteaccidente + "]";
	}
	
	
	
	

}