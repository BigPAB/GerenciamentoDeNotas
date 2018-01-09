package br.com.fean.gerenciamentodenotas.dao;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.model.Nota;

@Repository
public class AlunoDaoImpl implements AlunoDao {
	
	
	private static Map<String, Aluno> listaAlunos = new HashMap<String, Aluno>();
	
	@Override
	public String salvarAluno( String matricula, Aluno aluno) {
		
		
		 
		 listaAlunos.put(matricula, aluno);
		 
		 return  (aluno.getNome() + " Salvou!");
	}
	
	@Override
	public String excluirAluno(String matricula) {
		
		
		
		listaAlunos.remove(matricula);
		
		return "Aluno excluido";
	}
	
	@Override
	public Map<String, Aluno> listarAlunos() {
		
		return listaAlunos;
			
		}
	
	@Override
	public String adicionarNotaDoAluno(Nota nota, String matricula, String id) {
		
		
		listaAlunos.get(matricula).getCurso().getMaterias().get(id).setNota(nota);
		
		
		return "Salvou" ;
		
	}
	
	@Override
	public String alterarAluno(String id, Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Map<String, Aluno> getListaAlunos1() {
		return listaAlunos;
	}

	public static void setListaAlunos1(Map<String, Aluno> listaAlunos1) {
		AlunoDaoImpl.listaAlunos = listaAlunos1;
	}

	
	
	
}
