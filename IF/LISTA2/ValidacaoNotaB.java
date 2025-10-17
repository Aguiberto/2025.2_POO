import java.util.Scanner;

public class ValidacaoNotaB{

    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
       
        float nota1 = scanner.nextFloat();
        while(nota1 < 0 || nota1 > 10){
            System.out.println("nota invalida");
            nota1 = scanner.nextFloat();
        }

        float nota2 = scanner.nextFloat();
        while(nota2 < 0 || nota2 > 10){
            System.out.println("nota invalida");
            nota2 = scanner.nextFloat();
            }
        }

        float media = (nota1 + nota2) / 2;

        System.out.printf("media = %.2f",media);

        scanner.close();
    }
}