package com.eventos.teste.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eventos.teste.domain.model.Evento;

public interface EventoRepository extends MongoRepository<Evento, String>{

}
