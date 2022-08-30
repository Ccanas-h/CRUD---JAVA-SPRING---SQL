package com.edutecno.jparelaciones.videoclub.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.jparelaciones.videoclub.dto.DestinoDTO;
import com.edutecno.jparelaciones.videoclub.modelo.Destino;
import com.edutecno.jparelaciones.videoclub.repositorio.DestinoRepository;

@Service
public class DestinoServiceImpl implements DestinoService {

	private static final Logger log = LoggerFactory.getLogger(DestinoServiceImpl.class);

	@Autowired
	private DestinoRepository dao;

	private DestinoDTO respuesta;

	@Override
	@Transactional
	public DestinoDTO findAll() {
		respuesta = new DestinoDTO(new ArrayList<Destino>(), "Ha ocurrido un error", "102");
		try {
			respuesta.setArriendos((List<Destino>) dao.findAll());
			respuesta.setMensaje(String.format("Se ha/n encontrado %d registro/s", respuesta.getArriendos().size()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Arriendo Service: Error en findAll", e);
		}
		return respuesta;
	}

	@Override
	@Transactional
	public DestinoDTO add(Destino arriendo) {
		respuesta = new DestinoDTO(new ArrayList<Destino>(), "Ha ocurrido un error", "104");
		try {
			dao.save(arriendo);
			respuesta.setMensaje(String.format("Se ha guardado correctamente el arriendo de la pelicula %s",
					arriendo.getPelicula().getNombre()));
			respuesta.setCodigo("0");
		} catch (Exception e) {
			log.trace("Arriendo Service: Error en add", e);
		}
		return respuesta;
	}

}
