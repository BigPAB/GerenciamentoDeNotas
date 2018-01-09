package br.com.fean.gerenciamentodenotas.model;

public class Login {
	
	private Aluno aluno;
	private Professor professor;
	
	public Login(Aluno aluno) {
		super();
		this.aluno = aluno;
	}

	public Login(Professor professor) {
		super();
		this.professor = professor;
	}
	
	
}
