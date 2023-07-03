package com.apiviacepjava.Controller;

import com.apiviacepjava.Service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CepController {

    @Autowired
    private CepService viaCep;

    @GetMapping
    public String paginaInicial(){
        return "index.html";
    }

    @PostMapping
    public String consultarCep(String cep, boolean detalhado, Model model){


        try {
            var endereco = viaCep.buscaEndereco(cep);
            model.addAttribute("enderecoCompleto", viaCep.enderecoFormatado(endereco, detalhado));
        } catch (RuntimeException e) {
            model.addAttribute("erro", e.getMessage());
        }

        return "index.html";
    }
}
