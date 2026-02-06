package com.senai.cadastroaluno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroaluno.entities.Aluno;
import com.senai.cadastroaluno.repositorys.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	
	public List<Aluno> listarTodos() {
		return repository.findAll();
	}
	
	public Aluno salvar(Aluno aluno) {
		return repository.save(aluno);
	}
	
	public Aluno atualizar(Long id, Aluno alunoAtualizado) {
		Aluno alunoAntigo = repository.findById(id).orElse(null);
		
		if (alunoAntigo != null) {
			alunoAtualizado.setIdAluno(id);
			return repository.save(alunoAtualizado);
		}
		
		return null;
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
}