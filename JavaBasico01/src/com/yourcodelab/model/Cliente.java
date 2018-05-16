package com.yourcodelab.model;

import java.util.Date;

public class Cliente {
	//Atributos
	private int id;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private Date dataNascimento;
	
	//Construtor da Classe
	public Cliente(int id, String nome, String cpf, String email, Date data){
		this.id = id;
		this.nomeCompleto = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = data;
	}		
}
