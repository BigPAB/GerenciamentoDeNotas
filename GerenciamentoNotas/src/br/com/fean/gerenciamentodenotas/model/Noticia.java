package br.com.fean.gerenciamentodenotas.model;

import org.springframework.stereotype.Component;

@Component
public class Noticia {
		
		
		private String id;
		private String titulo;
		private String textoCompleto;
		
		public Noticia(){
			
		}
		public Noticia(String id, String titulo, String textoCompleto) {
			this.id = id;
			this.titulo = titulo;
			this.textoCompleto = textoCompleto;
		}

		public Noticia(String titulo, String textoCompleto) {
			this.titulo = titulo;
			this.textoCompleto = textoCompleto;
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
