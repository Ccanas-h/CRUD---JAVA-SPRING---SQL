package com.edutecno.jparelaciones.videoclub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.edutecno.jparelaciones.videoclub.dto.DestinoDTO;
import com.edutecno.jparelaciones.videoclub.modelo.Destino;
import com.edutecno.jparelaciones.videoclub.service.DestinoService;
import com.edutecno.jparelaciones.videoclub.service.PasajeroService;

@Controller
@RequestMapping("arriendos")
public class DestinoController {

	private static final Logger log = LoggerFactory.getLogger(DestinoController.class);

	@Autowired
	private DestinoService arriendoService;
	@Autowired
	private PasajeroService peliculaService;


	@GetMapping
	public ModelAndView arriendos(Model model) {
		ModelAndView modelAndView = new ModelAndView("arriendos");
		modelAndView.addObject("arriendo", new Destino());
		model.addAttribute("peliculas", peliculaService.findAll().getPeliculas());
		return modelAndView;
	}

	@PostMapping("/agregar")
	public RedirectView agregar(@ModelAttribute Destino arriendo) {
		DestinoDTO respuestaServicio = arriendoService.add(arriendo);
		if (respuestaServicio.getCodigo().equals("0")) {
			return new RedirectView("/home");
		} else {
			return new RedirectView("/arriendos");
		}
	}
}
