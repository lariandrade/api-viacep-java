package com.apiviacepjava.DTO;

public record CepDTO(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf,
        Long ddd) {
}
