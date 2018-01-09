package br.com.fean.gerenciamentodenotas.model;

import org.springframework.stereotype.Component;

@Component
public class Aluno {
	private String nome;
	private String sobreNome;
	private String matricula;
	private String senha;
	private Curso curso;
	private String endereco;
	private Endereco enderecoAtualizado;
	
	public Aluno() {
		
	}
	public Aluno(String nome, String sobreNome, String matricula, String senha, Curso curso) {
		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.matricula = matricula;
		this.senha = senha;
		this.curso = curso;
	}
	
	
	
	public Aluno(String nome, String sobreNome, String matricula, String senha) {
		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.matricula = matricula;
		this.senha = senha;
	}



	public Aluno(String matricula, String senha) {
		super();
		this.matricula = matricula;
		this.senha = senha;
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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Endereco getEnderecoAtualizado() {
		return enderecoAtualizado;
	}
	public void setEnderecoAtualizado(Endereco enderecoAtualizado) {
		this.enderecoAtualizado = enderecoAtualizado;
	}

	
}
