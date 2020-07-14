package com.m5fin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5fin.modelo.beans.MejorasVisitas;
import com.m5fin.modelo.beans.Mejoras;

public class MejoraDao {

JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Mejoras mejora){   
		String sql = "INSERT INTO Mejoras VALUES (null,'" 
				+ mejora.getFechaMejora() + "','" 
				+ mejora.getMotivoMejora() + "','" 
				+ mejora.getActividadesMejora() + "','" 
				+ mejora.getEstadoMejora() + "','"
				+ mejora.getIdClienteMejora() + "')";
	    return template.update(sql);
	}
	
	public List<MejorasVisitas> getListarMejoras(){  
		
		String sql = "select idmejora, idclientemejora, fechamejora, nombrecliente, motivomejora, actividadesmejora, estadomejora"
				+ " from mejoras left join clientes on idcliente = idclientemejora "
				+ "order by nombrecliente";
		
		
	    return template.query(sql,new RowMapper<MejorasVisitas>(){    
	        public MejorasVisitas mapRow(ResultSet rs, int row) throws SQLException {    
	            MejorasVisitas mv = new MejorasVisitas();    
	            mv.setIdmejora(rs.getInt(1));
				mv.setIdclientemejora(rs.getInt(2));
				mv.setFechamejora(rs.getString(3));
				mv.setNombrecliente(rs.getString(4));
				mv.setMotivomejora(rs.getString(5));
				mv.setActividadesmejora(rs.getString(6));
				mv.setEstadomejora(rs.getString(7));
	            return mv;
	        }    
	    });    
	}
	
}
