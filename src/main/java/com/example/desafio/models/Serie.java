package com.example.desafio.models;

import java.time.OffsetDateTime;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Serie
 *
 * @author Néstor Valdés
 * @version 1.0
 * @since 2021-02-15
 */

public class Serie{


    public Serie(OffsetDateTime fecha, double valor) {
		super();
		this.fecha = fecha;
		this.valor = valor;
	}
    Serie(){}
	private OffsetDateTime fecha;
    private double valor;

    @JsonProperty("fecha")
    public OffsetDateTime getFecha() { return fecha; }
    @JsonProperty("fecha")
    public void setFecha(OffsetDateTime value) { this.fecha = value; }

    @JsonProperty("valor")
    public double getValor() { return valor; }
    @JsonProperty("valor")
    public void setValor(double value) { this.valor = value; }

	
}
