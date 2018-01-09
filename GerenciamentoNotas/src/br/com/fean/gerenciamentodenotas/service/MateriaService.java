package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.model.Materia;


public interface MateriaService {
	
	public String salvarMateria(String id, Materia materia);
	
	public String excluirMateria(String id);
	
	public String alterarMateria(String id, Materia materia);
	
	public Map<String, Materia> listarMateria();

}
