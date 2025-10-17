import java.util.Scanner;

public class ValidacaoNota{

    private static boolean validador( float n1, float n2){

        if( n1 < 0 || n1 > 10){
            return false;
        }
        if(n2 < 0 || n2 > 10){
            return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();

        

        boolean validade = validador(nota1, nota2);

        if(validade == false){
            System.out.println("nota invalida");
        } else {
            Float media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f%n", media);
        }
    }
}