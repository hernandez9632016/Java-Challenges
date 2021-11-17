package com.javacha.funciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listacincuenta {

    public static void main(String[] args) {
        List lista = new ArrayList();
        Random random = new Random();
        int limite = 50;
        int numero = 0;

        System.out.println("Lista de 50 numeros: \n");
        for (int i = 0; i != limite; i++) {
            numero = random.nextInt(100);
            lista.add(numero);
        }
        for (int i = 0; i < limite; i++) {
            System.out.println(lista.get(i));
        }
    }
}


