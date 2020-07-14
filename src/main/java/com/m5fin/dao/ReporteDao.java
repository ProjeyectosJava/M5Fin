package com.m5fin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5fin.modelo.beans.Reportes;

public class ReporteDao {

JdbcTemplate template;

	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	/*
	public Clientes getCliById(int id){
		String sql = "select * from clientes where idcliente = ?";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Clientes>(Clientes.class));    
	}
	*/
	
	public List<Reportes> getListarMejoras(int idcli){  
		String sql = "";
		
		if(idcli == 0) {
			sql = "select idcliente, nombrecliente, rubrocliente, fechamejora, motivomejora, estadomejora " 
					+ "from clientes inner join mejoras on idcliente = idclientemejora "
					+ "order by nombrecliente";			
		} else {	
			sql ="select idcliente, nombrecliente, rubrocliente, fechamejora, motivomejora, estadomejora " 
					+ "from clientes inner join mejoras on idcliente = idclientemejora "
					+ "where idcliente = " + idcli;
		}
		System.out.println("Valor sql: " + sql);
	    return template.query(sql,new RowMapper<Reportes>(){    
	        public Reportes mapRow(ResultSet rs, int row) throws SQLException {    
	            Reportes r = new Reportes();    
	            r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setFechamejora(rs.getString(4));
				r.setMotivomejora(rs.getString(5));
				r.setEstadomejora(rs.getString(6));
	            return r;
	        }    
	    });    
	}
	
	
	public List<Reportes> getListarAccidentes(int idcli){  
		String sql = "";
		
		if(idcli == 0) {
			sql = "select idcliente, nombrecliente, rubrocliente, fechaaccidente, horaaccidente, sucesoaccidente, lugaraccidente " 
					+ "from clientes inner join accidentes on idcliente = idclienteaccidente " 
					+ "order by nombrecliente";
		} else {
			sql = "select idcliente, nombrecliente, rubrocliente, fechaaccidente, horaaccidente, sucesoaccidente, lugaraccidente " 
					+ "from clientes inner join accidentes on idcliente = idclienteaccidente " 
					+ "where idcliente = " + idcli;
		}
		System.out.println("Valor sql: " + sql);
	    return template.query(sql,new RowMapper<Reportes>(){    
	        public Reportes mapRow(ResultSet rs, int row) throws SQLException {    
	            Reportes r = new Reportes();    
	            r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setFechaaccidente(rs.getString(4));
				r.setHoraaccidente(rs.getString(5));
				r.setSucesoaccidente(rs.getString(6));
				r.setLugaraccidente(rs.getString(7));
	            return r;
	        }    
	    });    
	}
	
	
	public List<Reportes> getListarVisitas(int idcli){  
		String sql = "";
		
		if(idcli == 0) {
			sql = "select idcliente, nombrecliente, rubrocliente,direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado "
					+ "from clientes inner join visitas on idcliente = idclientevisita "
					+ "left join empleados on idempleadovisita = idempleado "
					+ "order by nombrecliente";
		} else {
			sql = "select idcliente, nombrecliente, rubrocliente,direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado " 
					+ "from clientes inner join visitas on idcliente = idclientevisita " 
					+ "left join empleados on idempleadovisita = idempleado " 
					+ "where idcliente = " + idcli;
		}
		
		System.out.println("valor sql: " + sql);
		
	    return template.query(sql,new RowMapper<Reportes>(){    
	        public Reportes mapRow(ResultSet rs, int row) throws SQLException {    
	            Reportes r = new Reportes();    
	            r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setDireccionvisita(rs.getString(4));
				r.setFechavisita(rs.getString(5));
				r.setCiudadvisita(rs.getString(6));
				r.setResumenvisita(rs.getString(7));
				r.setNombremepleado(rs.getString(8));
	            return r;
	        }    
	    });    
	}
	
	public List<Reportes> getListarVisitasCapacitacion(int idcli){  
		String sql = "";
		
		if(idcli == 0) {
			sql = "select  idcliente, nombrecliente, rubrocliente, direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado, fechacapacitacion, horacapacitacion, numasistcapacitacion " 
					+ "from clientes inner join visitas on idcliente = idclientevisita " 
					+ "left join empleados on idempleadovisita = idempleado " 
					+ "inner join capacitaciones on idvisita = idvisitacapacitacion " 
					+ "order by nombrecliente";
		} else {
			sql = "select idcliente, nombrecliente, rubrocliente, direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado, fechacapacitacion, horacapacitacion, numasistcapacitacion "
					+ "from clientes inner join visitas on idcliente = idclientevisita " 
					+ "left join empleados on idempleadovisita = idempleado " 
					+ "inner join capacitaciones on idvisita = idvisitacapacitacion " 
					+ "where idcliente = " + idcli;
		}
		
	    return template.query(sql,new RowMapper<Reportes>(){    
	        public Reportes mapRow(ResultSet rs, int row) throws SQLException {    
	            Reportes r = new Reportes();    
	            r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setDireccionvisita(rs.getString(4));
				r.setFechavisita(rs.getString(5));
				r.setCiudadvisita(rs.getString(6));
				r.setResumenvisita(rs.getString(7));
				r.setNombremepleado(rs.getString(8));
				r.setFechacapacitacion(rs.getString(9));
				r.setHoracapacitacion(rs.getString(10));
				r.setNumasistcapacitacion(rs.getString(11));
	            return r;
	        }    
	    });    
	}
	
	
}
