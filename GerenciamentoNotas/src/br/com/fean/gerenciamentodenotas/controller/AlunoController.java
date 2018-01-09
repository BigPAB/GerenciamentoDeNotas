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

import br.com.fean.gerenciamentodenotas.model.Aluno;
import br.com.fean.gerenciamentodenotas.service.AlunoService;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping("/alunoFormulario")
	public ModelAndView cadastrarAluno() {
		
		ModelAndView mv = new ModelAndView("cadastro","command", new Aluno());
		 
		
		return mv;
		
		
	}
	
	@RequestMapping(value = "/registrarAluno", method = {RequestMethod.GET , RequestMethod.POST})
	public String salvarAlunoCursoMateriaDto(Aluno aluno, ModelMap mm) {
		
		mm.addAttribute("retorno",alunoService.salvarAluno( aluno));
		
		return "perfil";
	}
	
public String excluirAluno(String matricula) {
		
		return alunoService.excluirAluno( matricula);
		
	}

	public String verificarMatriculaESenha(String matricula, String senha) {
		
		return alunoService.verificarMatriculaESenha(matricula, senha);
	}

	
	@GetMapping("/alunos")
	public String listarAlunos(ModelMap model) {
			
			Map<String, Aluno> listaAlunos = new HashMap<String, Aluno>();
			
			listaAlunos = alunoService.listarAlunos();
			model.addAttribute("listaAlunos", listaAlunos );
			
		return "mostrarAluno";
		
		
		
	}
}
