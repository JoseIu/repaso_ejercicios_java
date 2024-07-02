package org.example.objetos_herencia;

public class AnimalApp {
    public static void main(String[] args) {

        Animal bestia = new Animal("Bestia",2);

        Animal gato = new Gato("Vincent",4,"Felino");

        Animal perro = new Perro("Valto",5,"Perro");

        System.out.println("El animal besti hace el sonido de: " + bestia.hacerSonido() );
        System.out.println("El animal gato ahce al sonido de: " + gato.hacerSonido());
        System.out.println("El animal perro hace el sonido de:" + perro.hacerSonido());

    }
}
