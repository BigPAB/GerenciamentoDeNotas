package br.com.fean.gerenciamentodenotas.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Curso {
	
	private String id;
	private String nome;
	private Map<String, Materia> materias = new HashMap<String, Materia>();
	
	

	public Curso() {
		
	}

	public Curso(String id, String nome, Map<String, Materia> materias) {
		
		this.id = id;
		this.nome = nome;
		this.materias = materias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Map<String, Materia> materias) {
		this.materias = materias;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	

}
