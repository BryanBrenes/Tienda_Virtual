/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

import com.Tienda.entity.Pais;
import com.Tienda.entity.Persona;
import com.Tienda.service.IPaisService;
import com.Tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonasController {
    
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping("/personas")
    public String index(Model model){
        List<Persona> listaPersonas=personaService.getAllPerson();
        model.addAttribute("titulo","Personas");
        model.addAttribute("personas", listaPersonas);
        return "personas";
    }
    
    @GetMapping("/personasN")
    public String crearPersona(Model model){
        List<Pais> listaPais = paisService.listCountry();
        model.addAttribute("paises", listaPais);
        model.addAttribute("persona", new Persona());
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.savePerson(persona);
        return "redirect:/personas";
    }
    
        @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id")Long idPersona, Model model){
        Persona persona = personaService.getPersonById(idPersona);
        List<Pais> listaPais = paisService.listCountry();
        model.addAttribute("paises", listaPais);
        model.addAttribute("persona", persona);
        return "crear";
    }
    
    @GetMapping ("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona){
        personaService.delete(idPersona);
        return "redirect:/personas";
    }
    
    
            
}
