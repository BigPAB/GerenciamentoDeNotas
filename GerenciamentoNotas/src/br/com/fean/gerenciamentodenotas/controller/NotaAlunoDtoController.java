package br.com.fean.gerenciamentodenotas.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.fean.gerenciamentodenotas.dto.NotaAlunoDto;
import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.service.NotaAlunoDtoService;

@Controller
public class NotaAlunoDtoController {
	
	@Autowired
	NotaAlunoDtoService notaAlunoDtoService;

	@RequestMapping("/cadastrarNota")
	public ModelAndView cadastrarNotaAluno() {
		
		ModelAndView mv = new ModelAndView("CadastroNota","command", new NotaAlunoDto());
		 
		
		return mv;
		
		
	}
	
	@RequestMapping(value = "/salvarNota", method = {RequestMethod.GET , RequestMethod.POST})
	public String salvarNotaAlunoDto(NotaAlunoDto notaAlunoDto, ModelMap mm) {
		
		mm.addAttribute("retorno", notaAlunoDtoService.salvarNotaAlunoDto(notaAlunoDto));
		
		return "perfil";
	}

	@RequestMapping("/notasAlunos")
	public String listarNotaAlunoDto(ModelMap model) {
		
		Map<String, NotaAlunoDto> listaNotaAluno = new HashMap<String, NotaAlunoDto>();
		
		listaNotaAluno = notaAlunoDtoService.listarNotaAlunoDto();
		
		model.addAttribute("listaNotaAluno", listaNotaAluno );
		
		return "mostrarNota";
	
	}
	
}
