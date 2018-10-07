package br.edu.iftm.atividadeComplementar.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.atividadeComplementar.domains.Aluno;
import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;
import br.edu.iftm.atividadeComplementar.services.LancamentoAtividadeService;

@RestController
@RequestMapping(value="/lancamentoAticidade")
public class LancamentoAtividadeResource {
	
	@Autowired
	private LancamentoAtividadeService service;
	
	@RequestMapping(value="like/{codigo}",method=RequestMethod.GET)
	public ResponseEntity<?> findByNome(@PathVariable Integer codigo) {
		List<LancamentoAtividade> lancamentoAtividade = service.buscar(codigo);
		return ResponseEntity.ok().body(lancamentoAtividade);
	}
	
	@RequestMapping(value="{codigo}",method=RequestMethod.GET)
	public ResponseEntity<?> findByRa(@PathVariable Integer codigo) {
		Optional<LancamentoAtividade> lancamentoAtividade = service.buscarRa(codigo);
		return ResponseEntity.ok().body(lancamentoAtividade);
	}

}
