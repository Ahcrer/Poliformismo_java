package Ejercicio1;

public class Figura {
    protected float area = 0;

    public Figura(float area) {
        this.area = area;
    }

    public void calcularArea() {
        System.out.println("No se ha definido la figura por lo que el área es = " + area);
    }

}
