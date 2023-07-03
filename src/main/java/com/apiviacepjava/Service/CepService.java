package com.apiviacepjava.Service;

import com.apiviacepjava.Modal.Cep;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class CepService {
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
            throw new RuntimeException("Não encontrado.");
        }

    }

    public String formataCep(String cep) {
        return cep.replaceAll("[.-]", "");
    }

    public StringBuilder enderecoFormatado(Cep endereco, Boolean detalhado) {

        StringBuilder enderecoFinal = new StringBuilder();

        if(detalhado) {

            enderecoFinal.append("Bairro: " + endereco.bairro())
                    .append("\n")
                    .append("Logradouro: " + endereco.logradouro())
                    .append("\n")
                    .append("Complemento: ").append(endereco.complemento().isEmpty() ? "não possui" : endereco.complemento())
                    .append("\n")
                    .append("Localidade: " + endereco.localidade())
                    .append("\n")
                    .append("UF: " + endereco.uf())
                    .append("\n")
                    .append("DDD: " + endereco.ddd());

        } else {
            enderecoFinal.append(String.format("%s, %s - %s.", endereco.bairro(), endereco.logradouro(), endereco.localidade()));

        }


        return enderecoFinal;

    }
}

