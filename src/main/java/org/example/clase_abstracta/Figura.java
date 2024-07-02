package org.example.clase_abstracta;

public abstract class Figura {

    //Este comportamiento será obligatorio que heredan de Figura
    abstract double calcularArea();

    void imprimirInfo(){
        System.out.println("Esta info viene desde la calse abstract Figura");
    }
}
