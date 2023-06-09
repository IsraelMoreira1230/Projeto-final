package com.projetofinal.projetofinal.service;

import java.util.List;

import com.projetofinal.projetofinal.domain.Departamento;

public interface DepartamentoService {

    void salvar (Departamento departamento);
	
	void editar (Departamento departamento);
	
	void excluir(long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

    boolean departamentoTemCargos(Long id);

    
}