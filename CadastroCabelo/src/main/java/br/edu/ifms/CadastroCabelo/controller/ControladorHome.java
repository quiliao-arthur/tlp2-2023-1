package br.edu.ifms.CadastroCabelo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorHome {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msgBoasVindas", "Bem-Vindo ao SiG Cabeludo!");
		return "publica-indice";
	}
}
