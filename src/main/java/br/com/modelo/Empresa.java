package br.com.modelo;

public class Empresa {
	private String nome;
	private int id;
	
	public Empresa(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
