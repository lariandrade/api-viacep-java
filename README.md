<div align="center">
    <img src="https://github.com/lariandrade/api-viacep-java/assets/44838761/276b5190-e9ce-48e9-adc8-126a6a82c75d" weight="250" height="200"/>
    <h1 align="center">Consumindo API ViaCEP com Java</h1>
</div>

<div align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=FINALIZADO&color=GREEN&style=for-the-badge"/>
</div>


## Descrição do Projeto
O projeto foi desenvolvido com o objetivo de aplicar os conhecimentos adquiridos durante meus estudos.

Foram utilizadas as seguintes tecnologias e conceitos:

- Gson: utilizado para converter o JSON em objeto, facilitando o processamento dos dados.
- DTO (Data Transfer Object): utilizado para transferir os dados entre as diferentes camadas do sistema, garantindo uma separação adequada de responsabilidades.
- Service: utilizado para agrupar as regras de negócio relacionadas à consulta de CEP, promovendo uma organização e manutenção mais eficientes.
- StringBuilder: utilizado para construir a representação formatada do endereço, permitindo a escolha entre uma versão simples ou detalhada do resultado.
- `Java.net.URI`, `java.net.http.HttpClient`, `java.net.http.HttpRequest` e `java.net.http.HttpResponse`: utilizados para realizar a chamada à API ViaCEP, obter a resposta e processá-la.

API ViaCEP: https://viacep.com.br/

Minha proposta: [busca-cep.up.railway.app/](https://busca-cep.up.railway.app/)

## Funcionalidades
- `Funcionalidade 1`: Consulta Simples
- `Funcionalidade 2`: Consulta Detalhada

## Demonstração
### Detalhado
<div align="center">
    <img src="https://github.com/lariandrade/api-viacep-java/assets/44838761/001575f8-bff0-463e-8870-d6fe962b7e31"/>
</div>

### Simples
<div align="center">
   <img src="https://github.com/lariandrade/api-viacep-java/assets/44838761/8b6dd448-937f-4306-9155-567066895ea8"/>
</div>

### CEP inválido
<div align="center">
  <img src="https://github.com/lariandrade/api-viacep-java/assets/44838761/a43e84db-9a1f-4ed5-a069-800b4e74d01f"/>
</div>

## :arrow_forward: Rodar a aplicação

Siga as instruções abaixo para executar a aplicação:

**1. Baixe o projeto:**
```
git clone https://github.com/lariandrade/api-viacep-java.git
```
<p>Abra o projeto na IDE.</p>

**Recomendo o uso do IntelliJ IDEA, mas você pode usar qualquer outra IDE que seja compatível com projetos Spring Boot.**

A aplicação estará funcionando no endereço http://localhost:8080/.

## ✅ Tecnologias utilizadas

O projeto foi construído utilizando as seguintes ferramentas e tecnologias:

- Java 17
- Springboot
- Thymeleaf
- Bootstrap 5
- CSS3
- HTML5
