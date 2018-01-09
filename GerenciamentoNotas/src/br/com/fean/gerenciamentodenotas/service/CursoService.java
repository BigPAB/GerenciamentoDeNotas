package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.model.Curso;


public interface CursoService {
	
	public String salvarCurso(String id, Curso curso);
	
	public String excluirCurso(String id);
	
	public String alterarCurso(String id, Curso curso);
	
	public Map<String, Curso> listarCurso();
}
