package org.higashi.learningspringboot.controller;

import java.util.List;

import org.higashi.learningspringboot.entity.Medico;
import org.higashi.learningspringboot.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MedicoController {
	
	private MedicoRepository medicoRepository;
	  
    @Autowired
    public MedicoController(MedicoRepository medicoRepository) {
          this.medicoRepository = medicoRepository;
    }

    @RequestMapping(value = "/medico", method = RequestMethod.GET)
    public String listaMedicos(Model model) {
          List<Medico> listaMedicos = medicoRepository.findAll();
          if (listaMedicos != null) {
                model.addAttribute("medicos", listaMedicos);
          }
          return "listaMedicos";
    }

    @RequestMapping(value = "/medico", method = RequestMethod.POST)
    public String adicionaMedico(Medico medico) {
          medicoRepository.save(medico);
          return "redirect:/medico";
    }

}
