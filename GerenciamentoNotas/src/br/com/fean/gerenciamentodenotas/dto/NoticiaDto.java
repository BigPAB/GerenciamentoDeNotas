package br.com.fean.gerenciamentodenotas.dto;

import org.springframework.stereotype.Component;

@Component
public class NoticiaDto {

	private String id;
	private String titulo;
	private String textoCompleto;
	
	public NoticiaDto(){
		
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTextoCompleto() {
		return textoCompleto;
	}
	public void setTextoCompleto(String textoCompleto) {
		this.textoCompleto = textoCompleto;
	}
}
