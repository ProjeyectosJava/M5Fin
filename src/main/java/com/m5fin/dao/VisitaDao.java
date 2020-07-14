package com.m5fin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5fin.modelo.beans.Visitas;
import com.m5fin.modelo.beans.VisitasGeneradas;

public class VisitaDao {

JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Visitas visita){   
		String sql = "INSERT INTO Visitas VALUES (null,'" 
				+ visita.getDireccionVisita() + "','" 
				+ visita.getCiudadVisita() + "','" 
				+ visita.getFechaVisita() + "','" 
				+ visita.getResumenVisita() + "','"
				+ visita.getObservacionVisita() + "','"
				+ visita.getIdClienteVisita() + "','"
				+ visita.getIdEmpleadoVisita() + "')"; 
	    return template.update(sql);
	}
	
	public List<Visitas> getVisitas(){    
	    return template.query("select * from Visitas",new RowMapper<Visitas>(){    
	        public Visitas mapRow(ResultSet rs, int row) throws SQLException {    
	            Visitas v = new Visitas();    
	            v.setIdVisita(rs.getInt(1));
				v.setDireccionVisita(rs.getString(2));
				v.setCiudadVisita(rs.getString(3));
				v.setFechaVisita(rs.getString(4));
				v.setResumenVisita(rs.getString(5));
				v.setObservacionVisita(rs.getString(6));
				v.setIdClienteVisita(rs.getInt(7));
				v.setIdEmpleadoVisita(rs.getInt(8));
	            return v;
	        }    
	    });    
	}
	
	public List<VisitasGeneradas> getVisitasGeneradas(){
		String sql = "select nombrecliente, telefonocliente, direccioncliente, fechavisita, "
				+ "ciudadvisita, nombreempleado from Visitas "
				+ "left join Clientes on idclientevisita = idcliente "
				+ "left join empleados on idempleadovisita = idempleado "
				+ "order by idvisita desc";
	    return template.query(sql,new RowMapper<VisitasGeneradas>(){    
	        public VisitasGeneradas mapRow(ResultSet rs, int row) throws SQLException {    
	            VisitasGeneradas vg = new VisitasGeneradas();    
	            vg.setNombrecliente(rs.getString(1));
				vg.setTelefonocliente(rs.getString(2));
				vg.setDireccioncliente(rs.getString(3));
				vg.setFechavisita(rs.getString(4));
				vg.setCiudadvisita(rs.getString(5));
				vg.setNombreempleado(rs.getString(6));
	           	return vg;
	        }    
	    });    
	}
	
	/*
	public List<VisitasGeneradas> getVisitasGeneradas(){ 
		System.out.println("llegamos hasta qui");
		String sql = "select nombrecliente, telefonocliente, direccioncliente, fechavisita, "
				+ "ciudadvisita, nombreempleado from Visitas "
				+ "left join Clientes on idclientevisita = idcliente "
				+ "left join empleados on idempleadovisita = idempleado "
				+ "order by idvisita desc";
	    return template.query(sql,new RowMapper<VisitasGeneradas>(){

			@Override
			public VisitasGeneradas mapRow(ResultSet rs, int rowNum) throws SQLException {
				VisitasGeneradas vg = new VisitasGeneradas();
				vg.setNombrecliente(rs.getString(1));
				vg.setTelefonocliente(rs.getInt(2));
				vg.setDireccioncliente(rs.getString(3));
				vg.setFechavisita(rs.getString(4));
				vg.setCiudadvisita(rs.getString(5));
				vg.setNombreempleado(rs.getString(6));
	           	return vg;
			}    
	       /*
	    	public VisitasGeneradas mapRow(ResultSet rs, int row) throws SQLException {    
	            VisitasGeneradas vg = new VisitasGeneradas();    
	            vg.setNombrecliente(rs.getString(1));
				vg.setTelefonocliente(rs.getInt(2));
				vg.setDireccioncliente(rs.getString(3));
				vg.setFechavisita(rs.getString(4));
				vg.setCiudadvisita(rs.getString(5));
				vg.setNombreempleado(rs.getString(6));
	            return vg;
	        }    
	    });    
	}
	*/
	
	
}
