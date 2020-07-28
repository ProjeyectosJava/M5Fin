package com.m5fin.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADOS")
public class Empleados {
	
	/*
	@SequenceGenerator(name = "EmpleadoIdGenerator", sequenceName = "EMPLEADOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmpleadoIdGenerator")
	 */
	
	@Id
	@GeneratedValue
	private int idempleado;
	
	@Column(name="nombreempleado")
	private String nombreempleado;
	
	@Column(name="especialidadempleado")
	private String especialidadempleado;

	public Empleados() {
		
	}

	public Empleados(int idempleado, String nombreempleado, String especialidadempleado) {
		this.idempleado = idempleado;
		this.nombreempleado = nombreempleado;
		this.especialidadempleado = especialidadempleado;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
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
		return "Empleados [idempleado=" + idempleado + ", nombreempleado=" + nombreempleado
				+ ", especialidadempleado=" + especialidadempleado + "]";
	}
	


	
}