package com.murilocarnelos.projeto.mvc.dao;

import java.util.List;

import com.murilocarnelos.projeto.mvc.domain.Funcionario;

public interface FuncionarioDao {

void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
	
}
