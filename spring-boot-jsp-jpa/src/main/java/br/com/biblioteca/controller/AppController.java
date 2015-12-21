package br.com.biblioteca.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.biblioteca.service.LivroServiceImpl;
import br.com.biblioteca.Model.Livro;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class AppController {
	
	@Autowired
	LivroServiceImpl livroService;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listLivros(ModelMap model){
		
		List<Livro> livros = livroService.findAllLivros();
		model.addAttribute("livros", livros);
		return "livroslist";
	}
	 @RequestMapping(value = { "/newlivro" }, method = RequestMethod.GET)
	    public String newLivro(ModelMap model) {
	        Livro livro = new Livro();
	        model.addAttribute("livro", livro);
	        model.addAttribute("edit", false);
	        return "registration";
	    }
	 
	 @RequestMapping(value = { "/newliro" }, method = RequestMethod.POST)
	    public String saveLivro(@Valid Livro livro, BindingResult result,
	            ModelMap model) {
	 
	        if (result.hasErrors()) {
	            return "registration";
	        }	         
	        livroService.saveLivro(livro);
	 
	        model.addAttribute("success", "Livro " + livro.getNome() + " "+ livro.getEscritor() + " registered 	successfully");
	        //return "success";
	        return "registrationsuccess";
	 }
	 
	 
	 

}
