package br.com.fean.gerenciamentodenotas.dao;

import java.util.Map;

import br.com.fean.gerenciamentodenotas.model.Curso;

public interface CursoDao {

public String salvarCurso(String id, Curso curso);
	
	public String excluirCurso(String id);
	
	public String alterarCurso(String id, Curso curso);
	
	public Map<String, Curso> listarCurso();
}
