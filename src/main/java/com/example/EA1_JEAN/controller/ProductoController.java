/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EA1_JEAN.controller;

import com.example.EA1_JEAN.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

/**
 *
 * @author Jeanc
 */
@Controller
public class ProductoController {

    @GetMapping("/formularioProducto")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto()); // Crea un objeto Producto vacío para el formulario
        return "formularioProducto"; // Devuelve la vista formularioProducto.html
    }

    @PostMapping("/guardarProducto")
    public String guardarFormulario(@Valid Producto producto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formularioProducto"; // Si hay errores, vuelve al formulario y muestra mensajes
        }

        model.addAttribute("producto", producto); // Pasa los datos validados al modelo
        return "registroExitoso"; // Si todo está bien, redirige a la página de éxito
    }
}
