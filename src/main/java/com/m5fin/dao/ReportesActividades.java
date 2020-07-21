package com.m5fin.dao;

public class ReportesActividades {
	private int idcliente;
	private String nombrecliente;
	private String rubrocliente;
	
	private String fechamejora;
	private String motivomejora;
	private String actividadesmejora;
	private String estadomejora;
	
	private String fechaaccidente;
	private String horaaccidente;
	private String sucesoaccidente;
	private String lugaraccidente;
	
	private String direccionvisita;
	private String fechavisita;
	private String ciudadvisita;
	private String resumenvisita;
	private String observacionvisita;
	private String nombreempleado;
	
	private String fechacapacitacion;
	private String horacapacitacion;
	private String numasistcapacitacion;
	
	private String detalleasesoria;
	private String gestionasesoria;
	private String propuestaasesoria;
	private String fechaasesoria;
	private String especialasesoria;
	
	
	
	
	/*CU14 Visualizar Actividades*/
	/*constuctor listado capacitaciones*/
	public ReportesActividades(int idcliente, String nombrecliente, String fechacapacitacion, String horacapacitacion,
			String numasistcapacitacion) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.fechacapacitacion = fechacapacitacion;
		this.horacapacitacion = horacapacitacion;
		this.numasistcapacitacion = numasistcapacitacion;
	}
	
	/*constuctor Listado visitas*/
	public ReportesActividades(int idcliente, String nombrecliente, String direccionvisita, String fechavisita, String ciudadvisita,
			String resumenvisita, String observacionvisita, String nombreempleado) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.direccionvisita = direccionvisita;
		this.fechavisita = fechavisita;
		this.ciudadvisita = ciudadvisita;
		this.resumenvisita = resumenvisita;
		this.observacionvisita = observacionvisita;
		this.nombreempleado = nombreempleado;
	}
	
	/*constuctor listado mejoras*/
	public ReportesActividades(int idcliente, String nombrecliente, String rubrocliente, String fechamejora, String motivomejora,
			String actividadesmejora, String estadomejora) {
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.rubrocliente = rubrocliente;
		this.fechamejora = fechamejora;
		this.motivomejora = motivomejora;
		this.actividadesmejora = actividadesmejora;
		this.estadomejora = estadomejora;
	}
	
	/*Listado asesoria*/
	public ReportesActividades(String nombrecliente, String detalleasesoria, String gestionasesoria, 
			String propuestaasesoria, String fechaasesoria, String especialasesoria, String nombreempleado) {
		
		this.nombrecliente = nombrecliente;
		this.detalleasesoria = detalleasesoria;
		this.gestionasesoria = gestionasesoria;
		this.propuestaasesoria = propuestaasesoria;
		this.fechaasesoria = fechaasesoria;
		this.especialasesoria = especialasesoria;
		this.nombreempleado = nombreempleado;
		
	}
	
	public ReportesActividades() {
		
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

	public String getRubrocliente() {
		return rubrocliente;
	}

	public void setRubrocliente(String rubrocliente) {
		this.rubrocliente = rubrocliente;
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

	public String getFechaaccidente() {
		return fechaaccidente;
	}

	public void setFechaaccidente(String fechaaccidente) {
		this.fechaaccidente = fechaaccidente;
	}

	public String getHoraaccidente() {
		return horaaccidente;
	}

	public void setHoraaccidente(String horaaccidente) {
		this.horaaccidente = horaaccidente;
	}

	public String getSucesoaccidente() {
		return sucesoaccidente;
	}

	public void setSucesoaccidente(String sucesoaccidente) {
		this.sucesoaccidente = sucesoaccidente;
	}

	public String getLugaraccidente() {
		return lugaraccidente;
	}

	public void setLugaraccidente(String lugaraccidente) {
		this.lugaraccidente = lugaraccidente;
	}

	public String getDireccionvisita() {
		return direccionvisita;
	}

	public void setDireccionvisita(String direccionvisita) {
		this.direccionvisita = direccionvisita;
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

	public String getNombreempleado() {
		return nombreempleado;
	}

	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}

	public String getFechacapacitacion() {
		return fechacapacitacion;
	}

	public void setFechacapacitacion(String fechacapacitacion) {
		this.fechacapacitacion = fechacapacitacion;
	}

	public String getHoracapacitacion() {
		return horacapacitacion;
	}

	public void setHoracapacitacion(String horacapacitacion) {
		this.horacapacitacion = horacapacitacion;
	}

	public String getNumasistcapacitacion() {
		return numasistcapacitacion;
	}

	public void setNumasistcapacitacion(String numasistcapacitacion) {
		this.numasistcapacitacion = numasistcapacitacion;
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

	@Override
	public String toString() {
		return "ReportesActividades [idcliente=" + idcliente + ", nombrecliente=" + nombrecliente + ", rubrocliente="
				+ rubrocliente + ", fechamejora=" + fechamejora + ", motivomejora=" + motivomejora
				+ ", actividadesmejora=" + actividadesmejora + ", estadomejora=" + estadomejora + ", fechaaccidente="
				+ fechaaccidente + ", horaaccidente=" + horaaccidente + ", sucesoaccidente=" + sucesoaccidente
				+ ", lugaraccidente=" + lugaraccidente + ", direccionvisita=" + direccionvisita + ", fechavisita="
				+ fechavisita + ", ciudadvisita=" + ciudadvisita + ", resumenvisita=" + resumenvisita
				+ ", observacionvisita=" + observacionvisita + ", nombreempleado=" + nombreempleado
				+ ", fechacapacitacion=" + fechacapacitacion + ", horacapacitacion=" + horacapacitacion
				+ ", numasistcapacitacion=" + numasistcapacitacion + ", detalleasesoria=" + detalleasesoria
				+ ", gestionasesoria=" + gestionasesoria + ", propuestaasesoria=" + propuestaasesoria
				+ ", fechaasesoria=" + fechaasesoria + ", especialasesoria=" + especialasesoria + "]";
	}
	
	
}
