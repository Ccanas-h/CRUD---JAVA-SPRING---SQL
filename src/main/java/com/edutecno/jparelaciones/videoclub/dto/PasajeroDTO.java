package com.edutecno.jparelaciones.videoclub.dto;

import java.util.List;
import java.util.Objects;

import com.edutecno.jparelaciones.videoclub.modelo.Pasajero;

public class PasajeroDTO extends GenericDTO {

	private List<Pasajero> peliculas;

	public PasajeroDTO(List<Pasajero> peliculas, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.peliculas = peliculas;
	}

	public PasajeroDTO() {
		super();
	}

	public List<Pasajero> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pasajero> peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(peliculas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PasajeroDTO other = (PasajeroDTO) obj;
		return Objects.equals(peliculas, other.peliculas);
	}

}
