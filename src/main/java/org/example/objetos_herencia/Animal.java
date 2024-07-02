package org.example.objetos_herencia;

public class Animal {

    private String nombre;
    private int edad;
    private String raza;
    private  static int aniamCount;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = "";
        aniamCount++;
    }

    public Animal(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        aniamCount++;

    }

    public String darInfo (){
        return "El animal " + this.nombre + " tiene:" + this.edad + " y es de raza: " +this.raza;
    }

    public String hacerSonido(){

        return  "Grrrrrr";
    }

    public  static int getAniamCount(){

        return aniamCount;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
