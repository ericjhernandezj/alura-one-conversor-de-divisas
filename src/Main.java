/*
* Developed by Eric J. Hernandez J. (@ericjhernandezj)
* */

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        CurrencyConverter converter = new CurrencyConverter();

        String baseCurrency;
        String finalCurrency;
        double amount;

        String salir;

        System.out.println("Programa para convertir diferentes divisas.\n" + "Usar los códigos actuales de 3 caracteres, por ejemplo: MXN, USD, ARS");
        System.out.println();

        while (true) {
            try {
                System.out.println("Ingresar moneda de base: ");
                System.out.print("> ");
                baseCurrency = inputReader.nextLine().toUpperCase();
            } catch (NoSuchElementException e) {
                System.out.println("No se ingresó información. " + e);
                continue;
            }

            try {
                System.out.println("Ingresar moneda final: ");
                System.out.print("> ");
                finalCurrency = inputReader.nextLine().toUpperCase();
            } catch (NoSuchElementException e) {
                System.out.println("No se ingresó información. " + e);
                continue;
            }

            try {
                System.out.println("Ingresar cantidad: ");
                System.out.print("> ");
                amount = inputReader.nextDouble();
                inputReader.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("No se ingresó información. " + e);
                continue;
            }

            Currency result = converter.currencyConversion(baseCurrency, finalCurrency, amount);

            System.out.println(amount + baseCurrency.toUpperCase() + " es igual a " + String.format("%.2f", result.conversion_result()) + finalCurrency.toUpperCase());

            System.out.println("Ingrese \"salir\" para terminar el programa...");
            System.out.print("> ");

            try {
                salir = inputReader.nextLine().trim().toLowerCase();
            } catch (NoSuchElementException e) {
                System.out.println("No se ingresó información. " + e);
                continue;
            }

            if ("salir".equals(salir)) {
                break;
            } else {
                System.out.println("Entrada no valida");
            }
        }
    }
}