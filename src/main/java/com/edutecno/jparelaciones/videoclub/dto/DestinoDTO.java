package com.edutecno.jparelaciones.videoclub.dto;

import java.util.List;
import java.util.Objects;

import com.edutecno.jparelaciones.videoclub.modelo.Destino;

public class DestinoDTO extends GenericDTO {

	private List<Destino> arriendos;

	public DestinoDTO(List<Destino> arriendos, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.arriendos = arriendos;
	}

	public DestinoDTO() {
		super();
	}

	public List<Destino> getArriendos() {
		return arriendos;
	}

	public void setArriendos(List<Destino> arriendos) {
		this.arriendos = arriendos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(arriendos);
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
		DestinoDTO other = (DestinoDTO) obj;
		return Objects.equals(arriendos, other.arriendos);
	}

}
