package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADOS")
public class Empleados {
	
	@Id
	@GeneratedValue
	private int ideempleado;
	
	@Column(name="nombreempleado")
	private String nombreempleado;
	
	@Column(name="especialidadempleado")
	private String especialidadempleado;

	public Empleados() {
		
	}

	public Empleados(int ideempleado, String nombreempleado, String especialidadempleado) {
		super();
		this.ideempleado = ideempleado;
		this.nombreempleado = nombreempleado;
		this.especialidadempleado = especialidadempleado;
	}

	public int getIdeempleado() {
		return ideempleado;
	}

	public void setIdeempleado(int ideempleado) {
		this.ideempleado = ideempleado;
	}

	public String getNombreempleado() {
		return nombreempleado;
	}

	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}

	public String getEspecialidadempleado() {
		return especialidadempleado;
	}

	public void setEspecialidadempleado(String especialidadempleado) {
		this.especialidadempleado = especialidadempleado;
	}

	@Override
	public String toString() {
		return "Empleados [ideempleado=" + ideempleado + ", nombreempleado=" + nombreempleado
				+ ", especialidadempleado=" + especialidadempleado + "]";
	}
	


	
}