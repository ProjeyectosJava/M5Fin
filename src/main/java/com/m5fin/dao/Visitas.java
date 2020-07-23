package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	
  @ManyToOne
  @JoinColumn(name = "idclientevisita") 
  Clientes cliente;
  
  @ManyToOne
  @JoinColumn(name = "idempleadovisita") 
  Empleados empleado;
 
	
	
	
	public Visitas() {
	}

	
	
	

	public Visitas(int idvisita, String direccionvisita, String ciudadvisita, String fechavisita, String resumenvisita,
			String observacionvisita, Clientes cliente, Empleados empleado) {
		super();
		this.idvisita = idvisita;
		this.direccionvisita = direccionvisita;
		this.ciudadvisita = ciudadvisita;
		this.fechavisita = fechavisita;
		this.resumenvisita = resumenvisita;
		this.observacionvisita = observacionvisita;
		this.cliente = cliente;
		this.empleado = empleado;
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





	public Clientes getCliente() {
		return cliente;
	}





	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}





	public Empleados getEmpleado() {
		return empleado;
	}





	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}





	@Override
	public String toString() {
		return "Visitas [idvisita=" + idvisita + ", direccionvisita=" + direccionvisita + ", ciudadvisita="
				+ ciudadvisita + ", fechavisita=" + fechavisita + ", resumenvisita=" + resumenvisita
				+ ", observacionvisita=" + observacionvisita + ", cliente=" + cliente + ", empleado=" + empleado + "]";
	}





	
	
}
