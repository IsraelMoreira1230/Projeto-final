package com.projetofinal.projetofinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.projetofinal.projetofinal.dao.FuncionarioDao;
import com.projetofinal.projetofinal.domain.Funcionario;

public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	public Funcionario buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Funcionario> buscarTodos() {
		
		return dao.findAll();
	}
	
}