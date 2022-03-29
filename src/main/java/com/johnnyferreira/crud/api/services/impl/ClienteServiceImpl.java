package com.johnnyferreira.crud.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnnyferreira.crud.api.documents.Cliente;
import com.johnnyferreira.crud.api.repositories.ClienteRepository;
import com.johnnyferreira.crud.api.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente listarPorId(long id) {
		return this.clienteRepository.findById(id).orElse(null);
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover(long id) {
		this.clienteRepository.deleteById(id);

	}

}
