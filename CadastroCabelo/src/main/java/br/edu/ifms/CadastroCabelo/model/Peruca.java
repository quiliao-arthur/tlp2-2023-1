package br.edu.ifms.CadastroCabelo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Peruca extends Cabelo {

	public Peruca(@NotNull String cor, @NotNull String ondulacao, @NotNull @Min(30) double comprimento_cm,
			@NotNull @Min(100) double peso_g, boolean ativo) {
		super(cor, ondulacao, comprimento_cm, peso_g, ativo);
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String acabamento;//tradicional, front-lace, full-lace
}
