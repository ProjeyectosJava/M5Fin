package com.m5fin.dao;

public class ListaPagoMorosos {
	
	private int idpago;

	private String mesaniopago;
	
	private int montoregularpago;
	
	private int montoadicionalpago;
	
	private int idclientepago;
	
	private String nombrecliente;
	
	private int periodoDia;
	private int periodoMes;
	private int periodoYear;
	
	public ListaPagoMorosos() {
		
	}

	public ListaPagoMorosos(int idpago, String mesaniopago, int montoregularpago, int montoadicionalpago,
			int idclientepago, String nombrecliente, int periodoDia, int periodoMes, int periodoYear) {
		this.idpago = idpago;
		this.mesaniopago = mesaniopago;
		this.montoregularpago = montoregularpago;
		this.montoadicionalpago = montoadicionalpago;
		this.idclientepago = idclientepago;
		this.nombrecliente = nombrecliente;
		this.periodoDia = periodoDia;
		this.periodoMes = periodoMes;
		this.periodoYear = periodoYear;
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


	public int getIdclientepago() {
		return idclientepago;
	}


	public void setIdclientepago(int idclientepago) {
		this.idclientepago = idclientepago;
	}


	public String getNombrecliente() {
		return nombrecliente;
	}


	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}


	public int getPeriodoDia() {
		return periodoDia;
	}


	public void setPeriodoDia(int periodoDia) {
		this.periodoDia = periodoDia;
	}


	public int getPeriodoMes() {
		return periodoMes;
	}


	public void setPeriodoMes(int periodoMes) {
		this.periodoMes = periodoMes;
	}


	public int getPeriodoYear() {
		return periodoYear;
	}


	public void setPeriodoYear(int periodoYear) {
		this.periodoYear = periodoYear;
	}


	@Override
	public String toString() {
		return "ListaPagoMorosos [idpago=" + idpago + ", mesaniopago=" + mesaniopago + ", montoregularpago="
				+ montoregularpago + ", montoadicionalpago=" + montoadicionalpago + ", idclientepago=" + idclientepago
				+ ", nombrecliente=" + nombrecliente + ", periodoDia=" + periodoDia + ", periodoMes=" + periodoMes
				+ ", periodoYear=" + periodoYear + "]";
	}

	
	

}
