package br.algaworks.brewer.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Cerveja {
	
	@NotBlank(message = "Sku Obrigatorio")
	private String sku;
	
	@NotBlank(message = "Nome Obrigatorio")
	private String nome;
	
	@Size(min = 1,  max = 100)
	@NotBlank(message = "Descricao deve estar entre 1 e 100")
	private String descricao;
	
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
