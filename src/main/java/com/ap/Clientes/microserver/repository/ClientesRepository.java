package com.ap.Clientes.microserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ap.Clientes.microserver.entity.Clientes;


public interface ClientesRepository extends MongoRepository<Clientes, String>  {

}
