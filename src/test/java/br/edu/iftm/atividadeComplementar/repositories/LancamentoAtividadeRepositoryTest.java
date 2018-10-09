package br.edu.iftm.atividadeComplementar.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.atividadeComplementar.domains.Aluno;
import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LancamentoAtividadeRepositoryTest {
	
	@Autowired
	private AlunoRepository repository;
	
	@Test
	public void testaLancamentoAtividade01() {
		List<Aluno> l = repository.findByNomeContaining("Fransciscano");
		assertThat(l.size()).isGreaterThan(0);
	}
	
	@Test
	public void testaListaLancamentoAtividadeVazia() {
		List<Aluno> l = repository.findByNomeContaining("Gurmecindo");
		assertThat(l.size()).isEqualTo(0);
	}
	@Test
	public void testaNomeForadaLista() {
		List<Aluno> l = repository.findByNomeContaining("Jurisclésio");
		assertThat(l.size()).isEqualTo(0);
	}
}