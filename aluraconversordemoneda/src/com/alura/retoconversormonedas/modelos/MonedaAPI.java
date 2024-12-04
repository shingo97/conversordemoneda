package com.alura.retoconversormonedas.modelos;

public record MonedaAPI(
        String base_code,
        String target_code,
        double conversion_rate
) {

}
