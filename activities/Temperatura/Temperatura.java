import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius para conversão: ");
        float celsius = scanner.nextFloat();

        float fahrenheit = (celsius * 1.8f) + 32;

        System.out.printf("%.1fº Celsius é igual a %.1fº em Graus Fahrenheit\n", celsius, fahrenheit);
    }
}
