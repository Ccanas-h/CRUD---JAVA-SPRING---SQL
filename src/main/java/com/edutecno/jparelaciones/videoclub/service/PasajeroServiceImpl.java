package com.edutecno.jparelaciones.videoclub.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.jparelaciones.videoclub.dto.PasajeroDTO;
import com.edutecno.jparelaciones.videoclub.modelo.Pasajero;
import com.edutecno.jparelaciones.videoclub.repositorio.PasajeroRepository;

@Service
public class PasajeroServiceImpl implements PasajeroService {

	private static final Logger log = LoggerFactory.getLogger(PasajeroServiceImpl.class);

	@Autowired
	private PasajeroRepository dao;

	private PasajeroDTO respuesta;

	@Override
	@Transactional(readOnly = true)
	public PasajeroDTO findAll() {
		respuesta = new PasajeroDTO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "102");
		try {
			respuesta.setPeliculas((List<Pasajero>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getPeliculas().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Pelicula Service: Error en findAll", e);
		}
		return respuesta;
	}

	@Override
	@Transactional
	public PasajeroDTO add(Pasajero pelicula) {

		respuesta = new PasajeroDTO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "104");
		try {
			dao.save(pelicula);
			respuesta.setMensaje(String.format("Se ha guardado correctamente la pelicula %s", pelicula.getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Pelicula Service: Error en add", e);
		}
		return respuesta;
	}

}
