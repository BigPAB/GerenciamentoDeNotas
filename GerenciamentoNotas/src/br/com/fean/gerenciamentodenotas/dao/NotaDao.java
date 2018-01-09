package br.com.fean.gerenciamentodenotas.dao;

import java.util.List;
import java.util.Map;


import br.com.fean.gerenciamentodenotas.model.Nota;

public interface NotaDao {

public String salvarNota( Nota nota);
	
	public String excluirNota(String id);
	
	public String alterarNota(String id, Nota nota);
	
	public List< Nota> listarNota();
}
