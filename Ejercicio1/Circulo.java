package Ejercicio1;

public class Circulo extends Figura {
    private float radio;
    private float pi = 3.14f;

    public Circulo(float area, float radio, float pi) {
        super(area);
        this.radio = radio;
        this.pi = pi;
    }

    @Override
    public void calcularArea() {
        area = pi * (radio * radio);
        System.out.println("El área del circulo es: " + area);
    }

}
