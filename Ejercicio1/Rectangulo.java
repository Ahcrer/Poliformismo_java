package Ejercicio1;

public class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(float area, int base, int altura) {
        super(area);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = base * altura;
        System.out.println("El área del rectangulo es: " + area);
    }

}
