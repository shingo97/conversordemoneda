package com.alura.retoconversormonedas.principal;

import com.alura.retoconversormonedas.principal.GeneradorDeArchivo;
import com.alura.retoconversormonedas.calculos.CalculoMoneda;
import com.alura.retoconversormonedas.modelos.MonedaAPI;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.net.InterfaceAddress;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        CalculoMoneda ver = new CalculoMoneda();
        int opcion = 0;

        String menu = """
                --------------------------------------------------------------
                --------------------------------------------------------------
                                     Conversor de Monedas
               \s
                   Este programa esta diseñado para elegir diferentes tipos de\s
                   divisas y asimismo realizar conversiones.  \s
               \s
               \s
                   Elige una opción para convertir el monto deseado:
                  \s
                   1. Dólar a Peso Argentino
                   2. Peso Argentino a Dólar
                   3. Dólar a Real Brasilero
                   4. Real Brasilero a Dólar
                   5. Dólar a Peso Colombiano
                   6. Peso Colombiano a Dólar
                   7. Salir
                --------------------------------------------------------------
                --------------------------------------------------------------  \s
                  \s
               \s""";





        while (opcion != 7){
            System.out.println(menu);
            System.out.println("Digite una opción válida: ");


            try {

                opcion = Integer.parseInt(scanner.next());

                switch (opcion) {

                    case 1-> {
                        System.out.println("\nElegiste la opción Dólar a Peso Argentino");
                        ver.calculoConversion("USD", "ARS", scanner);

                    }

                    case 2-> {
                        System.out.println("\nElegiste la opción Peso Argentino a Dólar");
                        ver.calculoConversion("ARS", "USD", scanner);

                    }

                    case 3-> {
                        System.out.println("\nElegiste la opción Dólar a Real Brasilero");
                        ver.calculoConversion("USD", "BRL", scanner);

                    }

                    case 4-> {
                        System.out.println("\nElegiste la opción Real Brasilero a Dólar");
                        ver.calculoConversion("BRL", "USD", scanner);


                    }

                    case 5-> {
                        System.out.println("\nElegiste la opción Dólar a Peso Colombiano");
                        ver.calculoConversion("USD", "COP", scanner);

                    }

                    case 6-> {
                        System.out.println("\nElegiste la opción Peso Colombiano a Dólar");
                        ver.calculoConversion("COP", "USD", scanner);

                    }

                    case 7-> {
                        System.out.println("\nElegiste la opción la opción Salir\n");
                        System.out.println("Hasta luego. Gracias por utilizar este programa.");

                    }

                    default -> System.out.println("\nOpción no válida.");



                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            } catch (InputMismatchException e) {
                System.out.println("Ocurrió un error. Por favor, ingrese un número.");
                scanner.next();

                GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
                generadorDeArchivo.guardarJson();
            }
        }

        scanner.close();





    }



}
