package org.example.clase_abstracta;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * (this.radio * this.radio);
    }
}
