package com.apiviacepjava.Modal;


public record Cep(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf,
        Long ddd) {
}
