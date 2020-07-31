package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {
	
	/*
	@SequenceGenerator(name = "ClienteIdGenerator", sequenceName = "CLIENTES_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClienteIdGenerator")
	*/
	
	@Id
	@GeneratedValue
	@Column(name="idcliente")
	private int idcliente;
	
	@Column(name="nombrecliente")
	private String nombrecliente;
	
	@Column(name="telefonocliente")
	private String telefonocliente;
	
	@Column(name="emailcliente")
	private String emailcliente;
	
	@Column(name="rubrocliente")
	private String rubrocliente;
	
	@Column(name="direccioncliente")
	private String direccioncliente;
		
	public Clientes() {
		
	}
	

	public Clientes(int idcliente) {
		this.idcliente = idcliente;
	}




	public Clientes(int idcliente, String nombrecliente, String telefonocliente, String emailcliente,
			String rubrocliente, String direccioncliente) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.telefonocliente = telefonocliente;
		this.emailcliente = emailcliente;
		this.rubrocliente = rubrocliente;
		this.direccioncliente = direccioncliente;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getTelefonocliente() {
		return telefonocliente;
	}

	public void setTelefonocliente(String telefonocliente) {
		this.telefonocliente = telefonocliente;
	}

	public String getEmailcliente() {
		return emailcliente;
	}

	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}

	public String getRubrocliente() {
		return rubrocliente;
	}

	public void setRubrocliente(String rubrocliente) {
		this.rubrocliente = rubrocliente;
	}

	public String getDireccioncliente() {
		return direccioncliente;
	}

	public void setDireccioncliente(String direccioncliente) {
		this.direccioncliente = direccioncliente;
	}

	@Override
	public String toString() {
		return "Clientes [idcliente=" + idcliente + ", nombrecliente=" + nombrecliente + ", telefonocliente="
				+ telefonocliente + ", emailcliente=" + emailcliente + ", rubrocliente=" + rubrocliente
				+ ", direccioncliente=" + direccioncliente + "]";
	}
	
	
	
	
	
	

}