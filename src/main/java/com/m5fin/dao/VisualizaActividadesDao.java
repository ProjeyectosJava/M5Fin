package com.m5fin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;;

/*CU14 Visualizar Actividades*/

public class VisualizaActividadesDao {

JdbcTemplate template;

	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	/*Lista las capacitaciones de los clientes que tengan una o mas asociadas*/
	public List<ReportesActividades> getListarCapacitaciones(){  
		String sql = "";
		
		sql = "select  idcliente, nombrecliente, fechacapacitacion, horacapacitacion, numasistcapacitacion "
				+ "from clientes inner join visitas on idcliente = idclientevisita "
				+ "left join empleados on idempleadovisita = idempleado "
				+ "inner join capacitaciones on idvisita = idvisitacapacitacion "
				+ "order by nombrecliente";
		
		System.out.println("Valor sql: " + sql);
	    return template.query(sql,new RowMapper<ReportesActividades>(){    
	        public ReportesActividades mapRow(ResultSet rs, int row) throws SQLException {    
	            ReportesActividades ra = new ReportesActividades();    
	            ra.setIdcliente(rs.getInt("idcliente"));
	            ra.setNombrecliente(rs.getString("nombrecliente"));
	            ra.setFechacapacitacion(rs.getString("fechacapacitacion"));
	            ra.setHoracapacitacion(rs.getString("horacapacitacion"));
	            ra.setNumasistcapacitacion(rs.getString("numasistcapacitacion"));
	            return ra;
	        }    
	    });    
	}
	
	
	/*Lista las visitas de los clientes que tengan una o mas asociadas*/
	public List<ReportesActividades> getListarVisitas(){  
		String sql = "";
		
		sql = "select  idcliente, nombrecliente, ciudadvisita, direccionvisita, resumenvisita, "
				+ "observacionvisita, fechavisita, nombreempleado "
				+ "from clientes inner join visitas on idcliente = idclientevisita "
				+ "left join empleados on idempleadovisita = idempleado "
				+ "order by nombrecliente";
		
		System.out.println("Valor sql: " + sql);
	    return template.query(sql,new RowMapper<ReportesActividades>(){    
	        public ReportesActividades mapRow(ResultSet rs, int row) throws SQLException {    
	            ReportesActividades ra = new ReportesActividades();    
	            ra.setIdcliente(rs.getInt("idcliente"));
	            ra.setNombrecliente(rs.getString("nombrecliente"));
	            ra.setCiudadvisita(rs.getString("ciudadvisita"));
	            ra.setDireccionvisita(rs.getString("direccionvisita"));
	            ra.setResumenvisita(rs.getString("resumenvisita"));
	            ra.setObservacionvisita(rs.getNString("observacionvisita"));
	            ra.setFechavisita(rs.getNString("fechavisita"));
	            ra.setNombreempleado(rs.getString("nombreempleado"));
	            return ra;
	        }    
	    });    
	}
	
	/*Lista las mejoras de los clientes que tengan una o mas asociadas*/
	public List<ReportesActividades> getListarMejoras(){  
		String sql = "";
		
		sql = "select idcliente, nombrecliente, rubrocliente, fechamejora, motivomejora, "
				+ "actividadesmejora, estadomejora "
				+ "from clientes inner join mejoras on idcliente = idclientemejora "
				+ "order by nombrecliente";
		
		System.out.println("Valor sql: " + sql);
	    return template.query(sql,new RowMapper<ReportesActividades>(){    
	        public ReportesActividades mapRow(ResultSet rs, int row) throws SQLException {    
	            ReportesActividades ra = new ReportesActividades();    
	            ra.setIdcliente(rs.getInt("idcliente"));
	            ra.setNombrecliente(rs.getString("nombrecliente"));
	            ra.setRubrocliente(rs.getString("rubrocliente"));
	            ra.setFechamejora(rs.getString("fechamejora"));
	            ra.setMotivomejora(rs.getString("motivomejora"));
	            ra.setActividadesmejora(rs.getString("actividadesmejora"));
	            ra.setEstadomejora(rs.getString("estadomejora"));
	            return ra;
	        }    
	    });    
	}
	
	
	/*Lista las asesorias de los clientes que tengan una o mas asociadas*/
	public List<ReportesActividades> getListarAsesorias(){  
		String sql = "";
		
		sql = "select idcliente, nombrecliente, detalleasesoria, gestionasesoria, propuestaasesoria, "
				+ "fechaasesoria, especialasesoria, nombreempleado "
				+ "from clientes inner join visitas on idcliente = idclientevisita "
				+ "left join empleados on idempleadovisita = idempleado "
				+ "inner join asesorias on idvisita = idvisitaasesoria "
				+ "order by nombrecliente";
		
		System.out.println("Valor sql: " + sql);
	    return template.query(sql,new RowMapper<ReportesActividades>(){    
	        public ReportesActividades mapRow(ResultSet rs, int row) throws SQLException {    
	            ReportesActividades ra = new ReportesActividades();    
	            ra.setIdcliente(rs.getInt("idcliente"));
	            ra.setNombrecliente(rs.getString("nombrecliente"));
	            ra.setDetalleasesoria(rs.getString("detalleasesoria"));
	            ra.setGestionasesoria(rs.getString("gestionasesoria"));
	            ra.setPropuestaasesoria(rs.getString("propuestaasesoria"));
	            ra.setFechaasesoria(rs.getString("fechaasesoria"));
	            ra.setEspecialasesoria(rs.getString("especialasesoria"));
	            ra.setNombreempleado(rs.getString("nombreempleado"));
	            return ra;
	        }    
	    });    
	}
	
}
