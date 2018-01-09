package br.com.fean.gerenciamentodenotas.dao;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.fean.gerenciamentodenotas.model.Noticia;

@Repository
public class NoticiaDaoImpl {
	
private static Map<String, Noticia> listaNoticias = new HashMap<String, Noticia>();
	
	
	public String salvarNoticia(String titulo, Noticia noticia) {
		
		
		 
		 listaNoticias.put(titulo, noticia);
		 
		 return  " Salvou!";
	}
	
	public String excluirNoticia(String titulo) {
		
		
		
		listaNoticias.remove(titulo);
		
		return "Notícia excluida";
	}
	
	public Map<String, Noticia> listarNoticias() {
		
		return listaNoticias;
			
		}


	public static Map<String, Noticia> getListaNoticias() {
		return listaNoticias;
	}


	public static void setListaNoticias(Map<String, Noticia> listaNoticias) {
		NoticiaDaoImpl.listaNoticias = listaNoticias;
	}

}
