package ejercicio4;

public class SmartDevice {
    //declaramos variables atributos
    String marca;
    String modelo;
    String color;

    //clase padre,
    public SmartDevice(){

    }
    public SmartDevice(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    //clases hijas smartphone y smartwatch

    public static class SmartPhone extends SmartDevice{
        int ram;
        String os;

        public SmartPhone(){
            super();
        }

        public SmartPhone(String marca, String modelo, String color, int ram, String os){
            super(marca, modelo, color);
            this.ram = ram;
            this.os = os;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "ram=" + ram +
                    ", os='" + os + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
    public static class SmartWatch extends SmartDevice{
        //atributos
        double inches;
        String conexion;

        public SmartWatch (){
            super();
        }
        public SmartWatch (String marca, String modelo, String color, double inches, String conexion){
            super(marca, modelo, color);
            this.inches = inches;
            this.conexion = conexion;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "inches=" + inches +
                    ", conexion='" + conexion + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        SmartPhone iphonex = new SmartPhone("iphone", "x","black", 3, "ios");
        SmartWatch appleWatch = new SmartWatch("apple", "series 3", "grey", 3.15, "bluettooth");
        System.out.println("EL movil es un: "+ iphonex + "\nEl Reloj de pulsera es un: "+ appleWatch);


    }

}
