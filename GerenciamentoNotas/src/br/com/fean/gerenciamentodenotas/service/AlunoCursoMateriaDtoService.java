package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import br.com.fean.gerenciamentodenotas.dto.AlunoCursoMateriaDto;


public interface AlunoCursoMateriaDtoService {

public String salvarAlunoCursoMateriaDto( AlunoCursoMateriaDto alunoCursoMateriaDto);
	
	public String excluirAlunoCursoMateriaDto(String id);
	
	public String alterarAlunoCursoMateriaDto(String id, AlunoCursoMateriaDto alunoCursoMateriaDto);
	
	public Map<String, AlunoCursoMateriaDto> listarAlunoCursoMateriaDto();
}
