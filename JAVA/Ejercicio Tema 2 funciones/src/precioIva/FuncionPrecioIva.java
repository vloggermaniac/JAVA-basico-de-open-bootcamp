package precioIva;
import java.util.Scanner;

public class FuncionPrecioIva {
    public static double calcularIVA(double precio){
        double IVA;
        IVA = precio * 0.21;
        return IVA;

    }

    public static void main(String[] args) {
        // función que reciba un precio y devuelva el precio con el IVA 21% incluido.
        Scanner precioIngresado = new Scanner(System.in);

        double precioCompra;
        double IVA;

        System.out.println("Ingrese el precio: ");
        precioCompra = precioIngresado.nextDouble();

        IVA = calcularIVA(precioCompra);

        System.out.println("El precio total sin IVA es: " + precioCompra);
        System.out.println("El precio total IVA incluido: " + (precioCompra+IVA));
    }
}
