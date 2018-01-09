package br.com.fean.gerenciamentodenotas.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.dao.AlunoDaoImpl;
import br.com.fean.gerenciamentodenotas.dao.NotaDao;
import br.com.fean.gerenciamentodenotas.dto.NotaAlunoDto;
import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.model.Materia;
import br.com.fean.gerenciamentodenotas.model.Nota;

@Service
public class NotaAlunoDtoServiceImpl implements NotaAlunoDtoService{
	
	@Autowired
	NotaService notaService;
	@Autowired
	AlunoService alunoService;

	@Override
	public String salvarNotaAlunoDto(NotaAlunoDto notaAlunoDto) {
		
			Nota nota = new Nota(notaAlunoDto.getNotaAv1(),notaAlunoDto.getNotaAv2(), notaAlunoDto.getNotaAv3());
			notaService.salvarNota( nota);
			String matricula = notaAlunoDto.getMatriculaAluno();
			String idMateria = notaAlunoDto.getIdMateria();
			
			alunoService.adicionarNotaDoAluno(nota, matricula, idMateria);
			return "Salvou" ;
			
	}

	@Override
	public Map<String, NotaAlunoDto> listarNotaAlunoDto() {
		Map<String, NotaAlunoDto> notaAlunos = new HashMap<String, NotaAlunoDto>();
		
		
		
		Collection<Aluno> alunos;
		Collection<Materia> materias;
		
		alunos = alunoService.listarAlunos().values();
		
		for(Aluno aluno : alunos) {
			
			materias = aluno.getCurso().getMaterias().values();
			
			for(Materia materia : materias) {
			NotaAlunoDto notaAluno = new NotaAlunoDto();
			notaAluno.setMatriculaAluno(aluno.getMatricula());
			notaAluno.setIdMateria(materia.getId());
			notaAluno.setNotaAv1(materia.getNota().getNotaAv1());
			notaAluno.setNotaAv2(materia.getNota().getNotaAv2());
			notaAluno.setNotaAv3(materia.getNota().getNotaAv3());
			
			if(notaAluno.getNotaAv1()!= 0  && notaAluno.getNotaAv2() != 0 ) {
			notaAlunos.put(notaAluno.getMatriculaAluno(), notaAluno);
				}
			
			}
			
		}
		return notaAlunos;
		
	}

}
