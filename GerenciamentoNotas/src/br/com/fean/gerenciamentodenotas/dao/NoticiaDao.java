package br.com.fean.gerenciamentodenotas.dao;

import java.util.Map;

import br.com.fean.gerenciamentodenotas.model.Noticia;

public interface NoticiaDao {
	
public String salvarNotica(String id, Noticia noticia);
	
	public String excluirNoticia(String id);
	
	public String alterarNoticia(String id, Noticia noticia);
	
	public Map<String, Noticia> listarNoticia();
}
