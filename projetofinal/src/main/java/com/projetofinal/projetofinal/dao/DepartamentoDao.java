package com.projetofinal.projetofinal.dao;

import java.util.List;

import com.projetofinal.projetofinal.domain.Departamento;

public interface DepartamentoDao {

    void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();


}
