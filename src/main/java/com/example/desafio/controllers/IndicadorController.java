package com.example.desafio.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.models.Indicador;
import com.example.desafio.models.service.IndicadorService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/desafio_202102215_1")
public class IndicadorController {

	@Autowired
	private IndicadorService indicadorService;
	
	@GetMapping("/find/tipo/{type}/fecha/{date}")
	@ApiOperation(value = "Busca indicador por type y date",
	notes="Cada vez que se consume el servicio, este verifica si existe el registro de esta consulta en la base de datos con la finalidad de disminuir la carga al servicio que presenta los indicadores",
	response=Indicador.class)
	public Indicador detalle(@PathVariable String type,@PathVariable String date) {
		return indicadorService.findByTypeAndDate(type, date);
	}
}
