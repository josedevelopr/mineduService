package com.mineduColegios.minedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mineduColegios.minedu.entities.Colegio;
import com.mineduColegios.minedu.entities.RespuestaServer;
import com.mineduColegios.minedu.services.ColegioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/minedu"})
public class ColegioController 
{
	@Autowired
	ColegioService service;
	
	@GetMapping("/colegios")
    public List<Colegio>listar(){
        return service.listar();
    }  
    @GetMapping(path = {"/colegios/{codModular}"})
    public Colegio listarId(@PathVariable("codModular")String codModular){
        return service.listarCodModular(codModular);
    }
    @GetMapping(path = {"/colegios/validar/{codModular}"})
    public Colegio validarColegioCodModular(@PathVariable("codModular")String codModular){
        return service.listarCodModular(codModular);
    }
    @GetMapping(path = {"/colegios/validar/{codModular}/{dni}"})
    public RespuestaServer validarColegioCodModularYdniRepresentante(@PathVariable("codModular")String codModular,@PathVariable("dni")String dni){
        Colegio cole = service.listarCodModularAndDniRepresentanteColegio(codModular, dni);
        RespuestaServer respuesta = new RespuestaServer();
        if(cole==null) 
        {
        	respuesta.setEstadoRespuestaServer("0");
        	respuesta.setRespuestaServer("No existe un colegio con los datos insertado, por favor ingrese datos validos.");
		}
        else
        {
        	respuesta.setEstadoRespuestaServer("1");
        	respuesta.setRespuestaServer(cole.getCorreoRepresentanteColegio());
        }
		return respuesta;
    }
}