package com.pizzaweb.models;

public class Cliente {
	
	private String nome;
	private String eMail;
	private int Telefone;
	private String dataNascimento;
	private String endereco;
	private String usuario;
	private String senhaAcesso;

// Método construtor	
//Sobrecarga ocorre quando criamos dois ou mais métodos com o mesmo nome mas com argumentos diferentes
//Sobreposição ocorre quando há polimorfismo, as assinaturas dos metodos sao identicas.
	
	private Cliente() {
		
		
	}
	private Cliente(String nome,String eMail,int Telefone, String dataNascimento, String endereco, String usuario, String senhaAcesso) {
		this.nome = nome;
		this.eMail = eMail;
		this.Telefone = Telefone;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.usuario = usuario;
		this.senhaAcesso = senhaAcesso;	
	}
	
	//Cliente C1 = new Cliente();
	Cliente C1 = new Cliente(nome,eMail,Telefone,dataNascimento,endereco,usuario,senhaAcesso);
	
}
