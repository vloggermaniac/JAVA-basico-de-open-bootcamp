package com.company;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10 ) {
            count++;
            if (count == 6)
                break; // rompe el flujo
                //continue; salta el valor de 6 y  continua la siguiente iteracion
            System.out.println("Hola Mundo " + count);

        }
        System.out.println("FIN");
    }
}
