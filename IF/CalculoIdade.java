
import java.util.Scanner;


public class CalculoIdade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Em que ano você nasceu: ");
        int nascimento = sc.nextInt();

        int idade = 2025 - nascimento;

        System.out.println("Sua idade é: " + idade);
    }
}