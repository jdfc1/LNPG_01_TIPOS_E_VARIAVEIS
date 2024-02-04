import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float a = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float b = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float c = scanner.nextFloat();

        float resultado = ((a + b + c) / 3);

        if (resultado >= 7)
            System.out.println("Aprovado");
        else if (resultado < 3)
            System.out.println("Reprovado");
        else if ((resultado >= 3) || (resultado < 7))
            System.out.println("Prova Final");
    }
    

}
