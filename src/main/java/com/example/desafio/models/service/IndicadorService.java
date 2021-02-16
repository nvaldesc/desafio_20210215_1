package com.example.desafio.models.service;

import com.example.desafio.models.Indicador;

public interface IndicadorService {

	public Indicador findByTypeAndDate(String type, String date);

}
