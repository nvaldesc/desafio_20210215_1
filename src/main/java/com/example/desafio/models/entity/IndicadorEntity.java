package com.example.desafio.models.entity;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;


/**
 * Indicador Entity
 *
 * @author Néstor Valdés
 * @version 1.0
 * @since 2021-02-15
 */
@Entity
@Table(name = "INDICADOR")
public class IndicadorEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "VERSION")
	private String version;

	@Column(name = "AUTOR")
	private String autor;
	@Column(name = "CODIGO")
	private String codigo;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "UNIDAD_MEDIDA")
	private String unidadMedida;
	
	@Column(name = "FECHA")
	private OffsetDateTime fecha;
	@Column(name = "VALOR")
	private Double valor;

	
	public IndicadorEntity() {
		
	}
	




	public IndicadorEntity(String id, String version, String autor, String codigo, String nombre, String unidadMedida,
			OffsetDateTime fecha, Double valor) {
		super();
		this.id = id;
		this.version = version;
		this.autor = autor;
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		this.fecha = fecha;
		this.valor = valor;
	}





	public String getId() {
		return id;
	}





	public OffsetDateTime getFecha() {
		return fecha;
	}





	public void setFecha(OffsetDateTime fecha) {
		this.fecha = fecha;
	}





	public Double getValor() {
		return valor;
	}





	public void setValor(Double valor) {
		this.valor = valor;
	}





	public String getVersion() {
		return version;
	}


	public void setVersion(String value) {
		this.version = value;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String value) {
		this.autor = value;
	}

	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String value) {
		this.codigo = value;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String value) {
		this.nombre = value;
	}


	public String getUnidadMedida() {
		return unidadMedida;
	}


	public void setUnidadMedida(String value) {
		this.unidadMedida = value;
	}

	public void setId(String id) {
		this.id = id;
	}
}
