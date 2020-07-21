package com.m5fin.dao;

public class VisitasGeneradas {
	private String nombrecliente;
	private String telefonocliente;
	private String direccioncliente;
	private String fechavisita;
	private String ciudadvisita;
	private String nombreempleado;
	
	public VisitasGeneradas(String nombrecliente, String telefonocliente, String direccioncliente, String fechavisita,
			String ciudadvisita, String nombreempleado) {
		this.nombrecliente = nombrecliente;
		this.telefonocliente = telefonocliente;
		this.direccioncliente = direccioncliente;
		this.fechavisita = fechavisita;
		this.ciudadvisita = ciudadvisita;
		this.nombreempleado = nombreempleado;
	}
	
	public VisitasGeneradas() {
		
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

	public String getDireccioncliente() {
		return direccioncliente;
	}

	public void setDireccioncliente(String direccioncliente) {
		this.direccioncliente = direccioncliente;
	}

	public String getFechavisita() {
		return fechavisita;
	}

	public void setFechavisita(String fechavisita) {
		this.fechavisita = fechavisita;
	}

	public String getCiudadvisita() {
		return ciudadvisita;
	}

	public void setCiudadvisita(String ciudadvisita) {
		this.ciudadvisita = ciudadvisita;
	}

	public String getNombreempleado() {
		return nombreempleado;
	}

	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}

	@Override
	public String toString() {
		return "VisitasGeneradas [nombrecliente=" + nombrecliente + ", telefonocliente=" + telefonocliente
				+ ", direccioncliente=" + direccioncliente + ", fechavisita=" + fechavisita + ", ciudadvisita="
				+ ciudadvisita + ", nombreempleado=" + nombreempleado + "]";
	}
		
	

}