package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escreva o seu nome completo");
        Scanner input = new Scanner(System.in);
        String fullName = input.nextLine();
        List<String> array = List.of(fullName.split(" "));
        String newName = "";
        for (int i = 0; i < array.toArray().length; i++) {
            newName += "!" + array.toArray()[i].toString() + " ";
        }
        System.out.println(newName);
    }
}