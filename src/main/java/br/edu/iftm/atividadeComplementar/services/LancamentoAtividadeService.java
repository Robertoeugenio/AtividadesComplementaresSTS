package br.edu.iftm.atividadeComplementar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;
import br.edu.iftm.atividadeComplementar.repositories.LancamentoAtividadeRepository;

@Service
public class LancamentoAtividadeService {
	
	@Autowired
	private LancamentoAtividadeRepository repository;
	
	public List<LancamentoAtividade> buscar(Integer codigo) {
		return repository.findByNomeContaining(codigo);
	}
	
	public Optional<LancamentoAtividade> buscarRa(Integer codigo) {
		return repository.findById(codigo);
	}
	
	public List<LancamentoAtividade> buscarTodos() {
		return repository.findAll();
	}
	
}
