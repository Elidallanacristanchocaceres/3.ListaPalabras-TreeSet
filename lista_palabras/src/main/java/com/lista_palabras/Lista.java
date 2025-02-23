package com.lista_palabras;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lista {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Set<String> palabras = new TreeSet<>();

        // 1. ingresar palabras
        System.out.println("Ingrese palabras (escriba 'fin' para terminar):");
        while (true) {
            System.out.print("Palabra: ");
            String palabra = scanner.nextLine();
            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            if (!palabras.add(palabra)) {
                System.out.println("⚠ La palabra '" + palabra + "' ya está en la lista.");
            }
        }

        // 3.orden alfa
        System.out.println("\n📌 Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        // 4.buscar palabra
        System.out.print("\nIngrese la palabra que desea buscar: ");
        String palabraBuscar = scanner.nextLine();
        if (palabras.contains(palabraBuscar)) {
            System.out.println("✅ La palabra '" + palabraBuscar + "' está en la lista.");
        } else {
            System.out.println("❌ La palabra '" + palabraBuscar + "' no está registrada.");
        }

        scanner.close();
    }
}