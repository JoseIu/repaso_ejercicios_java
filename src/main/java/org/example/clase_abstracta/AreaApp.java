package org.example.clase_abstracta;

public class AreaApp {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(2,2);

        System.out.println("El area del circulo es de: " + circulo.calcularArea());
        System.out.println("El area del rectangulo es de: " + rectangulo.calcularArea());


    }
}
