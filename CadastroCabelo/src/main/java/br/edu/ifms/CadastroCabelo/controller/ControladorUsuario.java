package br.edu.ifms.CadastroCabelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifms.CadastroCabelo.model.Usuario;
import br.edu.ifms.CadastroCabelo.repository.RepositorioUsuario;
import jakarta.validation.Valid;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private RepositorioUsuario repositorioUsuario;
	
	@GetMapping("/cadastro-usuario")
	public String cadastrarUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "/publica-cadastrar-usuario";
	}
	
	@PostMapping("/salvar-usuario")
	public String salvarUsuario(@Valid Usuario usuario, BindingResult resultado, RedirectAttributes atributos) {
		if(resultado.hasErrors()) {
			return "/publica-cadastrar-usuario";
		}
		repositorioUsuario.save(usuario);
		atributos.addFlashAttribute("mensagem", "Usuário salvo com sucesso");
		return "redirect:/cadastro-usuario";
	}
}
