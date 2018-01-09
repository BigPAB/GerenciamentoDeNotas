package br.com.fean.gerenciamentodenotas.controller;


import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import br.com.fean.gerenciamentodenotas.dto.NoticiaDto;

import br.com.fean.gerenciamentodenotas.model.Noticia;
import br.com.fean.gerenciamentodenotas.service.NoticiaService;

@Controller
public class NoticiaController {
	
	@Autowired
	NoticiaService noticiaService;
	
	
		
	@RequestMapping("/cadastrarNoticia")
	public ModelAndView cadastrarNoticia() {
		
		ModelAndView mv = new ModelAndView("cadastroNoticia","command", new NoticiaDto());
		 
		
		return mv;
			
	}
	
	@RequestMapping(value = "/salvarNoticia", method = {RequestMethod.GET , RequestMethod.POST})
	public String salvarNoticia(NoticiaDto noticiaDto, ModelMap mm) {
		
		mm.addAttribute("retorno",noticiaService.salvarNoticia(noticiaDto));
		
		return "perfil";
	}
	
	@GetMapping("/jornal")
	public String listarNoticias(ModelMap model) {
		
		Map<String, Noticia> listaNoticias = new HashMap<String, Noticia>();
		
		listaNoticias = noticiaService.listarNoticias();
		
		model.addAttribute("listaNoticias", listaNoticias );
		
		return "jornal";
	
	
	
}

}

