package com.johnnyferreira.crud.api.services;

import java.util.List;

import com.johnnyferreira.crud.api.documents.Cliente;

public interface ClienteService {

	
	List<Cliente> listarTodos();
	
	Cliente listarPorId(long id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(long id);
}
