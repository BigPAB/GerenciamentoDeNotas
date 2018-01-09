package br.com.fean.gerenciamentodenotas.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import br.com.fean.gerenciamentodenotas.dto.NotaAlunoDto;
import br.com.fean.gerenciamentodenotas.model.Noticia;
import br.com.fean.gerenciamentodenotas.service.AlunoService;
import br.com.fean.gerenciamentodenotas.service.NotaService;

@Controller
public class NotaController {
	
	@Autowired
	NotaService notaService;
	
	
	
	
	

	/*@RequestMapping("/notasAlunos")
	public String listarNota(ModelMap model) {
		
		Map<String, NotaAlunoDto> listaNotaAluno = new HashMap<String, NotaAlunoDto>();
		
		listaNotaAluno = notaService.listarNotaAluno();
		
		model.addAttribute("listaNotaAluno", listaNotaAluno );
		
		return "mostrarNota";
	
	
	
}*/

}
