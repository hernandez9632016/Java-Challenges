package com.javacha.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner valoraeli = new Scanner(System.in);
        long numinv, fa, rest;
        int numeroelim;
        int contador = 0;
        java.util.List lista = new ArrayList();
        Random random = new Random();
        int limite = random.nextInt(99);
        System.out.println(" Cantidad de elementos: " + limite + "\n");
        int numero = 0;

        System.out.println("Numeros al azar: \n");
        for (int i = 0; i != limite; i++) {
            numero = random.nextInt(9999);
            contador = contador + numero;  /*********************    sumatoria de todos los elementos   ***************/
            lista.add(numero);
        }
        /**    lista.forEach(System.out::println); Opcion para imprimir la lista */
        for (int i = 0; i < limite; i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("La suma es: " + contador + "\n");

        System.out.println("Digita valor a eliminar: ");
        numeroelim = valoraeli.nextInt();

/*******************    Eliminar todas las apariciones de un valor en la lista      ***********************************/

        for (int i = 0; i < lista.size(); i++) {
            // System.out.println(lista.get(i));

            if (lista.get(i).equals(numeroelim)) {
                lista.remove(i);
            }
        }
        System.out.println(lista + "\n");

/********************************   CAPICUA   *************************************************************************/
        while (lista.size() < 0) ;
        fa = lista.size();
        numinv = 0;
        rest = 0;
        rest = fa % 10;
        fa = fa / 10;
        numinv = numinv * 10 + rest;

        while (fa != 0) {
            rest = fa % 10;
            numinv = numinv * 10 + rest;
            fa = fa / 10;
        }
        if (numinv == lista.size()) {
            System.out.println("La lista es capicua. \n");
        } else {
            System.out.println("La lista no es capicua. \n");
        }
    }
}


