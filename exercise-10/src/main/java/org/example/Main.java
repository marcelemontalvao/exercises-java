package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao seu carrinho de compras!");
        class Product {
            String name;
            int amount;
            double price;
            @Override
            public String toString() {
                return "Nome:  " + this.name + "\n" + "Quantidade:  " + this.amount + "\n" + "Preço:  " + this.price + "\n";
            }

        }
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        double totalPrice = 0;
        Double finalNumber;

        do {
            System.out.println("Insira o nome do produto");
            String name = input.next();
            System.out.println("Insira a quantidade do produto");
            int amount = input.nextInt();
            System.out.println("Insira o preço do produto");
            double price = input.nextFloat();
            Product product = new Product();

            product.name = name;
            product.amount = amount;
            product.price = price;
            products.add(product);
            totalPrice += amount*price;
            System.out.println("Para finalizar o programa, digite '0'.");
            finalNumber = input.nextDouble();
        } while (finalNumber != 0);

        for (Product item: products) {
            System.out.println(item);
        }

        System.out.println("Preço total: " + totalPrice);

    }
}