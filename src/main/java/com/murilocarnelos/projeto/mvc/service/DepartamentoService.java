package com.murilocarnelos.projeto.mvc.service;

import java.util.List;

import com.murilocarnelos.projeto.mvc.domain.Departamento;

public interface DepartamentoService {

void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();
	
}
