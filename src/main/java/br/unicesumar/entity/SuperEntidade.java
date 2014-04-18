package br.unicesumar.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public class SuperEntidade {
	
	@Id
	@SequenceGenerator(name = "seq_superentidade", sequenceName = "seq_superentidade")
	@GeneratedValue(generator = "seq_superentidade", strategy = GenerationType.SEQUENCE)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}