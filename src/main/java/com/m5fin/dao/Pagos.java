package com.m5fin.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PAGOS")
public class Pagos {
	
	/*
	@SequenceGenerator(name = "PagoIdGenerator", sequenceName = "PAGOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PagoIdGenerator")
	 */
	
	@Id
	@GeneratedValue
	@Column(name = "idpago")
	private int idpago;
	
	@Column(name = "mesaniopago")
	private String mesaniopago;
	
	@Column(name = "montoregularpago")
	private int montoregularpago;
	
	@Column(name = "montoadicionalpago")
	private int montoadicionalpago;
	
	/* reemplazamos la llave foranea por el @many y @join
	@Column(name = "idclientepago")
	private int idclientepago;
	*/
	
	@ManyToOne
	@JoinColumn(name = "idclientepago")
	Clientes cliente;
	
	public Pagos() {
		
	}

	public Pagos(int idpago, String mesaniopago, int montoregularpago, int montoadicionalpago, Clientes cliente) {
		super();
		this.idpago = idpago;
		this.mesaniopago = mesaniopago;
		this.montoregularpago = montoregularpago;
		this.montoadicionalpago = montoadicionalpago;
		this.cliente = cliente;
	}

	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	public String getMesaniopago() {
		return mesaniopago;
	}

	public void setMesaniopago(String mesaniopago) {
		this.mesaniopago = mesaniopago;
	}

	public int getMontoregularpago() {
		return montoregularpago;
	}

	public void setMontoregularpago(int montoregularpago) {
		this.montoregularpago = montoregularpago;
	}

	public int getMontoadicionalpago() {
		return montoadicionalpago;
	}

	public void setMontoadicionalpago(int montoadicionalpago) {
		this.montoadicionalpago = montoadicionalpago;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pagos [idpago=" + idpago + ", mesaniopago=" + mesaniopago + ", montoregularpago=" + montoregularpago
				+ ", montoadicionalpago=" + montoadicionalpago + ", cliente=" + cliente + "]";
	}
	
	
	
	

}
