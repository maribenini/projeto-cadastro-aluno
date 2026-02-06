package com.senai.cadastroaluno.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastroaluno.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}