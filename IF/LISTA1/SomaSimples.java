
import java.util.Scanner;


public class SomaSimples{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int a,b;
        int soma;

        a = ler.nextInt();
        b = ler.nextInt();

        soma = a + b;

        System.out.println("SOMA =" + soma);
    }

}