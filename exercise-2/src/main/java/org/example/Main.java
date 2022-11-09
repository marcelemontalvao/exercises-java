package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Olá! Informe a sua idade: ");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            String luckyNumber = new String(age + ".023");
            float casting = Float.valueOf(luckyNumber).floatValue();
            System.out.println("O número da sorte é: " + casting);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.err.println("O valor informado não é um número inteiro");
        }
    }
}