package com.edutecno.jparelaciones.videoclub.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.jparelaciones.videoclub.modelo.Destino;

@Repository
public interface DestinoRepository extends CrudRepository<Destino, Integer> { // Recordar que aqui el CrudRepository
																				// recibe <Entidad, y el tipo de dato
																				// del ID>

}
