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
public class PasajeroControllerVista {

	@Autowired
	private PasajeroService peliculaService;

	@GetMapping("peliculavista")
	public ModelAndView peliculas() {
		ModelAndView modelAndView = new ModelAndView("peliculavista"); //ModelAndView es donde redirige esta zona
		modelAndView.addObject("peliculas", peliculaService.findAll().getPeliculas());
		return modelAndView;
	}


}
