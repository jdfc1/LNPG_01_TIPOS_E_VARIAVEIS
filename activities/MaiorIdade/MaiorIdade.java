import java.util.Scanner;

public class MaiorIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("Você é menor de idade");
        }else{
            System.out.println("Você é Maior de idade");
        }

    }
    
}
