package com.eventos.teste.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.eventos.teste.domain.payload.Endereco;

@Document(collection = "evento")
public class Evento {
	public String id ;
	public long cpf;
	public String data;
	// pode ser uma consulta ao cpf, uma movimentacao ou uma compra com cartao
	public String descricao;
	public Double valor;
	public Endereco endereco;
}
