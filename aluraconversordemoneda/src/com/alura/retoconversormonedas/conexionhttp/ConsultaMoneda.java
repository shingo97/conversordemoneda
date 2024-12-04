package com.alura.retoconversormonedas.conexionhttp;


import com.alura.retoconversormonedas.modelos.MonedaAPI;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public MonedaAPI buscarMoneda(String monedaInicial, String monedaFinal){

        //Realiza la conexión con la API

        //Aquí se introduce la API key para el uso de la aplicación
        String apiKey = "25342e988b2170ab42447cee";

        URI uriAPi = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"+monedaInicial+"/"+monedaFinal+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uriAPi)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MonedaAPI.class);
        } catch (Exception e){
            throw new RuntimeException("No se ha podido encontrar ningún tipo de moneda.");
        }
    }
}
