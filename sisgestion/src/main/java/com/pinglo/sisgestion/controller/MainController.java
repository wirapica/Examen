package com.pinglo.sisgestion.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class MainController {
	@GetMapping("/infracciones")
    public String getInfracciones(Model model) {
		return "principal";
	}
}
