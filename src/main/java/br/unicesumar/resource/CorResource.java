package br.unicesumar.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.unicesumar.entity.Cor;
import br.unicesumar.service.CorService;

@Controller
@RequestMapping("/cor")
public class CorResource {
	
	@Autowired
	private CorService service;
	
	@RequestMapping(value = "/inserir", method = RequestMethod.POST)
	public @ResponseBody Cor inserir(@RequestBody Cor cor) { 
		return getService().inserir(cor);
	}

	@RequestMapping(value = "/atualizar", method = RequestMethod.PUT)
	public @ResponseBody Cor atualizar(@RequestBody Cor cor) { 
		return getService().atualizar(cor);
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public @ResponseBody List<Cor> listarTodos() {
		return getService().listarTodas();
	}

	@RequestMapping(value = "/apagar", method = RequestMethod.DELETE)
	public @ResponseBody void apagar(@RequestBody Cor cor) {
		getService().apagar(cor);
	}

	/*
	 * GETTERS E SETTERS
	 */
	public CorService getService() {
		return this.service;
	}
}