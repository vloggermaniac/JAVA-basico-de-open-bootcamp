package com.company;

public class CocheMain {
    public static void main(String[] args) {


        Coche cocheObj = new Coche();

        cocheObj.acelerar(50);

        System.out.println(cocheObj);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "ejemplo motor";
        cocheElectrico.fabricante = "honda";
        cocheElectrico.color = "verde";
        cocheElectrico.modelo = "fit";

        System.out.println(cocheElectrico);



        cocheElectrico.acelerar(120);
        System.out.println(cocheElectrico);
    }
}
