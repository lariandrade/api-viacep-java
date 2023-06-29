package com.apiviacepjava.Service;

import com.apiviacepjava.DTO.Cep;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCep {
    public Cep buscaEndereco(String cep) {

        URI endereco = URI.create("https://viacep.com.br/ws/" +  formataCep(cep) + "/json");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cep.class);

        } catch (Exception e) {
            throw new RuntimeException("CEP nao encontrado.");
        }

    }

    public String formataCep(String cep) {
        return cep.replaceAll("[.-]", "");
    }

    public StringBuilder enderecoFormatado(Cep endereco) {

        StringBuilder enderecoFinal = new StringBuilder();

        enderecoFinal.append(String.format("%s, %s - %s.", endereco.bairro(), endereco.logradouro(), endereco.localidade()));

        return enderecoFinal;

    }
}

