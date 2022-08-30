package com.edutecno.jparelaciones.videoclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edutecno.jparelaciones.videoclub.service.DestinoService;
import com.edutecno.jparelaciones.videoclub.service.PasajeroService;

@Controller
public class HomeController {

	@Autowired
	private DestinoService arriendoService;
	
	@Autowired 
	private PasajeroService peliculaService;

	@GetMapping({ "/", "home" })
	public ModelAndView clientes() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("arriendos", arriendoService.findAll().getArriendos());
		modelAndView.addObject("peliculas", peliculaService.findAll().getPeliculas());
		return modelAndView;
	}

}
