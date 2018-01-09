package br.com.fean.gerenciamentodenotas.controller;


import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.fean.gerenciamentodenotas.dto.AlunoCursoMateriaDto;
import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.service.AlunoCursoMateriaDtoService;
import br.com.fean.gerenciamentodenotas.service.AlunoService;

@Controller
public class AlunoCursoMateriaDtoController {
	
	@Autowired
	AlunoCursoMateriaDtoService alunoCursoMateriaDtoService;
	
	@RequestMapping("/cadastrarAluno")
	public ModelAndView cadastrarAluno() {
		
		ModelAndView mv = new ModelAndView("cadastro","command", new AlunoCursoMateriaDto());
		 
		
		return mv;
		
		
	}
	
	@RequestMapping(value = "/salvarAluno", method = RequestMethod.POST)
	public String salvarAlunoCursoMateriaDto(AlunoCursoMateriaDto alunoCursoMateriaDto, ModelMap mm) {
		
		mm.addAttribute("retorno",alunoCursoMateriaDtoService.salvarAlunoCursoMateriaDto( alunoCursoMateriaDto));
		
		return "perfil";
	}
	
	

}
