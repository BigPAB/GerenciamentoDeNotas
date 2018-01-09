package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.dao.AlunoDao;
import br.com.fean.gerenciamentodenotas.dao.AlunoDaoImpl;
import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.model.Nota;

@Service
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoDao alunoDao;


	@Override
	public String salvarAluno(Aluno aluno){
		
		
		 return alunoDao.salvarAluno( aluno.getMatricula(), aluno);
		 
		 
	}

	@Override
	public String verificarMatriculaESenha(String matricula, String senha) {
		
		
		String feedback = "";
		
		if(AlunoDaoImpl.getListaAlunos1().containsKey(matricula)) {
			if(AlunoDaoImpl.getListaAlunos1().get(matricula).getSenha()==senha) {
				feedback = "Acesso Liberado";
			
			}
		}else {
			feedback = "Matrícula ou senha incorreta!";
		}
		return feedback;
		
	}

	@Override
	public String excluirAluno(String matricula) {
		
		
		
		return alunoDao.excluirAluno(matricula);
		
	
	}
	@Override
	public Map<String, Aluno> listarAlunos() {
		
	
		return alunoDao.listarAlunos();
			
		}


	@Override
	public String adicionarNotaDoAluno(Nota nota, String matricula, String idMateria) {
		alunoDao.adicionarNotaDoAluno(nota, matricula, idMateria);
		return null;
	}

}
