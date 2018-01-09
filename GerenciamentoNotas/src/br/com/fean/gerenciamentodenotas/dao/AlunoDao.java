package br.com.fean.gerenciamentodenotas.dao;

import java.util.Map;

import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.model.Nota;


public interface AlunoDao {
	
public String salvarAluno(String matricula, Aluno aluno);
	
	public String excluirAluno(String id);
	
	public String alterarAluno(String id, Aluno aluno);
	
	public Map<String, Aluno> listarAlunos();
	
	public String adicionarNotaDoAluno(Nota nota, String matricula, String idMateria);
}
