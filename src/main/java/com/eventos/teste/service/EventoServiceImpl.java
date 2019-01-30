package com.eventos.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eventos.teste.domain.model.Evento;
import com.eventos.teste.domain.repository.EventoRepository;

@Controller
@RequestMapping("/evento")
public class EventoServiceImpl {
	
	@Autowired EventoRepository eventoRepository;
	
	@RequestMapping(value = "/buscaTodosEventos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "http://localhost:3000")
	@ResponseBody
	public List<Evento> buscaTodosEventos(){
		 List<Evento> list = eventoRepository.findAll();
		return  list;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "http://localhost:3000")
	@ResponseBody
	public Evento insert(@RequestBody Evento evento){
		Evento x =  eventoRepository.save(evento);
		return  x;
	}
	
}
