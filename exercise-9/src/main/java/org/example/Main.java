package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao jogo da forca!");
        String keyword = "programar";
        String usedLyrics = "";
        String guessedWord = "";
        int MAX_ATTEMPTS = 9;

        for(int i = 0; i < keyword.length(); i++) {
            guessedWord += "_";
            for (int attempts = 0; ; attempts++) {
                if(attempts == MAX_ATTEMPTS) {
                    System.out.println("Foram 9 tentativas... A palavra era " + keyword);
                    System.exit(0);
                }
                System.out.printf("Rodada %d. Até agora adivinhada: %s. Qual a sua próxima letra? %n", attempts, guessedWord);

                char attemptedLyric = new Scanner(System.in).next().charAt(0);
                if(usedLyrics.indexOf(attemptedLyric) >=0) {
                    System.out.printf("Você já tentou a letra %c. %n", attemptedLyric);
                } else {
                    usedLyrics += attemptedLyric;

                    if(keyword.indexOf(attemptedLyric) >=0) {
                        guessedWord = "";

                        for (int j = 0; j < keyword.length(); j++) {
                            guessedWord += usedLyrics.indexOf(keyword.charAt(j)) >= 0 ? keyword.charAt(j) : "_";
                        }

                        if (guessedWord.contains("_")) {
                            System.out.printf("Muito bem! %s existe na palavra. Ainda tem letras escondidas %n", attemptedLyric);
                        } else {
                            System.out.printf("Parabéns! A palavra adivinhada era '%s'", guessedWord);
                            System.exit(0);
                        }
                    } else {
                        System.out.printf("Infelizmente a letra %c não existe na palavra. %n", attemptedLyric);
                    }
                }
            }
        }
    }
}