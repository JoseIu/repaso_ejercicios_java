package org.example.interfaces;

import org.example.interfaces.interfaces.Comunicable;

public class Delfin implements Comunicable {


    @Override
    public void comunicarse() {
        System.out.println("El defin se comunica mediante sonidos");
    }
}
