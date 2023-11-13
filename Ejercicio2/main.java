package Ejercicio2;

public class main {
    public static void main(String[] args) {

        Fruta fruta = new Fruta();
        Manzana manzana = new Manzana();
        Banana banana = new Banana();

        System.out.println("El color de la fruta es: " + fruta.obtenerColor());
        System.out.println("El color de la manazana es: " + manzana.obtenerColor());
        System.out.println("El color de la banana es: " + banana.obtenerColor());

    }

}
