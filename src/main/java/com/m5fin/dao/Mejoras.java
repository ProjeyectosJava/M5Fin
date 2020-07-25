package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	/* reemplazamos la llave foranea por el @many y @join
	@Column(name = "idclientemejora")
	private int idclientemejora;
	*/
	
	@ManyToOne
	@JoinColumn(name = "idclientemejora") 
	Clientes cliente;
	
	public Mejoras() {
		
	}

	public Mejoras(int idmejora, String fechamejora, String motivomejora, String actividadesmejora, String estadomejora,
			Clientes cliente) {
		this.idmejora = idmejora;
		this.fechamejora = fechamejora;
		this.motivomejora = motivomejora;
		this.actividadesmejora = actividadesmejora;
		this.estadomejora = estadomejora;
		this.cliente = cliente;
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

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Mejoras [idmejora=" + idmejora + ", fechamejora=" + fechamejora + ", motivomejora=" + motivomejora
				+ ", actividadesmejora=" + actividadesmejora + ", estadomejora=" + estadomejora + ", cliente=" + cliente
				+ "]";
	}

	
}
