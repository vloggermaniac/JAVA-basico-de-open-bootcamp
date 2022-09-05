package company;

public class Tipo {
    public static void main(String[] args) {
        //tipo identificador = 30;
        //tipo identificador:
        //identificador = 30;

        //enteros
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4; //8 byte  capacidad del almacenamiento
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        //punto flotante
        float decimal1 = 4.9f; //f para indicar que es float
        double decimal2 = 9.99d; // d para indicar que double  y tiene doble capcidad
        System.out.println(decimal1);
        System.out.println(decimal2);
        //caracter
        char caracter1 = 'a'; // solo un
        System.out.println(caracter1);
        //booleanos
        boolean verdadero = true;
        boolean falso = false;
        System.out.println(verdadero);
        System.out.println(falso);
        //cadenas de textos
        String nombre = "Emanuel";
        System.out.println(nombre);

        //tipos envoltorios
        Integer numero = null;
        Long numero2 = 2L;
        System.out.println(numero);
        System.out.println(numero2);
    }

}
