package com.m5fin.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.m5fin.dao.Clientes;
import com.m5fin.servicio.ClienteServicio;

@RestController
@RequestMapping("/rest")
public class RestControlador {

	@Autowired
	ClienteServicio cs;

	@RequestMapping(value = "/clilist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Clientes> getClientes() {
		List<Clientes> listaclientes = cs.listarClientes();
		System.out.println("RESTListaClientes: " + listaclientes);
		return listaclientes;
	}

	@RequestMapping(value = "/clilist", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCliente(@RequestBody Clientes cliente) {
		System.out.println("RESTGuarda: " + cliente);
		cs.agregarCliente(cliente);
	}

	@RequestMapping(value = "/clilist", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateCliente(@RequestBody Clientes cliente) {
		System.out.println("RESTEdita: " + cliente);
		cs.editarCliente(cliente);
	}

	@RequestMapping(value = "/clidetalle/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Clientes getClientePorId(@PathVariable int id) {
		System.out.println("RESTconsulta por id: " + id);
		return cs.findClienteByid(id);
	}

	@RequestMapping(value = "/clidetalle/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCliente(@PathVariable("id") int id) {
		System.out.println("REST Elimina por id: " + id );
		cs.eliminarCliente(id);
	}
}
