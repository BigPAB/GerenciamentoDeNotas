package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.model.Nota;


public interface AlunoService {
	
	public String salvarAluno( Aluno aluno);
	
	public String verificarMatriculaESenha(String matricula, String senha);
	
	public String excluirAluno(String matricula);
	
	public Map<String, Aluno> listarAlunos();
	
	public String adicionarNotaDoAluno(Nota nota, String matricula, String idMateria);
	

}
