package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import br.com.fean.gerenciamentodenotas.dto.NoticiaDto;
import br.com.fean.gerenciamentodenotas.model.Noticia;

public interface NoticiaService {
	
	public String salvarNoticia(NoticiaDto noticiaDto);
	
	public String excluirNoticia(String id);
	
	public Map<String, Noticia> listarNoticias();
}
