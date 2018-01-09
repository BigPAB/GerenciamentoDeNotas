package br.com.fean.gerenciamentodenotas.dao;

import java.util.Map;


import br.com.fean.gerenciamentodenotas.model.Materia;

public interface MateriaDao {
	
public String salvarMateria(String id, Materia materia);
	
	public String excluirMateria(String id);
	
	public String alterarMateria(String id, Materia materia);
	
	public Map<String, Materia> listarMateria();
}
