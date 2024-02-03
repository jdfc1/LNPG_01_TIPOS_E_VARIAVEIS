import java.util.Scanner;

public class ParImpar {
    
    public static int parImpar(int a) {
        if (a % 2 == 0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;

        System.out.print("Digite o número para verificar se é par ou impar: ");
        a = scanner.nextInt();

        if (parImpar(a) == 0)
            System.out.println("O número " + a + " é Par");
        else
            System.out.println("O número " + a + " é Ímpar");


        scanner.close();
    }
}
