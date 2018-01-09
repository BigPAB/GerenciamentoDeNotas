package br.com.fean.gerenciamentodenotas.model;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	
	private String id;
	private String nome;
	private Nota nota;
	
	public Materia() {
		
	}
	public Materia( String nome, Nota nota) {
		
		
		this.nome = nome;
		this.nota = nota;
	}
	

	public Materia(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	

}
