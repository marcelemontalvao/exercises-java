package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira a sua idade");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Entrada - " + age);

        if(age > 18 && age < 70) {
            System.out.println("Saída - Voto obrigatório");
        } else if (age > 16 && age < 18) {
            System.out.println("Saída - Voto  facultativo");
        } else  {
            System.out.println("Saída - Sem direito a votar");
        }
    }
}