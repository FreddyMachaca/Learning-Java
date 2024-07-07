package com.utsudev.learningspringboot.controllers;

import com.utsudev.learningspringboot.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public ModelAndView buscarClientes() {
        ModelAndView mv = new ModelAndView("listar_clientes");
        mv.addObject("allClients", repository.findAll());
        return mv;
    }

    @GetMapping("/{id}")
    public ModelAndView buscarPorId(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("detalhes_cliente");
        mv.addObject("idClient", repository.findById(id).get());
        return mv;
    }
}
