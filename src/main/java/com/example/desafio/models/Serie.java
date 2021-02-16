package com.example.desafio.models;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Serie
 *
 * @author Néstor Valdés
 * @version 1.0
 * @since 2021-02-15
 */
@ApiModel(description = "Detalle sobre la Serie")
public class Serie {

	public Serie(OffsetDateTime fecha, double valor) {
		super();
		this.fecha = fecha;
		this.valor = valor;
	}

	Serie() {
	}

	private OffsetDateTime fecha;
	private double valor;

	@JsonProperty("fecha")
	@ApiModelProperty(notes="fecha de la serie")
	public OffsetDateTime getFecha() {
		return fecha;
	}

	@JsonProperty("fecha")
	public void setFecha(OffsetDateTime value) {
		this.fecha = value;
	}

	@JsonProperty("valor")
	@ApiModelProperty(notes="valor de la serie")
	public double getValor() {
		return valor;
	}

	@JsonProperty("valor")
	public void setValor(double value) {
		this.valor = value;
	}

}
