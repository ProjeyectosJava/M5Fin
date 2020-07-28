package com.m5fin.servicio;

import java.util.List;

import com.m5fin.dao.Clientes;
import com.m5fin.dao.Pagos;


public interface PagosServicio {
	
	Pagos findPagosByid(int id);
	List<Pagos> listarPagos();
	List<Clientes> listarClientesnoPagos();
	List<Pagos> listarPagosAtrasados(Integer fecha);
	
	void agregarPago(Pagos p);
	void editarCliente(Pagos p);

}
