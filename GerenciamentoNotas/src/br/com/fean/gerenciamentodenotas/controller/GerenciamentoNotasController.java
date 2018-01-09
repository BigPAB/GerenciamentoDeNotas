package br.com.fean.gerenciamentodenotas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GerenciamentoNotasController {
	
	@RequestMapping("/boletim")
	public String teste(){
		return "boletim";
	}
	
	@RequestMapping("/login")
	public String teste2(){
		return "login";
	}
	@RequestMapping("/ok")
	public String teste4(){
		return "template";
	}
	
	@RequestMapping("/cadastro")
	public String teste3(){
		return "cadastro";
	}
	@RequestMapping("/nota")
	public String teste5(){
		return "CadastroNota";
	}
	@RequestMapping("/jornal")
	public String teste6(){
		return "jornal";
	}
	@RequestMapping("/home")
	public String teste7(){
		return "home";
	}
	@RequestMapping("/perfil")
	public String teste8(){
		return "perfil";
	}
	
	/*@RequestMapping(value="login.html", method=RequestMethod.GET)
	public ModelAndView teste5{
		
	}*/
}
