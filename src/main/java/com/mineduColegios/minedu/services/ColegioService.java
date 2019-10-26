package com.mineduColegios.minedu.services;

import java.util.List;

import com.mineduColegios.minedu.entities.Colegio;


public interface ColegioService 
{
	List<Colegio>listar();
	Colegio listarCodModular(String codmodu);
	Colegio listarCodModularAndDniRepresentanteColegio(String codmodu,String dni);
}

