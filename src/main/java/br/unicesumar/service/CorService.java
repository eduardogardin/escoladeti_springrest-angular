package br.unicesumar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unicesumar.entity.Cor;
import br.unicesumar.repository.CorRepository;

@Service
public class CorService {
	
	@Autowired
	private CorRepository corRepository;
	
	public Cor inserir (Cor cor) {
		return getCorRepository().saveAndFlush(cor);
	}
	
	public Cor atualizar(Cor cor) {
		return getCorRepository().saveAndFlush(cor);
	}
	
	public List<Cor> listarTodas() {
		return getCorRepository().findAll();
	}

	public void apagar(Cor cor) {
		getCorRepository().delete(cor);
	}
	
	public Cor buscar(Cor cor) {
		return getCorRepository().findOne(cor.getId());
	}

	/*
	 * GETTERS E SETTERS
	 */
	public CorRepository getCorRepository() {
		return this.corRepository;
	}
}