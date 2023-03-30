package br.edu.ifms.CadastroCabelo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Cabelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	//TODO validação tipo-de-dado cor??????: notação de tintura????
	private String cor;
	
	@NotNull
	//TODO validação tipo-de-dado ondulação: liso, ondulado, encaracolado, cacheado, crespo
	private String ondulacao;//ondulação
	
	@NotNull
	@Min(value = 30)
	private double comprimento_cm;
	
	@NotNull
	@Min(value = 100)
	private double peso_g;//peso
	
	private boolean ativo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getOndulacao() {
		return ondulacao;
	}
	public void setOndulacao(String ondulacao) {
		this.ondulacao = ondulacao;
	}
	public double getComprimento_cm() {
		return comprimento_cm;
	}
	public void setComprimento_cm(double comprimento_cm) {
		this.comprimento_cm = comprimento_cm;
	}
	public double getPeso_g() {
		return peso_g;
	}
	public void setPeso_g(double peso_g) {
		this.peso_g = peso_g;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Cabelo(@NotNull String cor, @NotNull String ondulacao, @NotNull @Min(30) double comprimento_cm,
			@NotNull @Min(100) double peso_g, boolean ativo) {
		super();
		this.cor = cor;
		this.ondulacao = ondulacao;
		this.comprimento_cm = comprimento_cm;
		this.peso_g = peso_g;
		this.ativo = ativo;
	}
}
