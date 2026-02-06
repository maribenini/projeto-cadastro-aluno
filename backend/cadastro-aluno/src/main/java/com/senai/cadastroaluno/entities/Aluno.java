package com.senai.cadastroaluno.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAluno;
	
	@NotBlank(message = "O nome é obrigatório.")
	private String nomeAluno;
	
	@NotBlank(message = "A turma é obrigatória.")
	private String turma;
	
	@NotBlank(message = "RA é obrigatório.")
	private String ra;
	
	//Construtores
	public Aluno() {}
	
	public Aluno(String nomeAluno, String turma, String ra) {
		this.nomeAluno = nomeAluno;
		this.turma = turma;
		this.ra = ra;
	}
	
	//Getters e Setters

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	
	
}