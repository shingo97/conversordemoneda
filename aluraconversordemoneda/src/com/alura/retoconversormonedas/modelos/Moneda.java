package com.alura.retoconversormonedas.modelos;

public class Moneda {


    private String monedaInicial;
    private String monedaFinal;
    private double tasaConvertido;

    public Moneda() {
    }

    public Moneda(String monedaInicial, String monedaFinal, double tasaConvertido) {
        this.monedaInicial = monedaInicial;
        this.monedaFinal = monedaFinal;
        this.tasaConvertido = tasaConvertido;
    }

    public Moneda(MonedaAPI monedaAPI){
        this.monedaInicial = monedaAPI.base_code();
        this.monedaFinal = monedaAPI.target_code();
        this.tasaConvertido = Double.valueOf(monedaAPI.conversion_rate());

    }

    public String getMonedaInicial(){
        return monedaInicial;
    }
    public String getMonedaFinal(){
        return monedaFinal;
    }
    public double getTasaConvertido(){
        return tasaConvertido;
    }
}


