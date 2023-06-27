package com.apiviacepjava.DTO;

public record EnderecoDTO(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf) {
}
