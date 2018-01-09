package br.com.fean.gerenciamentodenotas.service;

import java.util.Map;

import br.com.fean.gerenciamentodenotas.dto.NotaAlunoDto;

public interface NotaAlunoDtoService {

	public String salvarNotaAlunoDto(NotaAlunoDto notaAlunoDto);
	
	public Map<String, NotaAlunoDto> listarNotaAlunoDto();
}
