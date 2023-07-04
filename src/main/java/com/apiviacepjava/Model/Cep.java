package com.apiviacepjava.Model;


public record Cep(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf,
        Long ddd) {
}
