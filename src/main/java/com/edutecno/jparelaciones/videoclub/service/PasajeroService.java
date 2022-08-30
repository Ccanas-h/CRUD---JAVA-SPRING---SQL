package com.edutecno.jparelaciones.videoclub.service;

import com.edutecno.jparelaciones.videoclub.dto.PasajeroDTO;
import com.edutecno.jparelaciones.videoclub.modelo.Pasajero;

public interface PasajeroService {

	PasajeroDTO findAll();

	PasajeroDTO add(Pasajero pelicula);
}
