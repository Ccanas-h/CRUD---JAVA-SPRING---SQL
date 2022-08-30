package com.edutecno.jparelaciones.videoclub.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.jparelaciones.videoclub.modelo.Pasajero;

//3) Creamos el repository que obtendra metodos de CrudRepository (Create, Read, Update, Delete). Lo mismo con Pelicula, Cliente. 

@Repository
public interface PasajeroRepository extends CrudRepository<Pasajero, Integer> { // Recordar que aqui el CrudRepository
																				// recibe <Entidad, y el tipo de dato
																				// del ID>

} // -> 4) Despues de hacer los Repositorys, vamos a testear el programa por 1era
	// vez. En la clase Test.
