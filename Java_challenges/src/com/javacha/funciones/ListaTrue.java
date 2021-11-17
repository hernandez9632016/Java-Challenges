package com.javacha.funciones;

import java.util.Arrays;

public class ListaTrue {
    public static void main(String[] args) {
        int[] lista = {2, 5, 8, 9, 6, 11, 3, 88, 28};

        for (int a = 0; a < lista.length; a++) {
            System.out.println(lista[a]+"\n");
        }
        System.out.println(listatru(lista));
    }

    public static boolean listatru(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Elementos repetidos");
                    return true;
                }
            }
        }
        System.out.println("Elementos no repetidos");
        return false;
    }
}
