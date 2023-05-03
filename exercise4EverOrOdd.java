import java.util.Scanner;
public class exercise4EverOrOdd {
    public static void main(String[] args) {
        int number;
        System.out.println("Par ou Ímpar!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
