package br.com.fean.gerenciamentodenotas.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fean.gerenciamentodenotas.dto.AlunoCursoMateriaDto;
import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.model.Curso;
import br.com.fean.gerenciamentodenotas.model.Materia;

@Service
public class AlunoCursoMateriaDtoServiceImpl implements AlunoCursoMateriaDtoService {
	
	@Autowired
	AlunoService alunoService;
	@Autowired
	MateriaService materiaService;
	@Autowired
	CursoService cursoService;
	@Autowired
	EnderecoService enderecoService;

	@Override
	public String salvarAlunoCursoMateriaDto( AlunoCursoMateriaDto alunoCursoMateriaDto) {
		
		Materia materia = new Materia(alunoCursoMateriaDto.getIdMateria(), alunoCursoMateriaDto.getNomeMateria());
		//Materia materia2 = new Materia(idMateria2, nomeMateria2);
		materiaService.salvarMateria(alunoCursoMateriaDto.getIdMateria(), materia);
		
		Map<String, Materia> materias = new HashMap<String, Materia>();
		materias.put(alunoCursoMateriaDto.getIdMateria(), materia);
		//materias.put(idMateria2, materia2);
		
		Curso curso = new Curso(alunoCursoMateriaDto.getIdCurso(), alunoCursoMateriaDto.getNomeCurso(), materias);
		cursoService.salvarCurso(alunoCursoMateriaDto.getIdCurso(), curso);
		
		Aluno aluno = new Aluno(alunoCursoMateriaDto.getNomeAluno(), alunoCursoMateriaDto.getSobreNome(), alunoCursoMateriaDto.getMatricula(), alunoCursoMateriaDto.getSenha(), curso);
		 
		 
		enderecoService.setarEndereco(aluno, alunoCursoMateriaDto.getEndereco());
		 
		 return alunoService.salvarAluno(aluno);
	}

	@Override
	public String excluirAlunoCursoMateriaDto(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterarAlunoCursoMateriaDto(String id, AlunoCursoMateriaDto alunoCursoMateriaDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, AlunoCursoMateriaDto> listarAlunoCursoMateriaDto() {
		// TODO Auto-generated method stub
		return null;
	}

}
