package com.company;

public class Switch {
    public static void main(String[] args) {
    String weather = "sunny";

    switch (weather){
        case "sunny":
            System.out.println("El dia esta soleado");
            break;
        case "cloudy":
            System.out.println("El dia esta nublado");
            break;
        default:
            System.out.println("No se ha podido identificar el clima");
            break;


      }
    }
}
