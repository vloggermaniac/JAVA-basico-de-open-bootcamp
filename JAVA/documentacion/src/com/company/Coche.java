package com.company;

public class Coche {

        //atributos
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Double largo;
        Integer velocidad = 0;

        //constructores
        public Coche(){

        }

        public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = this.color;
        this.fabricante = this.fabricante;
        this.modelo = this.modelo;
        this.peso = this.peso;
        this.largo = this.largo;
        }


        //comportamientos
        public void acelerar (Integer cantidad){
                if (cantidad > 0 && cantidad <= 120) {
                        this.velocidad += cantidad;
                }
        }
        // se utiliza para convertir a String
        // (es decir, a una cadena de texto) cualquier objeto Java.
        @Override
        public String toString() {
                return "Coche{" +
                        "color='" + color + '\'' +
                        ", fabricante='" + fabricante + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", peso=" + peso +
                        ", largo=" + largo +
                        ", velocidad=" + velocidad +
                        '}';
        }
}
