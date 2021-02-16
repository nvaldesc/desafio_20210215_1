package com.example.desafio.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.models.Indicador;
import com.example.desafio.models.service.IndicadorService;

@RestController
@RequestMapping("/api/desafio_202102215_1")
public class IndicadorController {

	@Autowired
	private IndicadorService indicadorService;
	
	@GetMapping("/find/tipo/{type}/fecha/{date}")
	public Indicador detalle(@PathVariable String type,@PathVariable String date) {
		return indicadorService.findByTypeAndDate(type, date);
	}
}
