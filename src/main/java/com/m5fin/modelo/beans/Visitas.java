package com.m5fin.modelo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VISITAS")
public class Visitas {
	
	@Id
	@GeneratedValue
	
	@Column(name="idvisita")
	private int idvisita;
	
	@Column(name="direccionvisita")
	private String direccionvisita;
	
	@Column(name="ciudadvisita")
	private String ciudadvisita;
	
	@Column(name="fechavisita")
	private String fechavisita;
	
	@Column(name="resumenvisita")
	private String resumenvisita;
	
	@Column(name="observacionvisita")
	private String observacionvisita;
	
	@Column(name="idclientevisita")
	private int idclientevisita;
	
	@Column(name="idempleadovisita")
	private int idempleadovisita;

	
	public Visitas() {
	}

	public Visitas(int idvisita, String direccionvisita, String ciudadvisita, String fechavisita, String resumenvisita,
			String observacionvisita, int idclientevisita, int idempleadovisita) {
		this.idvisita = idvisita;
		this.direccionvisita = direccionvisita;
		this.ciudadvisita = ciudadvisita;
		this.fechavisita = fechavisita;
		this.resumenvisita = resumenvisita;
		this.observacionvisita = observacionvisita;
		this.idclientevisita = idclientevisita;
		this.idempleadovisita = idempleadovisita;
	}

	public int getIdvisita() {
		return idvisita;
	}

	public void setIdvisita(int idvisita) {
		this.idvisita = idvisita;
	}

	public String getDireccionvisita() {
		return direccionvisita;
	}

	public void setDireccionvisita(String direccionvisita) {
		this.direccionvisita = direccionvisita;
	}

	public String getCiudadvisita() {
		return ciudadvisita;
	}

	public void setCiudadvisita(String ciudadvisita) {
		this.ciudadvisita = ciudadvisita;
	}

	public String getFechavisita() {
		return fechavisita;
	}

	public void setFechavisita(String fechavisita) {
		this.fechavisita = fechavisita;
	}

	public String getResumenvisita() {
		return resumenvisita;
	}

	public void setResumenvisita(String resumenvisita) {
		this.resumenvisita = resumenvisita;
	}

	public String getObservacionvisita() {
		return observacionvisita;
	}

	public void setObservacionvisita(String observacionvisita) {
		this.observacionvisita = observacionvisita;
	}

	public int getIdclientevisita() {
		return idclientevisita;
	}

	public void setIdclientevisita(int idclientevisita) {
		this.idclientevisita = idclientevisita;
	}

	public int getIdempleadovisita() {
		return idempleadovisita;
	}

	public void setIdempleadovisita(int idempleadovisita) {
		this.idempleadovisita = idempleadovisita;
	}

	@Override
	public String toString() {
		return "Visitas [idvisita=" + idvisita + ", direccionvisita=" + direccionvisita + ", ciudadvisita="
				+ ciudadvisita + ", fechavisita=" + fechavisita + ", resumenvisita=" + resumenvisita
				+ ", observacionvisita=" + observacionvisita + ", idclientevisita=" + idclientevisita
				+ ", idempleadovisita=" + idempleadovisita + "]";
	}
	
	
	
}
