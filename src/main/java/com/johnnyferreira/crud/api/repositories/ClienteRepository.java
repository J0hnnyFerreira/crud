package com.johnnyferreira.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.johnnyferreira.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
	
	

}
