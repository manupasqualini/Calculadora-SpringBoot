package com.manu.calculadorathymeleaf.controller;

import com.manu.calculadorathymeleaf.service.CalculadoraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraController {
    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("/calcular")
    public String calcular (int a, int b, String operacao, Model model){
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("operacao", operacao);
        return "index";
    }
}
