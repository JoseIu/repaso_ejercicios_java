package org.example.clase_abstracta;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    double calcularArea() {
        return this.base * this.altura;
    }

}
