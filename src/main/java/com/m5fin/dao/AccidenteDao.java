package com.m5fin.dao;


import org.springframework.jdbc.core.JdbcTemplate;

import com.m5fin.modelo.beans.Accidentes;

public class AccidenteDao {
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Accidentes accidente) {   
		int agregar = 0;
		String sql = "INSERT INTO Accidentes VALUES (null,'" 
				+ accidente.getFechaAccidente() + "','" 
				+ accidente.getHoraAccidente() + "','" 
				+ accidente.getSucesoAccidente() + "','" 
				+ accidente.getLugarAccidente() + "','"
				+ accidente.getClienteIdAcciedente() + "')";
		agregar = template.update(sql);
		return agregar;
	}
	
	
	
	
}
