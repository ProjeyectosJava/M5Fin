package com.m5fin.dao;

//import java.sql.ResultSet;    
//import java.sql.SQLException;    
//import java.util.List;    
//import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
//import org.springframework.jdbc.core.RowMapper;

import com.m5fin.modelo.beans.Capacitaciones;


public class CapacitacionDao {
	
JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Capacitaciones capacitacion){   
		String sql = "INSERT INTO Capacitaciones VALUES (null,'" 
				+ capacitacion.getFechaCapacitacion() + "','" 
				+ capacitacion.getHoraCapacitacion()  + "','" 
				+ capacitacion.getNumAsistCapacitacion() + "','"
				+ capacitacion.getIdVisitaCapacitacion() + "')";
		System.out.println("Valor sql: " + sql);
	    return template.update(sql);
	}

}
