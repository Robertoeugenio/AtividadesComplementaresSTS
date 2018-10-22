package br.edu.iftm.atividadeComplementar.domains;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LancamentoAtividade {

	@Id
	private Long codigo;
	private Integer quantidadeHoras;
	private Date dataInicio;
	private Date dataFim;
	private Aluno aluno;
	private Atividade atividade;
	
	public LancamentoAtividade() {
	}
	
	public LancamentoAtividade(Long codigo, Integer quantidadeHoras, Date dataInicio, Date dataFim, Aluno aluno, Atividade atividade) {
		super();
		this.codigo = codigo;
		this.quantidadeHoras = quantidadeHoras;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.aluno = aluno;
		this.atividade = atividade;
	}
	

	
	public String getSemestreAtividade() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataFim);
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH);
		
		if (mes > 5) {
			return ano + "-2";
		} else {
			return ano + "-1";
		}
	}
	
	public Integer getHorasAproveitadas(Atividade atividade,Integer quantidadeHorasCurso,Integer quantidadeHorasfeitas,Date dataFim) {
		if(atividade.getNome().equals("palestra")) {
			if(quantidadeHorasfeitas>atividade.getHorasAproveitadasPorAtividade(quantidadeHorasCurso)) 						
				return atividade.getHorasAproveitadasPorAtividade(quantidadeHorasCurso);
			return 1;
		}
		else if(quantidadeHorasfeitas>atividade.getValorLimiteHorasAtividade(quantidadeHorasCurso))
			return atividade.getValorLimiteHorasAtividade(quantidadeHorasCurso);
		return 1;
				
	}

	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
}