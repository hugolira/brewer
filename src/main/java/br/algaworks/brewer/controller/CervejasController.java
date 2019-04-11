package br.algaworks.brewer.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.algaworks.brewer.model.Cerveja;
import br.algaworks.brewer.repository.Cervejas;

@Controller
public class CervejasController {
	
	
	
	@Autowired
	private Cervejas cervejas;
	
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		
		cervejas.findAll(); // Apagar...

		return "cerveja/CadastroCerveja";
	}
	
	
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		
		if(result.hasErrors()) {
			return novo(cerveja);
		}
		
		attributes.addFlashAttribute("mensagem", "Cerveja Salva com Sucesso");
		System.out.println(">>>> Sku: " + cerveja.getSku());
		return "redirect:/cervejas/novo";
	}
		
}
