package br.edu.ifms.CadastroCabelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.CadastroCabelo.model.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

}
