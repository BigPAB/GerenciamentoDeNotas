package br.com.fean.gerenciamentodenotas.model;

public class Professor {
	
	private String nome;
	private String sobreNome;
	private String matricula;
	
	public Professor(String nome, String sobreNome, String matricula) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
