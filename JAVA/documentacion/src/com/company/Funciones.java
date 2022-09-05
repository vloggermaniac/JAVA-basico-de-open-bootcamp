package com.company;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();

        holaMundo("Emanuel" );
    }
    private static void holaMundo(){
        System.out.println("Hola mundo desde un metodo");
    }
    public static void holaMundo(String name){
        System.out.println("Hola " + name);
    }
}
