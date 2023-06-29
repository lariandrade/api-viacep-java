package com.apiviacepjava.Controller;

import com.apiviacepjava.DTO.Cep;
import com.apiviacepjava.Service.ViaCep;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CepController {

    @GetMapping
    public String paginaInicial(){
        return "index.html";
    }

    @PostMapping
    public String consultarCep(String cep, Model model){

        ViaCep viaCep = new ViaCep();

        var endereco = viaCep.buscaEndereco(cep);

        viaCep.enderecoFormatado(endereco);

        model.addAttribute("enderecoCompleto",  viaCep.enderecoFormatado(endereco));

        return "index.html";
    }
}
