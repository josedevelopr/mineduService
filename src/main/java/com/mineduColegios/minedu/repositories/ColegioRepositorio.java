package com.mineduColegios.minedu.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.mineduColegios.minedu.entities.Colegio;

public interface ColegioRepositorio extends Repository<Colegio,String>
{
	List<Colegio>findAll();
	Colegio findByCodmodularColegio(String codmodular);
	Colegio findByCodmodularColegioAndDniRepresentanteColegio(String codmodular,String dniRep);
}
