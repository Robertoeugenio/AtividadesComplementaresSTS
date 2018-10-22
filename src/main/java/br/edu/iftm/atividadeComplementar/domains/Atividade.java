package br.edu.iftm.atividadeComplementar.domains;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javassist.SerialVersionUID;

@Entity
@Table(name="Tabela_Atividade")
public class Atividade implements Serializable{
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Codigo_Atividade")
	private Integer codigo;
	
	@Column(name="Nome_Atividade",length=255, nullable=false, unique=true)
	private String nome;
	
	@Column(name="Percentual_CargaHoraria")
	private Integer percentualCargaHoraria;
	
	@Column(name="Maximo_AtividadeCodigoSemestre")
	private Integer maximoAtivcodigoadesSemestre;

	@Column(name="Percentual_porAtividadeCodigoSemestre")
	private Integer percentualPorAtivcodigoade;

	public Atividade(Integer codigo, String nome, Integer percentualCargaHoraria, Integer maximoAtivcodigoadesSemestre,
			Integer percentualPorAtivcodigoade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.percentualCargaHoraria = percentualCargaHoraria;
		this.maximoAtivcodigoadesSemestre = maximoAtivcodigoadesSemestre;
		this.percentualPorAtivcodigoade = percentualPorAtivcodigoade;
	}

	public Atividade() {
		super();
	}
	
	public Integer getValorLimiteHorasAtivcodigoade(Integer totalHorasComplementares) {
		return totalHorasComplementares * percentualPorAtivcodigoade / 100;
	}
	
	public Integer getHorasAproveitadasPorAtivcodigoade(Integer totalhorasComplementares) {
		return getValorLimiteHorasAtivcodigoade(totalhorasComplementares) * percentualCargaHoraria / 100; 
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPercentualCargaHoraria() {
		return percentualCargaHoraria;
	}

	public void setPercentualCargaHoraria(Integer percentualCargaHoraria) {
		this.percentualCargaHoraria = percentualCargaHoraria;
	}

	public Integer getMaximoAtivcodigoadesSemestre() {
		return maximoAtivcodigoadesSemestre;
	}

	public void setMaximoAtivcodigoadesSemestre(Integer maximoAtivcodigoadesSemestre) {
		this.maximoAtivcodigoadesSemestre = maximoAtivcodigoadesSemestre;
	}

	public Integer getPercentualPorAtivcodigoade() {
		return percentualPorAtivcodigoade;
	}

	public void setPercentualPorAtivcodigoade(Integer percentualPorAtivcodigoade) {
		this.percentualPorAtivcodigoade = percentualPorAtivcodigoade;
	}

	public Integer getHorasAproveitadasPorAtividade(Integer quantidadeHorasCurso) {
		// TODO Auto-generated method stub
		return null;
	}	

}
