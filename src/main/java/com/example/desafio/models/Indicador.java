package com.example.desafio.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Indicador
 *
 * @author Néstor Valdés
 * @version 1.0
 * @since 2021-02-15
 */
@ApiModel(description="Detalle sobre el Indicador")
public class Indicador {

	public Indicador(String version, String autor, String codigo, String nombre, String unidadMedida, Serie[] serie) {
		super();
		this.version = version;
		this.autor = autor;
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		this.serie = serie;
	}

	public Indicador() {}
	
	@ApiModelProperty(notes="numero de versión")
	private String version;

	@ApiModelProperty(notes="nombre del autor")
	private String autor;
	@ApiModelProperty(notes="código indicador")
	private String codigo;
	@ApiModelProperty(notes="nombre indicador")
	private String nombre;
	@ApiModelProperty(notes="unidad de medida del indicador")
	private String unidadMedida;
	@ApiModelProperty(notes="arreglo que presenta la fecha y el valor")
	private Serie[] serie;

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String value) {
		this.version = value;
	}

	@JsonProperty("autor")
	public String getAutor() {
		return autor;
	}

	@JsonProperty("autor")
	public void setAutor(String value) {
		this.autor = value;
	}

	@JsonProperty("codigo")
	public String getCodigo() {
		return codigo;
	}

	@JsonProperty("codigo")
	public void setCodigo(String value) {
		this.codigo = value;
	}

	@JsonProperty("nombre")
	public String getNombre() {
		return nombre;
	}

	@JsonProperty("nombre")
	public void setNombre(String value) {
		this.nombre = value;
	}

	@JsonProperty("unidad_medida")
	public String getUnidadMedida() {
		return unidadMedida;
	}

	@JsonProperty("unidad_medida")
	public void setUnidadMedida(String value) {
		this.unidadMedida = value;
	}

	@JsonProperty("serie")
	public Serie[] getSerie() {
		return serie;
	}

	@JsonProperty("serie")
	public void setSerie(Serie[] value) {
		this.serie = value;
	}
}
