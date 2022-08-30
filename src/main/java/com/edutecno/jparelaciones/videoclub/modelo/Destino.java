package com.edutecno.jparelaciones.videoclub.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SQ_ARRIENDO", initialValue = 1, sequenceName = "SQ_ARRIENDO", allocationSize = 1)
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ARRIENDO")
	private Integer id;
	private String inicio; //fecha
	private String pais;
	private String ciudad;

	@ManyToOne
	@JoinColumn(name = "pelicula_id", referencedColumnName = "id") // 3)ES COMO UN JOIN, DONDE DECIMOS QUE PELICULA_ID
	private Pasajero pelicula;										// ES IGUAL AL referencedColumnName de la otra
																	// TABLA.
	 											// CREAMOS EL REPOSITORY



	public Destino(Integer id, String inicio, String pais, String ciudad, Pasajero pelicula) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.pais = pais;
		this.ciudad = ciudad;
		this.pelicula = pelicula;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Destino() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String duracion) {
		this.pais = duracion;
	}

	public Pasajero getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pasajero pelicula) {
		this.pelicula = pelicula;
	}


}
