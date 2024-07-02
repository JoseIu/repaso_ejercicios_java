package org.example.ahorcado;

import java.util.Scanner;

public class AhorcadoApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String secretWord = "inteligente";

        int maxAttempts = 10;
        int attempts = 0;

        boolean isCorrectWord= false;

        char [] secretWordAttemps = new char[secretWord.length()];

        for (int i = 0; i < secretWordAttemps.length; i++) {

            secretWordAttemps[i] = '_';
        }

        while (!isCorrectWord && attempts < maxAttempts){

            System.out.println("Palabra a adivinar: " + String.valueOf(secretWordAttemps) + " " + secretWord.length());

            System.out.println("Introuce una letra:");
            char letter = Character.toLowerCase(keyboard.next().charAt(0));

            boolean isLetterCorrect = false;

            for (int i = 0; i < secretWordAttemps.length; i++) {
                if(secretWord.charAt(i) == letter){

                    secretWordAttemps[i] = letter;
                    isLetterCorrect = true;
                }
            }
            if(!isLetterCorrect){
                attempts++;
                System.out.println("Letra incorrecta, te quedan: " + (maxAttempts - attempts) + " Intentos");
            }

            if(secretWord.equals(secretWordAttemps)){

                System.out.println("Felicidades has acertado la palabra secreta!: " + secretWord);
                isCorrectWord = true;
            }

        }


        if(!isCorrectWord){

            System.out.println("Se acabaron los intentos, GAME OVER!");
        }

    }
}
