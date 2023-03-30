package br.edu.ifms.CadastroCabelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifms.CadastroCabelo.model.Cabelo;
import br.edu.ifms.CadastroCabelo.repository.RepositorioCabelo;
import jakarta.validation.Valid;

@Controller
public class ControladorCabelo {
	
	@Autowired
	RepositorioCabelo repositorioCabelo;
	
	@GetMapping("/registrar-cabelo")
	public String adicionarCabelo(Model model) {
		model.addAttribute("cabelo", new Cabelo());
		return "publica-registrar-cabelo";
	}
	
	@PostMapping("/salvar-cabelo")
	public String salvarCabelo(@Valid Cabelo cabelo, BindingResult resultado, RedirectAttributes atributos) {
		if(resultado.hasErrors()) {
			return "publica-registrar-cabelo";
		}
		repositorioCabelo.save(cabelo);
		atributos.addFlashAttribute("mensagem", "Cabelo registrado com sucesso!");
		return "redirect:/cabelo/registrar-cabelo";
	}
}
