package com.edutecno.jparelaciones.videoclub.dto;

import java.util.Objects;

public class GenericDTO {

	String mensaje;
	String codigo;

	public GenericDTO(String mensaje, String codigo) {
		super();
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public GenericDTO() {
		super();
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "GenericDTO [mensaje=" + mensaje + ", codigo=" + codigo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, mensaje);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenericDTO other = (GenericDTO) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(mensaje, other.mensaje);
	}

}
