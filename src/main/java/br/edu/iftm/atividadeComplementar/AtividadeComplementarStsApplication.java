package br.edu.iftm.atividadeComplementar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.iftm.atividadeComplementar.domains.Aluno;
import br.edu.iftm.atividadeComplementar.domains.Atividade;
import br.edu.iftm.atividadeComplementar.repositories.AlunoRepository;
import br.edu.iftm.atividadeComplementar.repositories.AtividadeRepository;

@SpringBootApplication
public class AtividadeComplementarStsApplication implements CommandLineRunner {

	@Autowired
	AlunoRepository alunoRepository;
	
	AtividadeRepository atividadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(AtividadeComplementarStsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Aluno aluno1 = new Aluno((long) 0001, "Fransciscano");
		Aluno aluno2 = new Aluno((long) 0002, "Jerosmarildo");

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(aluno1);
		alunos.add(aluno2);

		alunoRepository.saveAll(Arrays.asList(aluno1, aluno2));
		
		Atividade atividade1 = new Atividade(1, "Palestra", 20, 2, 10);
		Atividade atividade2 = new Atividade(2, "Oficina do barulho", 10, 2, 15);
		
		List<Atividade> atividades = new ArrayList<>();
		atividades.add(atividade1);
		atividades.add(atividade2);
		
		atividadeRepository.saveAll(Arrays.asList(atividade1, atividade2));

	}

}


