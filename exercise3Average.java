import java.util.Scanner;

public class exercise3Average {
    public static void main(String[] args) {
        Double firstNumber = 0.0;
        Double secondNumber = 0.0;
        Double average = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Média entre dois números!");
        System.out.println("Digite o primeiro número");
        firstNumber = scanner.nextDouble();
        System.out.println("Digite o segundo número");
        secondNumber = scanner.nextDouble();
        average = (firstNumber + secondNumber)/2;

        System.out.println("A média dos dois números fornecidos é: " + average);
    }
}
