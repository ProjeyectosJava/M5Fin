package com.m5fin.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.m5fin.modelo.beans.Clientes;    

public class ClienteDao {

	JdbcTemplate template;
	
	public void showClass() {
		System.out.println("\npublic class ClienteDao\n");
	}
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Clientes cliente){   
		String sql = "INSERT INTO Clientes VALUES (null,'" + cliente.getNombreCliente() + "','" + cliente.getTelefonoCliente() 
		+ "','" + cliente.getEmailCliente() + "','" + cliente.getRubroCliente() + "','"+ cliente.getDireccionCliente() + "')";
	    //String sql="insert into Cliente (nombre,telefono,correoelectronico,rubro,direccion) values('"+c.getNombre()+"',"+c.getTelefono()+",'"+c.getCorreoelectronico()+"','"+c.getRubro()+"','"+c.getDireccion()+"')";
	    return template.update(sql);
	}
	
	public int update(Clientes cliente){    
	    String sql = "update clientes set nombreCliente = '" + cliente.getNombreCliente() 
		+ "', telefonocliente = '" + cliente.getTelefonoCliente() 
		+ "', emailcliente = '" + cliente.getEmailCliente() 
		+ "', rubrocliente = '" + cliente.getRubroCliente()
		+ "', direccioncliente = '" + cliente.getDireccionCliente()
		+ "' where idcliente = '" + cliente.getIdCliente() + "'";
		//String sql="update Cliente set nombre='"+c.getNombre()+"', telefono="+c.getTelefono()+",correoelectronico='"+c.getCorreoelectronico()+"', rubro='"+c.getRubro()+"', direccion='"+c.getDireccion()+"' where id="+c.getId()+"";
	    System.out.println("ClienteDao update - valor sql: " + sql);
	    return template.update(sql);    
	}   
	
	public int delete(int id){
		String sql = "delete from clientes where idcliente = " + id;
		int del = 0;
		try {
			del = template.update(sql);
			
		} catch(Exception e) {
			
			System.out.println("error " + e);
		}
		System.out.println("del: " + del);
	    return del;
	}    
	
	/*public void deleteall(int id) {
		String sql = "";
		sql = "DELETE FROM mejoras WHERE EXISTS (SELECT 1 FROM mejoras WHERE idclientemejora = " + id + ")";
		//"delete * form mejora where idclientemejora = " + id;
	}
	*/
	
	public Clientes getCliById(int id) {
		String sql = "select * from clientes where idcliente = ?";
		System.out.println(sql);
		return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Clientes>(Clientes.class));
	       
	}
	
	public Clientes getClienteById(int id){
		String sql = "select * from clientes where idcliente = ?";
		System.out.println(sql);
		Clientes cli = new Clientes();
		
		try {
			cli = template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Clientes>(Clientes.class));
			
		} catch(DataAccessException e) {
			
			System.out.println("error " + e);
		}
		
		return cli;
	}
	
	public List<Clientes> getClientes(){    
	    return template.query("select * from Clientes",new RowMapper<Clientes>(){    
	        public Clientes mapRow(ResultSet rs, int row) throws SQLException {    
	            Clientes c = new Clientes();    
	            c.setIdCliente(rs.getInt(1));    
	            c.setNombreCliente(rs.getString(2));    
	            c.setTelefonoCliente(rs.getString(3));
	            c.setEmailCliente(rs.getString(4));
	            c.setRubroCliente(rs.getString(5));
	            c.setDireccionCliente(rs.getString(6));
	            return c;
	        }    
	    });    
	}    	
	
	
}