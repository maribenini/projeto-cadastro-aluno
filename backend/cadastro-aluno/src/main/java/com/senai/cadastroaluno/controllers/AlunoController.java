package com.senai.cadastroaluno.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.cadastroaluno.entities.Aluno;
import com.senai.cadastroaluno.services.AlunoService;

@RestController
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping
	public List<Aluno> listar(){
		return service.listarTodos();
	}
	
	@PostMapping
	public Aluno cadastrar(@RequestBody Aluno aluno) {
		return service.salvar(aluno);
	}
	
	@PutMapping("/{id}")
	public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
		return service.atualizar(id,  aluno);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		service.deletar(id);
	}
}