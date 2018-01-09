package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.dao.NoticiaDaoImpl;
import br.com.fean.gerenciamentodenotas.dto.NoticiaDto;

import br.com.fean.gerenciamentodenotas.model.Noticia;

@Service
public class NoticiaServiceImpl implements NoticiaService {
	
	@Autowired
	NoticiaDaoImpl noticiaDao;
	
	@Override
	public String salvarNoticia(NoticiaDto noticiaDto) {
		
		Noticia noticia = new Noticia(noticiaDto.getId(), noticiaDto.getTitulo(),  noticiaDto.getTextoCompleto());
		 
		 NoticiaDaoImpl.getListaNoticias().put(noticiaDto.getId(), noticia);	
		 
		 return "Salvou";
		 
		 
	}

	@Override
	public String excluirNoticia(String id) {
		
		
		
		NoticiaDaoImpl.getListaNoticias().remove(id);
		
		return "Noticia eliminada";
	
	}
	
	@Override
	public Map<String, Noticia> listarNoticias() {
		
	
		return NoticiaDaoImpl.getListaNoticias();
			
		}
}
