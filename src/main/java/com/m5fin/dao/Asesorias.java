package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ASESORIAS")
public class Asesorias {
	
	/*
	@SequenceGenerator(name = "AsesoriaIdGenerator", sequenceName = "ASESORIAS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AsesoriaIdGenerator")
	 */
	
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
	
	/*
	@Column(name="idvisitaasesoria")
	private int idvisitaasesoria;
	*/
	
	@ManyToOne
	@JoinColumn(name = "idvisitaasesoria") 
	Visitas visita;
	
	public Asesorias() {
		
	}

	public Asesorias(int idasesoria, String detalleasesoria, String gestionasesoria, String propuestaasesoria,
			String fechaasesoria, String especialasesoria, Visitas visita) {
		this.idasesoria = idasesoria;
		this.detalleasesoria = detalleasesoria;
		this.gestionasesoria = gestionasesoria;
		this.propuestaasesoria = propuestaasesoria;
		this.fechaasesoria = fechaasesoria;
		this.especialasesoria = especialasesoria;
		this.visita = visita;
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

	public Visitas getVisita() {
		return visita;
	}

	public void setVisita(Visitas visita) {
		this.visita = visita;
	}

	@Override
	public String toString() {
		return "Asesorias [idasesoria=" + idasesoria + ", detalleasesoria=" + detalleasesoria + ", gestionasesoria="
				+ gestionasesoria + ", propuestaasesoria=" + propuestaasesoria + ", fechaasesoria=" + fechaasesoria
				+ ", especialasesoria=" + especialasesoria + ", visita=" + visita + "]";
	}
	
	
	
	
	
	
}
