package com.polos.akdemia.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.polos.akdemia.model.Polo;
import com.polos.akdemia.repository.PoloRepository;

@Controller
public class PoloController {
	
	private final PoloRepository poloRepository;

    public PoloController(PoloRepository poloRepository) {
        this.poloRepository = poloRepository;
    }

    @GetMapping("/polos")
    public String mostrarPolos(Model model) {
        List<Polo> polos = poloRepository.findAll();
        model.addAttribute("polos", polos);
        return "polos"; // plantilla polos.html
    }

}
