package br.edu.iftm.atividadeComplementar.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atividade implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	private String nome;
	
	private Integer percentualCargaHoraria;
	
	private Integer maximoAtivcodigoadesSemestre;
	
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

}
