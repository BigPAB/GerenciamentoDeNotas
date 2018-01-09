package br.com.fean.gerenciamentodenotas.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.fean.gerenciamentodenotas.model.Nota;

@Repository
public class NotaDaoImpl implements NotaDao {
	
	private List<Nota> notas = new ArrayList<Nota>();

	@Override
	public String salvarNota( Nota nota) {
		notas.add(nota);
		return "Salvou";
	}

	@Override
	public String excluirNota(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterarNota(String id, Nota nota) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Nota> listarNota() {
		
		return notas;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	
	
}
