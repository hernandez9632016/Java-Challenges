package com.javacha.funciones;

import java.util.ArrayList;
import java.util.Random;

public class CombinacionFunciones {
    public static void main(String[] args) {
        int limite = 10;
        int[] lista = new int[limite];
        Random random = new Random();
        int numero = 0;

        System.out.println("Lista de 50 numeros: \n");
        for (int i = 0; i != limite; i++) {
            numero = random.nextInt(100);
            lista[i] = numero;
        }
        for (int i = 0; i < limite; i++) {
            System.out.println(lista[i]);
        }
        System.out.println(listatru(lista));
        System.out.println(numerounicos(lista));
    }

    public static boolean listatru(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Elementos repetidos");
                    return true;
                } else {

                }
            }
        }
        System.out.println("Elementos no repetidos");
        return false;
    }

    public static ArrayList<Integer> numerounicos(int[] array) {
        ArrayList<Integer> numeuni = new ArrayList<Integer>();


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Elementos repetidosaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                } else {
                    numeuni.add(array[j]);
                }
            }
        }
        System.out.println("Elementos no repetidosrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        return numeuni;
    }
}
