package br.edu.iftm.atividadeComplementar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.atividadeComplementar.domains.Aluno;
import br.edu.iftm.atividadeComplementar.domains.Atividade;
import br.edu.iftm.atividadeComplementar.repositories.AlunoRepository;
import br.edu.iftm.atividadeComplementar.repositories.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	private AtividadeRepository repository;
	
	public List<Atividade> buscar(String nome) {
		return repository.findByNomeContaining(nome);
	}
	
	public Optional<Atividade> buscarRa(Integer id) {
		return repository.findById(id);
	}
	
	public List<Atividade> buscarTodos() {
		return repository.findAll();
	}
	
	
	
	
	
}
