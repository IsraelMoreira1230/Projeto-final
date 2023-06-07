package com.projetofinal.projetofinal.service;

import java.util.List;

import com.projetofinal.projetofinal.domain.Cargo;

public interface CargoService {
    
    void salvar (Cargo cargo);
	
	void editar (Cargo cargo);
	
	void excluir(long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
    
}