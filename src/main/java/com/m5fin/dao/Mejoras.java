package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEJORAS")
public class Mejoras {
	@Id
	@GeneratedValue
	@Column(name = "idmejora")
	private int idmejora;
	
	@Column(name = "fechamejora")
	private String fechamejora;
	
	@Column(name = "motivomejora")
	private String motivomejora;
	
	@Column(name = "actividadesmejora")
	private String actividadesmejora;
	
	@Column(name = "estadomejora")
	private String estadomejora;
	
	@Column(name = "idClientemejora")
	private int idClientemejora;

	public Mejoras(int idmejora, String fechamejora, String motivomejora, String actividadesmejora, String estadomejora,
			int idClientemejora) {
		this.idmejora = idmejora;
		this.fechamejora = fechamejora;
		this.motivomejora = motivomejora;
		this.actividadesmejora = actividadesmejora;
		this.estadomejora = estadomejora;
		this.idClientemejora = idClientemejora;
	}

	public int getIdmejora() {
		return idmejora;
	}

	public void setIdmejora(int idmejora) {
		this.idmejora = idmejora;
	}

	public String getFechamejora() {
		return fechamejora;
	}

	public void setFechamejora(String fechamejora) {
		this.fechamejora = fechamejora;
	}

	public String getMotivomejora() {
		return motivomejora;
	}

	public void setMotivomejora(String motivomejora) {
		this.motivomejora = motivomejora;
	}

	public String getActividadesmejora() {
		return actividadesmejora;
	}

	public void setActividadesmejora(String actividadesmejora) {
		this.actividadesmejora = actividadesmejora;
	}

	public String getEstadomejora() {
		return estadomejora;
	}

	public void setEstadomejora(String estadomejora) {
		this.estadomejora = estadomejora;
	}

	public int getIdClientemejora() {
		return idClientemejora;
	}

	public void setIdClientemejora(int idClientemejora) {
		this.idClientemejora = idClientemejora;
	}

	@Override
	public String toString() {
		return "Mejoras [idmejora=" + idmejora + ", fechamejora=" + fechamejora + ", motivomejora=" + motivomejora
				+ ", actividadesmejora=" + actividadesmejora + ", estadomejora=" + estadomejora + ", idClientemejora="
				+ idClientemejora + "]";
	}
	
	

}
