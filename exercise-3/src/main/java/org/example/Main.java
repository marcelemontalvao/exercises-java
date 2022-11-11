package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int sum = 0;
            System.out.println("Escreva o mês e o valor de cada mês, como no exemplo: 'Janeiro: 1543, Fevereiro: 1222, Março: 1234'");
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();
            List<String> array =  List.of(sentence.split(", "));

            for(String month : array) {
                List<String> array0 =  List.of(month.split(": "));
                sum += Integer.valueOf(array0.get(1));
            }

            String total = "Total " + sum;
            List<String> finalArray = new ArrayList<>(array);
            finalArray.add(total);
            finalArray.forEach(System.out::println);
    }
}