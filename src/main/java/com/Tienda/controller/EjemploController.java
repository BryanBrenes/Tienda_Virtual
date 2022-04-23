/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author bryan
 */
@Controller
public class EjemploController {
    @GetMapping({"/ejemplo","/Ejemplo"})
    public String index() {
        return "Ejemplo";
    }
}
