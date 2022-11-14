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
                "Água - R$ 2,50" +
                "");
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        switch (option) {
            case ("1"):
                System.out.println("Coca-Cola - R$ 5\n");
                break;
            case ("2"):
                System.out.println("Coca-Cola 0 - R$ 4.50\n");
                break;
            case ("3"):
                System.out.println("Pepsi - R$ 4,40\n");
                break;
            case ("4"):
                System.out.println("Guaraná Antarctica - R$ 3,50\n");
                break;
            case ("5"):
                System.out.println("Fanta Laranja - R$ 4,23\n");
                break;
            case ("Água"):
                System.out.println("Água - R$ 2,50");
                break;
            default:
                System.out.println("Insira uma opção válida!");
        }
    }
}