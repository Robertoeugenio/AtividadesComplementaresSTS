package br.edu.iftm.atividadeComplementar.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.atividadeComplementar.domains.Aluno;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlunoRepositoryTest {
	
	@Autowired
	private AlunoRepository repository;
	
	

	@Test
	public void testaListaVazia() {
		List<Aluno> c = repository.findByNomeContaining("Edeoclaudio");
		assertThat(c.size()).isEqualTo(0);
	}
	@Test
	public void testaAlunoFransciscano() {
		List<Aluno> c = repository.findByNomeContaining("Jerosmarildo");
		assertThat(c.size()).isGreaterThan(0);
	}
	
	@Test
	public void testaListaFransciscano() {
		List<Aluno> c = repository.findByNomeContaining("Fransciscano");
		assertThat(c.size()).isEqualTo(0);
	}
	
	@Test
	public void testaIdAluno() {
		Optional<Aluno> alunos = repository.findById((long) 11114);
		assertThat(alunos.get().getAtividades().equals("c"));
	}
	

}