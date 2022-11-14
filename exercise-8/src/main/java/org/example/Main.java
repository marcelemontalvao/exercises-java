package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha uma das seguintes opções: \n" +
                "1 - Coca-Cola - R$ 5\n" +
                "2 - Coca-Cola 0 - R$ 4.50\n" +
                "3 - Pepsi - R$ 4,40\n" +
                "4 - Guaraná Antarctica - R$ 3,50\n" +
                "5 - Fanta Laranja - R$ 4,23\n" +
                "Água - R$ 2,50");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();

        if (option.equals("1")) {
            System.out.println("Coca-Cola - R$ 5\n");
        } else if (option.equals("2")) {
            System.out.println("Coca-Cola 0 - R$ 4.50\n");
        } else if (option.equals("3")) {
            System.out.println("Pepsi - R$ 4,40\n");
        } else if (option.equals("4")) {
            System.out.println("Guaraná Antarctica - R$ 3,50\n");
        } else if (option.equals("5")) {
            System.out.println("Fanta Laranja - R$ 4,23\n");
        } else if (option.equals("Água")) {
            System.out.println("Água - R$ 2,50");
        } else {
            System.out.println("Insira uma opção válida!");
        }
    }
}