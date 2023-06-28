package com.apiviacepjava.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CepController {

    @GetMapping
    public String consulta(){
        return "index.html";
    }
}
