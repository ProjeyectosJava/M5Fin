package com.m5fin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5fin.modelo.beans.Empleados;

public class EmpleadoDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Empleados empleado){   
		String sql = "INSERT INTO empleados VALUES (null,'" + empleado.getNombreEmpleado() + "','" + empleado.getEspecialidadEmpleado() + "')";
	    return template.update(sql);
	}
	
	public int update(Empleados empleado){    
	    String sql = "update empleados set nombreEmpleado = '" + empleado.getNombreEmpleado() 
		+ "', especialidadEmpleado = '" + empleado.getEspecialidadEmpleado() 
		+ "' where idEmpleado = '" + empleado.getIdEmpleado() + "'";
	    System.out.println("EmpleadoDao update - valor sql: " + sql);
	    return template.update(sql);    
	}   

	public int delete(int id){
		String sql = "delete from empleados where idempleado = " + id;
		int del = 0;
		try {
			del = template.update(sql);
		} catch(DataAccessException e) {
			System.out.println("error: " + e);
		}
		System.out.println("del: " + del);
	    return del;
	}    

	public Empleados getCliById(int id){
		String sql = "select * from empleados where idempleado = ?";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Empleados>(Empleados.class));    
	}
	
	public List<Empleados> getEmpleados(){    
	    return template.query("select * from Empleados",new RowMapper<Empleados>(){    
	        public Empleados mapRow(ResultSet rs, int row) throws SQLException {    
	            Empleados e=new Empleados();    
	            e.setIdEmpleado(rs.getInt(1));    
	            e.setNombreEmpleado(rs.getString(2));    
	            e.setEspecialidadEmpleado(rs.getString(3));
	            System.out.println("EmpleadoDao.getEmpleados() retorna e: " + e);
	            return e;
	        }    
	    });    
	}    		
}
