package com.mineduColegios.minedu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mineduColegios.minedu.entities.Colegio;
import com.mineduColegios.minedu.repositories.ColegioRepositorio;



@Service
public class ColegioServiceImpl implements ColegioService 
{
	@Autowired
	private ColegioRepositorio repositorio;
	
	@Override
	public List<Colegio> listar() {
		return repositorio.findAll();
	}

	@Override
	public Colegio listarCodModular(String codmodu) {
		return repositorio.findByCodmodularColegio(codmodu);
	}

	@Override
	public Colegio listarCodModularAndDniRepresentanteColegio(String codmodu, String dni) {
		return repositorio.findByCodmodularColegioAndDniRepresentanteColegio(codmodu, dni);
	}
	
}
