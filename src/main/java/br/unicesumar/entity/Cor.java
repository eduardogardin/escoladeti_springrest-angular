package br.unicesumar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cor extends SuperEntidade {

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String rgb;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRgb() {
		return rgb;
	}

	public void setRgb(String rgb) {
		this.rgb = rgb;
	}

}
