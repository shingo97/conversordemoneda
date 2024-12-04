package com.alura.retoconversormonedas.calculos;


import com.alura.retoconversormonedas.conexionhttp.ConsultaMoneda;
import com.alura.retoconversormonedas.modelos.Moneda;
import com.alura.retoconversormonedas.modelos.MonedaAPI;

import java.util.Scanner;

public class CalculoMoneda {

    public void calculoConversion(String monedaInicial, String monedaFinal, Scanner scanner){

        double monto;
        double montoTotal;
        ConsultaMoneda consulta = new ConsultaMoneda();

        System.out.println("\nIngrese el monto que desea convertir: ");

        try{

            monto = Double.parseDouble(scanner.next());

            MonedaAPI monedaAPI = consulta.buscarMoneda(monedaInicial, monedaFinal);

            Moneda moneda = new Moneda(monedaAPI);

            montoTotal = monto * moneda.getTasaConvertido();

            System.out.println("\nEl valor %.2f[%s] correspondiente al valor final de: %.2f[%s]\n"
                    .formatted(monto, monedaInicial, montoTotal, monedaFinal));
        }catch (NumberFormatException e) {
            System.out.println("Digite un monto válido.");

        }

    }


}
