package org.higashi.learningspringboot.controller;

import java.util.List;

import org.higashi.learningspringboot.entity.Paciente;
import org.higashi.learningspringboot.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class PacienteController {
	
	private PacienteRepository pacienteRepository;
	  
    @Autowired
    public PacienteController(PacienteRepository pacienteRepository) {
          this.pacienteRepository = pacienteRepository;
    }

    @RequestMapping(value = "/paciente", method = RequestMethod.GET)
    public String listaPacientes(Model model) {
          List<Paciente> listaPacientes = pacienteRepository.findAll();
          if (listaPacientes != null) {
                model.addAttribute("pacientes", listaPacientes);
          }
          return "listaPacientes";
    }

    @RequestMapping(value = "/paciente", method = RequestMethod.POST)
    public String adicionaPaciente(Paciente paciente) {
          pacienteRepository.save(paciente);
          return "redirect:/paciente";
    }

}
