package com.company;

public class IfElse {
    public static void main(String[] args) {
        boolean check = 15 < 10;
        int numero1 = 5;
        int numero2 = 10;
        int numero3 = 20;
        int numero4 = 1000;

        if (numero1 < numero2 && numero2 < numero3){
            System.out.println("verdadero");
        }else if (numero3 < numero4){
            System.out.println("else if");
        }else {

        }
        System.out.println("fin");
    }
}
