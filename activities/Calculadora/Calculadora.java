import java.util.Scanner;

public class Calculadora {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        if (a >= b)
            return a - b;
        else
            return b - a;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static float divisao(float a, float b) {
        if (a >= b)
            return a / b;
        else
            return b / a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.println("Soma: " + soma(a, b));
        System.out.println("Subtração: " + subtracao(a, b));
        System.out.println("Multiplicação: " + multiplicacao(a, b));
        System.out.println("Divisão: " + divisao(a, b));

        scanner.close();
    }
}
