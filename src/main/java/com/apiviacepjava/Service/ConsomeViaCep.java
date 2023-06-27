package com.apiviacepjava.Service;

import com.apiviacepjava.DTO.EnderecoDTO;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsomeViaCep {
    public EnderecoDTO buscaEndereco(String cep) {

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), EnderecoDTO.class);

        } catch (Exception e) {
            throw new RuntimeException("CEP nao encontrado.");
        }


    }
}

