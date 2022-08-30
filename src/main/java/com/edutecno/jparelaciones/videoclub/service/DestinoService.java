package com.edutecno.jparelaciones.videoclub.service;

import com.edutecno.jparelaciones.videoclub.dto.DestinoDTO;
import com.edutecno.jparelaciones.videoclub.modelo.Destino;

public interface DestinoService {

	DestinoDTO findAll();

	DestinoDTO add(Destino arriendo);
}
