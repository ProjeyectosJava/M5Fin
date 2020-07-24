package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASESORIAS")
public class Asesorias {
	
	@Id
	@GeneratedValue
	@Column(name="idasesoria")
	private int idasesoria;
	@Column(name="detalleasesoria")
	private String detalleasesoria;
	
	@Column(name="gestionasesoria")
	private String gestionasesoria;
	@Column(name="propuestaasesoria")
	private String propuestaasesoria;
	@Column(name="fechaasesoria")
	private String fechaasesoria;
	@Column(name="especialasesoria")
	private String especialasesoria;
	@Column(name="idvisitaasesoria")
	private int idvisitaasesoria;
	
	public Asesorias() {
		
	}
	
	public Asesorias(int idasesoria, String detalleasesoria, String gestionasesoria, String propuestaasesoria,
			String fechaasesoria, String especialasesoria, int idvisitaasesoria) {
		this.idasesoria = idasesoria;
		this.detalleasesoria = detalleasesoria;
		this.gestionasesoria = gestionasesoria;
		this.propuestaasesoria = propuestaasesoria;
		this.fechaasesoria = fechaasesoria;
		this.especialasesoria = especialasesoria;
		this.idvisitaasesoria = idvisitaasesoria;
	}

	public int getIdasesoria() {
		return idasesoria;
	}

	public void setIdasesoria(int idasesoria) {
		this.idasesoria = idasesoria;
	}

	public String getDetalleasesoria() {
		return detalleasesoria;
	}

	public void setDetalleasesoria(String detalleasesoria) {
		this.detalleasesoria = detalleasesoria;
	}

	public String getGestionasesoria() {
		return gestionasesoria;
	}

	public void setGestionasesoria(String gestionasesoria) {
		this.gestionasesoria = gestionasesoria;
	}

	public String getPropuestaasesoria() {
		return propuestaasesoria;
	}

	public void setPropuestaasesoria(String propuestaasesoria) {
		this.propuestaasesoria = propuestaasesoria;
	}

	public String getFechaasesoria() {
		return fechaasesoria;
	}

	public void setFechaasesoria(String fechaasesoria) {
		this.fechaasesoria = fechaasesoria;
	}

	public String getEspecialasesoria() {
		return especialasesoria;
	}

	public void setEspecialasesoria(String especialasesoria) {
		this.especialasesoria = especialasesoria;
	}

	public int getIdvisitaasesoria() {
		return idvisitaasesoria;
	}

	public void setIdvisitaasesoria(int idvisitaasesoria) {
		this.idvisitaasesoria = idvisitaasesoria;
	}

	@Override
	public String toString() {
		return "Aserorias [idasesoria=" + idasesoria + ", detalleasesoria=" + detalleasesoria + ", gestionasesoria="
				+ gestionasesoria + ", propuestaasesoria=" + propuestaasesoria + ", fechaasesoria=" + fechaasesoria
				+ ", especialasesoria=" + especialasesoria + ", idvisitaasesoria=" + idvisitaasesoria + "]";
	}

	
	
	
	
	
	
	
	
}
