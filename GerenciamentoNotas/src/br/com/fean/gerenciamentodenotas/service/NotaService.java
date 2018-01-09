package br.com.fean.gerenciamentodenotas.service;

import java.util.List;
import br.com.fean.gerenciamentodenotas.model.Nota;


public interface NotaService {

public String salvarNota( Nota nota);
	
	public String excluirNota(String id);
	
	public String alterarNota(String id, Nota nota);
	
	public List< Nota> listarNota();
}
