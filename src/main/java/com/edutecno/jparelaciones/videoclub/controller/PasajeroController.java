package com.edutecno.jparelaciones.videoclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.edutecno.jparelaciones.videoclub.dto.PasajeroDTO;
import com.edutecno.jparelaciones.videoclub.modelo.Pasajero;
import com.edutecno.jparelaciones.videoclub.service.PasajeroService;

@Controller
@RequestMapping("peliculas")
public class PasajeroController {

	@Autowired
	private PasajeroService peliculaService;

	@GetMapping
	public ModelAndView peliculas() {
		ModelAndView modelAndView = new ModelAndView("peliculas");
		modelAndView.addObject("pelicula", new Pasajero());
		return modelAndView;
	}

	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Pasajero pelicula) {
		PasajeroDTO respuestaServicio = peliculaService.add(pelicula);
		if (respuestaServicio.getCodigo().equals("0")) {
			return new RedirectView("/peliculavista");
		} else {
			return new RedirectView("/peliculas");
		}

	}
}
