package com.idat.EFLeonardoHuamaniPerezCliente.service;

import java.util.List;

import com.idat.EFLeonardoHuamaniPerezCliente.model.Cliente;

public interface ClienteService {
	List<Cliente> listar();
	Cliente obtenerId(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);
}
