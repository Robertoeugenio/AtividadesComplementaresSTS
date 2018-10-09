package br.edu.iftm.atividadeComplementar.domains;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long ra;
	private String nome;
	
	public Aluno() {
	}

	public Aluno(Long ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}

	public Long getRa() {
		return ra;
	}

	public void setRa(Long ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}