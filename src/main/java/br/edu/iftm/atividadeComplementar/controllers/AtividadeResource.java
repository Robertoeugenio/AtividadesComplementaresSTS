package br.edu.iftm.atividadeComplementar.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.atividadeComplementar.domains.Atividade;
import br.edu.iftm.atividadeComplementar.services.AtividadeService;

@RestController
@RequestMapping(value="/atividade")
public class AtividadeResource {
	
	@Autowired
	private AtividadeService service;
	
	@RequestMapping(value="like/{nome}",method=RequestMethod.GET)
	public ResponseEntity<?> findByNome(@PathVariable String nome) {
		List<Atividade> atividade = service.buscar(nome);
		return ResponseEntity.ok().body(atividade);
	}
	
	@RequestMapping(value="{ra}",method=RequestMethod.GET)
	public ResponseEntity<?> findByRa(@PathVariable Integer codigo) {
		Optional<Atividade> atividade = service.buscarRa(codigo);
		return ResponseEntity.ok().body(codigo);
	}

}
