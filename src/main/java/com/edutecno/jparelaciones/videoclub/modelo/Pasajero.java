package com.edutecno.jparelaciones.videoclub.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//2) SE CREA LA ENTITY DE PELICULA PRIMERO, YA QUE ARRIENDO TIENE DATOS DE PELICULA Y LA PELICULA TIENE DATOS PROPIOS. 

@Entity
@SequenceGenerator(name = "SQ_PELICULA", initialValue = 1, sequenceName = "SQ_PELICULA", allocationSize = 1)
public class Pasajero {  // PASAJEROOOO

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PELICULA")
	private Integer id;
	private String nombre;
	private String rut;
	private Integer edad;
	private String apellido;
	private String ciudadNatal;


	public Pasajero() {
		super();
	}


	public Pasajero(Integer id, String nombre, String rut, Integer edad, String apellido, String ciudadNatal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
		this.apellido = apellido;
		this.ciudadNatal = ciudadNatal;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCiudadNatal() {
		return ciudadNatal;
	}


	public void setCiudadNatal(String ciudadNatal) {
		this.ciudadNatal = ciudadNatal;
	}


	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", apellido="
				+ apellido + ", ciudadNatal=" + ciudadNatal + "]";
	}

	



}
