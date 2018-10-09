package br.edu.iftm.atividadeComplementar.domains;

import org.junit.Before;
import org.junit.Test;

import br.edu.iftm.atividadeComplementar.domains.Atividade;

import org.junit.Assert;

public class AtividadeTest {
	
	private Atividade atividade;
	
	@Before
	public void init() {
		atividade = new Atividade();
	}
	
	@Test
	public void testaQuantidadeLimiteHoras() {
		int percentualPalestra = 35;
		int quantidadeHorasSistemasParaInternet = 150;
		atividade.setNome("Palestra");
		atividade.setMaximoAtivcodigoadesSemestre(2);
		atividade.setPercentualPorAtivcodigoade(percentualPalestra);
		int quantidadeHoras = atividade.getValorLimiteHorasAtivcodigoade(quantidadeHorasSistemasParaInternet);
		Assert.assertEquals(quantidadeHoras,35);
	}
	//fazendo teste
	@Test
	public void testaQuantidadeLimiteHorasOficinaBarulho() {
		int percentualCurso = 40;
		int quantidadeHorasOficinaBarulho = 200;
		atividade.setNome("Oficinas");
		atividade.setMaximoAtivcodigoadesSemestre(2);
		atividade.setPercentualPorAtivcodigoade(percentualCurso);
		int quantidadeHoras = atividade.getValorLimiteHorasAtivcodigoade(quantidadeHorasOficinaBarulho);
		Assert.assertEquals(quantidadeHoras,80);
	}

}



