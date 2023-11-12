
package Ejercicio1;

public class main {

    public static void main(String[] args) {
        Figura figura = new Figura(0);

        figura.calcularArea();

        Circulo circulo = new Circulo(0, 2, 3.14f);

        circulo.calcularArea();

        Rectangulo rectangulo = new Rectangulo(0, 2, 4);

        rectangulo.calcularArea();

    }

}