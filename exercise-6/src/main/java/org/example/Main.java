package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira a sua idade");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Entrada - " + age);
        System.out.println("Saída - " + ((age >= 18 && age <= 70) ? "Voto obrigatório" : (age >= 16 && age < 18) ? "Voto  facultativo" : "Sem direito a votar"));
    }
}